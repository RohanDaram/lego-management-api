package com.rohan.lego.controller;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rohan.lego.model.DeleteRequest;
import com.rohan.lego.model.DeleteResponse;
import com.rohan.lego.model.ErrorResponse;
import com.rohan.lego.model.LegoSet;
import com.rohan.lego.model.RefreshRequest;
import com.rohan.lego.model.RefreshResponse;
import com.rohan.lego.model.UpdateRequest;
import com.rohan.lego.model.UpdateResponse;
import com.rohan.lego.service.LegoSetService;

@RequestMapping("/v1")
@RestController
public class LegoSetController {

	@Autowired
	LegoSetService legoSetService;

	@GetMapping("/legosets")
	public List<LegoSet> getLegoSets() {

		return legoSetService.getLegoSets();
	}

	@GetMapping("/legosets/{lego-theme}")
	public ResponseEntity<Object> getLegoSetsByTheme(@PathVariable("lego-theme") String legoTheme) {

		String regex = ".*\\d.*";
		boolean containsDigit = Pattern.matches(regex, legoTheme);
		if (containsDigit) {
			ErrorResponse error = new ErrorResponse();
			error.setCode("400");
			error.setMessage("Invalid Lego Set Theme.");
			return ResponseEntity.status(400).body(error);
		}

		return ResponseEntity.ok(legoSetService.getLegoSetsByTheme(legoTheme.trim()));
	}

	@PostMapping("/refresh-data")
	public RefreshResponse reloadData(@RequestBody RefreshRequest request) {

		RefreshResponse response = new RefreshResponse();
		if (legoSetService.reloadData(request)) {

			response.setCode("Success");
			response.setMessage("Data Refreshed Sucessfully");

		} else {
			response.setCode("Failed");
			response.setMessage("Data Refresh Failed");
		}

		response.setSource("JSON");

		return response;
	}

	@DeleteMapping("/delete-data")
	public DeleteResponse deleteLegoSetData(@RequestBody DeleteRequest request) {

		DeleteResponse response = new DeleteResponse();

		if (legoSetService.deleteLegoSetData(request)) {

			response.setCode("Success");
			response.setMessage("Data Deleted Sucessfully");

		} else {
			response.setCode("Failed");
			response.setMessage("Data Deletion Failed");
		}

		response.setSource("JSON");

		return response;
	}

	@PatchMapping("/update-data")
	public UpdateResponse updateLegoSetData(@RequestBody UpdateRequest request) {

		UpdateResponse response = new UpdateResponse();

		if (legoSetService.updateLegoSetData(request)) {

			response.setCode("Success");
			response.setMessage("Data Updated Sucessfully");

		} else {
			response.setCode("Failed");
			response.setMessage("Data Update Failed");
		}

		response.setSource("JSON");

		return response;
	}
}

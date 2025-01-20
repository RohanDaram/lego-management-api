CREATE TABLE IF NOT EXISTS lego_set (
    id INT AUTO_INCREMENT PRIMARY KEY,        
    name VARCHAR(255) NOT NULL,                  
    set_number INT NOT NULL,                     
    piece_count INT NOT NULL,                    
    release_date DATE,                           
    retirement_date DATE,                        
    target_age INT,                             
    theme VARCHAR(255),                         
    price FLOAT,                                 
    num_minifigures INT,                      
    licensed BOOLEAN
);
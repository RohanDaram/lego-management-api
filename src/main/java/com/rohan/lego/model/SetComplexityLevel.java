package com.rohan.lego.model;

public enum SetComplexityLevel {
	
	EASY("Basic level, suitable for beginners", 1),
    MEDIUM("Moderate complexity, for intermediate builders", 2),
    HARD("High complexity, for advanced builders", 3),
    EXPERT("Expert level, very challenging build", 4);
    
    private final String description;
    private final int level;

    SetComplexityLevel(String description, int level) {
        this.description = description;
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public int getLevel() {
        return level;
    }
}

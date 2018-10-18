package composition.plane;

import java.time.LocalDate;

public class Engine {  
	
    public Engine(String type, LocalDate mDate) { 
        this.type = type; 
    }
    
    @Override
	public String toString() {
		return "Engine [type=" + type + ", manufacturedDate=" + mDate + "]";
	}

	private String type; 
    private LocalDate mDate;  //manufactured date
    
} 


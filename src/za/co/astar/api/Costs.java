package za.co.astar.api;
import java.util.HashMap;
import java.util.Map;


public class Costs {
	
	private static final Map<String, Integer> costs = new HashMap<>();

    static {
    	costs.put(".", 1);
    	costs.put("@", 1);
    	costs.put("X", 1);
    	costs.put("*", 2);
    	costs.put("^", 3);
        costs.put("~", null);
    }

    public static Map<String, Integer> getMovementCosts() {
        return costs;
    }
}

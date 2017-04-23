package za.co.astar.api;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class TerrainLoader {
	public Terrain load(String filePath) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        Terrain terrain = null;

        try {
            String line = reader.readLine();
            List<String[]> terrains = new ArrayList<>();

            while(line != null){
                String[] t = new String[line.length()];
                for (int i = 0; i < line.length(); i++) {
                    t[i] = String.valueOf(line.charAt(i));
                }

                terrains.add(t);
                line = reader.readLine();
            }

            terrain = new Terrain(terrains.size(), terrains.get(0).length);
            terrain.buildTerrain(terrains.toArray(new String[terrains.size()][]));

        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return terrain;
    }
}

package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapData {
Map<String, ArrayList<UserLogData>> multiValueMap = new HashMap<String, ArrayList<UserLogData>>();
	
	public void createMap(String name, UserLogData usrData) {
		if(multiValueMap.containsKey(name)) {
			multiValueMap.get(name).add(usrData);
		}else {
			multiValueMap.put(name, new ArrayList<UserLogData>());
			multiValueMap.get(name).add(usrData);
		}
	}
	public void display() {
		multiValueMap.forEach((k,v)->System.out.println(k+" : "+v));
	}

}

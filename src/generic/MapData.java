package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapData {
Map<String, ArrayList<UserLogData>> userlogHashMap = new HashMap<String, ArrayList<UserLogData>>();
	
	public void createMap(String name, UserLogData usrData) {
		if(userlogHashMap.containsKey(name)) {
			userlogHashMap.get(name).add(usrData);
		}else {
			userlogHashMap.put(name, new ArrayList<UserLogData>());
			userlogHashMap.get(name).add(usrData);
		}
	}
	public void display() {
		userlogHashMap.forEach((k,v)->System.out.println(k+" : "+v));
	}

}

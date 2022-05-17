package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map_tut {
	private static final String Map = null;

	public static void main(String[] args) {
		Map<String,Integer> map1 =new HashMap<String,Integer>();
		map1.put("John",25);
		map1.put("J",25);
		map1.put("Joe",25);
		System.out.println(map1);
		System.out.println(map1.get("Joe"));
		System.out.println(map1.keySet());
		System.out.println(map1.values());
		Set<String> names =map1.keySet();
		for(String name:names) {
			System.out.println(name + map1.get(name));
		}
		
		//map of maps
		Map<String,Map<String,Object>> userProfiles = new HashMap<String,Map<String,Object>>();
		Map<String,Object> profile =new HashMap<String,Object>();
		profile.put("age",25);
		profile.put("dept","admin");
		profile.put("city","NY");
		userProfiles.put("SR",profile);
		
		System.out.println(userProfiles);
		
		profile =new HashMap<String,Object>();
		profile.put("age",25);
		profile.put("dept","admin");
		profile.put("city","NY");
		userProfiles.put("Sri",profile);
		
		System.out.println(userProfiles);
		
		profile =new HashMap<String,Object>();
		profile.put("age",25);
		profile.put("dept","admin");
		profile.put("city","NYC");
		userProfiles.put("Sri Sis",profile);
		
		System.out.println(userProfiles);
		
		System.out.println(userProfiles.get("Sri"));
		}
	}



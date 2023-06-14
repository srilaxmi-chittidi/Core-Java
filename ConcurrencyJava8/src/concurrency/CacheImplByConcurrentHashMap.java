package concurrency;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class CacheImplByConcurrentHashMap {

	public static void main(String[] args) {
		Cache c = new Cache();
		c.getEntry("one");
		c.getEntry("two");
		c.getEntry("three");
		c.getEntry("four");
		c.getEntry("five");
		c.getEntry("six");
		c.getMapDetails();
		
	}
	
}

class Cache{
	private static final long MAX_SIZE = 5;
	private final ConcurrentHashMap<String,String> map;
	
	public Cache() {
		map = new ConcurrentHashMap<>();
	}
	public String getEntry(String key) {
		String value = createCacheEntry(key);
		removeOldCacheEntry();
		return value;
	}
	public String createCacheEntry(String key) {
		String value = map.get(key);
		if(value == null) {
			String putResult = map.putIfAbsent(key, createRandom());
			value = putResult;
		}
		return value;
	}
	public void removeOldCacheEntry() {
		if(map.size() > MAX_SIZE) {
			String keyToDelete = map.keys().nextElement();
			System.out.println("Deleted entry "+keyToDelete);
			map.remove(keyToDelete);
		}
	}
	private String createRandom() {
		return "new entry to be cached";
	}
	public void getMapDetails() {
	
		for(Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
}
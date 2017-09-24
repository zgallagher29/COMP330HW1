import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;




//SOURCE: https://www.programcreek.com/2013/03/java-sort-map-by-value/


class ValueComparator<K, V extends Comparable<V>> implements Comparator<K>{
 
	HashMap<K, V> myMap = new HashMap<K, V>();
 
	public ValueComparator(HashMap<K, V> myMap){
		this.myMap.putAll(myMap);
	}
 
	@Override
	public int compare(K s1, K s2) {
		return -myMap.get(s1).compareTo(myMap.get(s2));//descending order	
	}
}
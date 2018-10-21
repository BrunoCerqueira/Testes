import java.util.ArrayList;
import java.util.List;

public class HashMap<K,V> {
	List<Entry<K,V>> list = new ArrayList<Entry<K,V>>();
	
	public void put(K newKey, V data) {
		int hash = hash(newKey);
		if(hash >= list.size()){
				list.add(hash,new Entry(newKey ,data,null));
			}else {
			Entry<K,V> x = list.get(hash(newKey));
			existValue(x,newKey,data);
	}
	}
	public void print() {
		for (Entry<K, V> entry : list) { 
			printEntry(entry);
		}
	}
	public V getValue(K key) {
		int hash = hash(key);
		return searchValueInsideEntry(list.get(hash),key);
	}
	private V searchValueInsideEntry(Entry<K,V> entry,K key) {
		if(entry.key == key) { 
			return entry.value;
		}else {
			return searchValueInsideEntry(entry.next, key);
		}
	}
	private void printEntry(Entry entry) {
		if(entry != null) {
			System.out.println(entry.value);
			printEntry(entry.next);
		}
	}
	private Integer hash(K key) {
		int hash = list.size()%2;
		return hash;
	}
	public void existValue(Entry<K,V> entry,  K key,V value) {
		if(entry == null) {
			entry = new Entry(key,value, null);
		}
		if(entry.key == key) {
			entry.value = value;
			return;
		}else {
			if(entry.next == null) {
				Entry newEntry = new Entry(key,value, null);
				entry.next = newEntry;
				return;
			}
			 existValue(entry.next,key,value);
		}
	}
	private void insertNewEntry(Entry<K,V> entry) {
		
	}

}

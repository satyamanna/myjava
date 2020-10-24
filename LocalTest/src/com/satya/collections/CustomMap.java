package com.satya.collections;

import java.util.Set;

public interface CustomMap<K,V> {

	V put(K key,V v);
	V get(K k);
	int size();
	Set<CustomMap.Entry<K, V>> entrySet();
	interface Entry<K,V> {
		K getKey();
		V getValue();
		V setValue(V value);
		boolean equals(Object o);
		int hashCode();
		 }
	
}

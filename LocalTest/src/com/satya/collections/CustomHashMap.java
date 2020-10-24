package com.satya.collections;

import java.util.Set;

public class CustomHashMap<K, V> implements CustomMap<K, V> {

	static final int DEFAULT_INITIAL_CAPACITY = 16;
	static final int MAXIMUM_CAPACITY = 1 << 30;
	static final float DEFAULT_LOAD_FACTOR = 0.75f;
	transient Entry[] table;
	int threshold;
	final float loadFactor;
	transient volatile int modCount;
	transient int size;
	public CustomHashMap() {
		// TODO Auto-generated constructor stub
		 this.loadFactor = DEFAULT_LOAD_FACTOR;
		 threshold = (int)(DEFAULT_INITIAL_CAPACITY * DEFAULT_LOAD_FACTOR);
		 table = new Entry[DEFAULT_INITIAL_CAPACITY];
		 init();
	}
	 void init() {
	    }
	 
	 public CustomHashMap(int initialCapacity, float loadFactor) {
	        if (initialCapacity < 0)
	            throw new IllegalArgumentException("Illegal initial capacity: " +
	                                               initialCapacity);
	        if (initialCapacity > MAXIMUM_CAPACITY)
	            initialCapacity = MAXIMUM_CAPACITY;
	        if (loadFactor <= 0 || Float.isNaN(loadFactor))
	            throw new IllegalArgumentException("Illegal load factor: " +
	                                               loadFactor);

	        // Find a power of 2 >= initialCapacity
	        int capacity = 1;
	        while (capacity < initialCapacity)
	            capacity <<= 1;

	        this.loadFactor = loadFactor;
	        threshold = (int)(capacity * loadFactor);
	        table = new Entry[capacity];
	        init();
	    }
	 public CustomHashMap(CustomMap<? extends K, ? extends V> m) {
	        this(Math.max((int) (m.size() / DEFAULT_LOAD_FACTOR) + 1,
	                      DEFAULT_INITIAL_CAPACITY), DEFAULT_LOAD_FACTOR);
	        putAllForCreate(m);  // asdadadas
	    }
	 
	 
	 
	 
	 static int hash(int h) {
	        // This function ensures that hashCodes that differ only by
	        // constant multiples at each bit position have a bounded
	        // number of collisions (approximately 8 at default load factor).
	        h ^= (h >>> 20) ^ (h >>> 12);
	        return h ^ (h >>> 7) ^ (h >>> 4);
	    }
	 public int size() {
	        return size;
	    }
	

	   
	    /*private V getForNullKey() {
	        for (Entry<K,V> e = table[0]; e != null; e = e.next) {
	            if (e.key == null)
	                return e.value;
	        }
	        return null;
	}*/
	@Override
	public V put(K key, V v) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public V get(K key) {
		// TODO Auto-generated method stub
		if (key == null)
            return getForNullKey();
        int hash = hash(key.hashCode());
        for (Entry<K,V> e = table[indexFor(hash, table.length)];
             e != null;
             e = e.next) {
            Object k;
            if (e.hash == hash && ((k = e.key) == key || key.equals(k)))
                return e.value;
        }
        return null;
		
	}*/
	 static int indexFor(int h, int length) {
	        return h & (length-1);
	    }
	@Override
	public V get(K k) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Set<com.satya.collections.CustomMap.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}

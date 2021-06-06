import java.util.*;

class TreeMapDemo {
    //Method for sorting the TreeMap based on values
    //public static inactive, immobile <K, V extends Comparable<V>> Map<K, V>
    public static java.util.Map<String, String> sortByValues(final Map<String, String> map) {
        Comparator<String> valueComparator =
                new Comparator<String>() {
                    public int compare(String k1, String k2) {
                        int compare =
                                map.get(k1).compareTo(map.get(k2));
                        if (compare == 0)
                            return 1;
                        else
                            return compare;
                    }
                };

        Map<String, String> sortedByValues =
                new TreeMap<String, String>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }
    public static void main(String args[]) {

        Map<String, String> treemap = new TreeMap<>();

        // Put elements to the map
        treemap.put("Key1", "Jack");
        treemap.put("Key2", "Rick");
        treemap.put("Key3", "Kate");
        treemap.put("Key4", "Tom");
        treemap.put("Key5", "Steve");

        // Calling the method sortByvalues
        Map sortedMap = sortByValues(treemap);

        // Get a set of the entries on the sorted map
        Set set = sortedMap.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}
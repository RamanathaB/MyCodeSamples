import java.util.*;


class Scratch {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int lg = arr.length;
        Stack<String> strStack = new Stack<String>();
        Queue<String> strQueue = new LinkedList<String>();
        strStack.push("c");
        strStack.push("e");
        strStack.push("a");
        strStack.push("d");
        strStack.push("b");
        Collections.sort(strStack,new Sortbyroll());
        System.out.println("Stack : "+strStack);
        strQueue.add("c");
        strQueue.add("e");
        strQueue.add("a");
        strQueue.add("d");
        strQueue.add("b");
        System.out.println("Queue : "+strQueue);

        System.out.println("Array : "+arr[1]);
        System.out.println("Hello Amazon... I'm coming...");
        System.out.println("Are you Ready???????");
        Map<String, String> tMap = new TreeMap<String, String>();
        Map<String, String> hMap = new HashMap<String, String>();
        List<String> dlList = new LinkedList<String>();
        List<String> aList = new ArrayList<String>();
        
        Collections.sort(aList);
        ListIterator<String> li = dlList.listIterator();
        Iterator<String> dlistIt = dlList.iterator();
        while (li.hasNext()) {
            //your logic goes hereMap<String, String> hMap = new HashMap<String, String>();
            li.hasPrevious();
        }
        hMap.put("alter","4");
        hMap.put("doll","1");
        hMap.put("cuttler","2");
        hMap.put("bottle","3");
        tMap.put("alter","3");
        tMap.put("doll","5");
        tMap.put("cuttler","6");
        tMap.put("bottle","3");
        System.out.println("hashmap data : "+hMap);
        System.out.println("Treehmap data : "+tMap);
        for (Map.Entry m:tMap.entrySet()){
            System.out.println("Frequency of " + m.getKey() +
                    " is " + m.getValue());
        }
        Set<String> keySet = tMap.keySet();
        System.out.println("Key Set : "+keySet);
        Collection<String> values = tMap.values();
        List<String> blist = new ArrayList<String>(values);
        System.out.println("values : "+values);
        Collections.sort(blist);
        System.out.println("blist : "+blist);
        for (String b :  blist
             ) {
                 System.out.println(tMap.containsValue(b));
        }
    }


static class Sortbyroll implements Comparator<String> {
    // Used for sorting in ascending order of
    // roll number
    public int compare(String a, String b)
    {
        return a.compareTo(b);
    }
}
} 
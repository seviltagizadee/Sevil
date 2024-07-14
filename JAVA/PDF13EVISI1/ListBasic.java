package PDF13EVISI1;

import java.util.*;

public class ListBasic {
    public static void main(String[] args) {
        //1
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(15);
        list.add(17);
        list.add(19);
        list.add(21);
        System.out.println(list);


        //2
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("oriange");
        set.add("strawbery");
        set.add("watermelon");
        System.out.println(set);

        //3
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(12);
        queue.add(9);
        queue.remove();
        queue.remove();
        System.out.println(queue);

        //4
        Map<String,String> map = new HashMap<>();
        map.put("Azerbaijan","Baku");
        map.put("Turkey","Ankara");
        map.put("England","London");
        System.out.println(map);

        //5
        List<String> name = new ArrayList<>();
        name.add("Sevil");
        name.add("Cinare");
        name.add("Nicat");
        name.add("Ali");
        name.add("Nubar");

        for (String names:name) {
            System.out.println(names);
        }

        //6
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("banana");
        System.out.println(fruits);   // Set'let dublikate icaze vermir. Çünki hasSet unikal data saxlamaq üçündür

        //7
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(11);
        numbers.add(13);

        while(!numbers.isEmpty()) {
            System.out.println(numbers.remove());
        }
            //8
            for (String capital : map.keySet()) {
                System.out.println(capital + "->" + map.get(capital));
            }


            //9
        List<Integer> number2= new ArrayList<>();
            number2.add(12);
            number2.add(35);
            number2.add(47);
        System.out.println("Remove number: " +number2.remove(2));

        //10
        Set<Integer> set1= new HashSet<>();
        set1.add(11);
        set1.add(22);
        set1.add(33);
        set1.add(44);
        List<Integer> arraylist = new ArrayList<>(set1);
        for (int reqemler: arraylist) {
            System.out.println(reqemler);
        }
    }
    }


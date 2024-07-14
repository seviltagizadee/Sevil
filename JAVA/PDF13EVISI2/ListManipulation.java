package PDF13EVISI2;

import java.util.*;

public class ListManipulation {
    public static void main(String[] args) {
        //11
        ArrayList<Integer> numbers = new ArrayList<>();
         numbers.add(10);
         numbers.add(11);
         numbers.add(12);
         numbers.add(13);
        System.out.println("Before: " + numbers);
        Collections.reverse(numbers);
        System.out.println("After: " + numbers);
        System.out.println("*************************************");
        //12
        Set<Integer> teamPoints1  =new HashSet<>();
        teamPoints1.add(18);
        teamPoints1.add(23);
        teamPoints1.add(30);
        Set<Integer> teamPoints2 = new HashSet<>();
        teamPoints2.add(10);
        teamPoints2.add(30);
        teamPoints2.add(15);
        teamPoints1.retainAll(teamPoints2);

        System.out.println("Same Points:" + teamPoints1);
        System.out.println("*************************************");

        //13
      Queue<String> fruits =new LinkedList<>();
      fruits.add("apple");
      fruits.add("banana");
      fruits.add("strawberry");
        System.out.println("Before:" +fruits);

        System.out.println("*************************************");


        //14
        Map<String,String> countries = new HashMap<>();
        countries.put("Azerbaijan","Baku");
        countries.put("Turkey","Ankara");
        countries.put("England","London");
        System.out.println(countries);
        filter(countries);
        System.out.println(countries);
        System.out.println("*************************************");

        //15
        ArrayList<String> fruits2 = new ArrayList<>();
        fruits2.add("Apple");
        fruits2.add("Banana");
        fruits2.add("Cherry");
        fruits2.add("Date");
        fruits2.add("Elderberry");

       String containelement = "Apple";
       boolean contains = fruits2.contains(containelement);

       if (contains){
           System.out.println(containelement);
       }else {
           System.out.println("isn't");
       }
        System.out.println("*************************************");


       //16
        Set<Integer> age  =new HashSet<>();
        age.add(18);
        age.add(23);
        age.add(30);

        System.out.println("*************************************");

        //17
        Queue<Integer> num1 = new LinkedList<>();
        num1.add(5);
        num1.add(7);
        Queue<Integer> num2 = new LinkedList<>();
        num2.add(7);
        num2.add(9);

        boolean equality = num1.equals(num2);
        System.out.println(equality);
        System.out.println("*************************************");



        //18
        Map <String,Integer> nameAge = new HashMap<>();
        nameAge.put("Sevil",19);
        nameAge.put("Ayxan",23);
        nameAge.put("Tahir",29);
        System.out.println(nameAge);
        Set<String> name = nameAge.keySet();
        System.out.println(name);
        System.out.println("*************************************");


        //19
        List<Integer> scor = new ArrayList<>();
        scor.add(100);
        scor.add(350);
        scor.add(100);
        Set<Integer> scor1 = new HashSet<>(scor);
        System.out.println(scor1);
        System.out.println("*************************************");


        //20
        Set<Integer> points1 = new HashSet<>();
        points1.add(55);
        points1.add(80);
        points1.add(33);
        points1.add(55);
        System.out.println(points1);
        Queue<Integer> points2 = new PriorityQueue<>(points1);
        System.out.println(points2);
    }

    public static void filter(Map<String,String> map){
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String index = iterator.next();
            if (index.startsWith("A")){
                iterator.remove();
            }
        }
    }
}

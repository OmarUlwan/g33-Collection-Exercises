package se.lexicon.omar;

import java.util.*;

public class App {
    public static void main(String[] args) {
        //Create a new list and populate it with the days of the week. Lastly, print the out the list.
        List<String> daysOfWeek = new ArrayList<String>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        int daysOfWeekLang = daysOfWeek.size();
        System.out.print("Exc-1");
        for (int i = 0; i < daysOfWeekLang; ++i) {
            System.out.print("::" + daysOfWeek.get(i) + "::");
        }

        /*
        Create a new list and populate it with the days of the week.
        Lastly, iterate through the list and print out each element separately.
         */
        List<String> daysOfWeek2 = new ArrayList<String>();
        daysOfWeek2.add("Monday");
        daysOfWeek2.add("Tuesday");
        daysOfWeek2.add("Wednesday");
        daysOfWeek2.add("Thursday");
        daysOfWeek2.add("Friday");
        daysOfWeek2.add("Saturday");
        daysOfWeek2.add("Sunday");
        Iterator daysOfWeek2Iterator = daysOfWeek2.iterator();
        System.out.print("\nExc-2");
        while (daysOfWeek2Iterator.hasNext()) {
            System.out.print("::" + daysOfWeek2Iterator.next() + "::");
        }

        /*
        . Create a new list and populate it with the days of the week excluding THURSDAY.
        Lastly, insert the weekday THURSDAY into the right position in the list.
         */
        List<String> daysOfWeek3 = new ArrayList<String>();
        daysOfWeek3.add("Monday");
        daysOfWeek3.add("Tuesday");
        daysOfWeek3.add("Wednesday");
        daysOfWeek3.add("");
        daysOfWeek3.add("Friday");
        daysOfWeek3.add("Saturday");
        daysOfWeek3.add("Sunday");
        daysOfWeek3.set(3, "Thursday");
        System.out.print("\nExc-3");
        for (Object day : daysOfWeek3) {
            System.out.print("::" + day + "::");
        }

        /*
        Create a new list and populate it with the days of the week. Then create a new list out of the
        first three elements of the first list using a subList.
         */
        List<String> daysOfWeek4 = new ArrayList<String>();
        daysOfWeek4.add("Monday");
        daysOfWeek4.add("Tuesday");
        daysOfWeek4.add("Wednesday");
        daysOfWeek4.add("Thursday");
        daysOfWeek4.add("Friday");
        daysOfWeek4.add("Saturday");
        daysOfWeek4.add("Sunday");
        List sublistDaysOfWeek3 = daysOfWeek4.subList(0, 3);
        System.out.print("\nExc-4");
        for (Object day : sublistDaysOfWeek3) {
            System.out.print("::" + day + "::");
        }

        /*
        Create a new hashset and populate it with the days of the week.
        Lastly, print the set out and pay attention to the order of the elements.
         */
        HashSet<String> daysOfWeek_Hashset = new HashSet<String>();
        daysOfWeek_Hashset.add("Monday");
        daysOfWeek_Hashset.add("Tuesday");
        daysOfWeek_Hashset.add("Wednesday");
        daysOfWeek_Hashset.add("Thursday");
        daysOfWeek_Hashset.add("Friday");
        daysOfWeek_Hashset.add("Saturday");
        daysOfWeek_Hashset.add("Sunday");
        Iterator iteratorDaysOfWeek_Hashset = daysOfWeek_Hashset.iterator();
        System.out.print("\nExc-5");
        while (iteratorDaysOfWeek_Hashset.hasNext()) {
            System.out.print("::" + iteratorDaysOfWeek_Hashset.next() + "::");
        }

        /*
        Create a new hashSet and populate it with the days of the week.
        Then convert the hashSet to an arrayList.
         */
        HashSet<String> daysOfWeek_Hashset2 = new HashSet<String>();
        daysOfWeek_Hashset2.add("Monday");
        daysOfWeek_Hashset2.add("Tuesday");
        daysOfWeek_Hashset2.add("Wednesday");
        daysOfWeek_Hashset2.add("Thursday");
        daysOfWeek_Hashset2.add("Friday");
        daysOfWeek_Hashset2.add("Saturday");
        daysOfWeek_Hashset2.add("Sunday");
        ArrayList<String> daysOfWeek_Hashset2Array = new ArrayList<>(daysOfWeek_Hashset2);
        System.out.print("\nExc-6");
        for (Object day : daysOfWeek_Hashset2Array) {
            System.out.print("::" + day + "::");
        }

        /*
        Create a new hashSet and populate it with random names. Then convert the hashSet to an arrayList.
        Lastly, manually sort the list in alphabetical order and print it out.
         */
        HashSet<String> randomName = new HashSet<String>();
        randomName.add("Omar");
        randomName.add("Johansson");
        randomName.add("Peter");
        randomName.add("Maikel");
        randomName.add("Alberto");
        ArrayList<String> randomNameArray = new ArrayList<String>(randomName);
        Collections.sort(randomNameArray);
        System.out.print("\nExc-7");
        for (Object name : randomNameArray) {
            System.out.print("::" + name + "::");
        }

        /*
        Create a new hashSet and populate it with random names.
        Lasty, sort the list in alphabetical order using only a Set or a child of Set.
         */
        HashSet<String> randomName2 = new HashSet<String>();
        randomName2.add("Omar");
        randomName2.add("Johansson");
        randomName2.add("Peter");
        randomName2.add("Maikel");
        randomName2.add("Alberto");
        TreeSet<String> randomName2TreeSet = new TreeSet();
        randomName2TreeSet.addAll(randomName2);
        System.out.print("\nExc-8");
        for (Object name : randomName2TreeSet) {
            System.out.print("::" + name + "::");
        }

        /*
         Create a new hashMap of type <Integer,String> and populate it with elements containing an id(Integer) and a car brand(String).
         Lastly, print out the entire hashMap.
         */
        HashMap<Integer, String> carBrandHasMap = new HashMap<>();
        carBrandHasMap.put(1, "Volvo");
        carBrandHasMap.put(2, "Saab");
        carBrandHasMap.put(3, "Audi");
        carBrandHasMap.put(4, "BMW");
        carBrandHasMap.put(5, "Mercedes");

        System.out.print("\nExc-9");
        System.out.println("::" + carBrandHasMap.entrySet() + "::");

        System.out.print("Exc-10");
        System.out.println("::" + carBrandHasMap.keySet() + "::");

        System.out.print("Exc-11");
        System.out.println("::" + carBrandHasMap.values() + "::");

        /*
        Create a new class and call it Car.
        Add fields for Id,Brand and Model + getters and setters.
        Create a new hashMap of type <Integer,Car> and populate it with elements containing an id(Integer) and a car object(Car).
        Lastly, print out only the car's brand.
         */
        HashMap<Integer, Car> carHashMap = new HashMap<>();
        carHashMap.put(1, new Car(1, "Volvo", "v70"));
        carHashMap.put(2, new Car(2, "Audi", "A6"));
        carHashMap.put(3, new Car(3, "BMW", "X5"));
        System.out.print("Exc-12");
        Iterator keyIterator = carHashMap.keySet().iterator();
        while (keyIterator.hasNext()) {
            System.out.print("::" + carHashMap.get(keyIterator.next()).getBrand() + "::");
        }

        /*
        Create an empty set and populate it with the all the days of the week.
        Next create a second set and populate it with ONLY the weekend days (SATURDAY and SUNDAY).
        Lastly, compare the two sets and retain in the first set only those days that are the same in both sets
         */
        Set<String> allTheDaysOfWeek = new HashSet<>();
        allTheDaysOfWeek.add("Monday");
        allTheDaysOfWeek.add("Tuesday");
        allTheDaysOfWeek.add("Wednesday");
        allTheDaysOfWeek.add("Thursday");
        allTheDaysOfWeek.add("Friday");
        allTheDaysOfWeek.add("Saturday");
        allTheDaysOfWeek.add("Sunday");

        Set<String> weekendDays = new HashSet<>();
        weekendDays.add("Saturday");
        weekendDays.add("Sunday");

        System.out.println("\nChallenge-1");

        Iterator weekendDaysIterator = weekendDays.iterator();
        Set<String> tmpSet = new HashSet<>();

        while (weekendDaysIterator.hasNext()) {
            Object value = weekendDaysIterator.next();
            boolean isTrue = allTheDaysOfWeek.contains(value);
            if (isTrue == true) {
                tmpSet.add((String) value);
            }
        }
        if (!(tmpSet.isEmpty())) {
            allTheDaysOfWeek.retainAll(tmpSet);
            System.out.print("The first set \"allTheDaysOfWeek\" only with days that are the same in the second set \"weekendDays\":");
            Iterator allTheDaysOfWeekIterator = allTheDaysOfWeek.iterator();
            while (allTheDaysOfWeekIterator.hasNext()) {
                System.out.print("::" + allTheDaysOfWeekIterator.next() + "::");
            }
        } else {
            System.out.println("Not match between the first set and the second set.");
        }

        /*
         Create a new hashMap of types <String,String> and populate it with elements containing an email (String) and a name (String).
         Next, create a new Set and populate it with the keys from the hashMap you created.
         */
        HashMap<String, String> emailName = new HashMap<>();
        emailName.put("omar@gmail.com", "Omar");
        emailName.put("johansson@gmail.com", "Johansson");
        emailName.put("peter@gmail.com", "Peter");
        emailName.put("maikel@gmail.com", "Maikel");
        emailName.put("alberto@gmail.com", "Alberto");


        HashMap<String, String> newEmailName = new HashMap<>();
        Iterator iteratorEmailName = emailName.keySet().iterator();
        while (iteratorEmailName.hasNext()) {
            newEmailName.put((String) iteratorEmailName.next(), "");
        }

        System.out.println("\nChallenge-2");
        System.out.print("::" + newEmailName.entrySet() + "::");

        /*
        Create a new class and call it SuperHero.
        Add fields for Id,Name and Age + getters and setters.
        Have the class implement the Comparable interface.
        Implement the override method and have it compare the AGE of the superhero.
        Next, create a new arrayList of type SuperHero.
        Sort the list by age and print out each element.
         */

        ArrayList<SuperHero> superHeroesArrayList = new ArrayList<>();
        superHeroesArrayList.add(new SuperHero(1, "Omar", 40));
        superHeroesArrayList.add(new SuperHero(2, "Johansson", 25));
        superHeroesArrayList.add(new SuperHero(3, "Peter", 55));
        superHeroesArrayList.add(new SuperHero(4, "Maikel", 37));
        superHeroesArrayList.add(new SuperHero(5, "Alberto", 19));

        Collections.sort(superHeroesArrayList);

        System.out.println("\nChallenge-3");
        for (SuperHero o : superHeroesArrayList) {
            System.out.println(o);
        }

        /*
        Create an array of type int with numbers: {1,4,4,2,6,7}.
        Next, create an appropriate Collection and populate it with the content of the int array.
        Lastly, print out each element in the Collection without duplicates.
         */
        int[] numArray = {1, 4, 4, 2, 6, 7};
        ArrayList<Integer> numArrayList = new ArrayList<>();
        for (int num: numArray){
            numArrayList.add(num);
        }
        System.out.println("Challenge-4");
        System.out.print(new TreeSet<Integer>(numArrayList));
    }
}

class Car {
    private int id;
    private String brand;
    private String model;

    public Car(int id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

class SuperHero implements Comparable<SuperHero> {
    private int id;
    private String name;
    private int age;

    public SuperHero(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(SuperHero superHero) {
        return this.age - superHero.getAge();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID: " + this.getId() + ", Name: " + this.getName() + ", Age: " + this.getAge();
    }

}

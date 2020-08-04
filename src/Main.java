import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List <Person> list = new ArrayList();

        list.add(new Person());
        list.add(new Person());
        list.add(new Person());

        List <Person> secList = list;
        list.add(new SecondPerson());

        List <Integer> integer = Arrays.asList(1,2,3);
        List <? extends Number> num = integer;

        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;
        nums.get(0); // compile-time error

        ThirdPerson person = new ThirdPerson();
        person.thirdPersonMeth();
    }
}

class Person{
    public void personMeth(){
        System.out.println("personMeth");
    }

    public int aPerson = 0;
}

class SecondPerson extends Person{
    public void secondPersonMeth(){
        System.out.println("secondPersonMeth()");
    }

    public int aSecondPerson = 0;
}

class ThirdPerson extends SecondPerson{
    public void thirdPersonMeth(){
        System.out.println("thirdPersonMeth()");
        //super.secondPersonMeth();
        
    }
}


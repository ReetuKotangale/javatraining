package Day8;

public class MyListGenericRunner {
    public static void main(String[] args) {
        MyList<String> mylist=new MyList<>();
        mylist.addElements("Apple");
        mylist.addElements("Mango");
        mylist.addElements("Orange");
        mylist.addElements("Strawberry");
        System.out.println(mylist);
        mylist.removeElements("Mango");
        System.out.println(mylist);
        String value=mylist.get(0);
        System.out.println("the value according to index position:"+value);

        MyList list2=new MyList();//also MyList<Character> list2=new MyList<>();
        list2.addElements('A');
        list2.addElements('B');
        list2.addElements('C');
        list2.addElements('D');
        System.out.println(list2);
        list2.removeElements('A');
        System.out.println(list2);
    }
}

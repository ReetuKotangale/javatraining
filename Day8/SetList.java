package Day8;

import java.util.*;

public class SetList {
    public static void main(String[] args) {
        List<Character> character=List.of('V','A','Q','A','Z','Q');
        Set<Character> tree=new TreeSet<>(character);//for unique value Set is used(avoid duplicates)
        //3 type set-tree,hash,linkedHash
        System.out.println("Tree set"+tree);//tree is print sorted value

        Set<Character> linked=new LinkedHashSet<>(character);
        System.out.println("LinkedHash set"+linked);//linkedHash set is used to print values as insertion manner

        Set<Character> hash=new HashSet<>(character);
        System.out.println("Hash set"+hash);//efficient but not care to print sorted or insertion order
    }
}

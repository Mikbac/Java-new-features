package pl.mikbac.java_21;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.SequencedCollection;
import java.util.SequencedMap;
import java.util.SequencedSet;

/**
 * Created by MikBac on 10.03.2025
 */
public class SequencedCollections {

    /*
    Sequenced sets - sequencedCollection
    Sequenced sets - SequencedSet
    Sequenced sets - SequencedMap
     */
    public static void main(String[] args) {

        // --- SequencedCollection ---
        SequencedCollection<String> list = new ArrayList<>();
        list.addFirst("a");
        list.addFirst("b");
        list.addLast("c");

        System.out.println(list.getFirst()); // b
        System.out.println(list.getLast()); // c

        list.removeFirst();
        list.removeLast();

        // --- SequencedSet ---
        SequencedSet<String> set = new LinkedHashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        System.out.println(set); // [a, b, c]
        System.out.println(set.reversed()); // [c, b, a]

        // --- SequencedMap ---
        SequencedMap<String, String> map = new LinkedHashMap<>();
        map.putFirst("k1", "v1");
        map.putFirst("k2", "v2");
        map.putLast("k3", "v3");

        System.out.println(map.sequencedEntrySet()); // [k2=v2, k1=v1, k3=v3]
        System.out.println(map.reversed()); // {k3=v3, k1=v1, k2=v2}
        System.out.println(map.sequencedKeySet()); // [k2, k1, k3]
        System.out.println(map.sequencedValues()); // [v2, v1, v3]

        System.out.println(map.firstEntry()); // k2=v2
        System.out.println(map.lastEntry()); // k3=v3
        System.out.println(map.pollFirstEntry()); // k2=v2
        System.out.println(map.pollLastEntry()); // k3=v3

    }

}

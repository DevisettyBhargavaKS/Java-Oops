package org.example.JavaOOps.Collections;

import java.util.LinkedHashSet;

public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet
                    = new LinkedHashSet<String>();
        linkedHashSet.add("java");
        linkedHashSet.add("collections");
        linkedHashSet.add("linkedHashSet");
        linkedHashSet.add("example");
        linkedHashSet.add("Basic");

            System.out.println("Initial HashSet " + linkedHashSet);
        linkedHashSet.remove("Basic");
            System.out.println("After removing element " + linkedHashSet);
        }
    }


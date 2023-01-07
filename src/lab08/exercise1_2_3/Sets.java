package lab08.exercise1_2_3;

import java.util.*;

public class Sets {

    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersectionSet = new HashSet<>();
        for (int i : first) {
            if (second.contains(i)) {
                intersectionSet.add(i);
            }
        }
        return intersectionSet;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> unionSet = new HashSet<>();
        for (int i : first) {
            unionSet.add(i);
        }
        for (int i : second) {
            unionSet.add(i);
        }
        return unionSet;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.retainAll(second);
        return result;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.addAll(second);
        return result;
    }

    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        return new ArrayList<>(new HashSet<>(source));
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> result = new ArrayList<>();
        for (int i : source) {
            if (!result.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static String firstRecurringCharacter(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return s.charAt(i) + "";
            }
            set.add(s.charAt(i));
        }
        return null;
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> set = new HashSet<>();
        Set<Character> result = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                result.add(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }
        return result;
    }

    public static Integer[] toArray(Set<Integer> source) {
        return (Integer[]) source.toArray();
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }

}

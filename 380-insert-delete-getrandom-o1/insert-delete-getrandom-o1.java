
import java.util.*;

class RandomizedSet {
    Set<Integer> S;
    List<Integer> v;

    public RandomizedSet() {
        S = new HashSet<>();
        v = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (S.size() == 0 || !S.contains(val)) {
            S.add(val);
            v.add(val);
            return true;
        }

        return false;
    }

    public boolean remove(int val) {
        if (S.contains(val)) {
            S.remove(val);
            v.remove(Integer.valueOf(val)); // Remove by value
            return true;
        }

        return false;
    }

    public int getRandom() {
        return v.get(new Random().nextInt(v.size()));
    }
}
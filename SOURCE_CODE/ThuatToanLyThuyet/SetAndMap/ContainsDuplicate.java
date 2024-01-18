package ThuatToanLyThuyet.SetAndMap;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> mySet = new HashSet<>();

        for (int n :
                nums) {
            if (mySet.contains(n) == true) {
                return true;
            } else {
                mySet.add(n);
            }
        }
        return false;
    }
}

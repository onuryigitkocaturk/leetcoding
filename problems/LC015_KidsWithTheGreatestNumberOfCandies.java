import java.util.ArrayList;
import java.util.List;

public class LC015_KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int initialMax = 0;

        for (int candie : candies) {
            initialMax = Math.max(initialMax, candie);
        }

        List<Boolean> resultArr = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= initialMax) {
                resultArr.add(true);
            } else {
                resultArr.add(false);
            }
        }
        return resultArr;
    }
}

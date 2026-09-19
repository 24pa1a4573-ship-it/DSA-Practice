// You have n items; the i-th item has value val[i] and weight wt[i].
// A knapsack can carry at most capacity units of weight.
// You may take any fraction of an item (i.e. split items).
// Return the maximum total value that can be placed in the knapsack, rounded to exactly 6 decimal places.


// Example 1

// Input: val = [60,100,120], wt = [10,20,30], capacity = 50
// Output: 240.000000

// Explanation:
//  • Take item 0 (w=10, v=60)
//  • Take item 1 (w=20, v=100)
//  • Take 2⁄3 of item 2 (w=20, v=80)

// Total value = 60 + 100 + 80 = 240

class Solution {

    static class Item {
        int value;
        int weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    public double fractionalKnapsack(int[] val, int[] wt, long cap) {
        int n = val.length;
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(val[i], wt[i]);
        }
        Arrays.sort(items, (a, b) ->
            Double.compare(
                (double)b.value / b.weight,
                (double)a.value / a.weight
            )
        );
        double ans = 0;
        for (Item item : items) {

            if (item.weight <= cap) {
                // Take whole item
                ans += item.value;
                cap -= item.weight;
            } 
            else {
                // Take only the fraction that fits
                ans += ((double) cap / item.weight) * item.value;
                break;
            }
        }
        return ans;
    }
}

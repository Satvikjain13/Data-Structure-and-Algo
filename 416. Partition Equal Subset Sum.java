class Solution{
public boolean canPartition(int[] nums) {
    int sum = 0;
    for (int num : nums) sum += num;
    if (sum % 2 != 0) return false;
    int target = sum / 2;

    Set<Integer> possible = new HashSet<>();
    possible.add(0);

    for (int num : nums) {
        Set<Integer> newSet = new HashSet<>(possible);
        for (int s : possible) {
            if (s + num == target) return true;
            if (s + num < target) newSet.add(s + num);
        }
        possible = newSet;
    }
    return possible.contains(target);
}
}

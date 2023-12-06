class Solution {
    public int totalMoney(int n) {
        int weekcount = n / 7;
        int remaining_days = n % 7;
        
        int total = ((weekcount * (weekcount - 1)) / 2) * 7; // Contribution from complete weeks
        total += weekcount * 28; // Contribution from complete weeks (additional on Mondays)
        total += ((remaining_days * (remaining_days + 1)) / 2) + (weekcount * remaining_days); // Contribution from remaining days
        
        return total;
    }
}
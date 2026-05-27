public class StockBuyandSell {
    public static int maxProfit(int[] prices) {
        int j=0;
        int i=1;
        int n = prices.length;
        int max =0;
        while(i<n){
            max = Math.max(max,prices[i]-prices[j]);
            if(prices[i]<prices[j]){
                j=i;
            }
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}

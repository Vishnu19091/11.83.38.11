package DSA.Arrays.prblm_qn;

public class BuyNDsell {
    public static int maxProfitBF(int[] prices){
        int maxProfit = 0;

        for(int i = 0; i<prices.length;i++){
            for(int j = i+1; j<prices.length;j++){
                int profit = prices[j] - prices[i];

                if(profit > maxProfit){
                    maxProfit=profit;
                }
            }
        }
        return maxProfit;
    }

    public static int maxProfitOP(int[] arr){
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for (int p=0;p<arr.length;p++){
            if(arr[p] < minPrice){
                minPrice=arr[p];
            }

            int profit = arr[p]- minPrice;

            if(profit > maxPrice){
                maxPrice = profit;
            }
        }

        return maxPrice;
    }
    public static void main(String[] args) {
        int[] stocks={1,2,3,1,5,7,9,1,3};
        System.out.println(maxProfitOP(stocks));
    }
}

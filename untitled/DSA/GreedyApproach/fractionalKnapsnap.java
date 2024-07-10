import java.util.Comparator;

public class fractionalKnapsnap {
    public static double getMaxValue(itemValues[] arr,int capacity){
        Arrays.sort(arr, new Comparator<itemValues>() {
            @Override
            public int compare(itemValues item1,itemValues item2)
            {
                double cpr1=Double.valueOf(item1.profit/item1.weight);
                double cpr2=Double.valueOf(item2.profit/item2.weight);
                if (cpr1<cpr2){
                    return 1;

                }
                else{
                    return -1;
                }
            } 
            
        })
        double totalValue=0;
        for (itemValues i:arr){
            int curWt=(int)i.weight;
            int curPr=(int)i.profit;

            if (capacity-curWt>=0){
                capacity=capacity-curWt;
                totalValue+=curPr;
            }
            else{
                double fraction=()
            }
        }


    }
    static class itemValues{
        int weight,profit;
        public itemValues(int wt,int profit){
            this.weight=wt;
            this.profit=profit;

        }

    }
    public static void main(String[] args) {
        itemValues[] arr={
            new itemValues(25, 5),
            new itemValues(75, 10),
            new itemValues(100, 12),
            new itemValues(50, 4),
            new itemValues(45, 7),
            new itemValues(90, 9),
            new itemValues(30, 3),
        };
        int capacity=37;
        //function calling 
        double maxValue = getMaxValue(arr,capacity);
        System.out.println("the maximum value is "+maxValue);

    }
    
}

// real-life example of using different data types, to calculate and output the total cost of a number of items:
public class DataTypesProblem1 {
    public static void main(String[] args){
        int items=50;
        float costPerItem=99.9f;
        float totalCost=items*costPerItem;
        char currency='$';
        System.out.println("Current items: " + items+currency);
        System.out.println("Current cost per item: " + costPerItem+currency);
        System.out.println("Current total cost: " + totalCost+currency);
    }
}

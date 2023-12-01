import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new BottleOFWater("qwe", 123, 100));
        productList.add(new BottleOFWater("qwe", 200, 150));
        productList.add(new BottleOFWater("zxcg", 500, 1000));
        productList.add(new BottleOFWater("qaffwe", 123, 10));
        productList.add(new HotWater("HotWAter1", 150, 500, 78));
        productList.add(new HotWater("HotWAter2", 250, 500, 78));

        HotWaterVendingMachine vendingMachine = new HotWaterVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("HotWAter2", 150,78));

    }
}
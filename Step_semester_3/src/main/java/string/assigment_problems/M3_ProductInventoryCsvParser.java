package string.assigment_problems;

public class M3_ProductInventoryCsvParser {

    public static void parseInventoryRecord(String csvLine) {
        if (csvLine == null) {
            System.out.println("Invalid Record");
            return;
        }

        String[] fields = csvLine.split(",");
        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String product = fields[0].trim();
        String sku = fields[1].trim();
        String qty = fields[2].trim();

        System.out.printf("Product: %s | SKU: %s | Qty: %s%n", product, sku, qty);
    }

    public static void main(String[] args) {
        String input1 = "Wireless Mouse,WM-2201,150";
        System.out.printf("Input: \"%s\"%nOutput: ", input1);
        parseInventoryRecord(input1);

        String input2 = "Wireless Mouse,150";
        System.out.printf("%nInput: \"%s\"%nOutput: ", input2);
        parseInventoryRecord(input2);
    }
}

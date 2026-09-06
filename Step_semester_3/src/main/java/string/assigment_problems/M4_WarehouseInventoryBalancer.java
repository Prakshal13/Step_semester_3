package string.assigment_problems;

public class M4_WarehouseInventoryBalancer {

    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        if (sectionA == null || sectionB == null) {
            System.out.println("Invalid inventory data.");
            return;
        }

        int totalA = 0;
        int totalB = 0;
        int maxQty = Integer.MIN_VALUE;
        String maxSection = "";
        int maxItemIndex = -1;

        int len = Math.min(sectionA.length, sectionB.length);

        for (int i = 0; i < len; i++) {
            totalA += sectionA[i];
            totalB += sectionB[i];

            if (sectionA[i] > maxQty) {
                maxQty = sectionA[i];
                maxSection = "Section A";
                maxItemIndex = i + 1; // 1-based item index
            }

            if (sectionB[i] > maxQty) {
                maxQty = sectionB[i];
                maxSection = "Section B";
                maxItemIndex = i + 1; // 1-based item index
            }
        }

        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";

        System.out.printf("Section A Total: %d | Section B Total: %d | Status: %s | Highest Quantity: %d (%s, Item %d)%n",
                totalA, totalB, status, maxQty, maxSection, maxItemIndex);
    }

    public static void main(String[] args) {
        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};

        System.out.println("Input: sectionA={20,15,30}, sectionB={25,10,30}");
        analyzeInventory(sectionA, sectionB);
    }
}

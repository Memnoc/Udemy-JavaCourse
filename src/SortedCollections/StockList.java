// This class holds a list of all the items in a map, and will include methods to add stock, remove stock when it's sold out.
// Because the stock item class uses the name when overriding equals and hashCode we can safely use the name as they key for the map

package SortedCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {
    private final Map<String,StockItem> list;

    public StockList() {
        this.list = new HashMap<>();
    }

    public int addStock(StockItem item) {
        if (item != null) {
            // check if we already have quantities of this item
            StockItem inStock = list.getOrDefault(item.getName(), item);
            // If there are already stocks on this item, adjust the quantity
            if (inStock != item) {
                // if they are not the same, pass the value of whatever was already in the map into our current item
                item.adjustStock(inStock.getQuantityInStock());
            }

            // update the item in either case, return the newly update stock quantity
            list.put(item.getName(), item);
            return item.getQuantityInStock();
        }
        // return 0 if there has not been stock movements
        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = list.getOrDefault(item, null);

        /*
         - if we have stocks
         - if the getQuantityInStock in stock is greater than the quantity that we are asking for to be sold
         - if the quantity we asked for has to also be greater than 0
         - all of it is true, then adjust the stock quantity by deducting what has been sold from the inStock quantity
         - return quantity to indicate that's how many items we are taking out of the stock
         */
        if ((inStock != null) && (inStock.getQuantityInStock() >= quantity) && (quantity > 0)) {
            inStock.adjustStock(- quantity);
            return quantity;
        }
        /*
        - if we get here, either we did not have it in stock,
        - or there wasn't sufficient quantity
        - or the quantity passed was equal or greater than 0
         */
        return 0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String,StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String,StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.getQuantityInStock();

            s = s + stockItem + ". There are " + stockItem.getQuantityInStock() + " in stock. Value of items: ";
            s = s + itemValue + "\n";
            totalCost += itemValue;
        }

        return s + "Total stock value " + totalCost;
    }
}

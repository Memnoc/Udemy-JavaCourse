package SortedCollections;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock = 0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;  // or here (but you wouldn't normally do both).
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if(price > 0.0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityStock + quantity;
        if(newQuantity >=0) {
            this.quantityStock = newQuantity;
        }
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if (obj == this) { // true: testing against the same object in memory
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass())) { // false: if the object is null, or the class of the object is different from this class (which is our object class, then we cannot compare.
            return false;
        }

        String objName = ((StockItem)obj).getName(); // equal: name of our current object vs the name of the object that has been passes
        return this.name.equals(objName); // this can return true or false
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
        System.out.println("Entering StockItem.compareTo");
        if (this == o) { // if the object is the same object in memory
            return 0;
        }
        if (o != null) { // if the object is not null
            return this.name.compareTo(o.getName()); /// compare the object name to the name passed. It can return -1 (less then), 0(equals), or 1(greater)
        }
        // This means that if you want to use the compareTo() function we have to assume we are not comparing against something that it's null.
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price;
    }
}

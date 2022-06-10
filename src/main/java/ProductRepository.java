public class ProductRepository {

    private Product[] items = new Product[0];
    /*private Product[] items = {
            new Product(1, "Отцы и дети", 800, "Тургенев"),
            new Product(2, "iPhone SE", 50000, "Apple"),
            new Product(3, "Война и Мир", 5000, "Толстой"),
            new Product(4, "Galaxy S 10", 60000, "Samsung"),
            new Product(5, "Преступление и наказание", 3000, "Достоевский"),
            new Product(6, "Mi Not 10 Light", 30000, "Xiaomi"),
            //new ViewingItem(707, "Номер один")
    };

     */

    public void save(Product item) {
        int length = items.length + 1;
        Product[] tmp = new Product[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Product[] findAll() { return items; }

    public void removeById(int id) {
        int length = items.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product item: items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }


}

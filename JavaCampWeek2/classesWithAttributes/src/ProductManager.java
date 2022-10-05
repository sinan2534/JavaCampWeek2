public class ProductManager {
    public void Add(Product product) {
        //JDBC
        System.out.println("Ürün eklendi: " + product.name);
    }

    public void Update(Product product) {
        System.out.println("Ürün fiyatı güncellendi: " + product.price);
    }

    public void Remove(Product product) {
        System.out.println("Stok tükenmek üzere: " + product.stockAmount);
    }
}
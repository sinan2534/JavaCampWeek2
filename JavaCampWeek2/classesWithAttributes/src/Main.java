public class Main {

    public static void main(String[] args) {
        // 2 farklı şekilde kullanabiliyoruz.
        // Product product = new Product(1,"Laptop","Asus Laptop",9000,2,4532139);
        Product product = new Product();
        product.name = "Laptop";
        product.description = "Asus Laptop";
        product.price = 9000;
        product.stockAmount = 2;
        product.setId(1);
        product.setKod(45328010);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        productManager.Update(product);
        productManager.Remove(product);
        System.out.println("ürün ID: " + product.getId());
        System.out.println("ürün kodu: " + product.getKod());
    }
}

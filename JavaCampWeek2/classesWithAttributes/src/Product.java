public class Product {
    //                         !!!" Buna Overloading (Asırı yükleme)"!!!
//   public Product(int id,String name,String description,double price,int stockAmount,int kod){
//     System.out.println("Yapıcı blok çalıştı");
//       this.id= id;
//       this.name= name;
//       this.price= price;
//       this.description=description;
//       this.stockAmount=stockAmount;
//       this.kod=kod;
//}

    public Product() {

    }

    //Attribute / field
    private int id;
    public String name;
    public String description;
    public double price;
    public int stockAmount;
    private int kod;
    //Private sadece tanımlandığı blok içerisinde geçerli


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }
}

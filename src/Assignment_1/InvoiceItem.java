package Assignment_1;


public class InvoiceItem {
    private int id;
    private String description;
    private int quantity;
    private double unitPrice;

    InvoiceItem(){
        id=0;
        description="Unknow";
        quantity=0;
        unitPrice=0;
    }
    InvoiceItem(int id,String desc,int qty,double unitP){
        this.id=id;
        this.description=desc;
        this.quantity=qty;
        this.unitPrice=unitP;
    }
    InvoiceItem(int id,String desc,int qty){
        this(id,desc,qty,200);
    }

    //getters


    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    //setters


    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }


    public String toString(){
        double total=quantity*unitPrice;
        return "========== Invoice Item ==========\n" +
                "Product Id: "+id+"\nProduct Name :"+description+"\nQuantity :"+quantity+"\nUnit Price : $"+unitPrice+"\nTotal Price:: $"+total;
    }

}

class test2{
    public static void main(String[] args) {
        InvoiceItem invoice1=new InvoiceItem(1,"Pen",5,2);
        InvoiceItem invoice2=new InvoiceItem(2,"Book",9);
        System.out.println(invoice1.toString());
        System.out.println(invoice2.toString());
        invoice2.setDescription("Laptop");
        invoice2.setUnitPrice(500);
        System.out.println(invoice2.toString());
    }

}


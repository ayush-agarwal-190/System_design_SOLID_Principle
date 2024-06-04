// Single Responsible - A class should have only one reason to change

class Marker
{
    String name;
    String color;
    int year;
    int price;

    public Marker(String name,String color,int year,int price)
    {
        this.name=name;
        this.color=color;
        this.year=year;
        this.price=price;
    }
}

class Invoice1
{
    private Marker marker;
    private int quantity;

    public Invoice1(Marker marker,int quantity)
    {
        this.marker=marker;
        this.quantity=quantity;
    }
    public int calculateTotal()
    {
        int price=((marker.price)*this.quantity);
        return price;
    }
    public void printInvoice()
    {

    }
    public void saveToDB()
    {

    }


}

/// To too do single Responsible we make different class for each 

class Invoice{
    private Marker marker;
    private int quantity;
    public Invoice(Marker marker,int quantity)
    {
        this.marker=marker;
        this.quantity=quantity;
    }
    public int calculateToatal()
    {
        int price=((marker.price)*this.quantity);
        return price;
    }

}
class InvoiceDao
{
    Invoice invoice;
    public InvoiceDao(Invoice invoice)
    {
        this.invoice=invoice;
    }
    public void saveToDB()
    {

    }
}

class InvoicePrinter
{
    private Invoice invoice;
    public InvoicePrinter(Invoice invoice)
    {
        this.invoice=invoice;
    }
    public void print()
    {
        
    }
}


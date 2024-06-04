// Open for extension but closed for modification 

class InvoiceDao{
    Invoice invoice;
    public InvoiceDao(Invoice invoice)
    {
        this.invoice=invoice;
    }
    public void saveToDB()
    {
        
    }

}

// The down one is not following the princple
class InvoiceDao{
    Invoice invoice;
    public InvoiceDao(Invoice invoice)
    {
        this.invoice=invoice;
    }
    public void saveToDB()
    {

    }
    public void saveToFile(String filename)
    {

    }

}

// 
        //   Invlice Dao 
        //   /  \    \
        //   DB  File  Extension if required
interface InvoiceDao
{
    public void save(Invoice invoice);
    
}
class DatabaseInvoiceDao implements InvoiceDao
{
    @Override
    public void save(Invoice invoice)
    {

    }
}

class FileInvoiceDao implements InvoiveDao
{
    @Override
    public void save(Invoice invoice)
    {

    }
}

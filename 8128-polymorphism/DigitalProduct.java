public class DigitalProduct extends Product
{
    private String fileUrl;
    private String fileFormat;
    
    public DigitalProduct() {
        super();
        fileUrl = "N/A";
        fileFormat = "N/A";
    }
    
    public DigitalProduct(String name, double price, String sku, 
    String fileUrl, String fileFormat)  {
        super(name, price, sku);
        this.fileUrl = fileUrl;
        this.fileFormat = fileFormat;
    }
    
    public String getFileUrl() {
        return fileUrl;
    }
    
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
    
    public String getFileFormat() {
        return this.fileFormat;
    }
    
    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }
    
}
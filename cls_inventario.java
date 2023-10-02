public class cls_inventario{
    private String str_isbn;
    private String str_nombre;
    private String str_autores;
    private int int_stock;
    private String str_fecha_p;
    private String str_resumen;
    private String str_ubicacion;
    private float flt_valor;

    public cls_inventario(String isba, String nombre, String autores, int stock, String fecha_p, String resumen,
    String ubicacion, float valor){

        this.str_isbn = isba;
        this.str_nombre = nombre;
        this.str_autores = autores;
        this.int_stock = stock;
        this.str_fecha_p = fecha_p;
        this.str_resumen = resumen;
        this.str_ubicacion = ubicacion;
        this.flt_valor = valor;
    }

    public void setNombre(String nombre){this.str_nombre = nombre;}
    public void setAutores(String autores){this.str_autores = autores;}
    public void setFecha_p(String fecha_p){this.str_fecha_p = fecha_p;}
    public void setResumen(String resumen){this.str_resumen = resumen;}
    public void setUbicacion(String ubicacion){this.str_ubicacion = ubicacion;}


    public String getIsba(){return this.str_isbn;}
    public String getNombre(){return this.str_nombre;}
    public String getAutores(){return this.str_autores;}
    public int getStock(){return this.int_stock;}
    public String getFecha_P(){return this.str_fecha_p;}
    public String getResumen(){return this.str_resumen;}
    public String getUbicacion(){return this.str_ubicacion;}
    public float getValor(){return this.flt_valor;}

}
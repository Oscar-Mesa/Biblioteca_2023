import javax.swing.JOptionPane;

public class app_inventario {
    static cls_inventario [] inventario = new cls_inventario[5];

    static int int_posiciones = 0;

    public static void main(String[] args){
        fnt_menu_principal();
    }


    private static void fnt_consultar_libros(){
        String isbn = JOptionPane.showInputDialog(null,"Ingrese el ISBA del libro: ");
        if (isbn == null){
            jop
        }

    }

    private static void fnt_registrar_libros(){

        String isbn = JOptionPane.showInputDialog(null,"ISBA");
        String nombre = JOptionPane.showInputDialog(null,"Nombre");
        String autores = JOptionPane.showInputDialog(null,"Autores");
        int stock = Integer.parseInt(JOptionPane.showInputDialog(null,"Stock"));  
        String fecha_p = JOptionPane.showInputDialog(null,"Fecha publicación");
        String resumen = JOptionPane.showInputDialog(null,"Resumen");
        String ubicacion = JOptionPane.showInputDialog(null,"Ubicación");
        float valor = Float.parseFloat(JOptionPane.showInputDialog(null,"Valor"));

        inventario[int_posiciones] = new cls_inventario(isbn, nombre, autores, stock, fecha_p, resumen, ubicacion, valor);
        int_posiciones += 1;
        JOptionPane.showMessageDialog(null, "Registrado con éxito",
        "Registrar",JOptionPane.INFORMATION_MESSAGE);
    }


//Aréa de menúes

    private static void fnt_menu_principal(){
        while(true){
            int menu = Integer.parseInt(JOptionPane.showInputDialog(null,
            "<<< MENU PRINCIPAL >>>\n" +
            "1. Menú libros\n"+
            "2. Menú compras\n"+
            "3. Salir" ));
        
            if (menu == 1){
                fnt_menu_libros();
            }
        }


    }

    private static void fnt_menu_libros(){
        while(true){
            int menu = Integer.parseInt(JOptionPane.showInputDialog(null,
            "<<< MENU LIBROS >>>\n" +
            "1. Registrar libros\n"+
            "2. Actualizar\n"+
            "3. Consultar\n"+
            "4. Salir" ));
        
            if (menu == 1){
                fnt_registrar_libros();
            }
            
            if(menu == 2){

            }
        }
    }


}



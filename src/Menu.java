import javax.swing.*;
import java.util.ArrayList;

public class Menu {
    public static void pintarMenu(ForniteManager fm){
        int opcion = LerDatos.lerEnteiro("Introduce una opcion:" +
                "\n1) AGREGAR UN ARMA AL INVENTARIO" +
                "\n2) AGREGAR UNA SKIN AL INVENTARIO" +
                "\n3) BUSCAR UN ARMA POR TIPO" +
                "\n4) MOSTRAR SKINS POR RAREZA" +
                "\n5) ELIMINAR UN ARMA" +
                "\n6) ELIMINAR UNA SKIN" +
                "\n7) SALIR");
        switch (opcion){
            case 1:
                String tipo = LerDatos.lerString("Inrtoduce el tipo:");
                Integer daño = LerDatos.lerEnteiro("Introduce el daño:");
                fm.agregarArma(new Arma(tipo,daño));
                System.out.println("Arma añadida");
                pintarMenu(fm);
                break;
            case 2:
                String nombre = LerDatos.lerString("Introduce el nombre:");
                String rareza = LerDatos.lerString("Introduce la rareza");
                fm.agregarSkin(new Skin(nombre,rareza));
                System.out.println("Skin agregada");
                pintarMenu(fm);
                break;
            case 3:
                String tipoBusqueda = LerDatos.lerString("Introduce el tipo de arma que quieres buscar: ");
                ArrayList<Arma> armasPorTipo = fm.buscarArmaPorTipo(tipoBusqueda);
                System.out.println("Estas son las armas del tipo que estas buscando");
                for (int i = 0; i < armasPorTipo.size(); i++){
                    System.out.println("ID "+(i+1)+" "+armasPorTipo.get(i).toString());
                }
                pintarMenu(fm);
                break;
            case 4:
                String rarezaBusqueda = LerDatos.lerString("Introduce la rareza por la que quiere buscar:");
                ArrayList<Skin> skinsPorRareza = fm.mostrarSkinsPorRareza(rarezaBusqueda);
                System.out.println("Estas son las Skins del tipo de rareza que buscas");
                for (int i = 0; i < skinsPorRareza.size(); i++){
                    System.out.println("ID "+(i+1)+" "+skinsPorRareza.get(i).toString());
                }
                pintarMenu(fm);
                break;
            case 5:
                String tipoEliminar = LerDatos.lerString("Introduce el tipo de arma que quieres eliminar:");
                fm.eliminarArma(tipoEliminar);
                pintarMenu(fm);
                break;
            case 6:
                fm.mostrarSkins();
                String nombreEliminar = LerDatos.lerString("Introduce el nombre del arma que quieres eliminar:");
                System.out.println("Skin eliminada");
                pintarMenu(fm);
                break;
            case 7:
                break;
            default:
                pintarMenu(fm);
                break;
        }
    }
}

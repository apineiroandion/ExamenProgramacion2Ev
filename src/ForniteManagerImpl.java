import java.util.ArrayList;

public class ForniteManagerImpl implements ForniteManager{
    private ArrayList<Arma> armas = new ArrayList<>();
    private ArrayList<Skin> skins = new ArrayList<>();

    @Override
    public void agregarArma(Arma arma) {
        armas.add(arma);
    }

    @Override
    public void agregarSkin(Skin skin) {
        skins.add(skin);
    }

    @Override
    public ArrayList<Arma> buscarArmaPorTipo(String tipo) {
        ArrayList<Arma> armasTipo = new ArrayList<>();
        for(int i = 0;i < armas.size(); i++){
            if (armas.get(i).getTipo().equals(tipo)){
                armasTipo.add(armas.get(i));
            }
        }
        return armasTipo;
    }

    @Override
    public ArrayList<Skin> mostrarSkinsPorRareza(String rareza) {
        ArrayList<Skin> skinsTipo = new ArrayList<>();
        for(int i = 0; i < skins.size(); i++){
            if (skins.get(i).getRareza().equals(rareza)){
                skinsTipo.add(skins.get(i));
            }
        }
        return skinsTipo;
    }

    @Override
    public void eliminarArma(String tipo) {
        System.out.println("Introduce el indice del arma que quieres borrar: ");
        for (int i = 0; i < armas.size(); i++){
            if(armas.get(i).getTipo().equals(tipo)) {
                System.out.println("ID " + (i + 1) + " " + armas.get(i).toString());
            }
        }
        Integer armaElegida = LerDatos.lerEnteiro("Elige el indice del arma que quieres borrar")-1;
        armas.remove(armaElegida);
        System.out.println("El arma ha sido eliminada");
    }

    @Override
    public void eliminarSkin(String nombre) {
        for (int i = 0; i < skins.size(); i++){
            if (skins.get(i).getNombre().equals(nombre)){
                skins.remove(this);
            }
        }
    }

    @Override
    public void mostrarSkins() {
        for (int i = 0; i < skins.size(); i++){
            System.out.println(skins.get(i).toString());
        }
    }
}

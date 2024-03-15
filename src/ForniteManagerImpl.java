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
    public void buscarArmaPorTipo(String tipo) {
        for(int i = 0;i < armas.size(); i++){
            if (armas.get(i).getTipo().equals(tipo)){
                System.out.println("ID: "+(i)+" "+armas.get(i).toString());
            }
        }
    }

    @Override
    public void mostrarSkinsPorRareza(String rareza) {
        ArrayList<Skin> skinsTipo = new ArrayList<>();
        for(int i = 0; i < skins.size(); i++){
            if (skins.get(i).getRareza().equals(rareza)){
                System.out.println("ID: "+(i)+" "+skins.get(i).toString());
            }
        }
    }

    @Override
    public void eliminarArma(String tipo) {
        System.out.println("Introduce el indice del arma que quieres borrar: ");
        for (int i = 0; i < armas.size(); i++){
            if(armas.get(i).getTipo().equals(tipo)) {
                System.out.println("ID " + (i) + " " + armas.get(i).toString());
            }
        }
        Integer armaElegida = LerDatos.lerEnteiro("Elige el indice del arma que quieres borrar");
        try{
            armas.remove(armas.get(armaElegida));
            System.out.println("El arma ha sido eliminada");
        }catch (IndexOutOfBoundsException e){
            System.out.println("no existe el indice");
        }


    }

    @Override
    public void eliminarSkin(String nombre) {
        for (int i = 0; i < skins.size(); i++){
            if (skins.get(i).getNombre().equals(nombre)){
                skins.remove(skins.get(i));
            }
        }
    }

    @Override
    public void mostrarSkins() {
        for (int i = 0; i < skins.size(); i++){
            System.out.println(skins.get(i).toString());
        }
    }

    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<Arma> armas) {
        this.armas = armas;
    }

    public ArrayList<Skin> getSkins() {
        return skins;
    }

    public void setSkins(ArrayList<Skin> skins) {
        this.skins = skins;
    }
}

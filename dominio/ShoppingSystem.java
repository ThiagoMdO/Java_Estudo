package academy.devdojo.maratonajava.javacore.CompassUol.dominio;

public class ShoppingSystem {
    private String tipoLoja;
    private int numeroLoja;
    public void venderItem(String item, double valorItem){
        System.out.println("Foi vendido "+item+" no valor de: "+valorItem);
    }

    public String getTipoLoja(){
        return tipoLoja;
    }
    public void setTipoLoja(String tipoLoja){
        this.tipoLoja = tipoLoja;
    }
    public int getNumeroLoja() {
        return numeroLoja;
    }
    public void setNumeroLoja(int numeroLoja){
        this.numeroLoja = numeroLoja;
    }

}

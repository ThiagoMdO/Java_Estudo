package academy.devdojo.maratonajava.javacore.CompassUol.dominio;

public abstract class AbstractRecipe {

    public void execute(){
        getReady();
        getTheDish();
        cleanup();
    }

    abstract void getReady();
    abstract void getTheDish();
    abstract void cleanup();

    // prepare
    // recipe
    // cleanup

}

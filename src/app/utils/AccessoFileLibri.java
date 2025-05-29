package app.utils;

public class AccessoFileLibri extends AccessoFileAstratto {

    private static AccessoFileLibri istanza;

    private AccessoFileLibri() {
        super("C:\\Users\\gabri\\IdeaProjects\\Progetto Ing. del Software\\" +
                "src\\app\\libreria");
    }

    public static AccessoFileLibri getIstanza() {
        if (istanza == null)
            istanza = new AccessoFileLibri();
        return istanza;
    }

}

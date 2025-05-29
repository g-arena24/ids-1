package app.utils;

public class AccessoFileStati extends AccessoFileAstratto {

    private static AccessoFileStati istanza;

    private AccessoFileStati() {
        super("C:\\Users\\gabri\\IdeaProjects\\" +
                "Progetto Ing. del Software\\src\\app\\stati\\databaseStati");
    }

    public static synchronized AccessoFileStati getIstanza() {
        if (istanza == null)
            istanza = new AccessoFileStati();
        return istanza;
    }

}

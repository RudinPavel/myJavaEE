package ru.vsu.persistence;

public abstract class DAO {

    private static final String POSTGRES_URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String POSTGRES_NAME = "postgres";
    private static final String POSTGRES_PASSWORD = "111111";

    public DAO() {
        try {
            Class.forName("org.postgresql.Driver"); // проверка наличия драйвера
        }
        catch (Exception e)
        {

        }
    }
}

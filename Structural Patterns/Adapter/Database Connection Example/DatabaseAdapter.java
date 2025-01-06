public class DatabaseAdapter implements DatabaseConnection{
    OldDatabaseConnection odc;

    public DatabaseAdapter(OldDatabaseConnection odc) {
        this.odc = odc;
    }

    @Override
    public void connect() {
        odc.oldConnect();
    }

    @Override
    public void disconnect() {
        odc.oldDisconnect();
    }
}

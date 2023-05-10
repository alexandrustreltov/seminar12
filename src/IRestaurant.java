public interface IRestaurant {
    private string nume;
    private List<Client> listaClienti;

    void abonareClient(IClient client){
        this.listaClienti.add(client);
    }
    void dezabonareClient(IClient client){
        this.listaClienti.remove(client);
    }
    void notificareClient(String mesaj){
    for(IClient client: this.listaClienti)   {
        client.primesteNotificare(mesaj);
    }
    }

}

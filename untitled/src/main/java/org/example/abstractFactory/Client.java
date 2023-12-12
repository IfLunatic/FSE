package org.example.abstractFactory;

public class Client {

    private Dropshipper dropshipper;
    private Order order;

    public Client(Dropshipper dropshipper) {
        this.dropshipper = dropshipper;
        this.order = dropshipper.createItem();
    }

    public void shipOrder() {
        order.ship();
    }

    public static void main(String[] args) {
        Client electronicClient = new Client(new ElectronicDropshipper());
        electronicClient.shipOrder();

        Client clothingClient = new Client(new ClothingDropshipper());
        clothingClient.shipOrder();
    }
}

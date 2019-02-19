package uk.zebington.cinemaenterpriso.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import uk.zebington.cinemaenterpriso.entities.Purchasable;

public class ViewBasketItemController extends Controller {
    @FXML
    public Label itemName;
    @FXML
    public Label itemPrice;

    private Purchasable purchasable;

    public ViewBasketItemController(Purchasable purchasable) {
        super("viewBasketItem");
        setPurchasable(purchasable);
    }

    public Purchasable getPurchasable() {
        return purchasable;
    }

    public void setPurchasable(Purchasable purchasable) {
        this.purchasable = purchasable;
        this.itemName.setText(purchasable.getName());
        this.itemPrice.setText(purchasable.getPrice().toString());
    }
}

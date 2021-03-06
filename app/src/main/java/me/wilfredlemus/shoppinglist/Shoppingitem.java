package me.wilfredlemus.shoppinglist;

/**
 * Created by walr on 20/11/16.
 */

public class Shoppingitem {
    private String text;
    private boolean checked;

    public Shoppingitem(String text) {
        this.text = text;
        this.checked = false;
    }

    public Shoppingitem(String text, boolean checked) {
        this.text = text;
        this.checked = checked;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void toggleChecked() {
        this.checked = !this.checked;
    }
}

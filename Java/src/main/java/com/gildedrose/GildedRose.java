package com.gildedrose;

class GildedRose {

    private BaseItem[] items;

    public GildedRose(BaseItem[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (BaseItem item : items) {
            item.updateQuality();
            item.updateSellInOfItem();
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (BaseItem i : this.items) {
            str += i.toString();
            str += "\n";
        }
        return str;
    }

}
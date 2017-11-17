package com.gildedrose;

class GildedRose {

    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items)
            updateQualityForOneItem(item);
    }

    private void updateQualityForOneItem(Item item) {
        Quality quality = new NormalQuality();
        switch (item.name) {
            case "Sulfuras, Hand of Ragnaros":
                quality = new LegendaryQuality();
                break;
            case "Aged Brie":
                quality = new AgedBrieQuality();
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                quality = new ConcertPassQuality();
                break;
        }
        quality.update(item);
    }

    @Override
    public String toString() {
        String str = "";
        for (Item i : this.items) {
            str += i.toString();
            str += "\n";
        }
        return str;
    }
}
package com.gildedrose;

import java.util.ArrayList;

class GildedRose {

    private Item[] items;
    private ArrayList<Quality> qualities;
    private NormalQuality normalQuality = new NormalQuality();

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        qualities = new ArrayList<>();
        qualities.add(new LegendaryQuality());
        qualities.add(new AgedBrieQuality());
        qualities.add(new ConcertPassQuality());

        for (Item item : items)
            getQuality(item).update(item);
    }

    private Quality getQuality(Item item) {
        for (Quality quality : qualities) {
            if (quality.applies(item)) {
                return quality;
            }
        }

        return normalQuality;
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
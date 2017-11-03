package main

import "fmt"

var itemsBehaviour = map[string]ItemBehaviour{
	"Sulfuras, Hand of Ragnaros": &Legendary{},
	"Aged Brie": &Inverse{},
	"Backstage passes to a TAFKAL80ETC concert": &Concert{},
	"Sword of Burning Fire": &Normal{},
	"Vest of Hermes": &Normal{},
}

type GildedRose struct {
	Items []*Item
}

func (gr *GildedRose) UpdateQuality() {
	for _, item := range gr.Items {
		gr.updateQualityForOneItem(item)
	}
}

func (gr *GildedRose) updateQualityForOneItem(item *Item) {
	itemsBehaviour[item.name].Update(item)
}



















func (gr *GildedRose) updateQualityOfItem(item *Item) {
	if item.name == "Sulfuras, Hand of Ragnaros" {

	} else if item.name == "Aged Brie" {
		gr.increaseQuality(item)
	} else if item.name == "Backstage passes to a TAFKAL80ETC concert" {
		gr.increaseQuality(item)

		if  item.sellIn <= 10 {
			gr.increaseQuality(item)
		}

		if item.sellIn <= 5 {
			gr.increaseQuality(item)
		}
	} else {
		gr.decreaseQuality(item)
	}
}

func (gr *GildedRose) updateQualityOfExpiredItem(item *Item) {
	if item.name == "Sulfuras, Hand of Ragnaros" {

	} else if item.name == "Aged Brie" {
		gr.increaseQuality(item)
	} else if item.name == "Backstage passes to a TAFKAL80ETC concert" {
		item.quality = 0
	} else {
		gr.decreaseQuality(item)
	}
}

func (gr *GildedRose) updateSellInOfItem(item *Item) {
	if item.name == "Sulfuras, Hand of Ragnaros" {

	} else if item.name == "Aged Brie" {
		item.sellIn = item.sellIn - 1
	} else if item.name == "Backstage passes to a TAFKAL80ETC concert" {
		item.sellIn = item.sellIn - 1
	} else {
		item.sellIn = item.sellIn - 1
	}
}

func (gr *GildedRose) increaseQuality(item *Item) {
	if item.quality < 50 {
		item.quality = item.quality + 1
	}
}

func (gr *GildedRose) decreaseQuality(item *Item) {
	if item.quality > 0 {
		item.quality = item.quality - 1
	}
}

func (gr *GildedRose) hasExpired(item *Item) bool {
	return item.sellIn < 0
}

func (gr *GildedRose) PrintItems() string {
	res := ""

	for _, i := range gr.Items {
		res += gr.printItem(i)
	}

	return res
}

func (gr *GildedRose) printItem(i *Item) string {
	return fmt.Sprintf("%v, %v, %v\n", i.name , i.sellIn, i.quality)
}
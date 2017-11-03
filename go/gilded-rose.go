package main


type Item struct {
	name            string
	sellIn, quality int
}

func main() {
	its := []*Item{}

	GildedRose(its)
}

func GildedRose(items []*Item) {
	for _, item := range items {
		updateQualityForOneItem(item)
	}
}

func updateQualityForOneItem(item *Item) {
	updateQualityOfItem(item)
	updateSellInOfItem(item)

	if(hasExpired(item)){
		updateQualityOfExpiredItem(item)
	}

}

func updateQualityOfItem(item *Item) {
	if item.name == "Sulfuras, Hand of Ragnaros" {
	} else if item.name == "Aged Brie" {
		increaseQuality(item)
	} else if item.name == "Backstage passes to a TAFKAL80ETC concert" {
		increaseQuality(item)

		if (item.sellIn <= 10){
			increaseQuality(item)
		}

		if (item.sellIn <= 5) {
			increaseQuality(item)
		}
	} else {
		decreaseQuality(item)
	}
}

func updateQualityOfExpiredItem(item *Item) {
	if item.name == "Sulfuras, Hand of Ragnaros" {
	} else if item.name == "Aged Brie" {
		increaseQuality(item)
	} else if item.name == "Backstage passes to a TAFKAL80ETC concert" {
		item.quality = 0
	} else {
		decreaseQuality(item)
	}
}

func updateSellInOfItem(item *Item) {
	if item.name == "Sulfuras, Hand of Ragnaros" {
	} else if item.name == "Aged Brie" {
		item.sellIn = item.sellIn - 1
	} else if item.name == "Backstage passes to a TAFKAL80ETC concert" {
		item.sellIn = item.sellIn - 1
	} else {
		item.sellIn = item.sellIn - 1
	}
}

func increaseQuality(item *Item) {
	if item.quality < 50 {
		item.quality = item.quality + 1
	}
}

func decreaseQuality(item *Item) {
	if item.quality > 0 {
		item.quality = item.quality - 1
	}
}

func hasExpired(item *Item) bool {
	return item.sellIn < 0
}

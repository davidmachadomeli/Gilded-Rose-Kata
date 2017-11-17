package main

import (
	"fmt"
	"github.com/davidmachadomeli/Gilded-Rose-Kata/go/item"
	"github.com/davidmachadomeli/Gilded-Rose-Kata/go/itembehaviour"
)

var itemsBehaviour = map[string]itembehaviour.ItemBehaviour{
	"Sulfuras, Hand of Ragnaros": &itembehaviour.Legendary{},
	"Aged Brie": &itembehaviour.Inverse{},
	"Backstage passes to a TAFKAL80ETC concert": &itembehaviour.Concert{},
	"Sword of Burning Fire": &itembehaviour.Normal{},
	"Vest of Hermes": &itembehaviour.Normal{},
}

type GildedRose struct {
	Items []*item.Item
}

func (gr *GildedRose) UpdateQuality() {
	for _, item := range gr.Items {
		gr.updateQualityForOneItem(item)
	}
}

func (gr *GildedRose) PrintItems() string {
	res := ""

	for _, i := range gr.Items {
		res += gr.printItem(i)
	}

	return res
}

func (gr *GildedRose) updateQualityForOneItem(item *item.Item) {
	itemsBehaviour[item.Name].Update(item)
}


func (gr *GildedRose) printItem(i *item.Item) string {
	return fmt.Sprintf("%v, %v, %v\n", i.Name , i.SellIn, i.Quality)
}
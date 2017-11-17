package itembehaviour

import "github.com/davidmachadomeli/Gilded-Rose-Kata/go/item"

// Baja sellin y sube Quality
type Inverse struct{}

func (i *Inverse) Update(item *item.Item) {
	item.Quality = AddQualityLimitedTo50(item.Quality)
	item.SellIn -= 1

	if item.SellIn < 0 {
		item.Quality = AddQualityLimitedTo50(item.Quality)
	}
}
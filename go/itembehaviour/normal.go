package itembehaviour

import "github.com/davidmachadomeli/Gilded-Rose-Kata/go/item"

// item normal
type Normal struct {}

func (n *Normal) Update(item *item.Item) {
	item.SellIn -= 1

	item.Quality -= 1

	if item.SellIn < 0 {
		item.Quality -= 1
	}

	item.Quality = LimitTo0(item.Quality)
}

package itembehaviour

import "github.com/davidmachadomeli/Gilded-Rose-Kata/go/item"

// aumenta calidad mientras mas cerca del evento esté
type Concert struct{}

func (c *Concert) Update(item *item.Item) {
	item.SellIn -= 1

	item.Quality += 1

	if item.SellIn < 10 {
		item.Quality += 1
	}

	if item.SellIn < 5 {
		item.Quality += 1
	}

	if item.SellIn <= 0 {
		item.Quality = 0
	}

	item.Quality = LimitTo50(item.Quality)
}

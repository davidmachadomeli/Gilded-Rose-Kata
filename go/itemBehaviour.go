package main

import "math"

type ItemBehaviour interface {
	Update(item *Item)
}


// No cambia para ninguna actualizacion
type Legendary struct {}
func (l *Legendary) Update(item *Item) {}

// Baja sellin y sube Quality
type Inverse struct{}
func (i *Inverse) Update(item *Item) {
	item.quality = LimitTo50(item.quality)
	item.sellIn -= 1
}

// aumenta calidad mientras mas cerca del evento esté
type Concert struct{}
func (c *Concert) Update(item *Item) {
	item.sellIn -= 1

	item.quality += 1

	if item.sellIn < 10 {
		item.quality += 1
	}

	if item.sellIn < 5 {
		item.quality += 1
	}

	if item.sellIn <= 0 {
		item.quality = 0
	}

	item.quality = int(math.Min(float64(item.quality), float64(50)))
}

// item normal
type Normal struct {}
func (n *Normal) Update(item *Item) {
	item.sellIn -= 1

	item.quality -= 1

	if item.sellIn < 0 {
		item.quality -= 1
	}

	item.quality = int(math.Max(float64(item.quality), float64(0)))
}


func LimitTo50(quality int) int {
	return int(math.Min(float64(quality + 1), float64(50)))
}

package itembehaviour

import (
	"testing"
	"github.com/davidmachadomeli/Gilded-Rose-Kata/go/item"
	"github.com/magiconair/properties/assert"
)

func TestLegendary_Update(t *testing.T) {
	l := Legendary{}
	it := &item.Item{Name: "TestItem", SellIn: 1, Quality: 1}
	expectedItem := &item.Item{Name: "TestItem", SellIn: 1, Quality: 1}

	l.Update(it)

	assert.Equal(t, expectedItem, it)
}

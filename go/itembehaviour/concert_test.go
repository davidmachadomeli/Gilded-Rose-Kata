package itembehaviour

import (
	"testing"
	"github.com/davidmachadomeli/Gilded-Rose-Kata/go/item"
	"github.com/stretchr/testify/assert"
)

var testCasesConcert = []struct{
	name string
	item item.Item
	expectedItem item.Item
}{
	{
		"Sellin more than 10 then Quality increase once",
		item.Item{Name: "testItem", SellIn: 12, Quality: 5},
		item.Item{Name: "testItem", SellIn: 11, Quality: 6},
	},
	{
		"Sellin between 5 and 10 then Quality increase twice",
		item.Item{Name: "testItem", SellIn: 7, Quality: 10},
		item.Item{Name: "testItem", SellIn: 6, Quality: 12},
	},
	{
		"Sellin between 1 and 5 then Quality increase 3 times",
		item.Item{Name: "testItem", SellIn: 2, Quality: 10},
		item.Item{Name: "testItem", SellIn: 1, Quality: 13},
	},
	{
		"Sellin between 1 and 5 then Quality increase 3 times and limit 50",
		item.Item{Name: "testItem", SellIn: 2, Quality: 50},
		item.Item{Name: "testItem", SellIn: 1, Quality: 50},
	},
	{
		"Sellin less than 0 then Quality drops to 0",
		item.Item{Name: "testItem", SellIn: 0, Quality: 10},
		item.Item{Name: "testItem", SellIn: -1, Quality: 0},
	},
}


func TestConcert_Update(t *testing.T) {

	normal := Concert{}

	for _, testCase := range testCasesConcert {
		normal.Update(&testCase.item)

		assert.Equal(t, testCase.item, testCase.expectedItem)
	}

}

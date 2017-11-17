package itembehaviour

import (
	"testing"
	"github.com/davidmachadomeli/Gilded-Rose-Kata/go/item"
	"github.com/magiconair/properties/assert"
)

var testCasesNormal = []struct{
	name string
	item item.Item
	expectedItem item.Item
}{
	{
		"Normal behaviour",
		item.Item{Name: "testItem", SellIn: 5, Quality: 5},
		item.Item{Name: "testItem", SellIn: 4, Quality: 4},
	},
	{
		"Quality not less zero",
		item.Item{Name: "testItem", SellIn: 5, Quality: 0},
		item.Item{Name: "testItem", SellIn: 4, Quality: 0},
	},
	{
		"Sellin less zero then quality decreace twice",
		item.Item{Name: "testItem", SellIn: 0, Quality: 10},
		item.Item{Name: "testItem", SellIn: -1, Quality: 8},
	},
}


func TestNormal_Update_behaviours(t *testing.T) {

	normal := Normal{}

	for _, testCase := range testCasesNormal {
		normal.Update(&testCase.item)

		assert.Equal(t, testCase.item, testCase.expectedItem)
	}

}

package itembehaviour

import "github.com/davidmachadomeli/Gilded-Rose-Kata/go/item"

type ItemBehaviour interface {
	Update(item *item.Item)
}

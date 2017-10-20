import { expect } from 'chai';
import { Item , Shop } from './src/gilded_rose'

const printItems = items => {
    return items.map( item =>
        `${item.name} ${item.quality} ${item.sellIn}`
    ).join('\n');
};

describe("gilded-rose", () => {
    describe("buy item", () => {
        let items, shop;
        beforeEach(() => {
            items = [
                new Item("Sword of Burning Fire", 10, 26),
                new Item("Aged Brie", 10, 0),
                new Item("Vest of Hermes", 5, 7),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 24),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80)
            ];
            shop = new Shop(items);
        });

        it("should test the store", () => {
            [1,2,3,4,5,6,7,8,9,10,11].forEach(() => shop.updateQuality());

            expect(printItems(items)).to.be.equal(
                'Sword of Burning Fire 14 -1\n' +
                'Aged Brie 12 -1\n' +
                'Vest of Hermes 0 -6\n' +
                'Backstage passes to a TAFKAL80ETC concert 0 -1\n' +
                'Sulfuras, Hand of Ragnaros 80 0'
            );
        });
    });
});

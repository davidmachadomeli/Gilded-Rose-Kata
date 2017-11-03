export default class QualityUpdater {
  constructor(sellIn){
    this.sellIn = sellIn;
  }

  update(items){
    items.forEach(item  => {
      switch (item.name) {
        //case 'Sulfuras, Hand of Ragnaros':
        //break;

        case 'Aged Brie':
          this.increaseQuality(item);
          break;

        case 'Backstage passes to a TAFKAL80ETC concert':
          this.increaseQuality(item);

          if (item.sellIn <= this.sellIn.firstLimit()) {
            this.increaseQuality(item);
          }

          if (item.sellIn <= this.sellIn.secondLimit()) {
            this.increaseQuality(item);
          }
          break;

        default:
          this.decreaseQuality(item);
          break;
      }
    })
  }

  updateExpired(expiredItems) {
    expiredItems.forEach(expiredItem  => {
      switch (expiredItem.name) {
        //case 'Sulfuras, Hand of Ragnaros':
        //break;

        case 'Aged Brie':
          this.increaseQuality(expiredItem);
          break;

        case 'Backstage passes to a TAFKAL80ETC concert':
          expiredItem.quality = 0;
          break;

        default:
          this.decreaseQuality(expiredItem);
          break;
      }
    });
  }

  increaseQuality(item) {
    if (item.quality < 50) {
      item.quality = item.quality + 1;
    }
  }

  decreaseQuality(item) {
    if (item.quality > 0) {
      item.quality = item.quality - 1;
    }
  }
}
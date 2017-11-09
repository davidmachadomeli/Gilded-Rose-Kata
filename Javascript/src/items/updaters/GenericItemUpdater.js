class GenericItemUpdater {
  updateQuality(item) {
    this.decreaseQuality(item);
  }

  updateSellIn(item) {
    item.sellIn -= 1;
  }

  updateExpired(item) {
    this.decreaseQuality(item);
  }

  increaseQuality(item) {
    if (item.quality < 50) {
      item.quality += 1;
    }
  }

  decreaseQuality(item) {
    if (item.quality > 0) {
      item.quality -= 1;
    }
  }
}

export default GenericItemUpdater

import GenericItemUpdater from './GenericItemUpdater'

class ShowTicketUpdater extends GenericItemUpdater {
  increaseQuality(item) {
    if (item.quality < 50) {
      item.quality += 1;
    }
  }

  updateQuality(item) {
    this.increaseQuality(item);

    if (item.sellIn <= 10) {
      this.increaseQuality(item);
    }

    if (item.sellIn <= 5) {
      this.increaseQuality(item);
    }
  }

  updateExpired(item) {
    item.quality = 0;
  }
}

export default ShowTicketUpdater

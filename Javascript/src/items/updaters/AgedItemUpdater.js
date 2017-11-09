import GenericItemUpdater from './GenericItemUpdater'

class AgedItemUpdater extends GenericItemUpdater {
  updateQuality(item) {
    if (item.quality < 50) {
      this.increaseQuality(item);
    }
  }

  updateExpired(item) {
    this.increaseQuality(item);
  }
}

export default AgedItemUpdater

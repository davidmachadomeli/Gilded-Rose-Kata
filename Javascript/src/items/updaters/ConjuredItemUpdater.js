import GenericItemUpdater from './GenericItemUpdater'

class ConjuredItemUpdater extends GenericItemUpdater {
  updateQuality(item) {
    this.decreaseQuality(item);
    this.decreaseQuality(item);
  }

  updateExpired(item) {
    this.decreaseQuality(item);
    this.decreaseQuality(item);
  }
}

export default ConjuredItemUpdater

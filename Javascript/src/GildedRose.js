import SellInUpdater from './SellInUpdater';
import QualityUpdater from './QualityUpdater';

class GildedRose {
  constructor(items) {
    this.items = items;
  }

  updateQuality() {
    const sellInUpdater = new SellInUpdater(this.items);
    const qualityUpdater = new QualityUpdater(sellIn);

    sellInUpdater.update();
    qualityUpdater.update(this.items);
    qualityUpdater.updateExpired(
      this.items.filter(item => this.hasExpired(item))
    );
  }

  hasExpired(item) {
    return item.sellIn < 0;
  }

  toString() {
    let string = '';

    this.items.forEach((item) => {
      string += item.toString();
      string += '\n';
    });

    return string;
  }
}

export default GildedRose

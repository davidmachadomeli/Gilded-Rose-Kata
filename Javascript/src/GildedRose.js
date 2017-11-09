import AgedItemUpdater from './items/updaters/AgedItemUpdater';
import ShowTicketUpdater from './items/updaters/ShowTicketUpdater';
import LegendaryItemUpdater from './items/updaters/LegendaryItemUpdater';

import ItemUpdaterResolver from './items/resolvers/ItemUpdaterResolver';

class GildedRose {
  constructor(items) {
    this.items = items;
  }

  updateQuality() {
    this.items.forEach(item => {
      this.updateQualityForOneItem(item);
    });
  }

  updateQualityForOneItem(item) {
    const updater = new ItemUpdaterResolver().resolve(item);

    updater.updateQuality(item);
    updater.updateSellIn(item);

    // no lo lleve a los updaters para evitar repeticion
    // se podría armar una logica del tipo `hook` || `event emitter` para ejecutar esto inmediatamente
    // despues de ejecutar el updateQuality, pero me parece muy complejo.
    if (this.hasExpired(item)) {
      updater.updateExpired(item);
    }
  }

  hasExpired(item) {
    return item.sellIn < 0;
  }

  toString() {
    let string = '';

    this.items.forEach((item) => {
      string += item.toString();
      string += '/n';
    });

    return string;
  }
}

export default GildedRose

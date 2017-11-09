import AgedItemUpdater from '../updaters/AgedItemUpdater';
import ShowTicketUpdater from '../updaters/ShowTicketUpdater';
import LegendaryItemUpdater from '../updaters/LegendaryItemUpdater';
import ConjuredItemUpdater from '../updaters/ConjuredItemUpdater';

import GenericItemUpdater from '../updaters/GenericItemUpdater';

class ItemUpdaterResolver {
  resolve(item) {
    switch (item.name) {
      case 'Sulfuras, Hand of Ragnaros':
        return new LegendaryItemUpdater();

      case 'Aged Brie':
        return new AgedItemUpdater();

      case 'Backstage passes to a TAFKAL80ETC concert':
        return new ShowTicketUpdater();

      case 'Conjured health elixir':
        return new ConjuredItemUpdater();

      default:
        return new GenericItemUpdater();
      }
  }
}

export default ItemUpdaterResolver

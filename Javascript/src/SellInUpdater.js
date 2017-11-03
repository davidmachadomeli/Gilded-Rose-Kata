

export default class SellInUpdater{
  constructor(items){
    this.PASS_SELL_IN_FIRST_LIMIT = 10;
    this.PASS_SELL_IN_SECOND_LIMIT = 5;
    this.items = items;
  }

  firstLimit(){
    return this.PASS_SELL_IN_FIRST_LIMIT;
  }

  secondLimit(){
    return this.PASS_SELL_IN_SECOND_LIMIT;
  }

  update(){
    this.items
      .filter( item =>
        item.name !== 'Sulfuras, Hand of Ragnaros'
      ).forEach( item =>
        item.sellIn = item.sellIn - 1
      );
  }
}
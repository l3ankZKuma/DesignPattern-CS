public class StockMarketDataParserAdapter implements CSVParser{

        private StockMarketDataParser adaptee;

        public StockMarketDataParserAdapter(StockMarketDataParser adaptee) {
            this.adaptee = adaptee;
        }

        @Override
        public void parseCSV() {
            adaptee.parseFromCSV();
        }
}

package com.bridgelabz.opps;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StockPortfolio {
    private List<Stock> stocks = new ArrayList<>();

    public void readFileInput() throws IOException {
        String filePath = "//Users//duk//eclipse-workspace//StockAccountManagement//src//com//bridgelabz//stock//stocktext";
        List<String> lines = new ArrayList<String>();
        Path path = Paths.get(filePath);
        lines = Files.readAllLines(path);

        System.out.println(lines);
        for (String line : lines) {
            String[] word = line.split(" ");
            Stock stock = new Stock();
            stock.setShareName(word[0]);
            stock.setNoOfShare(Integer.valueOf(word[1]));
            stock.setSharPrice(Double.valueOf(word[2]));
            stock.setTotalValue(Integer.valueOf(word[1]) * Double.valueOf(word[2]));
            stocks.add(stock);

        }
    }

    private void showStock() {

        for (Stock s : stocks) {
            System.out.println("Stock [shareName=" + s.getShareName() + ", noOfShare=" + s.getNoOfShare()
                    + ", sharePrice=" + s.getSharPrice() + ", totalValue=" + s.getTotalValue() + "]");
        }
    }


    public static void main(String[] args) throws IOException {
        StockPortfolio portfolio = new StockPortfolio();
        portfolio.readFileInput();
        portfolio.showStock();

    }
}

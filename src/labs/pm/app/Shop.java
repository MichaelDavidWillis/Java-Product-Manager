/*
 * Copyright (C) 2021 Michael David Willis
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package labs.pm.app;

import labs.pm.data.ProductManager;

/**
 * {@code Shop} class represents an application that manages Products.
 *
 * @version 1.0
 * @author Michael David Willis
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ProductManager pm = new ProductManager();
        ProductManager pm = ProductManager.getInstance();
//
        pm.printProductReport(101, "en-GB");
        pm.printProductReport(104, "ru-RU");
//
//        pm.createProduct(164, "Kombucha", BigDecimal.valueOf(1.99), NOT_RATED);
//        pm.reviewProduct(164, TWO_STAR, "Looks like tea but it's not tea?!");
//        pm.reviewProduct(164, FOUR_STAR, "Fine tea");
//        pm.reviewProduct(164, FOUR_STAR, "Refreshing!");
//        pm.reviewProduct(164, FIVE_STAR, "New favourite!");
//        pm.printProductReport(164);
        
//        pm.dumpData();
//        pm.restoreData();

//        pm.printProductReport(102);

        
    }

}

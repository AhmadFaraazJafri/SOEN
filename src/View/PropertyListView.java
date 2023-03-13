/***
 * ............................................................
 *    Project Phase 1 , SOEN 6441
 *    ©(Faraaz, Himangshu, Shivesh)
 *    Written by:
 *                @author Himangshu Shekhar Baruah , Student ID 40229774
 *                @author Ahmad Faraaz Jafri, Student ID 40232742
 *                @author Shivesh Chaudhary, Student ID 40228107
 * ............................................................
 */
package View;

import Model.Property;

import java.util.List;

public class PropertyListView {
    public void display(List<Property> properties) {
        if (properties.isEmpty()) {
            System.out.println("No properties found.");
        } else {
            int number = 1;
            for (Property property : properties) {
                System.out.println(number++ + ". " + property.toString());
            }
        }
    }
}

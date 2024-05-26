package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {


  private List<Item> createList(Item... elems) {
      return new ArrayList<>(Arrays.asList(elems));
  }
    @Test
    void EveryBranchTest()
    {
        RuntimeException ex;
        //Test case 1:
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 500));
        assertTrue(ex.getMessage().contains("allItems list can't be null!")); //null
        //Test case 2:
        assertTrue(SILab2.checkCart(createList(),500));
        //Test case 3:
        Item item1 = new Item("item1","345", 125, 10);
        Item nNull = new Item("null", "3b4", 122, 12);
        //Item noname = new Item("", "42a5c6", 300, 0);
        List<Item> items = createList(item1, nNull);
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items, 500));
        assertTrue(ex.getMessage().contains("Invalid character in item barcode!"));
        //Test case 4:
        Item eden = new Item("eden","24", 125, 10);
        Item dva = new Item("dva", "null", 111, 12);
        List<Item> items2 = createList(eden,dva);
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(items2, 500));
        //Test case 5:
        Item eden1 = new Item("eden","055", 501, 10);
        Item dva2 = new Item("dva", "333", 210, 0);
        List<Item> items3 = createList(eden1,dva2);
        assertFalse(SILab2.checkCart(items3,500));
        }

    @Test
    void MultipleConditionsTest() {
        // T T T
        List<Item> items4 = createList(new Item("eden","022", 250, 0.12f));
        assertTrue(SILab2.checkCart(items4, 500));
        // T  T  F
        List<Item> items3 = createList(new Item("dva","784512", 410, 0.1f));
        assertFalse(SILab2.checkCart(items3, 40));
        // T F X
        List<Item> items2 = createList(new Item("tri","222", 220, 0.0f));
        assertFalse(SILab2.checkCart(items2, 200));
        //F X  X
        List<Item> items1 = createList(new Item("chetiri","123", 300, 0.0f));
        assertFalse(SILab2.checkCart(items1, 200));
    }


}
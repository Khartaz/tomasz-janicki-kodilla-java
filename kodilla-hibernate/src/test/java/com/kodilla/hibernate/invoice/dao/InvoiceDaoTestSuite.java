package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Arrays;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");
        Product product3 = new Product("Product3");
        Item item1 = new Item(new BigDecimal(200), 23, new BigDecimal(34), product1);
        Item item2 = new Item(new BigDecimal(58), 1, new BigDecimal(202), product2);
        Item item3 = new Item(new BigDecimal(100), 33, new BigDecimal(1), product3);
        Invoice invoice1 = new Invoice("FV2018/10/25");
        invoice1.setItems(Arrays.asList(item1, item2, item3));
        //When
        invoiceDao.save(invoice1);
        int invoiceId = invoice1.getId();
        //Then
        Assert.assertNotEquals(0, invoiceId);
        //CleanUp
        invoiceDao.delete(invoiceId);
    }
}

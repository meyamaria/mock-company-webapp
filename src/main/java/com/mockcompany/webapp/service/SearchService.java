package com.mockcompany.webapp.service;

import com.mockcompany.webapp.data.ProductItemRepository;
import com.mockcompany.webapp.model.ProductItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Service;
// import org.hibernate.mapping.Collection;
@Service 
public class SearchService 
{

public Collection<ProductItem> search( Iterable<ProductItem> allItems, String query) 
    {

        return Collections.emptyList();
        // String lowerCaseQuery = query.toLowerCase();

        // List<ProductItem> itemList = new ArrayList<>();

        // // This is a loop that the code inside will execute on each of the items from the database.
        // for (ProductItem item : allItems) 
        // {
        //     // TODO: Figure out if the item should be returned based on the query parameter!
        //     if (item.getName().toLowerCase().contains(lowerCaseQuery) ||
        //     item.getDescription().toLowerCase().contains(lowerCaseQuery) ||
        //     item.getImage().toLowerCase().contains(lowerCaseQuery) ||
        //     String.valueOf(item.getCost()).contains(lowerCaseQuery) ||
        //     String.valueOf(item.getId()).contains(lowerCaseQuery)) 
        //     {
        //         Boolean matchesSearch = true;
        //         itemList.add(item);
        //         break;
        //     }
          
        // }
        // return itemList;
    }
}



package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	 @Override
	 public Category get(int id) {
		 for(Category category : categories){
				if(category.getId() == id) return category;
			}
			
			return null;
	 }

	// this for insert
	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();

		// adding first category
		category.setId(1);
		category.setName("Angkatan_2019");
		category.setDescription("This is some description for television");
		category.setImageURL("CAT_1.png");

		categories.add(category);

		// second category
		category = new Category();
		category.setId(2);
		category.setName("Angkatan_2018");
		category.setDescription("This is some description for mobile");
		category.setImageURL("CAT_2.png");

		categories.add(category);

		// third category
		category = new Category();
		category.setId(3);
		category.setName("Angkatan_2017");
		category.setDescription("This is some description for Laptop");
		category.setImageURL("CAT_3.png");

		categories.add(category);

	}


}

package com.gudigudigudi.mdtemplate;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by gu on 10/3/17.
 */

@Dao
public interface CategoryDao {

    @Query("SELECT * FROM category")
    List<Category> getAll();

    @Query("SELECT * FROM category WHERE code= :code LIMIT 1")
    Category getCategoryByCode(int code);

}

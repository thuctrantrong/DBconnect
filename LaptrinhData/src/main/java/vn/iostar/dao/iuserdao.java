package vn.iostar.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import vn.iostar.model.Usermodel;

public interface iuserdao {
	List<Usermodel> findAll()  throws IOException, SQLException;

	Usermodel findById(int id);

	void insert(Usermodel user);
}
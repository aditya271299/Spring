package com.dao;

import com.beans.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BookDao {
    private JdbcTemplate jt;

    public JdbcTemplate getJt() {
        return jt;
    }

    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }

    public int insertBook(Book b){
        String sql = "insert into JTBookDetails values (?,?,?,?)";
        Object[] val = {b.getBid(),b.getBookName(),b.getAuthorName(),b.getPrice()};
        System.out.println("record inserted");
        return jt.update(sql,val);

    }
    public int updateBook(String bn,float p){
        String query="update JTBookDetails set price='"+p+"'where bookName='"+bn+"'";
        return jt.update(query);

    }
    public int deleteBook(String bn){
        String query="delete from JTBookDetails where bookName='"+bn+"'";
        return jt.update(query);
    }
    public List<Book> fetchAllBooks() {
        String query = "select * from JTBookDetails";

        List<Book> lbook = jt.query(query, new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                Book book = new Book();
                book.setBid(rs.getInt(1));
                book.setBookName(rs.getString(2));
                book.setAuthorName(rs.getString(3));
                book.setPrice(rs.getFloat(4));
                return book;
            }
        });
        return lbook;
    }
    public List<Book>  likeAuthor(){
        String query="select * from JTBookDetails where authorName like 's%'";
        List<Book> lauthor = jt.query(query, new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                Book book = new Book();
                book.setBid(rs.getInt(1));
                book.setBookName(rs.getString(2));
                book.setAuthorName(rs.getString(3));
                book.setPrice(rs.getFloat(4));
                return book;
            }
        });
        return lauthor;
    }
    public List<Book>  betweenPrice(){
        String query="SELECT * FROM JTBookDetails WHERE Price BETWEEN 100 AND 190";
        List<Book> pprice = jt.query(query, new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                Book book = new Book();
                book.setBid(rs.getInt(1));
                book.setBookName(rs.getString(2));
                book.setAuthorName(rs.getString(3));
                book.setPrice(rs.getFloat(4));
                return book;
            }
        });
        return pprice;
    }
}

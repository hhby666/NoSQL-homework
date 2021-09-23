package com.wlq.work;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.List;

/**
 * program: homework
 * <br>description: MongoDB测试
 *
 * @author by 王林清 on 2021/9/23
 * @version Java1.8 IntelliJ IDEA
 */
public class MongoTest {
    public static void main(String[] args) {
        String uri = "mongodb://rw:rw@hhby.xyz:27017/?authSource=mongodbStudy";
        try {
            MongoClientURI mongoClientURI = new MongoClientURI(uri);
            MongoClient mongoClient = new MongoClient(mongoClientURI);
            MongoDatabase mongodbStudy = mongoClient.getDatabase("mongodbStudy");
            System.out.println("数据库名：" + mongodbStudy.getName());
            MongoCollection<Document> crudTest = mongodbStudy.getCollection("CRUDtest");
            FindIterable<Document> documents = crudTest.find();
            for (Document document : documents) {
                System.out.println("document = " + document.toJson());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

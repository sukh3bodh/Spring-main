// package com.example.mdbspringboot.model;

// import java.util.Date;
// import java.util.HashMap;
// import org.springframework.data.annotation.Id;
// import org.springframework.data.mongodb.core.mapping.Document;

// @Document("items")
// public class Products {
//     @Id
//     private String productId;
//     private String name;
//     private String desc;
//     private String[] images;
//     private Date deadline;
//     private int maxBid;
//     private int minBid;
//     private String ownerId;
//     private String currBidId;
//     private int currBidVal;
//     private HashMap<String, Integer> allBids;

//     public Products(String productId, String name, String desc, String image1, String image2, String image3, Date deadline, int maxBid, int minBid, String ownerId) {

//         this.productId = productId;
//         this.name = name;
//         this.desc = desc;
//         this.images = new String[3];
//         this.images[0] = image1;
//         this.images[1] = image2;
//         this.images[2] = image3;
//         this.deadline = deadline;
//         this.maxBid = maxBid;
//         this.minBid = minBid;
//         this.ownerId = ownerId;
//         this.currBidId = "";
//         this.currBidVal = 0;
//         this.allBids = new HashMap<String, Integer>();

//     }

//     public String getProductId() {
//         return this.productId;
//     }

//     public String getName() {
//         return this.name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getDesc() {
//         return this.desc;
//     }

//     public void setDesc(String desc) {
//         this.desc = desc;
//     }

//     public String[] getImages() {
//         return this.images;
//     }

//     public Date getDeadline() {
//         return this.deadline;
//     }

//     public void setDeadline(Date deadline) {
//         this.deadline = deadline;
//     }

//     public int getMaxBid() {
//         return this.maxBid;
//     }

//     public void setMaxBid(int maxBid) {
//         this.maxBid = maxBid;
//     }

//     public int getMinBid() {
//         return this.minBid;
//     }

//     public void setMinBid(int minBid) {
//         this.minBid = minBid;
//     }

//     public String getOwnerId() {
//         return this.ownerId;
//     }

//     public void setOwnerId(String ownerId) {
//         this.ownerId = ownerId;
//     }

//     public String getCurrBidId() {
//         return this.currBidId;
//     }

//     public void setCurrBidId(String currBidId) {
//         this.currBidId = currBidId;
//     }

//     public int getCurrBidVal() {
//         return this.currBidVal;
//     }

//     public void setCurrBidVal(int currBidVal) {
//         this.currBidVal = currBidVal;
//     }

//     public HashMap<String, Integer> getAllBids() {
//         return this.allBids;
//     }

//     public void setAllBids(HashMap<String, Integer> allBids) {
//         this.allBids = allBids;
//     }

//     public void setBid(String bidId, int bidVal){
//         this.currBidId = bidId;
//         this.currBidVal = bidVal;
//     }

// }

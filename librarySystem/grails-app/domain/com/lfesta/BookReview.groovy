package com.lfesta

class BookReview {
String book

Date dateCreated

String student

String review

    static constraints = {
book blank:false, nullable:false

dateCreated blank:false, nullable:false

student blank:false, nullable:false

review blank:false, nullable:false, size:0..5000
    }
}

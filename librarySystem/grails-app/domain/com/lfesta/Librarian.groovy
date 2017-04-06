package com.lfesta

class Librarian {
String name

String email

String office

String username

String password

int telephone

String library

    static constraints = {
name blank:false, nullable:false

email blank:false, nullable:false, size:0..5000

office blank:false, nullable:false

username blank:false, nullable:false, unique:true

password blank:false, nullable:false

telephone blank:false, nullable:false, size:10..11

library blank:false, nullable:false
    }
}

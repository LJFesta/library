package com.lfesta

class Library {
String namebuilding

String address

float openingHours

String location

int studySpaces
    static constraints = {
namebuilding blank:false, nullable:false

address blank:false, nullable:false

openingHours blank:false, nullable:false, maxSize:24.00

location blank:false, nullable:false

studySpaces blank:false, nullable:false
    }
}

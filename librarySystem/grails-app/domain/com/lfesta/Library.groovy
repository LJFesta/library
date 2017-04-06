package com.lfesta

class Library {
String name/building

String address

float openingHours

String location

int studySpaces
    static constraints = {
name/building blank:false, nullable:false

address blank:false, nullable:false

openingHours blank:false, nullable:false, maxSize:24.00

location blank:false, nullable:false

studyspaces blank:false, nullable:false, 
    }
}

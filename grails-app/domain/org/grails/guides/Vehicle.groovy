package org.grails.guides

@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Vehicle {

    String name
    Integer year
    Make make
    Model model

    static constraints = {
        year min: 1900
        name maxSize: 255
    }
}

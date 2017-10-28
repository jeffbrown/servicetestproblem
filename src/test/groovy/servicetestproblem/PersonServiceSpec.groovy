package servicetestproblem

import grails.testing.gorm.DataTest
import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class PersonServiceSpec extends Specification implements ServiceUnitTest<PersonService>, DataTest {

    def setupSpec() {
        mockDomain Person
    }

    void 'first test'() {
        expect:
        service.list().size() == 0
    }

    void 'second test'() {
        expect:
        service.list().size() == 0
    }
}

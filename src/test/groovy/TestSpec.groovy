import pages.GoogleMainPage
import geb.spock.GebReportingSpec
import org.openqa.selenium.Keys
import pages.GoogleSearchResultsPage

class TestSpec extends GebReportingSpec {
    def "difference between geb 0.5 and 0.6"() {
        when: 'user goes to google main page'
        to GoogleMainPage

        and: 'searches for word wikipedia'
        searchText << 'wikipedia'
        searchText << Keys.ENTER
        page(new GoogleSearchResultsPage(searchedFor: 'wikipedia'))

        then: 'we are at the search results page for wikipedia'
        waitFor { verifyAt() }
    }
}

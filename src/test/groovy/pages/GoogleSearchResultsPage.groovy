package pages

import geb.Page

class GoogleSearchResultsPage extends Page {
    static at = {
        title.startsWith(searchedFor)
    }

    String searchedFor
}

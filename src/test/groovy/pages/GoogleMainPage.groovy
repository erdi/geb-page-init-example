package pages

import geb.Page

class GoogleMainPage extends Page {
    static url = 'http://www.google.com'
    static content = {
        searchText { $('input', name: 'q') }
        searchButton { $('input', name: 'btnK') }
    }
}

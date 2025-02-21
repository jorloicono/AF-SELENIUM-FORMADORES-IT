require 'watir'

browser = Watir::Browser.new :chrome
browser.goto('C:\Users\Jorge\RubymineProjects\watir\uitesting\enlaces.html')

l = browser.link text: 'Click Here'

l.click

sleep 2

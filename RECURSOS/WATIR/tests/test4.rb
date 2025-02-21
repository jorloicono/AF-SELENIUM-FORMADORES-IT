require 'watir'

browser = Watir::Browser.new :chrome
browser.goto('C:\Users\Jorge\RubymineProjects\watir\uitesting\radio.html')

t = browser.radio value: 'female'

t.exist?
t.set
sleep 2
browser.screenshot.save 'radio.png'
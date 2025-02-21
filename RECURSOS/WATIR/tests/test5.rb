require 'watir'

browser = Watir::Browser.new :chrome
browser.goto('C:\Users\Jorge\RubymineProjects\watir\uitesting\checkbox.html')

t = browser.checkbox value: 'Train'
t.set

t = browser.checkbox value: 'Car'

t.exist?
t.set
sleep 2

require 'watir'

browser = Watir::Browser.new :chrome
browser.goto('C:\Users\Jorge\RubymineProjects\watir\uitesting\combos.html')

t = browser.select_list id: 'months'

t.exist?
t.select 'September'

t.selectedoptions
sleep 2
t.fire_event('onchange')
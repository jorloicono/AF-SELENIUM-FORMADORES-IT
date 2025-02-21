require 'watir'

browser = Watir::Browser.new :chrome
browser.goto('C:\Users\Jorge\RubymineProjects\watir\uitesting\boton.html')

browser.button(:name => 'btnsubmit').click

sleep 2
browser.screenshot.save 'boton.png'
require 'watir'
browser = Watir::Browser.new :chrome
browser.goto('C:\Users\Jorge\RubymineProjects\watir\uitesting\textbox.html')

t = browser.text_field id: 'firstname'

t.exist?
t.set 'Jorge'
sleep 2
puts "Valor: #{t.value}"
t.fire_event('onchange')
require 'watir'

b = Watir::Browser.new :chrome
b.goto('C:\Users\Jorge\RubymineProjects\watir\uitesting\esperas.html')

t = b.text_field(name: 'firstname')
t.exists?
t.set 'Riya Kapoor'
b.screenshot.save 'waittestbefore.png'
t.value
t.fire_event('onchange')
btn = b.button(id: 'btnsubmit').wait_until(&:enabled?)
btn.fire_event('onclick');
b.screenshot.save 'waittestafter.png'


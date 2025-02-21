require 'watir'
b = Watir::Browser.new :chrome
b.goto('http://localhost/uitesting/textbox.html')
t = b.text_field(id: 'firstname')
t.exists?
t.set 'Riya Kapoor'

require 'watir'
b = Watir::Browser.new :chrome
b.goto('http://localhost/uitesting/textbox.html')
t = b.text_field(name: 'firstname')
t.exists?
t.set 'Riya Kapoor'
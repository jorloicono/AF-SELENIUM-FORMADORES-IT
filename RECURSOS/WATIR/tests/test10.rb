require 'watir'

b = Watir::Browser.new :chrome
b.goto('C:\Users\Jorge\RubymineProjects\watir\uitesting\esperas2.html')

b.button(id: 'boton-esperado').wait_until(&:present?)

b.button(id: 'boton-esperado').click

b.close

b.goto('C:\Users\Jorge\RubymineProjects\watir\uitesting\esperas2.html')

b.driver.manage.timeouts.implicit_wait = 30

b.button(id: 'boton-esperado').click

b.close



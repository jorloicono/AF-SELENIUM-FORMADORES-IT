require 'watir'

# Iniciar navegador
browser = Watir::Browser.new :chrome
browser.goto('C:\Users\Jorge\RubymineProjects\watir\uitesting\ejercicio1.html')

# Interactuar con textbox
t = browser.text_field(id: 'firstname')
t.set 'John Doe'
t.fire_event('onchange')

# Interactuar con combobox
combo = browser.select_list(id: 'months')
combo.select 'September'

# Seleccionar radio button
radio = browser.radio(value: 'female')
radio.set

# Marcar checkbox
checkbox = browser.checkbox(value: 'Train')
checkbox.set

# Hacer clic en botón
button = browser.button(name: 'btnsubmit')
button.click

# Hacer clic en un enlace
link = browser.link(text: 'Click Here')
link.click

# Obtener texto de un div
div = browser.div(class: 'divtag')
puts "Div Text: #{div.text}"
browser.screenshot.save 'div.png'

# Cerrar navegador
browser.close

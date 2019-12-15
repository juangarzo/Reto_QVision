# language:es

  Característica: Validación Tarifas DX Hotels
    Yo como jefe de ventas
    quiero ingresar acceder al sitio web de DX Hotels
    para validar las tarifas cobradas a los clientes

    Esquema del escenario: Validar tarifa cobrada a los clientes
      Dado que accedo al sitio web de DX Hotels
      Cuando reservo la habitacion del hotel
      |location|checkIn|checkOut|
      |<location>|<checkIn>|<checkOut>|
      Entonces valido que la tarifa cobrada es correcta.
        |location|totalEsperado|
        |<location>|<totalEsperado>|
      Ejemplos:
        | location    | checkIn  | checkOut | totalEsperado |
        |Los Angeles  |12/22/2019|12/25/2019|436.00         |
        |San Francisco|12/22/2019|12/25/2019|1196.00        |
        |Las Vegas    |12/22/2019|12/25/2019|360.00         |
        |Honolulu     |12/22/2019|12/25/2019|444.00         |
        |New York     |12/22/2019|12/25/2019|476.00         |
        |Nassau       |12/22/2019|12/25/2019|996.00         |
        |Paris        |12/22/2019|12/25/2019|440.00         |
        |London       |12/22/2019|12/25/2019|596.00         |
        |Rome         |12/22/2019|12/25/2019|996.00         |
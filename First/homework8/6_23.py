import datetime


def convert_millis(ms):
    print(datetime.datetime.fromtimestamp(ms/1000).strftime('%H:%M:%S'))


convert_millis(555555500000)

package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.123456789";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEoQIBAAKCAQEA7mmRKBStv8GaBZwToyhB1qSnDVJnuh+C/Eovlhgh5qiaGRPK\r\n" + 
			"zOslVaDsSJM9jY72JaKL4f9WAuZ2uZ7MnSjW7ENHZzPDHMVMZYAecp7Gw9njCIEp\r\n" + 
			"rpuJOidQa27PZAv+qeniD/DBqrDFgBCeSJRibp/k+dBius4AqZmJf/zerj+NmDNd\r\n" + 
			"RT+GZuIjWM+hZFe+CbjLJ7+rsgJmgcJVsIt/n57IM6LpUlp+P3rIIcQ74qk8Qtpk\r\n" + 
			"wNtCzSZ3S8Mio6DlYYuYVIKjFgHpwqrrI7tuguhBOFLvqcmmTlTqVl+QHPjSTgI2\r\n" + 
			"Fwi2USDpBv9QCv8RNXaVgyAGLk8zrKHiOuzylwIDAQABAoIBADkknGIa8rovURdf\r\n" + 
			"HWXR1FX6CQAsbCg0PVTzAwzao+WBK84u7EDJa51mgLu0buBrD5xdpWF5rcfsLTC4\r\n" + 
			"WxqgG0NtrMOTqIRQ1crONn4KiGGQ69Wx/6eWKAIEQkY9vP+h0FwxbrmbXw/mZrAX\r\n" + 
			"S5jh1+Xj9SHbTI6xqX79CfPfTBA/POZ7CzT+VlvpOw+L46dZPmlb5NHDLZ+dj5T4\r\n" + 
			"bOcfo2ocwArDSa7SfVycGrTwWZ7ap3h/nZYKX0osn0VhJEdErkt/h7lp2oHp8J36\r\n" + 
			"RCyUvjP6rqbjT4xVyrStVv8na/ayLHU+UvP3zpghnZjFUTTl1LVnopvXzpv++ODj\r\n" + 
			"Jv8g0YECgYEA+NnbeF/fw8My5bSKNuaSZuGY2u9LLCPaVuL9cVyWum2nW7TEfzSE\r\n" + 
			"d6PxJ0BdtrFzJGSTlmSzs8mmeAHlCBMImip7btjZENEUP5uZmvrVgj9SQlmSjErB\r\n" + 
			"yQV4w/ZRAJIz5diWfaoZXsLxE1IgWJ66cA5COJh3gWGgKnv/AXu804cCgYEA9ULw\r\n" + 
			"q9q5FK01e7CLP0huWUP9Br/J+NPsOt1qktkhQOWPvK/WUt/nKu7Tf+CiMT2odppM\r\n" + 
			"cZFqSo45okue+R2mWWxse7yyLX1gGLc4ZFJ5Zt/EG2XK6MFQobnl7wVnXQz7wxKc\r\n" + 
			"73k190VuhOXH7BvnpI4y3QXeQqKcT+xRIcTczHECgYEAhFFaqCvaUD4XbxpLL5v0\r\n" + 
			"Fm44F5mLUAIUU4TInCFOJ/ysM0/v929WTENIs8U+zyiVf7FW5G3RO3SqZj8jp+Ju\r\n" + 
			"/YI/NZZp/M4fRR8YUtay9llzBMKZ8KzDU37sUs5DDdmvbLR4eIMckE15X/uYJWbo\r\n" + 
			"3TJHtc4kJRBi2JQr6H8BzTsCgYB/Ha29dIR+qfNRY0QYjYLb8zf+OoME21nRfJbS\r\n" + 
			"+4SXrSNdaUlM9M1MXDH0Uknd+ZYJupkqN3L+p05JxqXjebGRIXfsffVfTF71EGlC\r\n" + 
			"3dgcMJfkl1KeZitTVxVMV+GlwafvCAOcvpbwzOSmLq36us/JYwYLthHnOX6IkfPO\r\n" + 
			"68iAkQJ/fs2bN2c+03Oeu0MnZgzZP/fNJoLY42o7H9p1WIDgMfnk8TPYKoYh3ivT\r\n" + 
			"VxK4uFrd2uEAvvnWI4GCVPy/iFFX24mNPE2KVcUyKkRUEha/DhbGrli3jB7sXu97\r\n" + 
			"ZWjHo4dYDCXXMH1m1nlOtqsEUnt8n2WU3nuRM/IDehQfdxqfxQ==\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA7mmRKBStv8GaBZwToyhB\r\n" + 
			"1qSnDVJnuh+C/Eovlhgh5qiaGRPKzOslVaDsSJM9jY72JaKL4f9WAuZ2uZ7MnSjW\r\n" + 
			"7ENHZzPDHMVMZYAecp7Gw9njCIEprpuJOidQa27PZAv+qeniD/DBqrDFgBCeSJRi\r\n" + 
			"bp/k+dBius4AqZmJf/zerj+NmDNdRT+GZuIjWM+hZFe+CbjLJ7+rsgJmgcJVsIt/\r\n" + 
			"n57IM6LpUlp+P3rIIcQ74qk8QtpkwNtCzSZ3S8Mio6DlYYuYVIKjFgHpwqrrI7tu\r\n" + 
			"guhBOFLvqcmmTlTqVl+QHPjSTgI2Fwi2USDpBv9QCv8RNXaVgyAGLk8zrKHiOuzy\r\n" + 
			"lwIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
}

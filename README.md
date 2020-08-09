# VirtualDynamicAnalysis
PoC app to demonstrate how to perform dynamic analysis on apps installed inside a cloning app without root or repackaging the application. This app is based on [VirtualApp](https://github.com/asLody/VirtualApp)

# License and Warning
Since this app is derived from Virtual app. Please refer to VirtualApp's [declaration](https://github.com/asLody/VirtualApp).

# Demo

## Attacking Security Provider
Google Authenticator depends on the default Security Provider. By executing it inside the cloning app OTP seed used in HMAC operation can be seen easily in the logcat

![GoogleAuthenticator](GoogleAuthenticator.gif)

The same case with Microsoft Authenticator

![GoogleAuthenticator](MicrosoftAuthenticator.gif)

## Attacking Android Keystore
This is to demonstrate how a Fake Biometric Authentication App installed alongside a benign Biometric Authentication app inside cloning app can make use of the AES Key generated inside Android Keystore to decrypt a secret message

![Demo](BiometricAuthentication.gif)

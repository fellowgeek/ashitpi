# Aşit Pi (damn you net neutrality)

Pronounced "A(Sh)it Pie" is an embedded linux distribution built on Yocto for Raspberry Pi, built and configured to run a fullscreen webkit browser, while celebrating the death of net neutrality and everything that is good. ( no relations to our beloved killer of net neutrality Mr. Ajit Pai )

<img src="https://erfan.me/assets/images/ashit-pi-logo.png" />

## Built-in packages:

wpe, git, tmux, mc, cron, curl, python, ntp, bluez5, wiringpi, htop, tzdata, wpa-supplicant, openssh, openssh-sftp-server, openssl, iptables, dhcp-server, bridge-utils, i2c-tools

## Supported boards
Raspberry Pi 3, Raspberry Pi 3B+

## Usage

1. Flash the image on a SD card using [Etcher](https://www.balena.io/etcher/)
2. Boot your Raspberry Pi
3. Run the following commands:

fullscreen WebKit window:
```
WPELauncher URL
```

fullscreen WebKit window with mouse and WebGL support:
```
wpe URL
```

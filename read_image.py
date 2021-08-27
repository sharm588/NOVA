import time
import subprocess
import argparse

file_name = ""
parser = argparse.ArgumentParser()
parser.add_argument("--image", help="image to be processed")
args = parser.parse_args()

if args.image:
  file_name = args.image

check = False
if check == False:
    check = True
    #subprocess.call("source activate nova_env", shell=True)
    subprocess.Popen(["python", "./label_image_custom.py", "--image=" + file_name])
time.sleep(10)

https://unix.stackexchange.com/questions/233832/merge-two-video-clips-into-one-placing-them-next-to-each-other

https://superuser.com/questions/153160/join-videos-with-split-screen

https://stackoverflow.com/questions/26022410/merge-two-videos-into-one-using-mp4parser-on-android

https://superuser.com/questions/153160/join-videos-with-split-screen


ffmpeg -i input1.mp4 -i input2.mp4 \
 -filter_complex \
    "[0:v]pad=iw*2:ih[int]; \
     [int][1:v]overlay=W/2:0[vid]" \
-map "[vid]" \
-c:v libx264 -crf 23 \
output.mp4


https://github.com/umair13adil/KotlinFFMpeg

https://github.com/INDExOS/media-for-mobile



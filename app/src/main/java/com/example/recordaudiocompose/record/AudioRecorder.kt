package com.example.recordaudiocompose.record

import java.io.File

interface AudioRecorder {
    fun start(outputFile:File)
    fun stop()
}
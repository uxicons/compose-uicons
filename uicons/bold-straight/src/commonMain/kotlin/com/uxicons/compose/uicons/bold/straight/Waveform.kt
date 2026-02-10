package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Waveform: ImageVector? = null

val Icons.Bs.Waveform: ImageVector
    get() = _Waveform ?: UXIcon(name = "Waveform") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.88f, 23.93f)
                lineToRelative(-2.88f, -11.57f)
                lineToRelative(-2.88f, 11.57f)
                lineToRelative(-3.16f, -10.76f)
                lineToRelative(-2.21f, 7.08f)
                lineToRelative(-3.22f, -7.25f)
                lineToRelative(-0.53f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(2.48f, 0f)
                lineToRelative(0.78f, 1.75f)
                lineToRelative(2.79f, -8.92f)
                lineToRelative(2.84f, 9.65f)
                lineToRelative(3.12f, -12.54f)
                lineToRelative(3.12f, 12.54f)
                lineToRelative(2.84f, -9.65f)
                lineToRelative(2.79f, 8.92f)
                lineToRelative(0.78f, -1.75f)
                lineToRelative(2.48f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(-0.53f, 0f)
                lineToRelative(-3.22f, 7.25f)
                lineToRelative(-2.21f, -7.08f)
                lineToRelative(-3.16f, 10.76f)
                close()
            }
        }.also { _Waveform = it}

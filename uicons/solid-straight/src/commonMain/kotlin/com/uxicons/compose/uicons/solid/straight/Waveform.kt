package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Waveform: ImageVector? = null

val Icons.Ss.Waveform: ImageVector
    get() = _Waveform ?: UXIcon(name = "Waveform") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.91f, 24.02f)
                lineToRelative(-2.91f, -14.09f)
                lineToRelative(-2.91f, 14.09f)
                lineToRelative(-3.1f, -12.53f)
                lineToRelative(-2.3f, 9.15f)
                lineTo(0.81f, 13f)
                horizontalLineToRelative(-0.81f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.19f)
                lineToRelative(1.12f, 2.96f)
                lineTo(6.01f, 3.21f)
                lineToRelative(2.9f, 11.77f)
                lineTo(12f, 0.06f)
                lineToRelative(3.09f, 14.91f)
                lineToRelative(2.9f, -11.77f)
                lineToRelative(2.7f, 10.74f)
                lineToRelative(1.12f, -2.96f)
                horizontalLineToRelative(2.19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-0.81f)
                lineToRelative(-2.88f, 7.63f)
                lineToRelative(-2.3f, -9.15f)
                lineToRelative(-3.1f, 12.53f)
                close()
            }
        }.also { _Waveform = it}

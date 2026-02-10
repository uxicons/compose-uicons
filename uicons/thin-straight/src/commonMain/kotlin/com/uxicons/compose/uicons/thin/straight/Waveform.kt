package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Waveform: ImageVector? = null

val Icons.Ts.Waveform: ImageVector
    get() = _Waveform ?: UXIcon(name = "Waveform") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.97f, 23.84f)
                lineToRelative(-2.97f, -17.79f)
                lineToRelative(-2.97f, 17.79f)
                lineToRelative(-3.03f, -15.79f)
                lineToRelative(-2.41f, 12.98f)
                lineToRelative(-2.48f, -9.03f)
                lineToRelative(-1.12f, 0f)
                lineToRelative(0f, -1f)
                lineToRelative(1.88f, 0f)
                lineToRelative(1.52f, 5.56f)
                lineToRelative(2.59f, -13.91f)
                lineToRelative(2.97f, 15.51f)
                lineToRelative(3.03f, -18.21f)
                lineToRelative(3.03f, 18.21f)
                lineToRelative(2.97f, -15.51f)
                lineToRelative(2.59f, 13.91f)
                lineToRelative(1.52f, -5.56f)
                lineToRelative(1.88f, 0f)
                lineToRelative(0f, 1f)
                lineToRelative(-1.12f, 0f)
                lineToRelative(-2.48f, 9.03f)
                lineToRelative(-2.41f, -12.98f)
                lineToRelative(-3.03f, 15.79f)
                close()
            }
        }.also { _Waveform = it}

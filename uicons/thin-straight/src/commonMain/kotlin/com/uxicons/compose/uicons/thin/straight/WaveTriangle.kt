package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveTriangle: ImageVector? = null

val Icons.Ts.WaveTriangle: ImageVector
    get() = _WaveTriangle ?: UXIcon(name = "WaveTriangle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.94f, 9.91f)
                lineToRelative(-7.12f, 13.19f)
                lineTo(7.13f, 3.1f)
                lineTo(0.94f, 14.59f)
                lineToRelative(-0.88f, -0.47f)
                lineTo(7.18f, 0.9f)
                lineToRelative(9.69f, 20.0f)
                lineToRelative(6.19f, -11.47f)
                lineToRelative(0.88f, 0.47f)
                close()
            }
        }.also { _WaveTriangle = it}

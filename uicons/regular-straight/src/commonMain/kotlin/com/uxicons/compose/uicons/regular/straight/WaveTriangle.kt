package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveTriangle: ImageVector? = null

val Icons.Rs.WaveTriangle: ImageVector
    get() = _WaveTriangle ?: UXIcon(name = "WaveTriangle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.65f, 23.04f)
                lineToRelative(-9.4f, -17.95f)
                lineToRelative(-5.55f, 9.52f)
                lineToRelative(-1.73f, -1.01f)
                lineToRelative(7.37f, -12.65f)
                lineToRelative(9.4f, 17.95f)
                lineToRelative(5.54f, -9.5f)
                lineToRelative(1.73f, 1.01f)
                lineToRelative(-7.37f, 12.63f)
                close()
            }
        }.also { _WaveTriangle = it}

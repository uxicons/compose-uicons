package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveTriangle: ImageVector? = null

val Icons.Bs.WaveTriangle: ImageVector
    get() = _WaveTriangle ?: UXIcon(name = "WaveTriangle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.43f, 23.57f)
                lineToRelative(-9.0f, -17.0f)
                lineToRelative(-4.82f, 8.19f)
                lineToRelative(-2.58f, -1.52f)
                lineToRelative(7.55f, -12.81f)
                lineToRelative(9.0f, 17.0f)
                lineToRelative(4.82f, -8.17f)
                lineToRelative(2.58f, 1.52f)
                lineToRelative(-7.55f, 12.79f)
                close()
            }
        }.also { _WaveTriangle = it}

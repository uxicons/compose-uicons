package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveTriangle: ImageVector? = null

val Icons.Sr.WaveTriangle: ImageVector
    get() = _WaveTriangle ?: UXIcon(name = "WaveTriangle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 22f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.36f, -0.01f, -0.68f, -0.2f, -0.86f, -0.51f)
                lineTo(6.97f, 5.0f)
                lineTo(1.86f, 13.52f)
                curveToRelative(-0.28f, 0.47f, -0.9f, 0.63f, -1.37f, 0.34f)
                curveToRelative(-0.47f, -0.28f, -0.63f, -0.9f, -0.34f, -1.37f)
                lineTo(6.14f, 2.48f)
                curveToRelative(0.18f, -0.31f, 0.52f, -0.5f, 0.87f, -0.48f)
                curveToRelative(0.36f, 0.01f, 0.68f, 0.2f, 0.86f, 0.51f)
                lineToRelative(9.16f, 16.49f)
                lineToRelative(5.11f, -8.52f)
                curveToRelative(0.28f, -0.47f, 0.9f, -0.63f, 1.37f, -0.34f)
                curveToRelative(0.47f, 0.28f, 0.63f, 0.9f, 0.34f, 1.37f)
                lineToRelative(-6f, 10f)
                curveToRelative(-0.18f, 0.3f, -0.51f, 0.48f, -0.86f, 0.48f)
                close()
            }
        }.also { _WaveTriangle = it}

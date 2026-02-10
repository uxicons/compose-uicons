package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneArrival: ImageVector? = null

val Icons.Bs.PlaneArrival: ImageVector
    get() = _PlaneArrival ?: UXIcon(name = "PlaneArrival") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(24f)
                verticalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.38f, 20.6f)
                lineTo(2.64f, 12.19f)
                verticalLineTo(3.81f)
                curveToRelative(0.03f, -1.09f, 0.59f, -2.01f, 1.51f, -2.51f)
                curveToRelative(0.92f, -0.5f, 2.0f, -0.48f, 2.9f, 0.07f)
                curveToRelative(0.66f, 0.4f, 1.13f, 1.04f, 1.31f, 1.79f)
                lineToRelative(0.7f, 2.88f)
                lineToRelative(9.52f, 4.67f)
                curveToRelative(1.31f, 0.71f, 2.26f, 1.9f, 2.66f, 3.34f)
                curveToRelative(0.41f, 1.44f, 0.22f, 2.94f, -0.53f, 4.24f)
                lineToRelative(-1.34f, 2.33f)
                close()
                moveTo(5.64f, 10.34f)
                lineToRelative(12.55f, 6.3f)
                curveToRelative(0.28f, -0.56f, 0.34f, -1.19f, 0.17f, -1.79f)
                curveToRelative(-0.18f, -0.64f, -0.6f, -1.18f, -1.19f, -1.5f)
                lineTo(6.49f, 8.11f)
                lineToRelative(-0.85f, -3.46f)
                verticalLineToRelative(5.7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.02f, 9.46f)
                lineToRelative(0.07f, -9.46f)
                lineToRelative(4.06f, 1.23f)
                curveToRelative(0.85f, 0.38f, 1.43f, 1.2f, 1.5f, 2.13f)
                lineToRelative(0.74f, 8.06f)
            }
        }.also { _PlaneArrival = it}

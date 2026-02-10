package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyCar: ImageVector? = null

val Icons.Ss.KeyCar: ImageVector
    get() = _KeyCar ?: UXIcon(name = "KeyCar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.43f, 6.3f)
                curveToRelative(-0.84f, -1.34f, -1.73f, -2.48f, -2.63f, -3.38f)
                curveToRelative(-0.81f, -0.81f, -1.77f, -1.59f, -2.85f, -2.3f)
                curveToRelative(-1.64f, -1.08f, -3.79f, -0.74f, -5.0f, 0.77f)
                lineToRelative(-4.31f, 5.36f)
                curveToRelative(-0.9f, 1.12f, -0.81f, 2.73f, 0.2f, 3.75f)
                lineToRelative(4.67f, 4.67f)
                curveToRelative(1.0f, 1.0f, 2.6f, 1.1f, 3.72f, 0.23f)
                lineToRelative(5.33f, -4.16f)
                curveToRelative(1.52f, -1.19f, 1.9f, -3.31f, 0.88f, -4.94f)
                close()
                moveTo(18.54f, 8.46f)
                lineToRelative(-3f, -3f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3f, 3f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(7.5f, 12.0f)
                lineToRelative(4.27f, 4.27f)
                lineToRelative(-0.74f, 0.73f)
                horizontalLineToRelative(-3.03f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2f)
                reflectiveCurveToRelative(0f, 2.0f, 0f, 2.0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(0f, 24.0f)
                reflectiveCurveToRelative(0f, -4.5f, 0f, -4.5f)
                lineToRelative(7.5f, -7.5f)
                close()
            }
        }.also { _KeyCar = it}

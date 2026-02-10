package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartHomeAlt: ImageVector? = null

val Icons.Bs.SmartHomeAlt: ImageVector
    get() = _SmartHomeAlt ?: UXIcon(name = "SmartHomeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.66f, 7.41f)
                lineTo(14.16f, 0.76f)
                curveToRelative(-1.27f, -0.99f, -3.04f, -0.99f, -4.31f, 0f)
                lineTo(1.34f, 7.41f)
                curveToRelative(-0.85f, 0.67f, -1.34f, 1.67f, -1.34f, 2.76f)
                verticalLineToRelative(13.82f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-13.82f)
                curveToRelative(0f, -1.08f, -0.49f, -2.09f, -1.34f, -2.76f)
                close()
                moveTo(21f, 20.99f)
                lineTo(3f, 20.99f)
                verticalLineToRelative(-10.82f)
                curveToRelative(0f, -0.15f, 0.07f, -0.3f, 0.19f, -0.39f)
                lineTo(11.69f, 3.12f)
                curveToRelative(0.18f, -0.14f, 0.43f, -0.14f, 0.62f, 0f)
                lineToRelative(8.5f, 6.65f)
                curveToRelative(0.12f, 0.1f, 0.19f, 0.24f, 0.19f, 0.39f)
                verticalLineToRelative(10.82f)
                close()
                moveTo(13.5f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(18f, 13f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -2.21f, 1.21f, -4.15f, 3f, -5.19f)
                verticalLineToRelative(5.19f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-5.19f)
                curveToRelative(1.79f, 1.04f, 3f, 2.97f, 3f, 5.19f)
                close()
            }
        }.also { _SmartHomeAlt = it}

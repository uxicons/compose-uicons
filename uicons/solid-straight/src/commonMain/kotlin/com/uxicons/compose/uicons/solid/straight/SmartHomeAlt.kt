package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartHomeAlt: ImageVector? = null

val Icons.Ss.SmartHomeAlt: ImageVector
    get() = _SmartHomeAlt ?: UXIcon(name = "SmartHomeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.81f, 7.63f)
                lineTo(13.91f, 0.66f)
                curveToRelative(-1.12f, -0.88f, -2.69f, -0.88f, -3.81f, 0f)
                lineTo(1.19f, 7.63f)
                curveToRelative(-0.76f, 0.59f, -1.19f, 1.48f, -1.19f, 2.44f)
                verticalLineToRelative(13.93f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-13.93f)
                curveToRelative(0f, -0.96f, -0.43f, -1.85f, -1.19f, -2.44f)
                close()
                moveTo(11f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -2.21f, 1.21f, -4.15f, 3f, -5.19f)
                verticalLineToRelative(2.57f)
                curveToRelative(-0.61f, 0.7f, -1f, 1.61f, -1f, 2.62f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.0f, -0.39f, -1.91f, -1f, -2.62f)
                verticalLineToRelative(-2.57f)
                curveToRelative(1.79f, 1.04f, 3f, 2.97f, 3f, 5.19f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                close()
            }
        }.also { _SmartHomeAlt = it}

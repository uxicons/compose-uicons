package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartHomeAlt: ImageVector? = null

val Icons.Rs.SmartHomeAlt: ImageVector
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
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(-11.93f)
                curveToRelative(0f, -0.34f, 0.15f, -0.66f, 0.42f, -0.86f)
                lineTo(11.33f, 2.23f)
                curveToRelative(0.4f, -0.31f, 0.95f, -0.31f, 1.35f, 0f)
                lineToRelative(8.9f, 6.98f)
                curveToRelative(0.27f, 0.21f, 0.42f, 0.52f, 0.42f, 0.86f)
                verticalLineToRelative(11.93f)
                close()
                moveTo(13f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                close()
                moveTo(18f, 14f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -2.21f, 1.21f, -4.15f, 3f, -5.19f)
                verticalLineToRelative(2.57f)
                curveToRelative(-0.61f, 0.7f, -1f, 1.61f, -1f, 2.62f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.0f, -0.39f, -1.91f, -1f, -2.62f)
                verticalLineToRelative(-2.57f)
                curveToRelative(1.79f, 1.04f, 3f, 2.97f, 3f, 5.19f)
                close()
            }
        }.also { _SmartHomeAlt = it}

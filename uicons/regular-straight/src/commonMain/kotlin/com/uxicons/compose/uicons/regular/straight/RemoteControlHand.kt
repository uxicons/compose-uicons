package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RemoteControlHand: ImageVector? = null

val Icons.Rs.RemoteControlHand: ImageVector
    get() = _RemoteControlHand ?: UXIcon(name = "RemoteControlHand") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.93f, 7.46f)
                curveToRelative(0f, 1.95f, 1.59f, 3.54f, 3.54f, 3.54f)
                reflectiveCurveToRelative(3.54f, -1.59f, 3.54f, -3.54f)
                reflectiveCurveToRelative(-1.59f, -3.54f, -3.54f, -3.54f)
                reflectiveCurveToRelative(-3.54f, 1.59f, -3.54f, 3.54f)
                close()
                moveTo(9f, 7.46f)
                curveToRelative(0f, 0.85f, -0.69f, 1.54f, -1.54f, 1.54f)
                reflectiveCurveToRelative(-1.54f, -0.69f, -1.54f, -1.54f)
                reflectiveCurveToRelative(0.69f, -1.54f, 1.54f, -1.54f)
                reflectiveCurveToRelative(1.54f, 0.69f, 1.54f, 1.54f)
                close()
                moveTo(14.22f, 11.76f)
                lineToRelative(4.44f, 4.0f)
                lineToRelative(-1.34f, 1.49f)
                lineToRelative(-4.44f, -4f)
                curveToRelative(-0.42f, -0.37f, -1.06f, -0.37f, -1.49f, -0.01f)
                curveToRelative(-0.48f, 0.41f, -0.54f, 1.13f, -0.13f, 1.61f)
                lineToRelative(4.73f, 6.83f)
                verticalLineToRelative(2.31f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.69f)
                lineToRelative(-1.6f, -2.31f)
                lineTo(0f, 20.0f)
                lineTo(0f, 7.5f)
                curveTo(0f, 3.36f, 3.36f, 0f, 7.5f, 0f)
                reflectiveCurveToRelative(7.5f, 3.36f, 7.5f, 7.5f)
                verticalLineToRelative(2.36f)
                curveToRelative(-0.61f, -0.41f, -1.29f, -0.68f, -2f, -0.8f)
                verticalLineToRelative(-1.56f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveTo(2f, 4.47f, 2f, 7.5f)
                verticalLineToRelative(10.5f)
                lineTo(11.02f, 18f)
                lineToRelative(-1.33f, -1.93f)
                curveToRelative(-1.06f, -1.24f, -0.9f, -3.23f, 0.42f, -4.35f)
                curveToRelative(1.19f, -1.01f, 2.95f, -0.99f, 4.12f, 0.04f)
                close()
                moveTo(24f, 12.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 13.42f)
                lineToRelative(-5f, -4.75f)
                verticalLineToRelative(-2.67f)
                lineToRelative(7f, 6.5f)
                close()
            }
        }.also { _RemoteControlHand = it}

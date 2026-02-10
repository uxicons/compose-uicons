package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointDown: ImageVector? = null

val Icons.Sr.HandBackPointDown: ImageVector
    get() = _HandBackPointDown ?: UXIcon(name = "HandBackPointDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 5f)
                verticalLineToRelative(4.72f)
                curveToRelative(0f, 2.38f, -1.68f, 4.43f, -4.02f, 4.9f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-4.98f, 1.2f, -4.98f, 1.2f)
                verticalLineToRelative(5.68f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(7.34f)
                lineToRelative(-2.79f, -3.64f)
                curveToRelative(-1.7f, -1.99f, -1.59f, -4.94f, 0.25f, -6.79f)
                lineTo(5.86f, 1.48f)
                curveTo(6.8f, 0.54f, 8.08f, 0.0f, 9.41f, 0f)
                horizontalLineToRelative(7.59f)
                curveTo(19.76f, 0f, 22f, 2.24f, 22f, 5f)
                close()
            }
        }.also { _HandBackPointDown = it}

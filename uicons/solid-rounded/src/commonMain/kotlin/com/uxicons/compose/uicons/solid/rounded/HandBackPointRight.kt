package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointRight: ImageVector? = null

val Icons.Sr.HandBackPointRight: ImageVector
    get() = _HandBackPointRight ?: UXIcon(name = "HandBackPointRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 8f)
                horizontalLineTo(7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(7.34f)
                lineToRelative(-3.64f, -2.79f)
                curveToRelative(-1.99f, -1.7f, -4.94f, -1.59f, -6.79f, 0.25f)
                lineTo(1.48f, 5.86f)
                curveTo(0.54f, 6.8f, 0.0f, 8.08f, 0f, 9.41f)
                verticalLineToRelative(7.59f)
                curveTo(0f, 19.76f, 2.24f, 22f, 5f, 22f)
                horizontalLineToRelative(4.72f)
                curveToRelative(2.38f, 0f, 4.43f, -1.68f, 4.9f, -4.02f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(1.2f, -4.98f, 1.2f, -4.98f)
                horizontalLineToRelative(5.68f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _HandBackPointRight = it}

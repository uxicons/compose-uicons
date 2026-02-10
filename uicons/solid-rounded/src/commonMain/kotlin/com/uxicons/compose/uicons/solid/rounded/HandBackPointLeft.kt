package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointLeft: ImageVector? = null

val Icons.Sr.HandBackPointLeft: ImageVector
    get() = _HandBackPointLeft ?: UXIcon(name = "HandBackPointLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9.41f)
                verticalLineToRelative(7.59f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-4.72f)
                curveToRelative(-2.38f, 0f, -4.43f, -1.68f, -4.9f, -4.02f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-1.2f, -4.98f, -1.2f, -4.98f)
                horizontalLineTo(2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-7.34f)
                lineToRelative(3.64f, -2.79f)
                curveToRelative(1.99f, -1.7f, 4.94f, -1.59f, 6.79f, 0.25f)
                lineToRelative(2.42f, 2.4f)
                curveToRelative(0.94f, 0.94f, 1.48f, 2.22f, 1.48f, 3.55f)
                close()
            }
        }.also { _HandBackPointLeft = it}

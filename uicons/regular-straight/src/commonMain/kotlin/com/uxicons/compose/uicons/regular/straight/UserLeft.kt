package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserLeft: ImageVector? = null

val Icons.Rs.UserLeft: ImageVector
    get() = _UserLeft ?: UXIcon(name = "UserLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                horizontalLineToRelative(-5.78f)
                lineToRelative(1.99f, 1.98f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.34f, -3.34f)
                curveToRelative(-0.6f, -0.6f, -0.6f, -1.58f, 0f, -2.19f)
                lineToRelative(3.34f, -3.34f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.06f, 2.06f)
                horizontalLineToRelative(5.85f)
                verticalLineToRelative(2f)
                close()
                moveTo(11f, 16f)
                horizontalLineToRelative(-7f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(7f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(2f, 8.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveToRelative(-5.5f, -2.47f, -5.5f, -5.5f)
                close()
                moveTo(4f, 8.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                close()
            }
        }.also { _UserLeft = it}

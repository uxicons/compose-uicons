package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Watch: ImageVector? = null

val Icons.Ts.Watch: ImageVector
    get() = _Watch ?: UXIcon(name = "Watch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 11.79f)
                lineToRelative(3.35f, 3.35f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.65f, -3.65f)
                verticalLineToRelative(-6.21f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5.79f)
                close()
                moveTo(18f, 20.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.34f)
                curveToRelative(-1.47f, 0.85f, -3.18f, 1.34f, -5f, 1.34f)
                reflectiveCurveToRelative(-3.53f, -0.49f, -5f, -1.34f)
                verticalLineToRelative(3.34f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4.0f)
                curveToRelative(-2.43f, -1.83f, -4f, -4.73f, -4f, -8.0f)
                reflectiveCurveToRelative(1.57f, -6.17f, 4f, -8.0f)
                lineTo(6f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.34f)
                curveToRelative(1.47f, -0.85f, 3.18f, -1.34f, 5f, -1.34f)
                reflectiveCurveToRelative(3.53f, 0.49f, 5f, 1.34f)
                lineTo(17f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4.0f)
                curveToRelative(2.43f, 1.83f, 4f, 4.73f, 4f, 8.0f)
                reflectiveCurveToRelative(-1.57f, 6.17f, -4f, 8.0f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                close()
            }
        }.also { _Watch = it}

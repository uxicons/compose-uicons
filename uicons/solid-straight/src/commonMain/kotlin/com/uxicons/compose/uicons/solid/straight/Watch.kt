package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Watch: ImageVector? = null

val Icons.Ss.Watch: ImageVector
    get() = _Watch ?: UXIcon(name = "Watch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 3f)
                curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(16.96f, 3f, 12f, 3f)
                close()
                moveTo(14.29f, 15.71f)
                lineToRelative(-3.29f, -3.29f)
                verticalLineToRelative(-5.41f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.59f)
                lineToRelative(2.71f, 2.71f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(6f, 2.79f)
                lineTo(6f, 0f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2.79f)
                curveToRelative(-1.73f, -1.13f, -3.79f, -1.78f, -6f, -1.78f)
                reflectiveCurveToRelative(-4.27f, 0.66f, -6f, 1.78f)
                close()
                moveTo(18f, 21.21f)
                verticalLineToRelative(2.79f)
                lineTo(6f, 24f)
                verticalLineToRelative(-2.79f)
                curveToRelative(1.73f, 1.13f, 3.79f, 1.78f, 6f, 1.78f)
                reflectiveCurveToRelative(4.27f, -0.66f, 6f, -1.78f)
                close()
            }
        }.also { _Watch = it}

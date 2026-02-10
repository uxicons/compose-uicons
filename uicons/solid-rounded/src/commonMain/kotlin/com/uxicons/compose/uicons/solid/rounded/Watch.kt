package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Watch: ImageVector? = null

val Icons.Sr.Watch: ImageVector
    get() = _Watch ?: UXIcon(name = "Watch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 2.9f)
                curveTo(7.04f, 2.9f, 3f, 6.93f, 3f, 11.9f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(16.96f, 2.9f, 12f, 2.9f)
                close()
                moveTo(14.71f, 14.71f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-2f, -2f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.59f)
                lineToRelative(1.71f, 1.71f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(6f, 2.79f)
                verticalLineToRelative(-1.78f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.78f)
                curveToRelative(-1.73f, -1.13f, -3.79f, -1.78f, -6f, -1.78f)
                reflectiveCurveToRelative(-4.27f, 0.66f, -6f, 1.78f)
                close()
                moveTo(18f, 21.21f)
                verticalLineToRelative(1.78f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(7f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.78f)
                curveToRelative(1.73f, 1.13f, 3.79f, 1.78f, 6f, 1.78f)
                reflectiveCurveToRelative(4.27f, -0.66f, 6f, -1.78f)
                close()
            }
        }.also { _Watch = it}

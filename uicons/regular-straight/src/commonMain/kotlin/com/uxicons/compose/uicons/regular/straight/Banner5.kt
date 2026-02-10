package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner5: ImageVector? = null

val Icons.Rs.Banner5: ImageVector
    get() = _Banner5 ?: UXIcon(name = "Banner5") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11.07f)
                verticalLineToRelative(-0.07f)
                reflectiveCurveToRelative(-1.59f, -1.05f, -4f, -1.63f)
                verticalLineToRelative(-4.06f)
                lineToRelative(-0.65f, -0.24f)
                curveToRelative(-0.12f, -0.04f, -2.91f, -1.06f, -7.35f, -1.06f)
                reflectiveCurveToRelative(-7.23f, 1.02f, -7.35f, 1.06f)
                lineToRelative(-0.65f, 0.24f)
                verticalLineToRelative(4.06f)
                curveToRelative(-2.41f, 0.58f, -4f, 1.63f, -4f, 1.63f)
                verticalLineToRelative(0.07f)
                curveToRelative(1.5f, 0.93f, 3f, 2.93f, 3f, 2.93f)
                curveToRelative(0f, 0f, -1.81f, 2.04f, -3f, 4.93f)
                verticalLineToRelative(0.07f)
                curveToRelative(2.5f, -1f, 5.18f, -1.82f, 7f, -2f)
                verticalLineToRelative(-2.46f)
                curveToRelative(1.25f, -0.26f, 3.05f, -0.54f, 5f, -0.54f)
                reflectiveCurveToRelative(3.75f, 0.28f, 5f, 0.54f)
                verticalLineToRelative(2.46f)
                curveToRelative(1.82f, 0.18f, 4.5f, 1f, 7f, 2f)
                verticalLineToRelative(-0.07f)
                curveToRelative(-1.19f, -2.89f, -3f, -4.93f, -3f, -4.93f)
                curveToRelative(0f, 0f, 1.5f, -2f, 3f, -2.93f)
                close()
                moveTo(6f, 12.71f)
                verticalLineToRelative(-5.97f)
                curveToRelative(1.01f, -0.28f, 3.14f, -0.74f, 6f, -0.74f)
                reflectiveCurveToRelative(4.99f, 0.46f, 6f, 0.74f)
                verticalLineToRelative(5.97f)
                curveToRelative(-1.33f, -0.31f, -3.55f, -0.71f, -6f, -0.71f)
                reflectiveCurveToRelative(-4.67f, 0.4f, -6f, 0.71f)
                close()
            }
        }.also { _Banner5 = it}

package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ring: ImageVector? = null

val Icons.Rr.Ring: ImageVector
    get() = _Ring ?: UXIcon(name = "Ring") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 3f)
                curveTo(5.9f, 3f, 1.01f, 5.35f, 0.15f, 8.51f)
                curveToRelative(-0.09f, 0.15f, -0.15f, 0.31f, -0.15f, 0.49f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 3.65f, 5.27f, 6.5f, 12f, 6.5f)
                reflectiveCurveToRelative(12f, -2.85f, 12f, -6.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -3.65f, -5.27f, -6.5f, -12f, -6.5f)
                close()
                moveTo(12f, 5f)
                curveToRelative(5.89f, 0f, 10f, 2.37f, 10f, 4.5f)
                curveToRelative(0f, 0.36f, -0.13f, 0.73f, -0.35f, 1.09f)
                curveToRelative(-2.23f, -1.63f, -5.76f, -2.59f, -9.65f, -2.59f)
                curveToRelative(-3.87f, 0f, -7.44f, 0.97f, -9.65f, 2.58f)
                curveToRelative(-0.22f, -0.36f, -0.34f, -0.72f, -0.34f, -1.08f)
                curveToRelative(0f, -2.13f, 4.11f, -4.5f, 10f, -4.5f)
                close()
                moveTo(20.18f, 11.99f)
                curveToRelative(-1.75f, 1.15f, -4.64f, 2.01f, -8.18f, 2.01f)
                reflectiveCurveToRelative(-6.43f, -0.86f, -8.17f, -2.0f)
                curveToRelative(1.89f, -1.23f, 4.93f, -2.0f, 8.17f, -2.0f)
                reflectiveCurveToRelative(6.28f, 0.75f, 8.18f, 1.99f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-5.89f, 0f, -10f, -2.37f, -10f, -4.5f)
                verticalLineToRelative(-1.36f)
                curveToRelative(2.13f, 1.74f, 5.78f, 2.86f, 10f, 2.86f)
                reflectiveCurveToRelative(7.87f, -1.12f, 10f, -2.86f)
                verticalLineToRelative(1.36f)
                curveToRelative(0f, 2.13f, -4.11f, 4.5f, -10f, 4.5f)
                close()
            }
        }.also { _Ring = it}

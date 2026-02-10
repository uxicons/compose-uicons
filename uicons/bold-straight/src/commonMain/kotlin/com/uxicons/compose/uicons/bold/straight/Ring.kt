package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ring: ImageVector? = null

val Icons.Bs.Ring: ImageVector
    get() = _Ring ?: UXIcon(name = "Ring") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 3f)
                curveTo(5.16f, 3f, 0f, 5.79f, 0f, 9.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 3.71f, 5.16f, 6.5f, 12f, 6.5f)
                reflectiveCurveToRelative(12f, -2.79f, 12f, -6.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -3.71f, -5.16f, -6.5f, -12f, -6.5f)
                close()
                moveTo(12f, 6f)
                curveToRelative(5.49f, 0f, 9f, 2.07f, 9f, 3.5f)
                curveToRelative(0f, 0.17f, -0.05f, 0.34f, -0.14f, 0.52f)
                curveToRelative(-2.22f, -1.28f, -5.41f, -2.02f, -8.86f, -2.02f)
                reflectiveCurveToRelative(-6.64f, 0.74f, -8.86f, 2.02f)
                curveToRelative(-0.09f, -0.18f, -0.14f, -0.36f, -0.14f, -0.52f)
                curveToRelative(0f, -1.43f, 3.51f, -3.5f, 9f, -3.5f)
                close()
                moveTo(18.03f, 12.0f)
                curveToRelative(-1.52f, 0.58f, -3.58f, 1.0f, -6.03f, 1.0f)
                reflectiveCurveToRelative(-4.51f, -0.41f, -6.03f, -1.0f)
                curveToRelative(1.66f, -0.63f, 3.81f, -1.0f, 6.03f, -1.0f)
                reflectiveCurveToRelative(4.37f, 0.37f, 6.03f, 1.0f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-5.49f, 0f, -9f, -2.07f, -9f, -3.5f)
                verticalLineToRelative(-0.61f)
                curveToRelative(2.17f, 1.31f, 5.34f, 2.11f, 9f, 2.11f)
                reflectiveCurveToRelative(6.83f, -0.8f, 9f, -2.11f)
                verticalLineToRelative(0.61f)
                curveToRelative(0f, 1.43f, -3.51f, 3.5f, -9f, 3.5f)
                close()
            }
        }.also { _Ring = it}

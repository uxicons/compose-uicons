package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CanFood: ImageVector? = null

val Icons.Ts.CanFood: ImageVector
    get() = _CanFood ?: UXIcon(name = "CanFood") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(8.13f, 0f, 2f, 0.81f, 2f, 3f)
                curveToRelative(0f, 0.02f, 0f, 0.03f, 0.0f, 0.05f)
                horizontalLineToRelative(-0.0f)
                verticalLineToRelative(17.95f)
                curveToRelative(0f, 2.07f, 5.85f, 3f, 10f, 3f)
                reflectiveCurveToRelative(10f, -0.95f, 10f, -3.05f)
                lineTo(22f, 3f)
                curveToRelative(0f, -2.19f, -6.13f, -3f, -10f, -3f)
                close()
                moveTo(12f, 1f)
                curveToRelative(5.5f, 0f, 9f, 1.31f, 9f, 2f)
                reflectiveCurveToRelative(-3.5f, 2f, -9f, 2f)
                reflectiveCurveTo(3f, 3.69f, 3f, 3f)
                reflectiveCurveTo(6.5f, 1f, 12f, 1f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-5.29f, 0f, -9f, -1.3f, -9f, -2f)
                verticalLineToRelative(-2.65f)
                curveToRelative(1.85f, 1.13f, 5.9f, 1.65f, 9f, 1.65f)
                reflectiveCurveToRelative(7.15f, -0.53f, 9f, -1.67f)
                verticalLineToRelative(2.62f)
                curveToRelative(0f, 0.72f, -3.71f, 2.05f, -9f, 2.05f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-5.29f, 0f, -9f, -1.3f, -9f, -2f)
                verticalLineToRelative(-8.64f)
                curveToRelative(1.85f, 1.13f, 5.9f, 1.65f, 9f, 1.65f)
                reflectiveCurveToRelative(7.15f, -0.53f, 9f, -1.67f)
                verticalLineToRelative(8.62f)
                curveToRelative(0f, 0.72f, -3.71f, 2.05f, -9f, 2.05f)
                close()
                moveTo(12f, 9f)
                curveToRelative(-5.29f, 0f, -9f, -1.3f, -9f, -2f)
                verticalLineToRelative(-2.62f)
                curveToRelative(1.9f, 1.16f, 6.09f, 1.62f, 9f, 1.62f)
                reflectiveCurveToRelative(7.1f, -0.46f, 9f, -1.62f)
                verticalLineToRelative(2.57f)
                curveToRelative(0f, 0.72f, -3.71f, 2.05f, -9f, 2.05f)
                close()
            }
        }.also { _CanFood = it}

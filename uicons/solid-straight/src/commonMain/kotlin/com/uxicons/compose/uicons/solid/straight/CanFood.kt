package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CanFood: ImageVector? = null

val Icons.Ss.CanFood: ImageVector
    get() = _CanFood ?: UXIcon(name = "CanFood") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 5f)
                curveToRelative(-3.71f, 0f, -10f, -0.53f, -10f, -2.5f)
                reflectiveCurveTo(8.29f, 0f, 12f, 0f)
                reflectiveCurveToRelative(10f, 0.53f, 10f, 2.5f)
                reflectiveCurveToRelative(-6.29f, 2.5f, -10f, 2.5f)
                close()
                moveTo(12f, 10f)
                curveToRelative(5.94f, 0f, 9.71f, -1.41f, 10f, -2.15f)
                verticalLineToRelative(-2.45f)
                curveToRelative(-1.94f, 1.06f, -5.27f, 1.6f, -10f, 1.6f)
                reflectiveCurveToRelative(-8.06f, -0.54f, -10f, -1.6f)
                verticalLineToRelative(2.54f)
                curveToRelative(0.27f, 0.67f, 4.04f, 2.06f, 10f, 2.06f)
                close()
                moveTo(12f, 19f)
                curveToRelative(5.94f, 0f, 9.71f, -1.41f, 10f, -2.15f)
                verticalLineToRelative(-6.59f)
                curveToRelative(-2.48f, 1.24f, -6.76f, 1.74f, -10f, 1.74f)
                curveToRelative(-2.83f, 0f, -7.39f, -0.4f, -10f, -1.67f)
                verticalLineToRelative(6.62f)
                curveToRelative(0.27f, 0.67f, 4.04f, 2.06f, 10f, 2.06f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-2.83f, 0f, -7.39f, -0.4f, -10f, -1.67f)
                verticalLineToRelative(1.17f)
                curveToRelative(0f, 2.76f, 6.29f, 3.5f, 10f, 3.5f)
                curveToRelative(3.46f, 0f, 10f, -0.74f, 10f, -3.55f)
                verticalLineToRelative(-1.19f)
                curveToRelative(-2.48f, 1.24f, -6.76f, 1.74f, -10f, 1.74f)
                close()
            }
        }.also { _CanFood = it}

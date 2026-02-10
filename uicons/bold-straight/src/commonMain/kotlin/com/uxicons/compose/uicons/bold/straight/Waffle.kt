package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Waffle: ImageVector? = null

val Icons.Bs.Waffle: ImageVector
    get() = _Waffle ?: UXIcon(name = "Waffle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 3f)
                curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(16.96f, 3f, 12f, 3f)
                close()
                moveTo(18.92f, 12.97f)
                horizontalLineToRelative(-2.95f)
                reflectiveCurveToRelative(0f, -1.95f, 0f, -1.95f)
                horizontalLineToRelative(2.95f)
                curveToRelative(-0.15f, -1.06f, -0.53f, -2.09f, -1.17f, -3f)
                horizontalLineToRelative(-1.78f)
                reflectiveCurveToRelative(0f, -1.78f, 0f, -1.78f)
                curveToRelative(-0.91f, -0.63f, -1.94f, -1.02f, -3f, -1.17f)
                verticalLineToRelative(2.95f)
                reflectiveCurveToRelative(-1.95f, 0f, -1.95f, 0f)
                verticalLineToRelative(-2.95f)
                curveToRelative(-1.06f, 0.15f, -2.09f, 0.54f, -3f, 1.17f)
                verticalLineToRelative(1.78f)
                reflectiveCurveToRelative(-1.78f, 0f, -1.78f, 0f)
                curveToRelative(-0.63f, 0.91f, -1.02f, 1.94f, -1.17f, 3f)
                horizontalLineToRelative(2.95f)
                reflectiveCurveToRelative(0f, 1.95f, 0f, 1.95f)
                horizontalLineToRelative(-2.95f)
                curveToRelative(0.15f, 1.06f, 0.53f, 2.09f, 1.17f, 3f)
                horizontalLineToRelative(1.78f)
                reflectiveCurveToRelative(0f, 1.78f, 0f, 1.78f)
                curveToRelative(0.91f, 0.63f, 1.94f, 1.02f, 3f, 1.17f)
                verticalLineToRelative(-2.95f)
                reflectiveCurveToRelative(1.95f, 0f, 1.95f, 0f)
                verticalLineToRelative(2.95f)
                curveToRelative(1.06f, -0.15f, 2.09f, -0.53f, 3f, -1.17f)
                verticalLineToRelative(-1.78f)
                reflectiveCurveToRelative(1.78f, 0f, 1.78f, 0f)
                curveToRelative(0.63f, -0.91f, 1.02f, -1.94f, 1.17f, -3f)
                close()
                moveTo(11.03f, 12.97f)
                verticalLineToRelative(-1.95f)
                reflectiveCurveToRelative(1.95f, 0f, 1.95f, 0f)
                verticalLineToRelative(1.95f)
                reflectiveCurveToRelative(-1.95f, 0f, -1.95f, 0f)
                close()
            }
        }.also { _Waffle = it}

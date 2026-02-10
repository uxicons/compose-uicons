package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Exclamation: ImageVector? = null

val Icons.Tc.Exclamation: ImageVector
    get() = _Exclamation ?: UXIcon(name = "Exclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.91f, 1f, 1.06f, 2.25f, 1.06f, 12f)
                curveToRelative(0f, 7.71f, 3.27f, 11f, 10.94f, 11f)
                curveToRelative(5.09f, 0f, 10.94f, -1.25f, 10.94f, -11f)
                curveToRelative(0f, -7.71f, -3.27f, -11f, -10.94f, -11f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-7.06f, 0f, -9.94f, -2.9f, -9.94f, -10f)
                reflectiveCurveTo(4.94f, 2f, 12f, 2f)
                reflectiveCurveToRelative(9.94f, 2.9f, 9.94f, 10f)
                reflectiveCurveToRelative(-2.88f, 10f, -9.94f, 10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 13.68f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineTo(7.24f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(5.95f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 16.77f)
                moveToRelative(-0.74f, 0f)
                arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.49f, 0f)
                arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.49f, 0f)
            }
        }.also { _Exclamation = it}

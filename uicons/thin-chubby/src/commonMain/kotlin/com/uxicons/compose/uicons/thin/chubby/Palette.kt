package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Palette: ImageVector? = null

val Icons.Tc.Palette: ImageVector
    get() = _Palette ?: UXIcon(name = "Palette") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.89f, 1f, 1.03f, 2.25f, 1.03f, 12f)
                curveToRelative(0f, 7.71f, 3.28f, 11f, 10.97f, 11f)
                curveToRelative(0.44f, 0f, 0.88f, -0.01f, 1.3f, -0.03f)
                curveToRelative(1.3f, -0.07f, 2.32f, -1.18f, 2.32f, -2.53f)
                verticalLineToRelative(-0.02f)
                curveToRelative(0f, -3.39f, 1.63f, -4.09f, 4.08f, -4.09f)
                curveToRelative(0.21f, 0f, 0.41f, 0.01f, 0.61f, 0.02f)
                curveToRelative(1.27f, 0.08f, 2.44f, -0.92f, 2.57f, -2.22f)
                curveToRelative(0.07f, -0.66f, 0.1f, -1.37f, 0.1f, -2.13f)
                curveToRelative(0f, -7.71f, -3.28f, -11f, -10.97f, -11f)
                close()
                moveTo(21.88f, 14.03f)
                curveToRelative(-0.08f, 0.77f, -0.74f, 1.36f, -1.51f, 1.32f)
                curveToRelative(-0.22f, -0.01f, -0.44f, -0.02f, -0.67f, -0.02f)
                curveToRelative(-2.18f, 0f, -5.08f, 0.53f, -5.08f, 5.09f)
                verticalLineToRelative(0.02f)
                curveToRelative(0.0f, 0.82f, -0.6f, 1.49f, -1.37f, 1.53f)
                curveToRelative(-0.4f, 0.02f, -0.82f, 0.03f, -1.24f, 0.03f)
                curveToRelative(-7.08f, 0f, -9.97f, -2.9f, -9.97f, -10f)
                reflectiveCurveTo(4.92f, 2f, 12f, 2f)
                reflectiveCurveToRelative(9.97f, 2.9f, 9.97f, 10f)
                curveToRelative(0f, 0.72f, -0.03f, 1.4f, -0.09f, 2.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.31f, 6.01f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.19f, 8.59f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.33f, 9.73f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.37f, 15.86f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
        }.also { _Palette = it}

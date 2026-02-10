package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Palette: ImageVector? = null

val Icons.Rc.Palette: ImageVector
    get() = _Palette ?: UXIcon(name = "Palette") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.34f, 6.3f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.95f, 8.76f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.58f, 9.85f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.58f, 15.68f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23f)
                curveToRelative(-5.12f, 0f, -11f, -1.25f, -11f, -11f)
                reflectiveCurveTo(6.88f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 1.25f, 11f, 11f)
                curveToRelative(0f, 0.73f, -0.03f, 1.43f, -0.1f, 2.08f)
                curveToRelative(-0.15f, 1.52f, -1.48f, 2.69f, -3.0f, 2.58f)
                curveToRelative(-0.18f, -0.01f, -0.36f, -0.02f, -0.55f, -0.02f)
                curveToRelative(-2.19f, 0f, -3.37f, 0.54f, -3.37f, 3.37f)
                verticalLineToRelative(0.02f)
                curveToRelative(0.0f, 1.56f, -1.19f, 2.85f, -2.71f, 2.93f)
                curveToRelative(-0.41f, 0.02f, -0.83f, 0.03f, -1.27f, 0.03f)
                close()
                moveTo(12f, 3f)
                curveTo(6.6f, 3f, 3f, 4.53f, 3f, 12f)
                reflectiveCurveToRelative(3.6f, 9f, 9f, 9f)
                curveToRelative(0.4f, 0f, 0.78f, -0.01f, 1.16f, -0.03f)
                curveToRelative(0.47f, -0.03f, 0.82f, -0.42f, 0.81f, -0.93f)
                verticalLineToRelative(-0.02f)
                curveToRelative(0f, -3.61f, 1.76f, -5.37f, 5.37f, -5.37f)
                curveToRelative(0.23f, 0f, 0.46f, 0.01f, 0.67f, 0.02f)
                curveToRelative(0.45f, 0.03f, 0.84f, -0.33f, 0.89f, -0.79f)
                curveToRelative(0.06f, -0.58f, 0.09f, -1.21f, 0.09f, -1.88f)
                curveToRelative(0f, -7.47f, -3.6f, -9f, -9f, -9f)
                close()
            }
        }.also { _Palette = it}

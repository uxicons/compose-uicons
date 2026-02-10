package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lasso: ImageVector? = null

val Icons.Bs.Lasso: ImageVector
    get() = _Lasso ?: UXIcon(name = "Lasso") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 0f)
                curveToRelative(-6.27f, 0f, -11f, 4.08f, -11f, 9.5f)
                arcToRelative(8.74f, 8.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.17f, 1.67f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.85f, 4.37f)
                arcToRelative(6.6f, 6.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.31f, 3.96f)
                arcToRelative(4.37f, 4.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 4.5f)
                lineToRelative(0.02f, -3f)
                arcToRelative(1.38f, 1.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.52f, -1.5f)
                arcToRelative(3.65f, 3.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.56f, -1.95f)
                arcToRelative(14.44f, 14.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.03f, 0.46f)
                curveToRelative(0.13f, 0f, 0.26f, -0.01f, 0.39f, -0.01f)
                arcToRelative(12.77f, 12.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.01f, 1.0f)
                curveToRelative(6.27f, 0f, 11f, -4.08f, 11f, -9.5f)
                reflectiveCurveToRelative(-4.73f, -9.5f, -11f, -9.5f)
                close()
                moveTo(13f, 16f)
                arcToRelative(10.25f, 10.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.58f, -0.32f)
                arcToRelative(18.87f, 18.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.61f, -4.51f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.78f, -1.13f)
                curveToRelative(-0.02f, -0.18f, -0.03f, -0.36f, -0.03f, -0.54f)
                curveToRelative(0f, -3.71f, 3.44f, -6.5f, 8f, -6.5f)
                reflectiveCurveToRelative(8f, 2.79f, 8f, 6.5f)
                reflectiveCurveToRelative(-3.44f, 6.5f, -8f, 6.5f)
                close()
            }
        }.also { _Lasso = it}

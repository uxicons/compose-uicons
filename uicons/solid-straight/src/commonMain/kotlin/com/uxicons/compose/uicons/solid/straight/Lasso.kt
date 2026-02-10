package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lasso: ImageVector? = null

val Icons.Ss.Lasso: ImageVector
    get() = _Lasso ?: UXIcon(name = "Lasso") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 0f)
                curveToRelative(-6.07f, 0f, -11f, 4.04f, -11f, 9f)
                arcToRelative(7.59f, 7.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.69f, 3.1f)
                arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.44f, 3.08f)
                arcToRelative(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, 4.82f)
                arcToRelative(3.89f, 3.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                lineToRelative(0.01f, -2f)
                arcToRelative(1.89f, 1.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.01f, -2f)
                arcToRelative(5.06f, 5.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.68f, -3.43f)
                arcToRelative(10.82f, 10.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.43f, 0.43f)
                curveToRelative(0.3f, 0f, 0.58f, -0.01f, 0.84f, -0.02f)
                arcToRelative(13.05f, 13.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.04f, 1.01f)
                curveToRelative(6.07f, 0f, 11f, -4.04f, 11f, -9f)
                reflectiveCurveToRelative(-4.93f, -9f, -11f, -9f)
                close()
                moveTo(13f, 16f)
                arcToRelative(11.12f, 11.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.91f, -0.71f)
                arcToRelative(14.45f, 14.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.99f, -3.41f)
                arcToRelative(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.68f, -0.8f)
                arcToRelative(5.58f, 5.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.42f, -2.08f)
                curveToRelative(0f, -3.86f, 4.04f, -7f, 9f, -7f)
                reflectiveCurveToRelative(9f, 3.14f, 9f, 7f)
                reflectiveCurveToRelative(-4.04f, 7f, -9f, 7f)
                close()
            }
        }.also { _Lasso = it}

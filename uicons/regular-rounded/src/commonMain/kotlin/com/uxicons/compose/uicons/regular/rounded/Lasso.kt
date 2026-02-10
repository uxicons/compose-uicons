package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lasso: ImageVector? = null

val Icons.Rr.Lasso: ImageVector
    get() = _Lasso ?: UXIcon(name = "Lasso") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 0f)
                curveToRelative(-6.07f, 0f, -11f, 4.04f, -11f, 9f)
                arcToRelative(7.54f, 7.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.69f, 3.11f)
                arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.43f, 3.07f)
                arcToRelative(6.98f, 6.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, 4.82f)
                arcToRelative(3.89f, 3.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.01f, -2f)
                arcToRelative(1.89f, 1.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.01f, -2f)
                arcToRelative(5.04f, 5.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.68f, -3.43f)
                arcToRelative(10.82f, 10.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.43f, 0.43f)
                curveToRelative(0.3f, 0f, 0.58f, -0.01f, 0.84f, -0.02f)
                arcToRelative(13.05f, 13.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.04f, 1.01f)
                curveToRelative(6.07f, 0f, 11f, -4.04f, 11f, -9f)
                reflectiveCurveToRelative(-4.93f, -9f, -11f, -9f)
                close()
                moveTo(4.29f, 14.69f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.4f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.4f, 0f)
                arcToRelative(8.43f, 8.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.05f, 1.71f)
                arcToRelative(7.45f, 7.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.45f, -0.31f)
                close()
                moveTo(13f, 16f)
                arcToRelative(11.12f, 11.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.91f, -0.71f)
                arcToRelative(14.45f, 14.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.99f, -3.41f)
                arcToRelative(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.69f, -0.8f)
                arcToRelative(5.54f, 5.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.41f, -2.08f)
                curveToRelative(0f, -3.86f, 4.04f, -7f, 9f, -7f)
                reflectiveCurveToRelative(9f, 3.14f, 9f, 7f)
                reflectiveCurveToRelative(-4.04f, 7f, -9f, 7f)
                close()
            }
        }.also { _Lasso = it}

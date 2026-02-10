package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleDivide: ImageVector? = null

val Icons.Rc.CircleDivide: ImageVector
    get() = _CircleDivide ?: UXIcon(name = "CircleDivide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.4f, 0f, -11f, 3.6f, -11f, 11f)
                curveToRelative(0f, 9.86f, 6.28f, 11f, 11f, 11f)
                curveToRelative(5.12f, 0f, 11f, -1.25f, 11f, -11f)
                reflectiveCurveToRelative(-5.88f, -11f, -11f, -11f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-5.4f, 0f, -9f, -1.53f, -9f, -9f)
                curveToRelative(0f, -6.31f, 2.69f, -9f, 9f, -9f)
                curveToRelative(5.4f, 0f, 9f, 1.53f, 9f, 9f)
                reflectiveCurveToRelative(-3.6f, 9f, -9f, 9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 11f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(9f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8.5f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15.5f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
        }.also { _CircleDivide = it}

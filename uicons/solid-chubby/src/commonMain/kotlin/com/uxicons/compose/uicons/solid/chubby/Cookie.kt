package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cookie: ImageVector? = null

val Icons.Sc.Cookie: ImageVector
    get() = _Cookie ?: UXIcon(name = "Cookie") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.27f, 7.73f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.27f, 3.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.98f, 10.98f)
                curveToRelative(-5.61f, -0.25f, -8.0f, -2.93f, -8.01f, -8.96f)
                curveToRelative(0f, -0.54f, -0.42f, -0.98f, -0.96f, -1.0f)
                curveToRelative(-0.33f, -0.01f, -0.67f, -0.02f, -1.01f, -0.02f)
                curveTo(6.91f, 1f, 1.06f, 2.25f, 1.06f, 12f)
                curveToRelative(0f, 7.5f, 3.48f, 11f, 10.94f, 11f)
                curveToRelative(5.09f, 0f, 10.94f, -1.25f, 10.94f, -11.02f)
                curveToRelative(0f, -0.54f, -0.42f, -0.98f, -0.96f, -1.0f)
                close()
                moveTo(7.37f, 17.74f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(8.07f, 12.23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(12.69f, 16.89f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Cookie = it}

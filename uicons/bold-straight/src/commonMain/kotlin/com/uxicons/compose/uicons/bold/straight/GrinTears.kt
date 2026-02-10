package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinTears: ImageVector? = null

val Icons.Bs.GrinTears: ImageVector
    get() = _GrinTears ?: UXIcon(name = "GrinTears") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.99f, 14f)
                arcToRelative(21.84f, 21.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 1f)
                arcTo(21.92f, 21.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 14f)
                curveToRelative(-0.61f, 2.28f, -2.66f, 5f, -6f, 5f)
                reflectiveCurveTo(6.61f, 16.28f, 5.99f, 14f)
                close()
                moveTo(19.5f, 13.5f)
                reflectiveCurveToRelative(0.43f, 3.17f, 1.19f, 3.93f)
                arcToRelative(1.94f, 1.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.74f, -2.74f)
                curveTo(22.67f, 13.93f, 19.5f, 13.5f, 19.5f, 13.5f)
                close()
                moveTo(4.5f, 13.5f)
                reflectiveCurveToRelative(-3.17f, 0.43f, -3.93f, 1.19f)
                arcToRelative(1.94f, 1.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.74f, 2.74f)
                curveTo(4.07f, 16.67f, 4.5f, 13.5f, 4.5f, 13.5f)
                close()
                moveTo(3.01f, 11.72f)
                curveTo(3.74f, 0.17f, 20.26f, 0.18f, 20.99f, 11.72f)
                arcToRelative(11.13f, 11.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.98f, 0.94f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, -23.93f, 0f)
                arcTo(11.13f, 11.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.01f, 11.72f)
                close()
                moveTo(18.68f, 18.01f)
                curveToRelative(-3.22f, 3.93f, -10.14f, 3.92f, -13.37f, 0f)
                arcToRelative(3.62f, 3.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.59f, 0.84f)
                arcToRelative(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.78f, 1.01f)
                curveToRelative(4.45f, 5.46f, 13.66f, 5.46f, 18.11f, 0f)
                arcToRelative(3.89f, 3.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.78f, -1f)
                arcTo(3.62f, 3.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.68f, 18.01f)
                close()
                moveTo(8f, 7f)
                curveToRelative(-2.27f, 0f, -3f, 3.37f, -3f, 5f)
                curveToRelative(2.76f, -2.61f, 3.25f, -2.59f, 6f, 0f)
                curveTo(11f, 10.37f, 10.27f, 7f, 8f, 7f)
                close()
                moveTo(16f, 7f)
                curveToRelative(-2.27f, 0f, -3f, 3.37f, -3f, 5f)
                curveToRelative(2.76f, -2.61f, 3.25f, -2.59f, 6f, 0f)
                curveTo(19f, 10.37f, 18.27f, 7f, 16f, 7f)
                close()
            }
        }.also { _GrinTears = it}

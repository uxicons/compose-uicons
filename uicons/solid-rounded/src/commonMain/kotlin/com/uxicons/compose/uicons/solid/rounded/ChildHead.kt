package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChildHead: ImageVector? = null

val Icons.Sr.ChildHead: ImageVector
    get() = _ChildHead ?: UXIcon(name = "ChildHead") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.15f, -3.23f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, -19.7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.12f, 6.72f)
                arcToRelative(10.61f, 10.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.07f, 2.96f)
                arcToRelative(8.91f, 8.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.27f, 4.93f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.06f, 24f)
                lineTo(19.92f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.99f, -1.12f)
                arcToRelative(8.9f, 8.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.26f, -4.92f)
                arcToRelative(10.62f, 10.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.08f, -2.97f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.5f)
                close()
                moveTo(20.25f, 12.97f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.12f, 0.65f)
                curveTo(18.21f, 16.22f, 15.13f, 19f, 12f, 19f)
                reflectiveCurveToRelative(-6.21f, -2.78f, -7.13f, -5.38f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.12f, -0.65f)
                arcTo(1.61f, 1.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 13f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.27f, -2.97f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.82f, -0.88f)
                arcTo(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.71f, 2.71f)
                arcToRelative(3.53f, 3.53f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.58f, 0f)
                arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.67f, 6.44f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.82f, 0.88f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 13f)
                arcTo(1.61f, 1.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.25f, 12.97f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 11.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 11.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
        }.also { _ChildHead = it}

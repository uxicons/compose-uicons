package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChildHead: ImageVector? = null

val Icons.Ss.ChildHead: ImageVector
    get() = _ChildHead ?: UXIcon(name = "ChildHead") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.5f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.15f, -3.23f)
                arcTo(9.97f, 9.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                lineTo(12f, 0f)
                arcTo(9.97f, 9.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.15f, 8.27f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.27f, 14.99f)
                arcToRelative(10.3f, 10.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.47f, 2.3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 20f)
                verticalLineToRelative(4f)
                lineTo(21f, 24f)
                lineTo(21f, 20f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.74f, -2.71f)
                arcToRelative(10.33f, 10.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.47f, -2.3f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.5f)
                close()
                moveTo(20.25f, 12.97f)
                lineTo(19.41f, 12.82f)
                lineTo(19.13f, 13.62f)
                curveTo(18.21f, 16.22f, 15.13f, 19f, 12f, 19f)
                verticalLineToRelative(0f)
                curveToRelative(-3.13f, 0f, -6.21f, -2.78f, -7.13f, -5.38f)
                lineToRelative(-0.28f, -0.79f)
                lineToRelative(-0.83f, 0.14f)
                arcTo(1.57f, 1.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 13f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.27f, -2.97f)
                lineToRelative(0.74f, -0.13f)
                lineToRelative(0.08f, -0.74f)
                arcTo(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.58f, 2.77f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.83f, 0f)
                arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.54f, 6.38f)
                lineToRelative(0.08f, 0.74f)
                lineToRelative(0.74f, 0.13f)
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

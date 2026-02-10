package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gif: ImageVector? = null

val Icons.Ss.Gif: ImageVector
    get() = _Gif ?: UXIcon(name = "Gif") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 19f)
                horizontalLineToRelative(4.41f)
                lineToRelative(-4.41f, 4.41f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-17f)
                verticalLineToRelative(-21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(5.5f, 9f)
                verticalLineToRelative(-2.07f)
                arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                arcToRelative(0.77f, 0.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                horizontalLineToRelative(1.25f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 1.99f)
                verticalLineToRelative(2.1f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 1.98f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -1.98f)
                verticalLineToRelative(-1.08f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(0.08f)
                arcToRelative(0.76f, 0.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, 0.73f)
                arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                close()
                moveTo(11.25f, 4.93f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(6.07f)
                horizontalLineToRelative(1.25f)
                close()
                moveTo(16.26f, 4.93f)
                horizontalLineToRelative(-3.26f)
                verticalLineToRelative(6.03f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-2.39f)
                horizontalLineToRelative(1.86f)
                verticalLineToRelative(-1.25f)
                horizontalLineToRelative(-1.86f)
                verticalLineToRelative(-1.14f)
                horizontalLineToRelative(2.01f)
                close()
            }
        }.also { _Gif = it}

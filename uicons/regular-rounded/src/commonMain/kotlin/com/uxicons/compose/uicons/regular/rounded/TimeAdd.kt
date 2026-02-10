package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeAdd: ImageVector? = null

val Icons.Rr.TimeAdd: ImageVector
    get() = _TimeAdd ?: UXIcon(name = "TimeAdd") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 7f)
                verticalLineToRelative(4.59f)
                lineToRelative(-2.71f, 2.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, 1.41f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, -0.71f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.73f, 21.62f)
                arcToRelative(9.98f, 9.98f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.9f, -6.89f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.92f, 0.54f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, -8.28f, 8.28f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.54f, -1.92f)
                close()
            }
        }.also { _TimeAdd = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeForwardTen: ImageVector? = null

val Icons.Ss.TimeForwardTen: ImageVector
    get() = _TimeForwardTen ?: UXIcon(name = "TimeForwardTen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 2f)
                verticalLineToRelative(3.36f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -10f, 18.64f)
                verticalLineToRelative(-2f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.66f, -15f)
                horizontalLineToRelative(-3.67f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineToRelative(-5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 13f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 24f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                close()
                moveTo(21f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 24f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.59f)
                lineToRelative(-1.29f, 1.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.71f, 0.71f)
                close()
            }
        }.also { _TimeForwardTen = it}

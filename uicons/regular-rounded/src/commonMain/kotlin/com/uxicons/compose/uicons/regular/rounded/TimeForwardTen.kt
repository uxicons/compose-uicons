package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeForwardTen: ImageVector? = null

val Icons.Rr.TimeForwardTen: ImageVector
    get() = _TimeForwardTen ?: UXIcon(name = "TimeForwardTen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                close()
                moveTo(22f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 12f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(2.37f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -14.36f, 17.81f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.36f, 0.07f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.36f, -1.93f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12.27f, -14.32f)
                horizontalLineToRelative(-2.64f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.38f, 15.08f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.09f, 0.22f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 1.41f)
                lineToRelative(1.29f, -1.29f)
                verticalLineToRelative(4.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.62f, -0.92f)
                close()
            }
        }.also { _TimeForwardTen = it}

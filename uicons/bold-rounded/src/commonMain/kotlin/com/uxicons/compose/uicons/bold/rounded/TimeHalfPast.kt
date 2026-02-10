package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeHalfPast: ImageVector? = null

val Icons.Br.TimeHalfPast: ImageVector
    get() = _TimeHalfPast ?: UXIcon(name = "TimeHalfPast") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(10f, 12f)
            arcToRelative(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -1.31f)
            verticalLineToRelative(-3.69f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            verticalLineToRelative(3.69f)
            arcToRelative(1.97f, 1.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.62f)
            verticalLineToRelative(2.19f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            verticalLineToRelative(-2.19f)
            arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -1.31f)
            close()
            moveTo(12f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 18f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -24f)
            close()
            moveTo(3f, 12f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.5f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -1.5f)
            close()
            moveTo(6.74f, 1.39f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            close()
            moveTo(2.91f, 5.25f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            close()
            moveTo(6.74f, 19.61f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            close()
            moveTo(2.91f, 15.75f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            close()
        }
    }.also { _TimeHalfPast = it }

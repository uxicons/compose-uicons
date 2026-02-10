package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeDelete: ImageVector? = null

val Icons.Rr.TimeDelete: ImageVector
    get() = _TimeDelete ?: UXIcon(name = "TimeDelete") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 15.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                lineToRelative(-2.79f, 2.79f)
                lineToRelative(-2.79f, -2.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 1.41f)
                lineToRelative(2.79f, 2.79f)
                lineToRelative(-2.79f, 2.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, 1.41f)
                lineToRelative(2.79f, -2.79f)
                lineToRelative(2.79f, 2.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -1.41f)
                lineToRelative(-2.79f, -2.79f)
                lineToRelative(2.79f, -2.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 22f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10f, -10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(4.59f)
                lineToRelative(-2.71f, 2.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, 1.41f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, -0.71f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                close()
            }
        }.also { _TimeDelete = it}

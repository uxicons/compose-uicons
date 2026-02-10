package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSquareDown: ImageVector? = null

val Icons.Rs.AngleSquareDown: ImageVector
    get() = _AngleSquareDown ?: UXIcon(name = "AngleSquareDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 16f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -0.58f)
                lineTo(5.91f, 10.74f)
                lineTo(7.33f, 9.33f)
                lineTo(12f, 14f)
                lineToRelative(4.71f, -4.71f)
                lineTo(18.13f, 10.7f)
                lineToRelative(-4.71f, 4.71f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                close()
                moveTo(24f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                close()
                moveTo(2f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                close()
            }
        }.also { _AngleSquareDown = it}

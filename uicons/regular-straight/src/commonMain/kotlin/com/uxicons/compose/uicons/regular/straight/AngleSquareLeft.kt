package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSquareLeft: ImageVector? = null

val Icons.Rs.AngleSquareLeft: ImageVector
    get() = _AngleSquareLeft ?: UXIcon(name = "AngleSquareLeft") {
            path(fill = SolidColor(Color.Black)) {
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
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.01f, 11.98f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.58f, -1.41f)
                lineToRelative(4.67f, -4.67f)
                lineToRelative(1.41f, 1.41f)
                lineTo(10f, 11.98f)
                lineToRelative(4.71f, 4.71f)
                lineTo(13.3f, 18.11f)
                lineTo(8.59f, 13.4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.01f, 11.98f)
                close()
            }
        }.also { _AngleSquareLeft = it}

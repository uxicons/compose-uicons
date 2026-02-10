package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretSquareLeft1: ImageVector? = null

val Icons.Rs.CaretSquareLeft1: ImageVector
    get() = _CaretSquareLeft1 ?: UXIcon(name = "CaretSquareLeft1") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.36f, 12.84f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.66f)
                lineToRelative(5.65f, -5.17f)
                verticalLineToRelative(12f)
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
        }.also { _CaretSquareLeft1 = it}

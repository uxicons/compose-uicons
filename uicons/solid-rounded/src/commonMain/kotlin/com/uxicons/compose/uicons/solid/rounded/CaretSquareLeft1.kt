package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretSquareLeft1: ImageVector? = null

val Icons.Sr.CaretSquareLeft1: ImageVector
    get() = _CaretSquareLeft1 ?: UXIcon(name = "CaretSquareLeft1") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19f)
                verticalLineTo(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                verticalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(19f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19f)
                close()
                moveTo(13.4f, 17.73f)
                lineTo(8.25f, 12.64f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.29f)
                lineTo(13.4f, 6.27f)
                arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.57f, 0.64f)
                verticalLineTo(17.09f)
                arcTo(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.4f, 17.73f)
                close()
            }
        }.also { _CaretSquareLeft1 = it}

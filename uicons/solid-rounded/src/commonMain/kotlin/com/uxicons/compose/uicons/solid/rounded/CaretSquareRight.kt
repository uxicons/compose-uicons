package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretSquareRight: ImageVector? = null

val Icons.Sr.CaretSquareRight: ImageVector
    get() = _CaretSquareRight ?: UXIcon(name = "CaretSquareRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 5f)
                verticalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                close()
                moveTo(10.6f, 6.27f)
                lineToRelative(5.15f, 5.09f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.29f)
                lineTo(10.6f, 17.73f)
                arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.57f, -0.64f)
                verticalLineTo(6.91f)
                arcTo(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.6f, 6.27f)
                close()
            }
        }.also { _CaretSquareRight = it}

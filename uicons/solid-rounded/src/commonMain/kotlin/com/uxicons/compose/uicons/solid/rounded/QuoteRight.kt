package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QuoteRight: ImageVector? = null

val Icons.Sr.QuoteRight: ImageVector
    get() = _QuoteRight ?: UXIcon(name = "QuoteRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 4f)
                horizontalLineTo(4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineTo(7.91f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 4f)
                horizontalLineTo(18f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(5.91f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 4f)
                close()
            }
        }.also { _QuoteRight = it}

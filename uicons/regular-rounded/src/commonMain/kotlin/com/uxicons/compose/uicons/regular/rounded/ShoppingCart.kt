package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingCart: ImageVector? = null

val Icons.Rr.ShoppingCart: ImageVector
    get() = _ShoppingCart ?: UXIcon(name = "ShoppingCart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.71f, 4.08f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.41f, 3f)
                horizontalLineTo(4.24f)
                lineTo(4.2f, 2.65f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.22f, 0f)
                horizontalLineTo(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 2f)
                horizontalLineToRelative(0.22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.99f, 0.88f)
                lineToRelative(1.38f, 11.7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.56f, 19f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(8.56f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.82f, -2f)
                horizontalLineToRelative(11.92f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.92f, -4.11f)
                lineToRelative(0.79f, -4.35f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.71f, 4.08f)
                close()
                moveTo(21.4f, 6.18f)
                lineToRelative(-0.79f, 4.35f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.66f, 13f)
                horizontalLineTo(5.42f)
                lineTo(4.48f, 5f)
                horizontalLineTo(20.41f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.4f, 6.18f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 22f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 22f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
        }.also { _ShoppingCart = it}

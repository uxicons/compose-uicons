package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingCartAdd: ImageVector? = null

val Icons.Rr.ShoppingCartAdd: ImageVector
    get() = _ShoppingCartAdd ?: UXIcon(name = "ShoppingCartAdd") {
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
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(3f)
                horizontalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.77f, 9.73f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.16f, 0.81f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.66f, 13f)
                horizontalLineTo(5.42f)
                lineToRelative(-0.94f, -8f)
                horizontalLineTo(13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
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
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.83f, -2f)
                horizontalLineTo(17.66f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.92f, -4.11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.77f, 9.73f)
                close()
            }
        }.also { _ShoppingCartAdd = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingCart: ImageVector? = null

val Icons.Bs.ShoppingCart: ImageVector
    get() = _ShoppingCart ?: UXIcon(name = "ShoppingCart") {
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
                moveTo(5.65f, 5f)
                lineTo(5.39f, 2.94f)
                arcTo(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.09f, 0f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                horizontalLineTo(2.09f)
                arcToRelative(0.33f, 0.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.33f, 0.3f)
                lineToRelative(1.5f, 11.76f)
                arcTo(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.22f, 18f)
                horizontalLineTo(20.4f)
                lineTo(23.97f, 5f)
                close()
                moveTo(18.11f, 15f)
                horizontalLineTo(7.22f)
                arcToRelative(0.33f, 0.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.33f, -0.3f)
                lineTo(6.04f, 8f)
                horizontalLineToRelative(14f)
                close()
            }
        }.also { _ShoppingCart = it}

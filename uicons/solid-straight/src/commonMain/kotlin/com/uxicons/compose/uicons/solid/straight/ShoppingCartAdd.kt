package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingCartAdd: ImageVector? = null

val Icons.Ss.ShoppingCartAdd: ImageVector
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
                moveTo(22.81f, 9.58f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.8f, 3f)
                horizontalLineTo(4.24f)
                lineTo(4.2f, 2.65f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.22f, 0f)
                horizontalLineTo(0f)
                verticalLineTo(2f)
                horizontalLineTo(1.22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.99f, 0.88f)
                lineTo(3.8f, 16.35f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.78f, 19f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(6.78f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.99f, -0.88f)
                lineTo(5.65f, 15f)
                horizontalLineTo(21.84f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 5f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -2f)
                close()
            }
        }.also { _ShoppingCartAdd = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingBagAdd: ImageVector? = null

val Icons.Ss.ShoppingBagAdd: ImageVector
    get() = _ShoppingBagAdd ?: UXIcon(name = "ShoppingBagAdd") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 19f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, -4.47f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 6f)
                horizontalLineTo(0f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(16.68f)
                arcTo(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 19f)
                close()
                moveTo(12f, 2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                horizontalLineTo(8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 18f)
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
        }.also { _ShoppingBagAdd = it}

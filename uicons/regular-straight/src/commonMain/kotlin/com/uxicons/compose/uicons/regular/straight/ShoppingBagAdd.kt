package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingBagAdd: ImageVector? = null

val Icons.Rs.ShoppingBagAdd: ImageVector
    get() = _ShoppingBagAdd ?: UXIcon(name = "ShoppingBagAdd") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 6f)
                horizontalLineTo(0f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineTo(6f)
                close()
                moveTo(8f, 6f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 16f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, -3f)
                close()
            }
        }.also { _ShoppingBagAdd = it}

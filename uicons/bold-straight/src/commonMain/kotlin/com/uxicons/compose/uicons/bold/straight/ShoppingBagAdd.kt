package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingBagAdd: ImageVector? = null

val Icons.Bs.ShoppingBagAdd: ImageVector
    get() = _ShoppingBagAdd ?: UXIcon(name = "ShoppingBagAdd") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 6f)
                horizontalLineTo(0f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(9f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineTo(9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineTo(6f)
                close()
                moveTo(9f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 15f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(2.5f, 0f)
                lineToRelative(0.5f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -0.5f)
                lineToRelative(0f, -2.5f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, -3f)
                close()
            }
        }.also { _ShoppingBagAdd = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingBag: ImageVector? = null

val Icons.Ss.ShoppingBag: ImageVector
    get() = _ShoppingBag ?: UXIcon(name = "ShoppingBag") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 6f)
                horizontalLineTo(0f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(6f)
                close()
                moveTo(12f, 2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                horizontalLineTo(8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
            }
        }.also { _ShoppingBag = it}

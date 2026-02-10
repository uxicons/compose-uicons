package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingBag: ImageVector? = null

val Icons.Bs.ShoppingBag: ImageVector
    get() = _ShoppingBag ?: UXIcon(name = "ShoppingBag") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 6f)
                lineTo(0f, 6f)
                lineTo(0f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(21f, 24f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(24f, 6f)
                close()
                moveTo(12f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                lineTo(9f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 9f)
                lineTo(6f, 9f)
                verticalLineToRelative(2f)
                lineTo(9f, 11f)
                lineTo(9f, 9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                lineTo(18f, 9f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _ShoppingBag = it}

package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingBagAdd: ImageVector? = null

val Icons.Br.ShoppingBagAdd: ImageVector
    get() = _ShoppingBagAdd ?: UXIcon(name = "ShoppingBagAdd") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 18f)
            horizontalLineTo(21f)
            verticalLineTo(16.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineTo(18f)
            horizontalLineTo(16.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineTo(18f)
            verticalLineToRelative(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(21f)
            horizontalLineToRelative(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 6f)
            horizontalLineTo(18f)
            arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 6f)
            horizontalLineTo(3.5f)
            arcTo(3.54f, 3.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.5f)
            verticalLineToRelative(9f)
            arcTo(5.55f, 5.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
            horizontalLineToRelative(6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-6f)
            arcTo(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.5f)
            verticalLineToRelative(-9f)
            arcTo(0.47f, 0.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 9f)
            horizontalLineTo(6f)
            verticalLineToRelative(1.5f)
            arcTo(1.54f, 1.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 12f)
            arcTo(1.54f, 1.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 10.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(9f)
            horizontalLineToRelative(2.5f)
            arcToRelative(0.47f, 0.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
            verticalLineToRelative(2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-2f)
            arcTo(3.54f, 3.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 6f)
            close()
            moveTo(9f, 6f)
            horizontalLineTo(9f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
            horizontalLineTo(9f)
            close()
        }
    }.also { _ShoppingBagAdd = it }

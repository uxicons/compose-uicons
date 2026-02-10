package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingCart: ImageVector? = null

val Icons.Br.ShoppingCart: ImageVector
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
            moveTo(22.98f, 6.02f)
            arcTo(3.67f, 3.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.36f, 5f)
            horizontalLineTo(5.65f)
            lineTo(5.39f, 2.94f)
            arcTo(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.09f, 0f)
            horizontalLineTo(1.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
            horizontalLineTo(0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 3f)
            horizontalLineToRelative(0.59f)
            arcToRelative(0.33f, 0.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.33f, 0.3f)
            lineToRelative(1.5f, 11.76f)
            arcTo(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.22f, 18f)
            horizontalLineTo(17.34f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.3f, -4.04f)
            lineToRelative(1.25f, -4.53f)
            arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.98f, 6.02f)
            close()
            moveTo(19.75f, 13.16f)
            arcTo(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.34f, 15f)
            horizontalLineTo(7.22f)
            arcToRelative(0.33f, 0.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.33f, -0.3f)
            lineTo(6.04f, 8f)
            horizontalLineTo(20.51f)
            arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 8.63f)
            close()
        }
    }.also { _ShoppingCart = it }

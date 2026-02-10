package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingCartCheck: ImageVector? = null

val Icons.Br.ShoppingCartCheck: ImageVector
    get() = _ShoppingCartCheck ?: UXIcon(name = "ShoppingCartCheck") {
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
            moveTo(19.75f, 13.16f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.34f, 15f)
            horizontalLineTo(7.22f)
            arcToRelative(0.33f, 0.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.33f, -0.3f)
            lineTo(6.04f, 8f)
            horizontalLineTo(9.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 6.5f)
            horizontalLineToRelative(0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 5f)
            horizontalLineTo(5.65f)
            lineTo(5.39f, 2.94f)
            arcTo(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.09f, 0f)
            horizontalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(0.59f)
            arcToRelative(0.33f, 0.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.33f, 0.3f)
            lineToRelative(1.5f, 11.76f)
            arcTo(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.22f, 18f)
            horizontalLineTo(17.34f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.3f, -4.04f)
            lineToRelative(0.02f, -0.06f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.21f, 12f)
            horizontalLineToRelative(0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.45f, 1.1f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.41f, 2.49f)
            lineTo(17.12f, 6.78f)
            lineTo(16.27f, 5.9f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.16f, 2.08f)
            lineToRelative(1.26f, 1.31f)
            arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.7f, 0.75f)
            horizontalLineToRelative(0.04f)
            arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.69f, -0.7f)
            lineToRelative(4.73f, -4.74f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.12f, -2.12f)
            close()
        }
    }.also { _ShoppingCartCheck = it }

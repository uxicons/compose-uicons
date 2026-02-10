package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingCartCheck: ImageVector? = null

val Icons.Bs.ShoppingCartCheck: ImageVector
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
                moveTo(18.11f, 15f)
                horizontalLineTo(7.22f)
                arcToRelative(0.33f, 0.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.33f, -0.3f)
                lineTo(6.04f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(5.65f)
                lineTo(5.39f, 2.94f)
                arcTo(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.09f, 0f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                horizontalLineTo(2.09f)
                arcToRelative(0.33f, 0.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.33f, 0.3f)
                lineToRelative(1.5f, 11.76f)
                arcTo(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.22f, 18f)
                horizontalLineTo(20.4f)
                lineToRelative(1.65f, -6f)
                horizontalLineTo(18.94f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.07f, 10.04f)
                horizontalLineToRelative(0.04f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.69f, -0.7f)
                lineToRelative(5.26f, -5.26f)
                lineTo(21.94f, 1.96f)
                lineToRelative(-4.82f, 4.82f)
                lineToRelative(-1.89f, -1.97f)
                lineToRelative(-2.16f, 2.08f)
                lineToRelative(2.3f, 2.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.07f, 10.04f)
                close()
            }
        }.also { _ShoppingCartCheck = it}

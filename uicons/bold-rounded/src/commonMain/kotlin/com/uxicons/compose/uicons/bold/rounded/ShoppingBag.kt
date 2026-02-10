package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingBag: ImageVector? = null

val Icons.Br.ShoppingBag: ImageVector
    get() = _ShoppingBag ?: UXIcon(name = "ShoppingBag") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 6.2f)
            horizontalLineTo(18f)
            verticalLineTo(6f)
            arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 6f)
            verticalLineToRelative(0.2f)
            horizontalLineTo(3.5f)
            arcTo(3.54f, 3.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.7f)
            verticalLineToRelative(8.8f)
            arcTo(5.55f, 5.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
            horizontalLineToRelative(13f)
            arcTo(5.55f, 5.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.5f)
            verticalLineTo(9.7f)
            arcTo(3.54f, 3.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 6.2f)
            close()
            moveTo(9f, 6f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
            verticalLineToRelative(0.2f)
            horizontalLineTo(9f)
            close()
            moveTo(21f, 18.5f)
            arcTo(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 21f)
            horizontalLineTo(5.5f)
            arcTo(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.5f)
            verticalLineTo(9.7f)
            arcToRelative(0.47f, 0.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
            horizontalLineTo(6f)
            verticalLineToRelative(1.3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(9.2f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(1.3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(9.2f)
            horizontalLineToRelative(2.5f)
            arcToRelative(0.47f, 0.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
            close()
        }
    }.also { _ShoppingBag = it }

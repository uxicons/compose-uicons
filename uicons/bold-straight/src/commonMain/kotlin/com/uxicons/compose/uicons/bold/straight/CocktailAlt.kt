package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CocktailAlt: ImageVector? = null

val Icons.Bs.CocktailAlt: ImageVector
    get() = _CocktailAlt ?: UXIcon(name = "CocktailAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 0f)
                verticalLineTo(1.5f)
                arcTo(6.03f, 6.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.95f, 5.94f)
                lineToRelative(8.55f, 8.2f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                verticalLineToRelative(3f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(13.5f)
                verticalLineTo(14.14f)
                lineToRelative(8.53f, -8.18f)
                arcTo(6.03f, 6.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 1.5f)
                verticalLineTo(0f)
                close()
                moveTo(19.98f, 3.76f)
                lineTo(12f, 11.42f)
                lineTo(8.43f, 8f)
                horizontalLineToRelative(4.24f)
                lineTo(15.8f, 5f)
                horizontalLineTo(5.31f)
                lineTo(3.99f, 3.73f)
                arcTo(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.4f, 3f)
                horizontalLineTo(20.6f)
                arcTo(3.21f, 3.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.98f, 3.76f)
                close()
            }
        }.also { _CocktailAlt = it}

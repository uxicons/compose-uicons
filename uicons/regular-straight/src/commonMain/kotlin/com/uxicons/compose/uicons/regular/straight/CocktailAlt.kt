package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CocktailAlt: ImageVector? = null

val Icons.Rs.CocktailAlt: ImageVector
    get() = _CocktailAlt ?: UXIcon(name = "CocktailAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 0f)
                verticalLineTo(1f)
                arcTo(5.53f, 5.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.81f, 5.08f)
                lineTo(11f, 13.44f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(13.44f)
                lineToRelative(9.19f, -8.36f)
                arcTo(5.53f, 5.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 1f)
                verticalLineTo(0f)
                close()
                moveTo(20.85f, 3.6f)
                lineTo(12f, 11.65f)
                lineTo(5.79f, 6f)
                horizontalLineToRelative(8.97f)
                lineToRelative(2f, -2f)
                horizontalLineTo(3.59f)
                lineToRelative(-0.43f, -0.4f)
                arcTo(3.53f, 3.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.15f, 2f)
                horizontalLineTo(21.85f)
                arcTo(3.53f, 3.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.85f, 3.6f)
                close()
            }
        }.also { _CocktailAlt = it}

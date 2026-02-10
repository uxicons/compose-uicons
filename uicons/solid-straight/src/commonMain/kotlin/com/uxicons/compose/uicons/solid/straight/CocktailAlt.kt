package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CocktailAlt: ImageVector? = null

val Icons.Ss.CocktailAlt: ImageVector
    get() = _CocktailAlt ?: UXIcon(name = "CocktailAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 0f)
                verticalLineTo(1f)
                arcTo(5.52f, 5.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.9f, 4f)
                horizontalLineTo(16.76f)
                lineToRelative(-2f, 2f)
                horizontalLineTo(2.81f)
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
            }
        }.also { _CocktailAlt = it}

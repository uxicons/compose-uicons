package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CocktailAlt: ImageVector? = null

val Icons.Sr.CocktailAlt: ImageVector
    get() = _CocktailAlt ?: UXIcon(name = "CocktailAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.87f, 12.89f)
                lineToRelative(8.17f, -7.55f)
                curveToRelative(2.08f, -1.78f, 0.48f, -5.45f, -2.2f, -5.34f)
                horizontalLineTo(3.16f)
                arcTo(3.17f, 3.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.13f, 4f)
                horizontalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(1.68f)
                lineToRelative(7.46f, 6.89f)
                arcTo(4.23f, 4.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 13.87f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(13f)
                verticalLineTo(13.87f)
                arcTo(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.87f, 12.89f)
                close()
            }
        }.also { _CocktailAlt = it}

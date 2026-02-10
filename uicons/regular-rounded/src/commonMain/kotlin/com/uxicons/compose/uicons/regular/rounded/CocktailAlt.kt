package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CocktailAlt: ImageVector? = null

val Icons.Rr.CocktailAlt: ImageVector
    get() = _CocktailAlt ?: UXIcon(name = "CocktailAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.87f, 12.89f)
                lineTo(23.04f, 5.34f)
                curveToRelative(2.08f, -1.78f, 0.48f, -5.45f, -2.2f, -5.34f)
                horizontalLineTo(3.16f)
                curveTo(0.47f, -0.1f, -1.13f, 3.56f, 0.99f, 5.37f)
                lineToRelative(8.15f, 7.53f)
                arcTo(4.24f, 4.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 13.87f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(13f)
                verticalLineTo(13.87f)
                arcTo(4.26f, 4.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.87f, 12.89f)
                close()
                moveTo(4.62f, 6f)
                horizontalLineTo(16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(2.46f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.7f, -2f)
                horizontalLineTo(20.84f)
                arcToRelative(1.15f, 1.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.08f, 0.75f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.65f, 3.9f)
                lineToRelative(-8.13f, 7.52f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0.59f)
                arcToRelative(0.05f, 0.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.02f, 0f)
                arcToRelative(2.23f, 2.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, -0.58f)
                close()
            }
        }.also { _CocktailAlt = it}

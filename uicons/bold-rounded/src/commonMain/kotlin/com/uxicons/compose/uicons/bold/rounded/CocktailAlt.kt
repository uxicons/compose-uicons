package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CocktailAlt: ImageVector? = null

val Icons.Br.CocktailAlt: ImageVector
    get() = _CocktailAlt ?: UXIcon(name = "CocktailAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.11f, 13.25f)
            lineToRelative(7.8f, -7.21f)
            arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.84f, -3.76f)
            arcTo(3.55f, 3.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.44f, 0f)
            horizontalLineTo(3.56f)
            arcTo(3.55f, 3.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.24f, 2.28f)
            arcToRelative(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.87f, 3.79f)
            lineTo(8.9f, 13.26f)
            arcToRelative(4.6f, 4.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, 0.94f)
            verticalLineTo(21f)
            horizontalLineToRelative(-3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(9f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-3f)
            verticalLineTo(14.2f)
            arcTo(4.62f, 4.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.11f, 13.25f)
            close()
            moveTo(7.63f, 8f)
            horizontalLineTo(13.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            lineToRelative(-9.1f, 0.01f)
            lineTo(3.13f, 3.84f)
            arcToRelative(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.09f, -0.46f)
            arcTo(0.56f, 0.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.56f, 3f)
            horizontalLineTo(20.44f)
            arcToRelative(0.56f, 0.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.52f, 0.37f)
            arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.12f, 0.49f)
            lineToRelative(-7.76f, 7.17f)
            arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.15f, 0.01f)
            close()
        }
    }.also { _CocktailAlt = it }

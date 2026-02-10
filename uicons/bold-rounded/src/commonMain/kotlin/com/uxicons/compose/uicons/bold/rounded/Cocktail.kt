package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cocktail: ImageVector? = null

val Icons.Br.Cocktail: ImageVector
    get() = _Cocktail ?: UXIcon(name = "Cocktail") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.46f, 2.27f)
            arcTo(4.37f, 4.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.63f, 0f)
            horizontalLineTo(4.37f)
            arcTo(4.37f, 4.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.54f, 2.27f)
            arcTo(4.27f, 4.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.68f, 6.68f)
            arcTo(14.04f, 14.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 12.9f)
            verticalLineTo(21f)
            horizontalLineToRelative(-3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(9f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-3f)
            verticalLineTo(12.9f)
            arcToRelative(14.04f, 14.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.82f, -6.22f)
            arcTo(4.27f, 4.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.46f, 2.27f)
            close()
            moveTo(12f, 10f)
            arcTo(11.07f, 11.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.18f, 5f)
            horizontalLineTo(20.82f)
            arcTo(11.07f, 11.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
            close()
        }
    }.also { _Cocktail = it }

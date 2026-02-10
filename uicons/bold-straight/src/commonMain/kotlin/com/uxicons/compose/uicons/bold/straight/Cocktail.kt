package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cocktail: ImageVector? = null

val Icons.Bs.Cocktail: ImageVector
    get() = _Cocktail ?: UXIcon(name = "Cocktail") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.41f, 1.5f)
                arcTo(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.59f, 0f)
                horizontalLineTo(3.41f)
                arcTo(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.24f, 4.67f)
                arcTo(12.58f, 12.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 12.45f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                verticalLineToRelative(3f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(13.5f)
                verticalLineTo(12.45f)
                arcTo(12.58f, 12.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.76f, 4.67f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.41f, 1.5f)
                close()
                moveTo(12f, 9.54f)
                arcTo(9.56f, 9.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.22f, 4f)
                horizontalLineTo(20.78f)
                arcTo(9.56f, 9.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9.54f)
                close()
            }
        }.also { _Cocktail = it}

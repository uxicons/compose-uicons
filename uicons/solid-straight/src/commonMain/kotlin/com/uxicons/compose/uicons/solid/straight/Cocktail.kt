package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cocktail: ImageVector? = null

val Icons.Ss.Cocktail: ImageVector
    get() = _Cocktail ?: UXIcon(name = "Cocktail") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.98f, 3f)
                horizontalLineTo(0.02f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -1.68f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                horizontalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.49f, 1.32f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.98f, 3f)
                close()
                moveTo(11f, 11.96f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(11.96f)
                arcTo(12.56f, 12.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.39f, 5f)
                horizontalLineTo(0.61f)
                arcTo(12.56f, 12.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 11.96f)
                close()
            }
        }.also { _Cocktail = it}

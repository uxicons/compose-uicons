package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cocktail: ImageVector? = null

val Icons.Rs.Cocktail: ImageVector
    get() = _Cocktail ?: UXIcon(name = "Cocktail") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.49f, 1.32f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.21f, 4.11f)
                arcTo(12.6f, 12.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 11.96f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(11.96f)
                arcTo(12.6f, 12.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.79f, 4.11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.49f, 1.32f)
                close()
                moveTo(2.17f, 2.44f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.93f, 1.37f)
                curveToRelative(-0.08f, 0.21f, -0.18f, 0.42f, -0.28f, 0.63f)
                horizontalLineTo(2.35f)
                curveToRelative(-0.1f, -0.21f, -0.2f, -0.42f, -0.28f, -0.63f)
                arcTo(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.17f, 2.44f)
                close()
                moveTo(12f, 10f)
                arcTo(10.5f, 10.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.62f, 6f)
                horizontalLineTo(20.38f)
                arcTo(10.5f, 10.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                close()
            }
        }.also { _Cocktail = it}

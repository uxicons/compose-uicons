package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cocktail: ImageVector? = null

val Icons.Sr.Cocktail: ImageVector
    get() = _Cocktail ?: UXIcon(name = "Cocktail") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.01f, 4f)
                lineTo(-0.01f, 4f)
                arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                lineTo(20f, 0f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.01f, 4f)
                close()
                moveTo(23.45f, 6f)
                lineTo(0.53f, 6f)
                arcTo(13.81f, 13.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 11.96f)
                lineTo(11f, 22f)
                lineTo(7f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(17f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(13f, 22f)
                lineTo(13f, 11.96f)
                arcTo(13.8f, 13.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.45f, 6f)
                close()
            }
        }.also { _Cocktail = it}

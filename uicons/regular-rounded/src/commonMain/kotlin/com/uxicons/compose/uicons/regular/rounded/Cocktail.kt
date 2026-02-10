package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cocktail: ImageVector? = null

val Icons.Rr.Cocktail: ImageVector
    get() = _Cocktail ?: UXIcon(name = "Cocktail") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.52f, 2.09f)
                arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 0f)
                lineTo(4f, 0f)
                arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.48f, 2.09f)
                arcToRelative(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.13f, 4.04f)
                arcTo(13.55f, 13.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 11.96f)
                lineTo(11f, 22f)
                lineTo(7f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(17f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(13f, 22f)
                lineTo(13f, 11.96f)
                arcTo(13.55f, 13.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.39f, 6.13f)
                arcTo(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.52f, 2.09f)
                close()
                moveTo(4f, 2f)
                lineTo(20f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                lineTo(2f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 2f)
                close()
                moveTo(12f, 10f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.01f, 6f)
                lineTo(20.99f, 6f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                close()
            }
        }.also { _Cocktail = it}

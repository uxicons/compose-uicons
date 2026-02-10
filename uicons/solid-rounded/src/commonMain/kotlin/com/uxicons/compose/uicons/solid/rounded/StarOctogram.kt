package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarOctogram: ImageVector? = null

val Icons.Sr.StarOctogram: ImageVector
    get() = _StarOctogram ?: UXIcon(name = "StarOctogram") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.77f, 8.95f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.7f, -1.7f)
                arcToRelative(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.32f, -4.32f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.7f, -0.7f)
                arcToRelative(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.1f, 0f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.7f, 0.7f)
                arcTo(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.93f, 7.25f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.7f, 1.7f)
                arcToRelative(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.1f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.7f, 1.7f)
                arcTo(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.25f, 21.07f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.7f, 0.7f)
                arcToRelative(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.1f, 0f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.7f, -0.7f)
                arcToRelative(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.32f, -4.32f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.7f, -1.7f)
                arcToRelative(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6.1f)
                close()
            }
        }.also { _StarOctogram = it}

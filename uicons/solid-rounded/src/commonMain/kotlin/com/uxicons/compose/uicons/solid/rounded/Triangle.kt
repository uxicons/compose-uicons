package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Triangle: ImageVector? = null

val Icons.Sr.Triangle: ImageVector
    get() = _Triangle ?: UXIcon(name = "Triangle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.95f, 23f)
                horizontalLineTo(4.05f)
                arcTo(4.03f, 4.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.6f, 21.09f)
                arcToRelative(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.18f, -3.86f)
                lineTo(8.38f, 3.21f)
                arcToRelative(4.07f, 4.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.25f, 0.03f)
                lineToRelative(7.92f, 13.94f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.16f, 3.91f)
                arcTo(4.03f, 4.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.95f, 23f)
                close()
            }
        }.also { _Triangle = it}

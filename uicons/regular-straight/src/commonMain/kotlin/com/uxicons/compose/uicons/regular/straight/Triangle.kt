package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Triangle: ImageVector? = null

val Icons.Rs.Triangle: ImageVector
    get() = _Triangle ?: UXIcon(name = "Triangle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21f)
                horizontalLineTo(0f)
                lineTo(10.26f, 3.22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.47f, 0f)
                close()
                moveTo(3.47f, 19f)
                horizontalLineTo(20.53f)
                lineTo(12f, 4.23f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _Triangle = it}

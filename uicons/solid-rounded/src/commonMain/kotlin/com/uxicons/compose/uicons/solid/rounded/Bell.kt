package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bell: ImageVector? = null

val Icons.Sr.Bell: ImageVector
    get() = _Bell ?: UXIcon(name = "Bell") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.42f, 21f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.15f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.39f, 12.55f)
                lineTo(20.66f, 6.83f)
                arcTo(9.32f, 9.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.58f, 7.28f)
                lineTo(1.23f, 12.82f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.09f, 19f)
                horizontalLineTo(17.61f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.79f, -6.45f)
                close()
            }
        }.also { _Bell = it}

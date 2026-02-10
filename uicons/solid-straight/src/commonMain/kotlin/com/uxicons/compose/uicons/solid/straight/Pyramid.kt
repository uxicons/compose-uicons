package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pyramid: ImageVector? = null

val Icons.Ss.Pyramid: ImageVector
    get() = _Pyramid ?: UXIcon(name = "Pyramid") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.1f, 1.24f)
                lineTo(0f, 24f)
                horizontalLineTo(24f)
                lineTo(13.9f, 1.24f)
                arcTo(2.09f, 2.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.1f, 1.24f)
                close()
            }
        }.also { _Pyramid = it}

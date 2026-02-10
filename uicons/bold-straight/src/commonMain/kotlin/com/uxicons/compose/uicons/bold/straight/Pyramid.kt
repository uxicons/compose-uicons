package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pyramid: ImageVector? = null

val Icons.Bs.Pyramid: ImageVector
    get() = _Pyramid ?: UXIcon(name = "Pyramid") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4.35f)
                lineTo(19.39f, 21f)
                horizontalLineTo(4.61f)
                lineTo(12f, 4.35f)
                moveTo(12f, 0.01f)
                arcToRelative(2.06f, 2.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.9f, 1.23f)
                lineTo(0f, 24f)
                horizontalLineTo(24f)
                lineTo(13.9f, 1.24f)
                arcTo(2.06f, 2.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0.01f)
                close()
            }
        }.also { _Pyramid = it}

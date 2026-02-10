package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pyramid: ImageVector? = null

val Icons.Sr.Pyramid: ImageVector
    get() = _Pyramid ?: UXIcon(name = "Pyramid") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.04f, 24f)
                horizontalLineTo(3.96f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.42f, 18.27f)
                lineTo(8.46f, 2.19f)
                arcTo(3.93f, 3.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.74f, 0.01f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.81f, 2.18f)
                lineToRelative(8.04f, 16.08f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.04f, 24f)
                close()
            }
        }.also { _Pyramid = it}

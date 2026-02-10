package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pyramid: ImageVector? = null

val Icons.Rs.Pyramid: ImageVector
    get() = _Pyramid ?: UXIcon(name = "Pyramid") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.01f)
                curveToRelative(0.06f, 0f, 0.07f, 0.02f, 0.08f, 0.04f)
                lineTo(20.93f, 22f)
                horizontalLineTo(3.08f)
                lineTo(11.92f, 2.06f)
                curveToRelative(0.02f, -0.04f, 0.02f, -0.05f, 0.08f, -0.05f)
                moveToRelative(0f, -2f)
                arcToRelative(2.06f, 2.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.9f, 1.23f)
                lineTo(0f, 24f)
                horizontalLineTo(24f)
                lineTo(13.9f, 1.24f)
                arcTo(2.06f, 2.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0.01f)
                close()
            }
        }.also { _Pyramid = it}

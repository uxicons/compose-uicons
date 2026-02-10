package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pyramid: ImageVector? = null

val Icons.Rr.Pyramid: ImageVector
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
                moveTo(2f, 20.04f)
                arcTo(1.97f, 1.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.96f, 22f)
                horizontalLineTo(20.04f)
                arcTo(1.97f, 1.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 20.04f)
                arcToRelative(1.95f, 1.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.21f, -0.88f)
                lineTo(13.75f, 3.08f)
                arcToRelative(1.96f, 1.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.51f, 0f)
                lineTo(2.21f, 19.16f)
                arcTo(1.95f, 1.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 20.04f)
                close()
            }
        }.also { _Pyramid = it}

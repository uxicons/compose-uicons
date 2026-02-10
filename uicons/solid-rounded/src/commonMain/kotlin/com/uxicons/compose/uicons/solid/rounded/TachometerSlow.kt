package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerSlow: ImageVector? = null

val Icons.Sr.TachometerSlow: ImageVector
    get() = _TachometerSlow ?: UXIcon(name = "TachometerSlow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.05f, 4.08f)
                curveTo(8.4f, -5.63f, -6.66f, 9.52f, 3.19f, 21.11f)
                arcToRelative(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.96f, -0.47f)
                lineToRelative(0.61f, -1.1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.87f, -0.51f)
                horizontalLineToRelative(6.82f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.87f, 0.51f)
                lineToRelative(0.63f, 1.13f)
                arcToRelative(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.9f, 0.49f)
                arcTo(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.05f, 4.08f)
                close()
                moveTo(12f, 15f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.93f, -2.52f)
                lineTo(6.29f, 8.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.71f, 7.29f)
                lineToRelative(3.77f, 3.77f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 15f)
                close()
            }
        }.also { _TachometerSlow = it}

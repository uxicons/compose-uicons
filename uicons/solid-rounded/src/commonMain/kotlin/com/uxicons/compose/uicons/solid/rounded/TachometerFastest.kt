package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerFastest: ImageVector? = null

val Icons.Sr.TachometerFastest: ImageVector
    get() = _TachometerFastest ?: UXIcon(name = "TachometerFastest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.99f, 4.05f)
                curveTo(8.35f, -5.66f, -6.71f, 9.5f, 3.14f, 21.08f)
                arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.1f, 20.61f)
                lineToRelative(0.61f, -1.1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.59f, 19f)
                lineTo(15.41f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.87f, 0.52f)
                lineToRelative(0.63f, 1.13f)
                arcToRelative(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.9f, 0.49f)
                arcTo(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.99f, 4.05f)
                close()
                moveTo(19.37f, 16.23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, 0.51f)
                lineToRelative(-4.87f, -2.14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.8f, -1.83f)
                lineToRelative(4.87f, 2.14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.37f, 16.23f)
                close()
            }
        }.also { _TachometerFastest = it}

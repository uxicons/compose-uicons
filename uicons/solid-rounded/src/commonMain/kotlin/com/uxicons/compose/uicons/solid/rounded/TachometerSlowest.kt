package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerSlowest: ImageVector? = null

val Icons.Sr.TachometerSlowest: ImageVector
    get() = _TachometerSlowest ?: UXIcon(name = "TachometerSlowest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 13f)
                arcToRelative(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.19f, 8.13f)
                arcToRelative(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.9f, -0.49f)
                lineToRelative(0.63f, -1.13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.59f, 19f)
                horizontalLineToRelative(6.82f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.87f, 0.51f)
                lineToRelative(0.61f, 1.1f)
                arcToRelative(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.96f, 0.47f)
                curveTo(30.72f, 9.49f, 15.63f, -5.66f, 4f, 4.05f)
                arcTo(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 13f)
                close()
                moveTo(5.14f, 14.92f)
                lineTo(10.01f, 12.78f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.8f, 1.83f)
                lineTo(5.95f, 16.75f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.81f, -1.83f)
                close()
            }
        }.also { _TachometerSlowest = it}

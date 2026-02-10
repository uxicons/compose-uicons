package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerSlowest: ImageVector? = null

val Icons.Ss.TachometerSlowest: ImageVector
    get() = _TachometerSlowest ?: UXIcon(name = "TachometerSlowest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 13f)
                arcToRelative(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.11f, 9.82f)
                lineToRelative(0.64f, 0.45f)
                lineTo(8f, 20f)
                horizontalLineToRelative(8f)
                lineToRelative(2.25f, 3.27f)
                lineToRelative(0.64f, -0.45f)
                curveTo(28.42f, 16.17f, 23.62f, 0.98f, 12f, 1f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 13f)
                close()
                moveTo(12.8f, 14.83f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.98f, -0.22f)
                lineTo(4.16f, 17.53f)
                lineToRelative(-0.8f, -1.83f)
                lineToRelative(6.66f, -2.92f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12.8f, 14.83f)
                close()
            }
        }.also { _TachometerSlowest = it}

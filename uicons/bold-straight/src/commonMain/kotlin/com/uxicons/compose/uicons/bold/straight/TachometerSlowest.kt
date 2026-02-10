package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerSlowest: ImageVector? = null

val Icons.Bs.TachometerSlowest: ImageVector
    get() = _TachometerSlowest ?: UXIcon(name = "TachometerSlowest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.62f, 1.9f)
                lineToRelative(-4.6f, 1.98f)
                lineTo(5.59f, 14.12f)
                lineToRelative(4.6f, -1.98f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13f)
                close()
                moveTo(12f, 1f)
                arcTo(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.11f, 22.82f)
                lineToRelative(0.94f, 0.66f)
                lineToRelative(3.41f, -2.82f)
                lineToRelative(-1.91f, -2.31f)
                lineTo(5.96f, 19.66f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12.09f, -0.01f)
                lineToRelative(-1.55f, -1.3f)
                lineToRelative(-1.93f, 2.3f)
                lineToRelative(3.38f, 2.83f)
                lineToRelative(0.94f, -0.66f)
                arcTo(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1f)
                close()
            }
        }.also { _TachometerSlowest = it}

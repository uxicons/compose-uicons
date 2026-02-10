package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltSlowest: ImageVector? = null

val Icons.Br.TachometerAltSlowest: ImageVector
    get() = _TachometerAltSlowest ?: UXIcon(name = "TachometerAltSlowest") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.9f, 11.4f)
            arcTo(11.98f, 11.98f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3.76f, 21.63f)
            arcTo(5.18f, 5.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.34f, 23f)
            horizontalLineToRelative(9.32f)
            arcToRelative(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.73f, -1.51f)
            arcTo(11.86f, 11.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.9f, 11.4f)
            close()
            moveTo(18.29f, 19.34f)
            arcTo(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.66f, 20f)
            lineTo(7.34f, 20f)
            arcToRelative(2.23f, 2.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.52f, -0.56f)
            arcToRelative(8.97f, 8.97f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.11f, -7.67f)
            arcTo(8.89f, 8.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.29f, 19.34f)
            close()
            moveTo(14f, 13f)
            arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.43f, 1.95f)
            lineTo(8.23f, 16.81f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.46f, -2.62f)
            lineToRelative(3.34f, -1.86f)
            arcTo(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13f)
            close()
            moveTo(19f, 13f)
            arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 4.46f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.31f, -1.91f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6.65f, -4.36f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.76f, 9.82f)
            curveTo(9.08f, 3.32f, 18.98f, 5.71f, 19f, 13f)
            close()
        }
    }.also { _TachometerAltSlowest = it }

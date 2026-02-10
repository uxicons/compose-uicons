package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltSlowest: ImageVector? = null

val Icons.Rs.TachometerAltSlowest: ImageVector
    get() = _TachometerAltSlowest ?: UXIcon(name = "TachometerAltSlowest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(0.37f, 0.98f, -4.41f, 16.17f, 5.11f, 22.82f)
                lineTo(5.37f, 23f)
                lineTo(18.63f, 23f)
                lineToRelative(0.26f, -0.18f)
                curveTo(28.42f, 16.17f, 23.62f, 0.98f, 12f, 1f)
                close()
                moveTo(17.99f, 21f)
                lineTo(6.01f, 21f)
                curveTo(-1.63f, 15.32f, 2.47f, 2.98f, 12f, 3f)
                curveTo(21.53f, 2.98f, 25.63f, 15.32f, 17.99f, 21f)
                close()
                moveTo(14f, 13f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.18f, 1.61f)
                lineToRelative(-5.54f, 2.43f)
                lineToRelative(-0.8f, -1.83f)
                lineToRelative(5.54f, -2.43f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13f)
                close()
                moveTo(20f, 13f)
                arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.41f, 5.71f)
                lineToRelative(-1.4f, -1.43f)
                curveTo(20.04f, 13.68f, 17.27f, 6.9f, 12f, 7f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.96f, 5.34f)
                lineToRelative(-2.03f, 0.89f)
                curveTo(4.1f, 2.48f, 19.58f, 2.26f, 20f, 13f)
                close()
            }
        }.also { _TachometerAltSlowest = it}

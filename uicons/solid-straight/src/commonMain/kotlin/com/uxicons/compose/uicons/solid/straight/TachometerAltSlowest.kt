package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltSlowest: ImageVector? = null

val Icons.Ss.TachometerAltSlowest: ImageVector
    get() = _TachometerAltSlowest ?: UXIcon(name = "TachometerAltSlowest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 13f)
                arcToRelative(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.11f, 9.82f)
                lineTo(5.37f, 23f)
                lineTo(18.63f, 23f)
                lineToRelative(0.26f, -0.18f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.44f, 9.37f)
                curveTo(19.03f, -3.57f, 0.25f, -0.66f, 0f, 13f)
                close()
                moveTo(16.63f, 18.25f)
                curveToRelative(0.11f, -0.1f, 0.21f, -0.19f, 0.32f, -0.3f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -9.9f)
                curveToRelative(-4.12f, -4.29f, -11.78f, -1.33f, -11.93f, 4.6f)
                lineToRelative(-1.99f, 0.83f)
                arcToRelative(8.99f, 8.99f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.34f, 5.88f)
                curveToRelative(-0.13f, 0.14f, -0.27f, 0.27f, -0.41f, 0.39f)
                close()
                moveTo(10.78f, 14.58f)
                lineTo(4.55f, 17.18f)
                lineToRelative(-0.77f, -1.85f)
                lineToRelative(6.25f, -2.61f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.76f, 1.85f)
                close()
            }
        }.also { _TachometerAltSlowest = it}

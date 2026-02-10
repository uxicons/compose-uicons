package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltSlow: ImageVector? = null

val Icons.Ss.TachometerAltSlow: ImageVector
    get() = _TachometerAltSlow ?: UXIcon(name = "TachometerAltSlow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 13f)
                arcToRelative(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.11f, 9.82f)
                lineTo(5.37f, 23f)
                lineTo(18.63f, 23f)
                lineToRelative(0.26f, -0.18f)
                curveTo(28.42f, 16.17f, 23.62f, 0.98f, 12f, 1f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 13f)
                close()
                moveTo(16.62f, 18.25f)
                curveToRelative(5.73f, -5.08f, 0.24f, -14.38f, -6.96f, -11.84f)
                lineTo(8.13f, 4.89f)
                curveTo(17.55f, 0.54f, 25.64f, 12.77f, 17.94f, 19.75f)
                close()
                moveTo(10f, 13f)
                arcToRelative(2.02f, 2.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.07f, -0.51f)
                lineTo(5.29f, 7.71f)
                lineTo(6.71f, 6.29f)
                lineToRelative(4.78f, 4.78f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10f, 13f)
                close()
                moveTo(3f, 13f)
                arcToRelative(8.93f, 8.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.89f, -3.87f)
                lineToRelative(1.53f, 1.53f)
                arcToRelative(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.97f, 7.59f)
                lineToRelative(-1.32f, 1.5f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 13f)
                close()
            }
        }.also { _TachometerAltSlow = it}

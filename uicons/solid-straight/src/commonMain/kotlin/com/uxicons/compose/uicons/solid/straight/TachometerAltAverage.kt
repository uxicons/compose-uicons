package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltAverage: ImageVector? = null

val Icons.Ss.TachometerAltAverage: ImageVector
    get() = _TachometerAltAverage ?: UXIcon(name = "TachometerAltAverage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(0.37f, 0.98f, -4.41f, 16.17f, 5.11f, 22.82f)
                lineTo(5.37f, 23f)
                lineTo(18.63f, 23f)
                lineToRelative(0.26f, -0.18f)
                curveTo(28.42f, 16.17f, 23.62f, 0.98f, 12f, 1f)
                close()
                moveTo(12f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -3.72f)
                lineTo(11f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7.28f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                close()
                moveTo(17.94f, 19.75f)
                lineTo(16.62f, 18.25f)
                curveToRelative(3.8f, -3.11f, 2.78f, -9.68f, -1.62f, -11.56f)
                lineTo(15f, 4.53f)
                curveTo(21.32f, 6.61f, 23.13f, 15.36f, 17.94f, 19.75f)
                close()
                moveTo(3f, 13f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 4.53f)
                verticalLineToRelative(2.16f)
                curveTo(4.61f, 8.57f, 3.59f, 15.14f, 7.38f, 18.25f)
                lineToRelative(-1.32f, 1.5f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 13f)
                close()
            }
        }.also { _TachometerAltAverage = it}

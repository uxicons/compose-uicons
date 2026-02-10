package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagnifyingGlassWave: ImageVector? = null

val Icons.Ss.MagnifyingGlassWave: ImageVector
    get() = _MagnifyingGlassWave ?: UXIcon(name = "MagnifyingGlassWave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.74f, 16.32f)
                curveToRelative(1.41f, -1.73f, 2.26f, -3.93f, 2.26f, -6.32f)
                curveTo(20f, 4.49f, 15.51f, 0f, 10f, 0f)
                reflectiveCurveTo(0f, 4.49f, 0f, 10f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.4f, 0f, 4.6f, -0.85f, 6.32f, -2.26f)
                lineToRelative(6.19f, 6.19f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-6.19f, -6.19f)
                close()
                moveTo(8f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                close()
                moveTo(11f, 15f)
                horizontalLineToRelative(-2f)
                lineTo(9f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                close()
                moveTo(14f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _MagnifyingGlassWave = it}

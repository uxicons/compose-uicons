package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GunSquirt: ImageVector? = null

val Icons.Br.GunSquirt: ImageVector
    get() = _GunSquirt ?: UXIcon(name = "GunSquirt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 6f)
            horizontalLineToRelative(-0.71f)
            curveToRelative(-0.66f, -2.31f, -2.78f, -4f, -5.29f, -4f)
            lineTo(6f, 2f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1.1f)
            curveTo(1.22f, 3.51f, 0f, 5.37f, 0f, 7.5f)
            curveToRelative(0f, 1.89f, 0.96f, 3.57f, 2.42f, 4.56f)
            lineTo(0.11f, 20.33f)
            curveToRelative(-0.52f, 1.84f, 0.87f, 3.67f, 2.78f, 3.67f)
            horizontalLineToRelative(0f)
            curveToRelative(1.29f, 0f, 2.43f, -0.86f, 2.78f, -2.11f)
            lineToRelative(0.53f, -1.89f)
            horizontalLineToRelative(2.8f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-1.96f)
            lineToRelative(1.12f, -4f)
            horizontalLineToRelative(8.34f)
            curveToRelative(2.51f, 0f, 4.64f, -1.69f, 5.29f, -4f)
            horizontalLineToRelative(0.71f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(16.5f, 10f)
            lineTo(5.5f, 10f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            close()
        }
    }.also { _GunSquirt = it }

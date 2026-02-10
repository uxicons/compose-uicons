package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RegionPinAlt: ImageVector? = null

val Icons.Br.RegionPinAlt: ImageVector
    get() = _RegionPinAlt ?: UXIcon(name = "RegionPinAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 12f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-5.46f)
            lineToRelative(-4.54f, -4.16f)
            lineTo(11f, 3f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-6f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(5.5f, 3f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(6.57f)
            lineToRelative(-5f, 2.5f)
            verticalLineToRelative(-6.57f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(3f, 18.5f)
            verticalLineToRelative(-3.07f)
            lineToRelative(6.25f, -3.12f)
            lineToRelative(4.29f, 3.93f)
            lineToRelative(-3.17f, 4.76f)
            horizontalLineToRelative(-4.86f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(18.5f, 21f)
            horizontalLineToRelative(-4.53f)
            lineToRelative(2.67f, -4f)
            horizontalLineToRelative(4.36f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(18.11f, 11.13f)
            curveToRelative(0.49f, 0.48f, 1.28f, 0.48f, 1.77f, 0f)
            lineToRelative(2.65f, -2.59f)
            curveToRelative(1.95f, -1.95f, 1.95f, -5.12f, 0f, -7.07f)
            curveTo(21.56f, 0.49f, 20.28f, 0f, 19f, 0f)
            curveToRelative(-1.28f, 0f, -2.56f, 0.49f, -3.54f, 1.46f)
            curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0f, 7.07f)
            lineToRelative(2.65f, 2.59f)
            close()
            moveTo(19f, 3.55f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            close()
        }
    }.also { _RegionPinAlt = it }

package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BedAlt: ImageVector? = null

val Icons.Br.BedAlt: ImageVector
    get() = _BedAlt ?: UXIcon(name = "BedAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 2f)
            lineTo(5.5f, 2f)
            curveTo(2.47f, 2f, 0f, 4.47f, 0f, 7.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            lineTo(21f, 19f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(24f, 7.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(19f, 13f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(0.5f)
            lineTo(3f, 13f)
            lineTo(3f, 7.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(5.5f)
            horizontalLineToRelative(-2f)
            close()
        }
    }.also { _BedAlt = it }

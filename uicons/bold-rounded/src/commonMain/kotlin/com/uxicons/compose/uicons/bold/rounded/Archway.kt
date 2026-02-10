package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Archway: ImageVector? = null

val Icons.Br.Archway: ImageVector
    get() = _Archway ?: UXIcon(name = "Archway") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 20f)
            horizontalLineToRelative(-0.5f)
            lineTo(22f, 6.62f)
            lineToRelative(1.25f, -1.25f)
            curveToRelative(0.73f, -0.73f, 0.95f, -1.83f, 0.56f, -2.79f)
            curveToRelative(-0.4f, -0.96f, -1.32f, -1.58f, -2.36f, -1.58f)
            lineTo(2.56f, 1f)
            curveTo(1.52f, 1f, 0.59f, 1.62f, 0.2f, 2.58f)
            curveTo(-0.2f, 3.54f, 0.02f, 4.63f, 0.75f, 5.37f)
            lineToRelative(1.25f, 1.25f)
            verticalLineToRelative(13.38f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            lineTo(6.5f, 23f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(19f, 20f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-1.5f)
            lineTo(5f, 6f)
            horizontalLineToRelative(14f)
            verticalLineToRelative(14f)
            close()
        }
    }.also { _Archway = it }

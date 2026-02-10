package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RulerVertical: ImageVector? = null

val Icons.Br.RulerVertical: ImageVector
    get() = _RulerVertical ?: UXIcon(name = "RulerVertical") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 0f)
            horizontalLineToRelative(-3f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            lineTo(6.5f, 20f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(3f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            lineTo(17.5f, 4f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            close()
            moveTo(13.5f, 21f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            lineTo(9.5f, 4f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(3f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(2.49f)
            lineToRelative(-1.51f, 0.01f)
            curveToRelative(-0.83f, 0.01f, -1.49f, 0.68f, -1.49f, 1.51f)
            curveToRelative(0.01f, 0.82f, 0.68f, 1.49f, 1.5f, 1.49f)
            horizontalLineToRelative(0.01f)
            lineToRelative(1.49f, -0.01f)
            verticalLineToRelative(1.01f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            close()
        }
    }.also { _RulerVertical = it }

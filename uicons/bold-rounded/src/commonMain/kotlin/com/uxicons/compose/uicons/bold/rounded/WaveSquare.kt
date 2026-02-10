package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveSquare: ImageVector? = null

val Icons.Br.WaveSquare: ImageVector
    get() = _WaveSquare ?: UXIcon(name = "WaveSquare") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17f, 22f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(2.5f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            close()
        }
    }.also { _WaveSquare = it }

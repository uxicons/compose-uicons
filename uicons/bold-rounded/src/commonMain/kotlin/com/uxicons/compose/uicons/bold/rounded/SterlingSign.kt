package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SterlingSign: ImageVector? = null

val Icons.Br.SterlingSign: ImageVector
    get() = _SterlingSign ?: UXIcon(name = "SterlingSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(3.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            curveToRelative(0.74f, 0f, 1.5f, -0.76f, 1.5f, -1.5f)
            verticalLineToRelative(-5.5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(-3f)
            curveTo(5f, 3.51f, 8.51f, 0f, 13f, 0f)
            curveToRelative(4.25f, 0f, 7.45f, 3.33f, 7.59f, 3.47f)
            curveToRelative(0.57f, 0.6f, 0.55f, 1.55f, -0.05f, 2.12f)
            curveToRelative(-0.6f, 0.57f, -1.55f, 0.55f, -2.12f, -0.05f)
            curveToRelative(-0.02f, -0.02f, -2.47f, -2.53f, -5.41f, -2.53f)
            reflectiveCurveToRelative(-5f, 2.2f, -5f, 5f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(8f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.52f, -0.1f, 1.03f, -0.28f, 1.5f)
            horizontalLineToRelative(12.78f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _SterlingSign = it }

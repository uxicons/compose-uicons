package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CentSign: ImageVector? = null

val Icons.Br.CentSign: ImageVector
    get() = _CentSign ?: UXIcon(name = "CentSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.78f, 17.42f)
            curveToRelative(-1.35f, 2.6f, -3.9f, 4.3f, -6.78f, 4.55f)
            verticalLineToRelative(0.53f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.52f)
            curveToRelative(-4.41f, -0.29f, -7.9f, -3.96f, -7.9f, -8.44f)
            verticalLineToRelative(-3.09f)
            curveTo(3.1f, 5.98f, 6.59f, 2.3f, 11f, 2.02f)
            verticalLineToRelative(-0.52f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(0.53f)
            curveToRelative(2.93f, 0.25f, 5.51f, 1.99f, 6.84f, 4.66f)
            curveToRelative(0.37f, 0.74f, 0.07f, 1.64f, -0.68f, 2.01f)
            curveToRelative(-0.74f, 0.37f, -1.64f, 0.07f, -2.01f, -0.67f)
            curveToRelative(-0.93f, -1.87f, -2.8f, -3.03f, -4.89f, -3.03f)
            horizontalLineToRelative(-1.72f)
            curveToRelative(-3.01f, 0f, -5.45f, 2.45f, -5.45f, 5.45f)
            verticalLineToRelative(3.09f)
            curveToRelative(0f, 3.01f, 2.45f, 5.45f, 5.45f, 5.45f)
            horizontalLineToRelative(1.72f)
            curveToRelative(2.05f, 0f, 3.91f, -1.13f, 4.85f, -2.95f)
            curveToRelative(0.38f, -0.74f, 1.29f, -1.03f, 2.02f, -0.64f)
            curveToRelative(0.74f, 0.38f, 1.02f, 1.29f, 0.64f, 2.02f)
            close()
        }
    }.also { _CentSign = it }

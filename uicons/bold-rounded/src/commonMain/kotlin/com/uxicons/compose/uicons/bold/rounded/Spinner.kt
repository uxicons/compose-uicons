package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spinner: ImageVector? = null

val Icons.Br.Spinner: ImageVector
    get() = _Spinner ?: UXIcon(name = "Spinner", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(268.08f, 512f)
            curveTo(126.69f, 511.96f, 12.11f, 397.32f, 12.15f, 255.93f)
            reflectiveCurveTo(126.83f, -0.04f, 268.21f, 0f)
            curveToRelative(96.56f, 0.03f, 184.89f, 54.38f, 228.43f, 140.57f)
            curveToRelative(7.7f, 15.91f, 1.03f, 35.05f, -14.88f, 42.74f)
            curveToRelative(-15.5f, 7.5f, -34.15f, 1.38f, -42.21f, -13.83f)
            curveTo(391.77f, 74.81f, 276.3f, 36.81f, 181.63f, 84.59f)
            reflectiveCurveTo(48.97f, 247.85f, 96.75f, 342.51f)
            reflectiveCurveToRelative(163.26f, 132.66f, 257.92f, 84.88f)
            curveToRelative(36.48f, -18.41f, 66.13f, -47.99f, 84.65f, -84.42f)
            curveToRelative(8.02f, -15.75f, 27.29f, -22.02f, 43.04f, -14.01f)
            curveToRelative(15.75f, 8.02f, 22.02f, 27.29f, 14.01f, 43.04f)
            lineToRelative(0f, 0f)
            curveTo(452.85f, 458.08f, 364.52f, 512.24f, 268.08f, 512f)
            close()
        }
    }.also { _Spinner = it }

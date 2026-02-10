package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloppyDiskPen: ImageVector? = null

val Icons.Br.FloppyDiskPen: ImageVector
    get() = _FloppyDiskPen ?: UXIcon(name = "FloppyDiskPen") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(10f, 20.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(9.76f)
            curveToRelative(0.93f, 0f, 1.83f, 0.38f, 2.49f, 1.04f)
            lineToRelative(3.24f, 3.27f)
            curveToRelative(0.65f, 0.66f, 1.01f, 1.53f, 1.01f, 2.46f)
            verticalLineToRelative(1.73f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.73f)
            curveToRelative(0f, -0.13f, -0.05f, -0.26f, -0.14f, -0.35f)
            lineToRelative(-3.24f, -3.27f)
            curveToRelative(-0.09f, -0.09f, -0.22f, -0.15f, -0.35f, -0.15f)
            horizontalLineToRelative(-0.26f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2.45f)
            curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(14.5f, 12.75f)
            curveToRelative(0f, -2.07f, -1.68f, -3.75f, -3.75f, -3.75f)
            reflectiveCurveToRelative(-3.75f, 1.68f, -3.75f, 3.75f)
            reflectiveCurveToRelative(1.68f, 3.75f, 3.75f, 3.75f)
            reflectiveCurveToRelative(3.75f, -1.68f, 3.75f, -3.75f)
            close()
            moveTo(23.51f, 12.85f)
            curveToRelative(-0.88f, -1.07f, -2.46f, -1.13f, -3.41f, -0.18f)
            lineToRelative(-6.81f, 6.81f)
            curveToRelative(-0.81f, 0.81f, -1.27f, 1.92f, -1.27f, 3.06f)
            verticalLineToRelative(0.95f)
            curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(0.95f)
            curveToRelative(1.15f, 0f, 2.25f, -0.46f, 3.06f, -1.27f)
            lineToRelative(6.71f, -6.71f)
            curveToRelative(0.85f, -0.85f, 1.01f, -2.24f, 0.25f, -3.17f)
            close()
        }
    }.also { _FloppyDiskPen = it }

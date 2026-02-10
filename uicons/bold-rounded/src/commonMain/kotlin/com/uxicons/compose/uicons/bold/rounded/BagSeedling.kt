package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BagSeedling: ImageVector? = null

val Icons.Br.BagSeedling: ImageVector
    get() = _BagSeedling ?: UXIcon(name = "BagSeedling") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.97f, 8.5f)
            curveToRelative(-0.36f, 3.44f, -2.62f, 4.74f, -4.47f, 5.22f)
            verticalLineToRelative(1.78f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.83f)
            curveToRelative(-1.83f, -0.51f, -4.07f, -1.83f, -4.43f, -5.17f)
            curveToRelative(-0.1f, -0.89f, 0.71f, -1.62f, 1.58f, -1.43f)
            curveToRelative(2.29f, 0.49f, 3.6f, 1.93f, 4.35f, 3.38f)
            curveToRelative(0.76f, -1.44f, 2.08f, -2.89f, 4.38f, -3.37f)
            curveToRelative(0.87f, -0.18f, 1.68f, 0.54f, 1.58f, 1.43f)
            close()
            moveTo(22.82f, 22.65f)
            curveToRelative(-0.4f, 0.83f, -1.22f, 1.35f, -2.14f, 1.35f)
            lineTo(3.33f, 24f)
            curveToRelative(-0.92f, 0f, -1.74f, -0.52f, -2.14f, -1.35f)
            reflectiveCurveToRelative(-0.29f, -1.79f, 0.29f, -2.52f)
            lineToRelative(0.53f, -0.66f)
            lineTo(2.0f, 4.53f)
            lineToRelative(-0.53f, -0.66f)
            curveToRelative(-0.57f, -0.72f, -0.69f, -1.68f, -0.29f, -2.51f)
            reflectiveCurveTo(2.4f, 0f, 3.33f, 0f)
            horizontalLineToRelative(17.35f)
            curveToRelative(0.92f, 0f, 1.74f, 0.52f, 2.14f, 1.35f)
            reflectiveCurveToRelative(0.29f, 1.79f, -0.29f, 2.52f)
            lineToRelative(-0.53f, 0.66f)
            verticalLineToRelative(14.95f)
            lineToRelative(0.53f, 0.66f)
            curveToRelative(0.57f, 0.72f, 0.69f, 1.68f, 0.29f, 2.51f)
            close()
            moveTo(19f, 20f)
            lineTo(19f, 4f)
            lineTo(5f, 4f)
            verticalLineToRelative(16f)
            horizontalLineToRelative(14f)
            close()
        }
    }.also { _BagSeedling = it }

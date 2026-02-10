package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UfoBeam: ImageVector? = null

val Icons.Br.UfoBeam: ImageVector
    get() = _UfoBeam ?: UXIcon(name = "UfoBeam") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.82f, 4.55f)
            curveToRelative(-0.65f, -2.61f, -3.01f, -4.55f, -5.82f, -4.55f)
            reflectiveCurveToRelative(-5.17f, 1.94f, -5.82f, 4.55f)
            curveTo(2.18f, 5.37f, 0f, 6.93f, 0f, 9f)
            curveToRelative(0f, 3.45f, 6.03f, 5f, 12f, 5f)
            reflectiveCurveToRelative(12f, -1.55f, 12f, -5f)
            curveToRelative(0f, -2.07f, -2.18f, -3.63f, -6.18f, -4.45f)
            close()
            moveTo(12f, 3f)
            curveToRelative(1.44f, 0f, 2.65f, 1.02f, 2.94f, 2.38f)
            curveToRelative(-0.44f, 0.26f, -1.34f, 0.62f, -2.94f, 0.62f)
            curveToRelative(-1.61f, 0f, -2.51f, -0.36f, -2.94f, -0.61f)
            curveToRelative(0.28f, -1.36f, 1.49f, -2.39f, 2.94f, -2.39f)
            close()
            moveTo(12f, 11f)
            curveToRelative(-5.38f, 0f, -8.43f, -1.35f, -8.96f, -2.0f)
            curveToRelative(0.29f, -0.35f, 1.47f, -1.05f, 3.8f, -1.52f)
            curveToRelative(0.76f, 0.65f, 2.31f, 1.52f, 5.15f, 1.52f)
            reflectiveCurveToRelative(4.39f, -0.87f, 5.15f, -1.52f)
            curveToRelative(2.33f, 0.47f, 3.51f, 1.17f, 3.8f, 1.52f)
            curveToRelative(-0.52f, 0.65f, -3.57f, 2.0f, -8.96f, 2.0f)
            close()
            moveTo(7.38f, 17.08f)
            lineToRelative(-2.5f, 6f)
            curveToRelative(-0.24f, 0.58f, -0.8f, 0.92f, -1.39f, 0.92f)
            curveToRelative(-0.19f, 0f, -0.39f, -0.04f, -0.58f, -0.12f)
            curveToRelative(-0.77f, -0.32f, -1.13f, -1.2f, -0.81f, -1.96f)
            lineToRelative(2.5f, -6f)
            curveToRelative(0.32f, -0.77f, 1.2f, -1.13f, 1.96f, -0.81f)
            curveToRelative(0.77f, 0.32f, 1.13f, 1.2f, 0.81f, 1.96f)
            close()
            moveTo(21.89f, 21.92f)
            curveToRelative(0.32f, 0.77f, -0.04f, 1.64f, -0.81f, 1.96f)
            curveToRelative(-0.19f, 0.08f, -0.38f, 0.12f, -0.58f, 0.12f)
            curveToRelative(-0.59f, 0f, -1.15f, -0.35f, -1.39f, -0.92f)
            lineToRelative(-2.5f, -6f)
            curveToRelative(-0.32f, -0.77f, 0.04f, -1.64f, 0.81f, -1.96f)
            curveToRelative(0.77f, -0.32f, 1.64f, 0.04f, 1.96f, 0.81f)
            lineToRelative(2.5f, 6f)
            close()
        }
    }.also { _UfoBeam = it }

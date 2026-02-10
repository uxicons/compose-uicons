package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bullhorn: ImageVector? = null

val Icons.Br.Bullhorn: ImageVector
    get() = _Bullhorn ?: UXIcon(name = "Bullhorn") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 7.05f)
            lineTo(22f, 1.5f)
            curveToRelative(0f, -0.78f, -0.6f, -1.43f, -1.38f, -1.5f)
            curveToRelative(-0.78f, -0.06f, -1.48f, 0.48f, -1.6f, 1.25f)
            curveToRelative(-0.4f, 2.39f, -3.63f, 2.75f, -5.52f, 2.75f)
            lineTo(5.5f, 4.0f)
            curveTo(2.47f, 4f, 0f, 6.47f, 0f, 9.5f)
            curveToRelative(0f, 1.9f, 0.97f, 3.58f, 2.43f, 4.56f)
            lineToRelative(3.88f, 8.73f)
            curveToRelative(0.33f, 0.73f, 1.05f, 1.21f, 1.85f, 1.21f)
            curveToRelative(0.65f, 0f, 1.3f, -0.19f, 1.79f, -0.6f)
            curveToRelative(1.01f, -0.83f, 1.29f, -2.16f, 0.8f, -3.27f)
            lineToRelative(-2.28f, -5.13f)
            horizontalLineToRelative(5.02f)
            curveToRelative(1.89f, 0f, 5.12f, 0.36f, 5.52f, 2.75f)
            curveToRelative(0.12f, 0.73f, 0.75f, 1.25f, 1.48f, 1.25f)
            curveToRelative(1.0f, 0f, 1.5f, -0.72f, 1.5f, -1.5f)
            verticalLineToRelative(-5.55f)
            curveToRelative(1.14f, -0.23f, 2f, -1.24f, 2f, -2.45f)
            reflectiveCurveToRelative(-0.86f, -2.22f, -2f, -2.45f)
            close()
            moveTo(7f, 12f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(5f)
            close()
            moveTo(19f, 13.18f)
            curveToRelative(-1.41f, -0.77f, -3.27f, -1.18f, -5.5f, -1.18f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(3.5f)
            curveToRelative(2.23f, 0f, 4.09f, -0.41f, 5.5f, -1.18f)
            verticalLineToRelative(7.35f)
            close()
        }
    }.also { _Bullhorn = it }

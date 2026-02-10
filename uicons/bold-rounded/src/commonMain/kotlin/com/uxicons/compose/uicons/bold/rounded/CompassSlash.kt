package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassSlash: ImageVector? = null

val Icons.Br.CompassSlash: ImageVector
    get() = _CompassSlash ?: UXIcon(name = "CompassSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21.47f, 19.35f)
            curveToRelative(1.63f, -2.1f, 2.53f, -4.66f, 2.53f, -7.35f)
            curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
            curveToRelative(-2.69f, 0f, -5.26f, 0.89f, -7.35f, 2.52f)
            lineTo(2.56f, 0.44f)
            curveTo(1.98f, -0.15f, 1.02f, -0.15f, 0.44f, 0.44f)
            curveTo(-0.15f, 1.02f, -0.15f, 1.98f, 0.44f, 2.56f)
            lineToRelative(21f, 21f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
            lineToRelative(-2.09f, -2.09f)
            close()
            moveTo(12f, 3f)
            curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
            curveToRelative(0f, 1.89f, -0.59f, 3.69f, -1.67f, 5.21f)
            lineToRelative(-4.55f, -4.55f)
            lineToRelative(2.37f, -4.09f)
            curveToRelative(0.64f, -1.11f, -0.6f, -2.36f, -1.72f, -1.72f)
            lineToRelative(-4.09f, 2.37f)
            lineToRelative(-4.55f, -4.55f)
            curveToRelative(1.51f, -1.08f, 3.32f, -1.67f, 5.21f, -1.67f)
            close()
            moveTo(15.96f, 21.84f)
            curveToRelative(0.2f, 0.81f, -0.3f, 1.62f, -1.1f, 1.81f)
            curveToRelative(-0.93f, 0.23f, -1.89f, 0.34f, -2.85f, 0.34f)
            curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
            curveToRelative(0f, -0.97f, 0.12f, -1.93f, 0.34f, -2.86f)
            curveToRelative(0.2f, -0.81f, 1.01f, -1.3f, 1.81f, -1.1f)
            curveToRelative(0.81f, 0.2f, 1.3f, 1.01f, 1.1f, 1.81f)
            curveToRelative(-0.17f, 0.69f, -0.26f, 1.42f, -0.26f, 2.14f)
            curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
            curveToRelative(0.72f, 0f, 1.45f, -0.09f, 2.15f, -0.26f)
            curveToRelative(0.81f, -0.2f, 1.62f, 0.3f, 1.81f, 1.1f)
            close()
            moveTo(6.85f, 15.44f)
            lineToRelative(1.33f, -2.3f)
            lineToRelative(2.69f, 2.69f)
            lineToRelative(-2.3f, 1.33f)
            curveToRelative(-1.11f, 0.64f, -2.36f, -0.6f, -1.72f, -1.72f)
            close()
        }
    }.also { _CompassSlash = it }

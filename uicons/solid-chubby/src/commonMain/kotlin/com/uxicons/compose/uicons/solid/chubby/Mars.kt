package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mars: ImageVector? = null

val Icons.Sc.Mars: ImageVector
    get() = _Mars ?: UXIcon(name = "Mars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.51f, 2.5f)
                curveToRelative(-0.15f, -0.45f, -0.5f, -0.8f, -0.95f, -0.95f)
                curveToRelative(-0.14f, -0.05f, -3.49f, -1.12f, -6.77f, 0.11f)
                curveToRelative(-0.78f, 0.29f, -1.17f, 1.16f, -0.87f, 1.93f)
                curveToRelative(0.29f, 0.78f, 1.16f, 1.17f, 1.93f, 0.88f)
                curveToRelative(0.67f, -0.25f, 1.36f, -0.36f, 2.0f, -0.39f)
                lineToRelative(-4.4f, 4.37f)
                curveToRelative(-3.27f, -2.47f, -6.64f, -2.15f, -9.82f, 0.97f)
                curveToRelative(-3.5f, 3.52f, -3.49f, 7.29f, 0.03f, 10.93f)
                curveToRelative(1.79f, 1.72f, 3.65f, 2.58f, 5.51f, 2.58f)
                reflectiveCurveToRelative(3.7f, -0.86f, 5.45f, -2.58f)
                curveToRelative(3.09f, -3.11f, 3.41f, -6.55f, 0.95f, -9.79f)
                lineToRelative(4.42f, -4.38f)
                curveToRelative(-0.03f, 0.63f, -0.14f, 1.32f, -0.39f, 1.98f)
                curveToRelative(-0.3f, 0.77f, 0.09f, 1.64f, 0.86f, 1.94f)
                curveToRelative(0.18f, 0.07f, 0.36f, 0.1f, 0.54f, 0.1f)
                curveToRelative(0.6f, 0f, 1.17f, -0.37f, 1.4f, -0.96f)
                curveToRelative(1.25f, -3.26f, 0.16f, -6.59f, 0.12f, -6.73f)
                close()
            }
        }.also { _Mars = it}

package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fill: ImageVector? = null

val Icons.Sc.Fill: ImageVector
    get() = _Fill ?: UXIcon(name = "Fill") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.81f, 14.76f)
                curveToRelative(0.36f, -0.01f, 0.72f, -0.16f, 1.0f, -0.44f)
                curveToRelative(0.58f, -0.59f, 0.58f, -1.54f, -0.01f, -2.12f)
                lineTo(11.33f, 1.79f)
                curveToRelative(-0.59f, -0.58f, -1.54f, -0.58f, -2.12f, 0.01f)
                curveToRelative(-0.58f, 0.59f, -0.58f, 1.54f, 0.01f, 2.12f)
                lineToRelative(5.25f, 5.24f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, -0.0f, 1.42f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(6.43f, 3.92f)
                curveToRelative(-0.58f, -0.59f, -1.53f, -0.59f, -2.12f, -0.0f)
                reflectiveCurveToRelative(-0.59f, 1.53f, -0.0f, 2.12f)
                lineToRelative(1.11f, 1.11f)
                curveTo(2.72f, 10.01f, 1.22f, 12.45f, 1.15f, 12.56f)
                curveToRelative(-0.18f, 0.29f, -0.2f, 0.64f, -0.05f, 0.95f)
                curveToRelative(0.06f, 0.12f, 1.37f, 2.87f, 3.76f, 5.27f)
                curveToRelative(2.39f, 2.4f, 5.14f, 3.72f, 5.26f, 3.77f)
                curveToRelative(0.14f, 0.07f, 0.28f, 0.1f, 0.43f, 0.1f)
                curveToRelative(0.18f, 0f, 0.36f, -0.05f, 0.53f, -0.15f)
                curveToRelative(0.12f, -0.08f, 3.03f, -1.88f, 6.17f, -5.03f)
                curveToRelative(1.16f, -1.16f, 2.06f, -2.21f, 2.66f, -2.96f)
                curveToRelative(0.27f, 0.18f, 0.59f, 0.27f, 0.9f, 0.26f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.35f, 16.78f)
                curveToRelative(-0.34f, -0.23f, -0.78f, -0.23f, -1.12f, 0f)
                curveToRelative(-0.17f, 0.11f, -1.65f, 1.15f, -1.65f, 2.7f)
                curveToRelative(0f, 1.22f, 0.99f, 2.21f, 2.21f, 2.21f)
                reflectiveCurveToRelative(2.21f, -0.99f, 2.21f, -2.21f)
                curveToRelative(0f, -1.55f, -1.48f, -2.59f, -1.65f, -2.7f)
                close()
            }
        }.also { _Fill = it}

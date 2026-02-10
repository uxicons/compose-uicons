package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scale: ImageVector? = null

val Icons.Sc.Scale: ImageVector
    get() = _Scale ?: UXIcon(name = "Scale") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.8f, 3.91f)
                curveToRelative(-0.11f, -0.32f, -0.37f, -0.56f, -0.7f, -0.65f)
                curveToRelative(-0.07f, -0.02f, -1.57f, -0.4f, -3.81f, -0.7f)
                curveToRelative(0.65f, 0.99f, 1.02f, 2.17f, 1.02f, 3.43f)
                verticalLineToRelative(0.94f)
                curveToRelative(0f, 0.27f, -0.11f, 0.53f, -0.31f, 0.72f)
                curveToRelative(-0.17f, 0.16f, -1.78f, 1.58f, -6.0f, 1.58f)
                curveToRelative(-4.18f, 0f, -5.82f, -1.42f, -5.99f, -1.58f)
                curveToRelative(-0.2f, -0.19f, -0.32f, -0.45f, -0.32f, -0.73f)
                verticalLineToRelative(-0.94f)
                curveToRelative(0f, -1.26f, 0.38f, -2.44f, 1.02f, -3.43f)
                curveToRelative(-2.24f, 0.3f, -3.74f, 0.68f, -3.81f, 0.7f)
                curveToRelative(-0.33f, 0.08f, -0.59f, 0.33f, -0.7f, 0.65f)
                curveToRelative(-0.05f, 0.15f, -1.2f, 3.66f, -1.2f, 8.33f)
                curveToRelative(0f, 4.72f, 1.15f, 8.19f, 1.2f, 8.34f)
                curveToRelative(0.11f, 0.32f, 0.37f, 0.56f, 0.7f, 0.65f)
                curveToRelative(0.17f, 0.04f, 4.26f, 1.07f, 9.1f, 1.07f)
                reflectiveCurveToRelative(8.92f, -1.03f, 9.1f, -1.07f)
                curveToRelative(0.33f, -0.08f, 0.59f, -0.33f, 0.7f, -0.65f)
                curveToRelative(0.05f, -0.15f, 1.2f, -3.66f, 1.2f, -8.33f)
                curveToRelative(0f, -4.72f, -1.15f, -8.19f, -1.2f, -8.34f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.55f, 4.95f)
                curveToRelative(0.26f, -0.49f, 0.86f, -0.68f, 1.35f, -0.42f)
                curveToRelative(0.49f, 0.26f, 0.68f, 0.86f, 0.42f, 1.35f)
                lineToRelative(-0.67f, 1.27f)
                curveToRelative(1.4f, -0.17f, 2.24f, -0.52f, 2.66f, -0.75f)
                verticalLineToRelative(-0.41f)
                curveToRelative(0f, -2.36f, -1.93f, -4.29f, -4.31f, -4.29f)
                reflectiveCurveToRelative(-4.31f, 1.92f, -4.31f, 4.29f)
                verticalLineToRelative(0.41f)
                curveToRelative(0.5f, 0.27f, 1.64f, 0.74f, 3.65f, 0.82f)
                lineToRelative(1.21f, -2.28f)
                close()
            }
        }.also { _Scale = it}

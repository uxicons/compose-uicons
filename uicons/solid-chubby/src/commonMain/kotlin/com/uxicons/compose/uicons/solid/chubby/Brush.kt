package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Brush: ImageVector? = null

val Icons.Sc.Brush: ImageVector
    get() = _Brush ?: UXIcon(name = "Brush") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.28f, 10.1f)
                curveToRelative(-0.02f, -0.37f, -0.04f, -0.75f, -0.06f, -1.16f)
                curveToRelative(-0.2f, -3.62f, -1.07f, -6.33f, -1.11f, -6.45f)
                curveToRelative(-0.11f, -0.34f, -0.39f, -0.59f, -0.74f, -0.67f)
                curveToRelative(-0.05f, -0.01f, -0.49f, -0.1f, -1.23f, -0.23f)
                verticalLineTo(6.36f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(1.32f)
                curveToRelative(-0.55f, -0.07f, -1.16f, -0.13f, -1.81f, -0.18f)
                verticalLineTo(5.39f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(1.02f)
                curveToRelative(-0.44f, -0.01f, -0.89f, -0.02f, -1.34f, -0.02f)
                curveToRelative(-0.16f, 0f, -0.31f, 0.0f, -0.47f, 0.0f)
                verticalLineToRelative(3.43f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(1.08f)
                curveToRelative(-3.29f, 0.2f, -5.78f, 0.72f, -5.9f, 0.75f)
                curveToRelative(-0.35f, 0.07f, -0.63f, 0.33f, -0.74f, 0.67f)
                curveToRelative(-0.04f, 0.11f, -0.91f, 2.83f, -1.11f, 6.45f)
                curveToRelative(-0.02f, 0.4f, -0.04f, 0.79f, -0.06f, 1.16f)
                curveToRelative(1.46f, 0.28f, 5.63f, 0.99f, 10.28f, 0.99f)
                reflectiveCurveToRelative(8.82f, -0.71f, 10.28f, -0.99f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 13.09f)
                curveToRelative(-4.53f, 0f, -8.53f, -0.63f, -10.3f, -0.96f)
                curveToRelative(0.07f, 1.7f, 0.43f, 2.93f, 1.49f, 3.83f)
                curveToRelative(1.3f, 1.09f, 2.89f, 1.63f, 5.65f, 1.86f)
                lineToRelative(-0.21f, 0.88f)
                curveToRelative(-0.25f, 1.04f, -0.02f, 2.12f, 0.65f, 2.97f)
                curveToRelative(0.66f, 0.84f, 1.66f, 1.33f, 2.73f, 1.33f)
                reflectiveCurveToRelative(2.07f, -0.48f, 2.73f, -1.33f)
                curveToRelative(0.66f, -0.84f, 0.9f, -1.93f, 0.65f, -2.97f)
                lineToRelative(-0.21f, -0.88f)
                curveToRelative(2.76f, -0.23f, 4.35f, -0.77f, 5.65f, -1.86f)
                curveToRelative(1.06f, -0.9f, 1.42f, -2.13f, 1.49f, -3.83f)
                curveToRelative(-1.78f, 0.33f, -5.78f, 0.96f, -10.3f, 0.96f)
                close()
            }
        }.also { _Brush = it}

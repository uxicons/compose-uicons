package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAverage: ImageVector? = null

val Icons.Tr.TachometerAverage: ImageVector
    get() = _TachometerAverage ?: UXIcon(name = "TachometerAverage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                curveToRelative(0f, 2.91f, -1.06f, 5.72f, -2.98f, 7.91f)
                curveToRelative(-1.17f, 1.33f, -3.22f, 1.47f, -4.57f, 0.3f)
                lineToRelative(-0.59f, -0.51f)
                curveToRelative(-0.21f, -0.18f, -0.23f, -0.5f, -0.05f, -0.71f)
                reflectiveCurveToRelative(0.5f, -0.23f, 0.7f, -0.05f)
                lineToRelative(0.59f, 0.51f)
                curveToRelative(0.94f, 0.81f, 2.35f, 0.72f, 3.16f, -0.2f)
                curveToRelative(1.76f, -2.01f, 2.73f, -4.58f, 2.73f, -7.25f)
                curveToRelative(0f, -3.26f, -1.43f, -6.33f, -3.93f, -8.43f)
                curveToRelative(-2.49f, -2.1f, -5.8f, -2.97f, -9.06f, -2.4f)
                curveTo(5.29f, 3.0f, 1.7f, 6.77f, 1.09f, 11.56f)
                curveToRelative(-0.41f, 3.21f, 0.53f, 6.29f, 2.65f, 8.7f)
                curveToRelative(0.79f, 0.9f, 2.24f, 0.99f, 3.16f, 0.2f)
                lineToRelative(0.59f, -0.51f)
                curveToRelative(0.21f, -0.18f, 0.52f, -0.16f, 0.71f, 0.05f)
                curveToRelative(0.18f, 0.21f, 0.16f, 0.52f, -0.05f, 0.7f)
                lineToRelative(-0.59f, 0.51f)
                curveToRelative(-0.62f, 0.53f, -1.38f, 0.8f, -2.14f, 0.8f)
                curveToRelative(-0.9f, 0f, -1.79f, -0.37f, -2.43f, -1.09f)
                curveTo(0.68f, 18.3f, -0.34f, 14.93f, 0.1f, 11.44f)
                curveTo(0.76f, 6.21f, 4.68f, 2.09f, 9.84f, 1.19f)
                curveToRelative(3.56f, -0.63f, 7.15f, 0.33f, 9.88f, 2.62f)
                curveToRelative(2.72f, 2.29f, 4.28f, 5.64f, 4.28f, 9.19f)
                close()
                moveTo(14f, 13f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.93f, 0.64f, -1.71f, 1.5f, -1.94f)
                lineTo(11.5f, 6f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(5.06f)
                curveToRelative(0.86f, 0.22f, 1.5f, 1.01f, 1.5f, 1.94f)
                close()
                moveTo(13f, 13f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _TachometerAverage = it}

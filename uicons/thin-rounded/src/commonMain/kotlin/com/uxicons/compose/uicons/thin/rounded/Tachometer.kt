package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tachometer: ImageVector? = null

val Icons.Tr.Tachometer: ImageVector
    get() = _Tachometer ?: UXIcon(name = "Tachometer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.9f, 11.48f)
                curveToRelative(-0.69f, -5.42f, -5.11f, -9.79f, -10.52f, -10.4f)
                curveToRelative(-3.46f, -0.39f, -6.78f, 0.67f, -9.36f, 2.97f)
                curveTo(1.47f, 6.33f, 0f, 9.61f, 0f, 13.05f)
                curveToRelative(0f, 3.29f, 1.3f, 6.36f, 3.66f, 8.65f)
                curveToRelative(0.86f, 0.84f, 1.99f, 1.3f, 3.17f, 1.3f)
                horizontalLineToRelative(10.35f)
                curveToRelative(1.15f, 0f, 2.22f, -0.41f, 3.0f, -1.14f)
                curveToRelative(2.86f, -2.68f, 4.22f, -6.46f, 3.72f, -10.38f)
                close()
                moveTo(19.5f, 21.13f)
                curveToRelative(-0.6f, 0.56f, -1.43f, 0.87f, -2.32f, 0.87f)
                lineTo(6.83f, 22f)
                curveToRelative(-0.92f, 0f, -1.8f, -0.36f, -2.47f, -1.01f)
                curveToRelative(-2.16f, -2.1f, -3.35f, -4.92f, -3.35f, -7.94f)
                curveToRelative(0f, -3.15f, 1.34f, -6.16f, 3.69f, -8.26f)
                curveToRelative(2.04f, -1.82f, 4.59f, -2.79f, 7.29f, -2.79f)
                curveToRelative(0.43f, 0f, 0.86f, 0.02f, 1.29f, 0.07f)
                curveToRelative(4.96f, 0.56f, 9.01f, 4.57f, 9.63f, 9.53f)
                curveToRelative(0.46f, 3.6f, -0.79f, 7.07f, -3.41f, 9.52f)
                close()
                moveTo(16.65f, 7.65f)
                lineToRelative(-3.63f, 3.63f)
                curveToRelative(-0.3f, -0.18f, -0.65f, -0.28f, -1.01f, -0.28f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.37f, -0.1f, -0.72f, -0.28f, -1.01f)
                lineToRelative(3.63f, -3.63f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                close()
                moveTo(12f, 14.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Tachometer = it}

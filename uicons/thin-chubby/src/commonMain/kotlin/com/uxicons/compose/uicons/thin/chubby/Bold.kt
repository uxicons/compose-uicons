package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bold: ImageVector? = null

val Icons.Tc.Bold: ImageVector
    get() = _Bold ?: UXIcon(name = "Bold") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.16f, 16.22f)
                curveToRelative(-0.29f, -2.76f, -2.72f, -4.98f, -5.75f, -5.45f)
                curveToRelative(0.55f, -0.34f, 1.04f, -0.77f, 1.45f, -1.27f)
                curveToRelative(0.99f, -1.23f, 1.34f, -2.75f, 1.0f, -4.28f)
                curveToRelative(-0.55f, -2.44f, -3.0f, -4.21f, -5.83f, -4.21f)
                lineTo(5.21f, 1f)
                curveToRelative(-0.24f, 0f, -0.45f, 0.17f, -0.49f, 0.41f)
                curveToRelative(-1.13f, 6.46f, -1.22f, 13.04f, -0.25f, 19.53f)
                lineToRelative(0.24f, 1.63f)
                curveToRelative(0.04f, 0.24f, 0.25f, 0.43f, 0.49f, 0.43f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(6.57f, -0.03f, 8.27f, -0.03f)
                curveToRelative(2.01f, 0f, 3.9f, -0.81f, 5.18f, -2.24f)
                curveToRelative(1.14f, -1.27f, 1.68f, -2.87f, 1.5f, -4.52f)
                close()
                moveTo(5.63f, 2f)
                horizontalLineToRelative(5.41f)
                curveToRelative(2.37f, 0f, 4.41f, 1.44f, 4.85f, 3.43f)
                curveToRelative(0.27f, 1.23f, -0.01f, 2.45f, -0.81f, 3.44f)
                curveToRelative(-0.9f, 1.13f, -2.36f, 1.8f, -3.96f, 1.8f)
                curveToRelative(-0.0f, 0f, -0.0f, 0f, -0.0f, 0f)
                reflectiveCurveToRelative(-0.0f, 0f, -0.0f, 0f)
                lineTo(4.82f, 10.67f)
                curveToRelative(0.06f, -2.9f, 0.33f, -5.8f, 0.82f, -8.67f)
                close()
                moveTo(17.92f, 20.07f)
                curveToRelative(-1.09f, 1.21f, -2.71f, 1.91f, -4.43f, 1.91f)
                curveToRelative(-1.44f, 0f, -6.35f, 0.02f, -7.84f, 0.02f)
                lineToRelative(-0.18f, -1.2f)
                curveToRelative(-0.45f, -3.03f, -0.67f, -6.08f, -0.66f, -9.12f)
                lineTo(13.22f, 11.67f)
                curveToRelative(3.06f, 0f, 5.68f, 2.04f, 5.95f, 4.65f)
                curveToRelative(0.14f, 1.36f, -0.3f, 2.69f, -1.25f, 3.75f)
                close()
            }
        }.also { _Bold = it}

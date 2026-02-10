package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellSlash: ImageVector? = null

val Icons.Tr.BellSlash: ImageVector
    get() = _BellSlash ?: UXIcon(name = "BellSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.85f, 23.15f)
                lineToRelative(-3.56f, -3.56f)
                curveToRelative(0.69f, -0.31f, 1.29f, -0.8f, 1.76f, -1.42f)
                curveToRelative(0.88f, -1.17f, 1.17f, -2.64f, 0.78f, -4.05f)
                lineToRelative(-2.05f, -7.44f)
                curveToRelative(-1.09f, -3.93f, -4.7f, -6.67f, -8.78f, -6.67f)
                curveToRelative(-3.0f, 0f, -5.75f, 1.43f, -7.45f, 3.84f)
                lineTo(0.85f, 0.15f)
                curveTo(0.66f, -0.05f, 0.34f, -0.05f, 0.15f, 0.15f)
                reflectiveCurveTo(-0.05f, 0.66f, 0.15f, 0.85f)
                lineToRelative(23f, 23f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(12.0f, 1f)
                curveToRelative(3.63f, 0f, 6.85f, 2.44f, 7.82f, 5.94f)
                lineToRelative(2.05f, 7.44f)
                curveToRelative(0.31f, 1.1f, 0.08f, 2.26f, -0.61f, 3.18f)
                curveToRelative(-0.45f, 0.59f, -1.05f, 1.02f, -1.74f, 1.25f)
                lineTo(5.27f, 4.56f)
                curveToRelative(1.5f, -2.23f, 4f, -3.56f, 6.73f, -3.56f)
                close()
                moveTo(16f, 19f)
                lineTo(5.64f, 19f)
                curveToRelative(-1.11f, 0f, -2.15f, -0.5f, -2.84f, -1.36f)
                curveToRelative(-0.69f, -0.86f, -0.95f, -1.98f, -0.72f, -3.04f)
                lineToRelative(1.99f, -7.21f)
                curveToRelative(0.07f, -0.27f, -0.08f, -0.54f, -0.35f, -0.61f)
                curveToRelative(-0.26f, -0.07f, -0.54f, 0.08f, -0.61f, 0.35f)
                lineToRelative(-2.0f, 7.24f)
                curveToRelative(-0.31f, 1.38f, 0.03f, 2.81f, 0.91f, 3.91f)
                curveToRelative(0.89f, 1.1f, 2.2f, 1.74f, 3.62f, 1.74f)
                horizontalLineToRelative(1.93f)
                curveToRelative(0.22f, 2.24f, 2.11f, 4f, 4.41f, 4f)
                curveToRelative(2.45f, 0f, 4.52f, -2.06f, 4.52f, -4.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(11.98f, 23f)
                curveToRelative(-1.75f, 0f, -3.19f, -1.31f, -3.4f, -3f)
                horizontalLineToRelative(6.88f)
                curveToRelative(-0.25f, 1.67f, -1.74f, 3f, -3.48f, 3f)
                close()
            }
        }.also { _BellSlash = it}

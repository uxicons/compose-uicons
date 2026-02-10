package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartArrow: ImageVector? = null

val Icons.Tr.HeartArrow: ImageVector
    get() = _HeartArrow ?: UXIcon(name = "HeartArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 17f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.23f, -0.05f, 0.45f, -0.15f, 0.65f)
                lineToRelative(-4.93f, -4.93f)
                curveToRelative(2.23f, -2.45f, 4.08f, -5.33f, 4.08f, -7.75f)
                curveToRelative(0.06f, -1.53f, -0.47f, -2.99f, -1.45f, -4.01f)
                curveToRelative(-0.92f, -0.95f, -2.15f, -1.46f, -3.56f, -1.46f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-1.74f, 0.04f, -3.35f, 1.01f, -4.21f, 2.56f)
                curveToRelative(-0.01f, 0.02f, -0.12f, 0.24f, -0.27f, 0.58f)
                curveToRelative(-0.15f, -0.34f, -0.26f, -0.58f, -0.28f, -0.61f)
                curveToRelative(-0.84f, -1.53f, -2.45f, -2.5f, -4.21f, -2.53f)
                curveToRelative(-0.97f, 0f, -1.85f, 0.24f, -2.61f, 0.7f)
                lineTo(0.85f, 0.15f)
                curveTo(0.66f, -0.05f, 0.34f, -0.05f, 0.15f, 0.15f)
                reflectiveCurveTo(-0.05f, 0.66f, 0.15f, 0.85f)
                lineToRelative(4.45f, 4.46f)
                curveToRelative(-0.05f, 0.05f, -0.11f, 0.1f, -0.16f, 0.16f)
                curveToRelative(-0.97f, 1.01f, -1.5f, 2.46f, -1.44f, 3.95f)
                curveToRelative(0f, 3.51f, 3.86f, 7.98f, 7.16f, 10.73f)
                curveToRelative(0.68f, 0.57f, 1.51f, 0.85f, 2.35f, 0.85f)
                reflectiveCurveToRelative(1.66f, -0.28f, 2.34f, -0.85f)
                curveToRelative(0.78f, -0.65f, 1.6f, -1.4f, 2.38f, -2.21f)
                lineToRelative(4.91f, 4.91f)
                curveToRelative(-0.2f, 0.09f, -0.41f, 0.15f, -0.65f, 0.15f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(4f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(14.21f, 19.39f)
                curveToRelative(-0.98f, 0.82f, -2.42f, 0.82f, -3.4f, -0.0f)
                curveToRelative(-3.14f, -2.62f, -6.8f, -6.8f, -6.8f, -9.99f)
                curveToRelative(-0.05f, -1.25f, 0.38f, -2.43f, 1.16f, -3.24f)
                curveToRelative(0.73f, -0.76f, 1.71f, -1.16f, 2.84f, -1.16f)
                curveToRelative(1.39f, 0.03f, 2.67f, 0.8f, 3.33f, 1.99f)
                curveToRelative(0.0f, 0.01f, 0.42f, 0.88f, 0.7f, 1.67f)
                curveToRelative(0.07f, 0.2f, 0.26f, 0.34f, 0.47f, 0.34f)
                horizontalLineToRelative(0f)
                curveToRelative(0.21f, 0f, 0.4f, -0.14f, 0.47f, -0.34f)
                curveToRelative(0.3f, -0.86f, 0.68f, -1.65f, 0.68f, -1.65f)
                curveToRelative(0.67f, -1.21f, 1.95f, -1.99f, 3.34f, -2.02f)
                curveToRelative(1.13f, 0f, 2.11f, 0.4f, 2.84f, 1.15f)
                curveToRelative(0.79f, 0.82f, 1.21f, 2.01f, 1.17f, 3.29f)
                curveToRelative(0f, 2.94f, -3.52f, 7.21f, -6.79f, 9.94f)
                close()
            }
        }.also { _HeartArrow = it}

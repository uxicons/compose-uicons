package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextHeight: ImageVector? = null

val Icons.Sc.TextHeight: ImageVector
    get() = _TextHeight ?: UXIcon(name = "TextHeight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 4.03f)
                verticalLineToRelative(17.47f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-17.47f)
                curveToRelative(-2.61f, 0.09f, -4.34f, 0.4f, -5.24f, 0.62f)
                curveToRelative(-0.1f, 0.52f, -0.22f, 1.22f, -0.27f, 1.96f)
                curveToRelative(-0.06f, 0.83f, -0.77f, 1.45f, -1.6f, 1.39f)
                curveToRelative(-0.83f, -0.06f, -1.45f, -0.78f, -1.39f, -1.6f)
                curveToRelative(0.12f, -1.74f, 0.52f, -3.27f, 0.54f, -3.33f)
                curveToRelative(0.12f, -0.47f, 0.47f, -0.85f, 0.92f, -1.02f)
                curveToRelative(0.11f, -0.04f, 2.83f, -1.04f, 8.54f, -1.04f)
                reflectiveCurveToRelative(8.42f, 1f, 8.54f, 1.04f)
                curveToRelative(0.47f, 0.18f, 0.81f, 0.57f, 0.93f, 1.06f)
                curveToRelative(0.01f, 0.06f, 0.36f, 1.53f, 0.53f, 3.26f)
                curveToRelative(0.08f, 0.82f, -0.52f, 1.56f, -1.35f, 1.64f)
                curveToRelative(-0.81f, 0.08f, -1.56f, -0.52f, -1.64f, -1.35f)
                curveToRelative(-0.07f, -0.77f, -0.19f, -1.48f, -0.29f, -2.0f)
                curveToRelative(-0.9f, -0.21f, -2.63f, -0.52f, -5.22f, -0.61f)
                close()
                moveTo(22f, 18f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.8f, 0.03f, 1.3f, -0.98f, 0.8f, -1.6f)
                curveToRelative(-0.91f, -1.21f, -1.99f, -2.29f, -3.2f, -3.2f)
                curveToRelative(-0.36f, -0.27f, -0.84f, -0.27f, -1.2f, 0f)
                curveToRelative(-1.21f, 0.91f, -2.29f, 1.98f, -3.2f, 3.2f)
                curveToRelative(-0.5f, 0.62f, 0f, 1.63f, 0.8f, 1.6f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.8f, -0.03f, -1.3f, 0.98f, -0.8f, 1.6f)
                curveToRelative(0.91f, 1.22f, 1.99f, 2.29f, 3.2f, 3.2f)
                curveToRelative(0.35f, 0.27f, 0.84f, 0.27f, 1.2f, 0f)
                curveToRelative(1.21f, -0.91f, 2.29f, -1.99f, 3.2f, -3.2f)
                curveToRelative(0.5f, -0.62f, -0.0f, -1.63f, -0.8f, -1.6f)
                close()
            }
        }.also { _TextHeight = it}

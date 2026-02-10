package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleNodes: ImageVector? = null

val Icons.Br.CircleNodes: ImageVector
    get() = _CircleNodes ?: UXIcon(name = "CircleNodes") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 4f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            reflectiveCurveTo(17.79f, 0f, 20f, 0f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            close()
            moveTo(16f, 16f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
            moveTo(4f, 5f)
            curveTo(1.79f, 5f, 0f, 6.79f, 0f, 9f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
            moveTo(11.76f, 14.08f)
            lineToRelative(-1.5f, -1.38f)
            curveToRelative(-0.61f, -0.56f, -1.56f, -0.52f, -2.12f, 0.09f)
            curveToRelative(-0.56f, 0.61f, -0.52f, 1.56f, 0.09f, 2.12f)
            lineToRelative(1.5f, 1.38f)
            curveToRelative(0.29f, 0.27f, 0.65f, 0.4f, 1.01f, 0.4f)
            curveToRelative(0.41f, 0f, 0.81f, -0.16f, 1.1f, -0.49f)
            curveToRelative(0.56f, -0.61f, 0.52f, -1.56f, -0.09f, -2.12f)
            close()
            moveTo(17.75f, 14.5f)
            curveToRelative(0.67f, 0f, 1.28f, -0.46f, 1.45f, -1.14f)
            lineToRelative(0.5f, -2f)
            curveToRelative(0.2f, -0.8f, -0.29f, -1.62f, -1.09f, -1.82f)
            curveToRelative(-0.81f, -0.2f, -1.62f, 0.29f, -1.82f, 1.09f)
            lineToRelative(-0.5f, 2f)
            curveToRelative(-0.2f, 0.8f, 0.29f, 1.62f, 1.09f, 1.82f)
            curveToRelative(0.12f, 0.03f, 0.24f, 0.04f, 0.36f, 0.04f)
            close()
            moveTo(10.9f, 8.34f)
            curveToRelative(0.15f, 0f, 0.3f, -0.02f, 0.45f, -0.07f)
            lineToRelative(2.2f, -0.69f)
            curveToRelative(0.79f, -0.25f, 1.23f, -1.09f, 0.98f, -1.88f)
            curveToRelative(-0.25f, -0.79f, -1.09f, -1.23f, -1.88f, -0.98f)
            lineToRelative(-2.2f, 0.69f)
            curveToRelative(-0.79f, 0.25f, -1.23f, 1.09f, -0.98f, 1.88f)
            curveToRelative(0.2f, 0.64f, 0.79f, 1.05f, 1.43f, 1.05f)
            close()
        }
    }.also { _CircleNodes = it }

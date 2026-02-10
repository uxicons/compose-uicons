package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleW: ImageVector? = null

val Icons.Sr.CircleW: ImageVector
    get() = _CircleW ?: UXIcon(name = "CircleW") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(17.06f, 16.1f)
                curveToRelative(-0.2f, 1.07f, -0.97f, 1.8f, -1.95f, 1.89f)
                curveToRelative(-0.06f, 0.01f, -0.12f, 0.01f, -0.19f, 0.01f)
                curveToRelative(-0.92f, 0f, -1.73f, -0.58f, -2.07f, -1.5f)
                lineToRelative(-0.87f, -2.49f)
                lineToRelative(-0.89f, 2.48f)
                curveToRelative(-0.36f, 0.98f, -1.25f, 1.6f, -2.24f, 1.5f)
                curveToRelative(-0.96f, -0.08f, -1.73f, -0.81f, -1.92f, -1.81f)
                lineToRelative(-0.94f, -8.82f)
                curveToRelative(-0.06f, -0.55f, 0.34f, -1.04f, 0.89f, -1.1f)
                curveToRelative(0.55f, -0.06f, 1.04f, 0.34f, 1.1f, 0.89f)
                lineToRelative(0.93f, 8.74f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0.04f, 0.1f, 0.11f, 0.11f)
                curveToRelative(0.08f, 0.0f, 0.14f, -0.06f, 0.19f, -0.19f)
                lineToRelative(1.84f, -5.14f)
                curveToRelative(0.14f, -0.4f, 0.52f, -0.66f, 0.94f, -0.66f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.42f, 0.0f, 0.8f, 0.27f, 0.94f, 0.67f)
                lineToRelative(1.79f, 5.15f)
                curveToRelative(0.04f, 0.11f, 0.12f, 0.17f, 0.2f, 0.17f)
                curveToRelative(0.03f, -0.0f, 0.11f, -0.01f, 0.14f, -0.18f)
                lineToRelative(0.92f, -8.67f)
                curveToRelative(0.06f, -0.55f, 0.54f, -0.95f, 1.1f, -0.89f)
                curveToRelative(0.55f, 0.06f, 0.95f, 0.55f, 0.89f, 1.1f)
                lineToRelative(-0.93f, 8.74f)
                close()
            }
        }.also { _CircleW = it}

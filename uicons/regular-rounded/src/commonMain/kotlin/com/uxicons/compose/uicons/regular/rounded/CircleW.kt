package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleW: ImageVector? = null

val Icons.Rr.CircleW: ImageVector
    get() = _CircleW ?: UXIcon(name = "CircleW") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.04f, 0.02f)
                curveTo(5.42f, 0.02f, 0.04f, 5.4f, 0.04f, 12.02f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.66f, 0.02f, 12.04f, 0.02f)
                close()
                moveTo(12.04f, 22.02f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.52f, 2.02f, 12.04f, 2.02f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(18.03f, 7.38f)
                lineToRelative(-0.93f, 8.74f)
                curveToRelative(-0.2f, 1.08f, -0.95f, 1.9f, -2.13f, 1.9f)
                curveToRelative(-0.92f, 0f, -1.73f, -0.58f, -2.07f, -1.5f)
                lineToRelative(-0.87f, -2.49f)
                lineToRelative(-0.89f, 2.48f)
                curveToRelative(-0.36f, 0.98f, -1.25f, 1.59f, -2.24f, 1.5f)
                curveToRelative(-0.96f, -0.08f, -1.73f, -0.81f, -1.91f, -1.81f)
                lineToRelative(-0.94f, -8.82f)
                curveToRelative(-0.06f, -0.55f, 0.34f, -1.04f, 0.89f, -1.1f)
                curveToRelative(0.55f, -0.06f, 1.04f, 0.34f, 1.1f, 0.89f)
                lineToRelative(0.93f, 8.74f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0.04f, 0.1f, 0.11f, 0.11f)
                curveToRelative(0.07f, 0.01f, 0.14f, -0.06f, 0.19f, -0.19f)
                lineToRelative(1.84f, -5.14f)
                curveToRelative(0.14f, -0.4f, 0.52f, -0.66f, 0.94f, -0.66f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.42f, 0.0f, 0.8f, 0.27f, 0.94f, 0.67f)
                lineToRelative(1.79f, 5.15f)
                curveToRelative(0.04f, 0.11f, 0.11f, 0.19f, 0.2f, 0.17f)
                curveToRelative(0.03f, -0.0f, 0.11f, -0.01f, 0.14f, -0.18f)
                lineToRelative(0.92f, -8.67f)
                curveToRelative(0.06f, -0.55f, 0.55f, -0.95f, 1.1f, -0.89f)
                curveToRelative(0.55f, 0.06f, 0.95f, 0.55f, 0.89f, 1.1f)
                close()
            }
        }.also { _CircleW = it}

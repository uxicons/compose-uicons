package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PageBreak: ImageVector? = null

val Icons.Sc.PageBreak: ImageVector
    get() = _PageBreak ?: UXIcon(name = "PageBreak") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.54f, 6.76f)
                curveToRelative(-0.06f, -0.13f, -0.14f, -0.25f, -0.25f, -0.34f)
                lineToRelative(-5.65f, -4.93f)
                curveToRelative(-0.2f, -0.18f, -0.5f, -0.23f, -0.52f, -0.24f)
                curveToRelative(-0.12f, 2.66f, 0.04f, 4.47f, 0.17f, 5.37f)
                curveToRelative(1.19f, 0.15f, 3.71f, 0.38f, 6.25f, 0.14f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.0f, -0.17f, 0.0f, -0.33f, 0.0f, -0.5f)
                curveToRelative(0f, -1.1f, -0.06f, -2.31f, -0.15f, -3.26f)
                curveToRelative(-0.9f, 0.09f, -1.8f, 0.12f, -2.64f, 0.12f)
                curveToRelative(-2.68f, 0f, -4.82f, -0.35f, -4.94f, -0.37f)
                curveToRelative(-0.4f, -0.07f, -0.72f, -0.36f, -0.81f, -0.76f)
                curveToRelative(-0.02f, -0.1f, -0.67f, -2.38f, -0.46f, -6.74f)
                curveToRelative(-0.32f, -0.02f, -0.65f, 0f, -1f, 0f)
                curveToRelative(-4.38f, 0f, -7.99f, 0.77f, -8.15f, 0.81f)
                curveToRelative(-0.37f, 0.08f, -0.66f, 0.35f, -0.76f, 0.72f)
                curveToRelative(-0.04f, 0.16f, -1.09f, 4.26f, -1.09f, 9.47f)
                curveToRelative(0f, 0.17f, 0.0f, 0.34f, 0.0f, 0.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3.92f)
                curveToRelative(0.24f, 3.89f, 0.98f, 6.45f, 1.01f, 6.59f)
                curveToRelative(0.09f, 0.33f, 0.34f, 0.59f, 0.66f, 0.69f)
                curveToRelative(0.16f, 0.05f, 3.8f, 1.22f, 8.24f, 1.22f)
                reflectiveCurveToRelative(8.32f, -1.17f, 8.48f, -1.22f)
                curveToRelative(0.35f, -0.11f, 0.6f, -0.4f, 0.68f, -0.75f)
                curveToRelative(0.03f, -0.14f, 0.59f, -2.7f, 0.78f, -6.53f)
                horizontalLineToRelative(-3.94f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(14f, 14.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _PageBreak = it}

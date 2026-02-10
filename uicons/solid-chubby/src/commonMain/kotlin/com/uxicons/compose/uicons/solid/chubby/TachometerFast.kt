package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerFast: ImageVector? = null

val Icons.Sc.TachometerFast: ImageVector
    get() = _TachometerFast ?: UXIcon(name = "TachometerFast") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.99f)
                curveTo(6.88f, 1.99f, 1f, 3.24f, 1f, 12.99f)
                curveToRelative(0f, 2.45f, 0.37f, 4.79f, 1.03f, 6.58f)
                curveToRelative(0.35f, 0.96f, 1.1f, 1.74f, 2.04f, 2.14f)
                curveToRelative(0.94f, 0.4f, 1.98f, 0.39f, 2.92f, -0.02f)
                lineToRelative(1.9f, -0.84f)
                horizontalLineToRelative(6.24f)
                lineToRelative(1.88f, 0.83f)
                curveToRelative(1.49f, 0.61f, 2.46f, 0.22f, 2.92f, 0.03f)
                curveToRelative(0.94f, -0.4f, 1.68f, -1.17f, 2.04f, -2.13f)
                curveToRelative(0.67f, -1.8f, 1.04f, -4.14f, 1.04f, -6.59f)
                curveTo(23f, 3.24f, 17.12f, 1.99f, 12f, 1.99f)
                close()
                moveTo(16.69f, 10.15f)
                lineToRelative(-2.59f, 2.52f)
                curveToRelative(0.07f, 0.21f, 0.11f, 0.44f, 0.11f, 0.68f)
                curveToRelative(0f, 1.22f, -0.99f, 2.21f, -2.21f, 2.21f)
                reflectiveCurveToRelative(-2.21f, -0.99f, -2.21f, -2.21f)
                reflectiveCurveToRelative(0.99f, -2.21f, 2.21f, -2.21f)
                curveToRelative(0.24f, 0f, 0.48f, 0.04f, 0.7f, 0.11f)
                lineToRelative(2.6f, -2.54f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.38f, 1.41f, 0.02f)
                curveToRelative(0.39f, 0.4f, 0.38f, 1.03f, -0.02f, 1.41f)
                close()
            }
        }.also { _TachometerFast = it}

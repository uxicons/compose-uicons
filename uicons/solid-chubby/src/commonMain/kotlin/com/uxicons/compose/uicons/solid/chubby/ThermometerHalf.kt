package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThermometerHalf: ImageVector? = null

val Icons.Sc.ThermometerHalf: ImageVector
    get() = _ThermometerHalf ?: UXIcon(name = "ThermometerHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.32f, 10.1f)
                curveToRelative(-0.01f, -1.73f, -0.04f, -4.56f, -0.08f, -5.2f)
                curveToRelative(-0.14f, -2.19f, -2.0f, -3.9f, -4.24f, -3.9f)
                reflectiveCurveToRelative(-4.1f, 1.71f, -4.24f, 3.9f)
                curveToRelative(-0.04f, 0.64f, -0.07f, 3.5f, -0.08f, 5.2f)
                curveToRelative(-1.78f, 1.07f, -2.65f, 3.03f, -2.65f, 5.97f)
                curveToRelative(0f, 6.21f, 3.98f, 6.93f, 6.97f, 6.93f)
                reflectiveCurveToRelative(6.97f, -0.72f, 6.97f, -6.93f)
                curveToRelative(0f, -2.94f, -0.87f, -4.9f, -2.65f, -5.97f)
                close()
                moveTo(12f, 19.01f)
                curveToRelative(-1.63f, 0f, -2.95f, -1.32f, -2.95f, -2.94f)
                curveToRelative(0f, -1.27f, 0.82f, -2.36f, 1.95f, -2.77f)
                verticalLineToRelative(-4.44f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4.44f)
                curveToRelative(1.14f, 0.41f, 1.96f, 1.5f, 1.96f, 2.77f)
                curveToRelative(0f, 1.62f, -1.32f, 2.94f, -2.96f, 2.94f)
                close()
            }
        }.also { _ThermometerHalf = it}

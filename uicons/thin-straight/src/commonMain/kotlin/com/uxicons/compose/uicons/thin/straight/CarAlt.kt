package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarAlt: ImageVector? = null

val Icons.Ts.CarAlt: ImageVector
    get() = _CarAlt ?: UXIcon(name = "CarAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 16f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(19f, 15f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                lineTo(7f, 20f)
                verticalLineToRelative(3f)
                lineTo(2f, 23f)
                verticalLineToRelative(-3f)
                lineTo(0f, 20f)
                lineTo(0f, 8f)
                lineTo(1.59f, 8f)
                curveToRelative(0.91f, -1.95f, 1.89f, -3.64f, 2.93f, -5.05f)
                curveToRelative(0.44f, -0.6f, 1.1f, -1.04f, 1.85f, -1.25f)
                curveToRelative(1.19f, -0.32f, 3.12f, -0.7f, 5.63f, -0.7f)
                reflectiveCurveToRelative(4.45f, 0.38f, 5.63f, 0.7f)
                curveToRelative(0.75f, 0.2f, 1.4f, 0.64f, 1.85f, 1.25f)
                curveToRelative(1.04f, 1.41f, 2.02f, 3.1f, 2.93f, 5.05f)
                horizontalLineToRelative(1.59f)
                verticalLineToRelative(12f)
                close()
                moveTo(1.06f, 11.91f)
                curveToRelative(1.77f, -0.25f, 6.87f, -0.91f, 10.94f, -0.91f)
                reflectiveCurveToRelative(9.17f, 0.66f, 10.94f, 0.91f)
                curveToRelative(-1.25f, -3.42f, -2.68f, -6.23f, -4.26f, -8.37f)
                curveToRelative(-0.31f, -0.42f, -0.77f, -0.73f, -1.3f, -0.87f)
                curveToRelative(-1.12f, -0.3f, -2.97f, -0.67f, -5.37f, -0.67f)
                reflectiveCurveToRelative(-4.25f, 0.36f, -5.37f, 0.67f)
                curveToRelative(-0.53f, 0.14f, -0.99f, 0.45f, -1.3f, 0.87f)
                curveToRelative(-1.58f, 2.14f, -3.02f, 4.96f, -4.26f, 8.37f)
                close()
                moveTo(6f, 20f)
                lineTo(3f, 20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21f, 20f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(23f, 19f)
                verticalLineToRelative(-6.07f)
                curveToRelative(-1.52f, -0.22f, -6.82f, -0.93f, -11f, -0.93f)
                reflectiveCurveToRelative(-9.48f, 0.71f, -11f, 0.93f)
                verticalLineToRelative(6.07f)
                lineTo(23f, 19f)
                close()
            }
        }.also { _CarAlt = it}

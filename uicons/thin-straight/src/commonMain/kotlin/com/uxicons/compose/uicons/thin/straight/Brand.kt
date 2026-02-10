package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Brand: ImageVector? = null

val Icons.Ts.Brand: ImageVector
    get() = _Brand ?: UXIcon(name = "Brand") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.25f, 16.97f)
                lineToRelative(3.92f, 3.91f)
                lineToRelative(5.68f, -5.77f)
                lineToRelative(-3.94f, -3.94f)
                lineToRelative(-5.67f, 5.8f)
                close()
                moveTo(19.45f, 15.11f)
                lineToRelative(-4.28f, 4.35f)
                lineToRelative(-2.51f, -2.5f)
                lineToRelative(4.27f, -4.37f)
                lineToRelative(2.52f, 2.52f)
                close()
                moveTo(23.36f, 13.65f)
                lineTo(12.17f, 2.46f)
                lineToRelative(-8f, 1f)
                lineTo(0.72f, 0.01f)
                lineTo(0.01f, 0.71f)
                lineToRelative(3.46f, 3.46f)
                lineToRelative(-0.93f, 8.14f)
                lineToRelative(11.04f, 11.01f)
                curveToRelative(0.45f, 0.45f, 1.05f, 0.68f, 1.64f, 0.68f)
                curveToRelative(0.6f, 0f, 1.21f, -0.23f, 1.67f, -0.69f)
                lineToRelative(6.5f, -6.64f)
                curveToRelative(0.82f, -0.83f, 0.81f, -2.19f, -0.02f, -3.01f)
                close()
                moveTo(22.67f, 15.96f)
                lineToRelative(-6.49f, 6.64f)
                curveToRelative(-0.52f, 0.52f, -1.38f, 0.52f, -1.9f, 0.01f)
                lineTo(3.59f, 11.94f)
                lineToRelative(0.78f, -6.87f)
                lineToRelative(1.9f, 1.9f)
                curveToRelative(-0.18f, 0.3f, -0.28f, 0.64f, -0.28f, 1.01f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                curveToRelative(-0.37f, 0f, -0.71f, 0.11f, -1.01f, 0.28f)
                lineToRelative(-1.91f, -1.91f)
                lineToRelative(6.74f, -0.84f)
                lineToRelative(10.85f, 10.84f)
                curveToRelative(0.44f, 0.44f, 0.45f, 1.16f, 0.01f, 1.6f)
                close()
                moveTo(7.99f, 6.99f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
            }
        }.also { _Brand = it}

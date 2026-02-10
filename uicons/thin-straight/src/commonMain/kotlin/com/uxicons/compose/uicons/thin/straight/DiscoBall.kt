package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiscoBall: ImageVector? = null

val Icons.Ts.DiscoBall: ImageVector
    get() = _DiscoBall ?: UXIcon(name = "DiscoBall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 4.01f)
                lineTo(12.5f, 1f)
                horizontalLineToRelative(3.5f)
                lineTo(16f, 0f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.01f)
                curveToRelative(-5.28f, 0.26f, -9.5f, 4.64f, -9.5f, 9.99f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                curveToRelative(0f, -5.35f, -4.22f, -9.73f, -9.5f, -9.99f)
                close()
                moveTo(9f, 11.18f)
                curveToRelative(0.92f, -0.12f, 1.93f, -0.18f, 3f, -0.18f)
                reflectiveCurveToRelative(2.08f, 0.07f, 3f, 0.18f)
                verticalLineToRelative(5.64f)
                curveToRelative(-0.92f, 0.12f, -1.93f, 0.18f, -3f, 0.18f)
                reflectiveCurveToRelative(-2.08f, -0.07f, -3f, -0.18f)
                verticalLineToRelative(-5.64f)
                close()
                moveTo(8f, 16.67f)
                curveToRelative(-3.07f, -0.54f, -5f, -1.65f, -5f, -2.67f)
                reflectiveCurveToRelative(1.93f, -2.13f, 5f, -2.67f)
                verticalLineToRelative(5.34f)
                close()
                moveTo(9f, 10.18f)
                verticalLineToRelative(-4.66f)
                curveToRelative(0.94f, -0.33f, 1.95f, -0.52f, 3f, -0.52f)
                reflectiveCurveToRelative(2.06f, 0.18f, 3f, 0.52f)
                verticalLineToRelative(4.66f)
                curveToRelative(-0.98f, -0.12f, -2.0f, -0.18f, -3f, -0.18f)
                reflectiveCurveToRelative(-2.02f, 0.06f, -3f, 0.18f)
                close()
                moveTo(16f, 11.33f)
                curveToRelative(3.07f, 0.54f, 5f, 1.65f, 5f, 2.67f)
                reflectiveCurveToRelative(-1.93f, 2.13f, -5f, 2.67f)
                verticalLineToRelative(-5.34f)
                close()
                moveTo(20.78f, 12.01f)
                curveToRelative(-1.1f, -0.79f, -2.83f, -1.36f, -4.78f, -1.68f)
                verticalLineToRelative(-4.38f)
                curveToRelative(2.38f, 1.19f, 4.17f, 3.4f, 4.78f, 6.07f)
                close()
                moveTo(8f, 5.94f)
                verticalLineToRelative(4.38f)
                curveToRelative(-1.95f, 0.32f, -3.68f, 0.89f, -4.78f, 1.68f)
                curveToRelative(0.6f, -2.66f, 2.39f, -4.88f, 4.78f, -6.07f)
                close()
                moveTo(3.22f, 15.99f)
                curveToRelative(1.1f, 0.79f, 2.83f, 1.36f, 4.78f, 1.68f)
                verticalLineToRelative(4.38f)
                curveToRelative(-2.38f, -1.19f, -4.17f, -3.4f, -4.78f, -6.07f)
                close()
                moveTo(9f, 22.48f)
                verticalLineToRelative(-4.66f)
                curveToRelative(0.98f, 0.12f, 2.0f, 0.18f, 3f, 0.18f)
                reflectiveCurveToRelative(2.02f, -0.06f, 3f, -0.18f)
                verticalLineToRelative(4.66f)
                curveToRelative(-0.94f, 0.33f, -1.95f, 0.52f, -3f, 0.52f)
                reflectiveCurveToRelative(-2.06f, -0.18f, -3f, -0.52f)
                close()
                moveTo(16f, 22.06f)
                verticalLineToRelative(-4.38f)
                curveToRelative(1.95f, -0.32f, 3.68f, -0.89f, 4.78f, -1.68f)
                curveToRelative(-0.6f, 2.66f, -2.39f, 4.88f, -4.78f, 6.07f)
                close()
            }
        }.also { _DiscoBall = it}

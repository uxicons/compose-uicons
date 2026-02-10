package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldCat: ImageVector? = null

val Icons.Ts.ShieldCat: ImageVector
    get() = _ShieldCat ?: UXIcon(name = "ShieldCat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 11f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(14f, 10f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(22f, 5.23f)
                verticalLineToRelative(6.65f)
                curveToRelative(0f, 7.5f, -7.17f, 10.97f, -9.37f, 11.85f)
                lineToRelative(-0.65f, 0.26f)
                lineToRelative(-0.63f, -0.31f)
                curveToRelative(-2.19f, -1.1f, -9.35f, -5.19f, -9.35f, -11.8f)
                verticalLineToRelative(-6.65f)
                curveToRelative(0f, -1.12f, 0.72f, -2.12f, 1.79f, -2.47f)
                lineTo(12f, 0.03f)
                lineToRelative(8.21f, 2.72f)
                curveToRelative(1.07f, 0.35f, 1.79f, 1.35f, 1.79f, 2.47f)
                close()
                moveTo(21f, 5.23f)
                curveToRelative(0f, -0.69f, -0.44f, -1.3f, -1.1f, -1.52f)
                lineToRelative(-7.9f, -2.62f)
                lineToRelative(-7.9f, 2.62f)
                curveToRelative(-0.66f, 0.22f, -1.1f, 0.83f, -1.1f, 1.52f)
                verticalLineToRelative(6.65f)
                curveToRelative(0f, 6.04f, 6.96f, 9.98f, 9.02f, 11.02f)
                curveToRelative(2.05f, -0.82f, 8.98f, -4.14f, 8.98f, -11.02f)
                verticalLineToRelative(-6.65f)
                close()
                moveTo(16.99f, 6.97f)
                curveToRelative(0.01f, 3.15f, 0f, 5.06f, 0f, 5.06f)
                curveToRelative(0f, 2.75f, -2.24f, 4.99f, -4.99f, 4.99f)
                reflectiveCurveToRelative(-4.99f, -2.24f, -4.99f, -4.99f)
                curveToRelative(0f, 0f, -0.01f, -1.9f, 0f, -5.06f)
                lineToRelative(0.0f, -0.85f)
                lineToRelative(2.69f, 1.49f)
                curveToRelative(1.45f, -0.76f, 3.17f, -0.76f, 4.61f, 0f)
                lineToRelative(2.69f, -1.49f)
                lineToRelative(0.0f, 0.85f)
                close()
                moveTo(15.99f, 7.83f)
                lineToRelative(-1.7f, 0.94f)
                lineToRelative(-0.25f, -0.15f)
                curveToRelative(-1.28f, -0.77f, -2.81f, -0.77f, -4.09f, 0f)
                lineToRelative(-0.25f, 0.15f)
                lineToRelative(-1.7f, -0.94f)
                curveToRelative(-0.0f, 1.43f, 0.0f, 4.21f, 0.0f, 4.21f)
                curveToRelative(0f, 2.2f, 1.79f, 3.99f, 3.99f, 3.99f)
                reflectiveCurveToRelative(3.99f, -1.79f, 3.99f, -3.99f)
                curveToRelative(0f, 0f, 0.01f, -2.78f, 0.0f, -4.21f)
                close()
            }
        }.also { _ShieldCat = it}

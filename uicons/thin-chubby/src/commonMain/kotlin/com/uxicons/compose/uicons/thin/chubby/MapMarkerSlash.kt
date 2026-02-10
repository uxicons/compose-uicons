package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerSlash: ImageVector? = null

val Icons.Tc.MapMarkerSlash: ImageVector
    get() = _MapMarkerSlash ?: UXIcon(name = "MapMarkerSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.85f, 22.15f)
                lineToRelative(-4.2f, -4.2f)
                curveToRelative(2.22f, -2.38f, 3.35f, -4.71f, 3.35f, -6.94f)
                curveToRelative(0f, -5.33f, -4.67f, -10f, -10f, -10f)
                curveToRelative(-2.54f, 0f, -5.19f, 1.18f, -7.13f, 3.16f)
                lineToRelative(-3.01f, -3.01f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(21.0f, 21.0f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(12f, 2f)
                curveToRelative(4.25f, 0f, 9f, 3.85f, 9f, 9f)
                curveToRelative(0f, 1.96f, -1.03f, 4.06f, -3.06f, 6.24f)
                lineToRelative(-12.37f, -12.37f)
                curveToRelative(1.76f, -1.8f, 4.14f, -2.87f, 6.42f, -2.87f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.93f, 19.13f)
                curveToRelative(-1.7f, 1.43f, -3.33f, 2.44f, -3.93f, 2.79f)
                curveToRelative(-1.46f, -0.85f, -9.0f, -5.54f, -9.0f, -10.92f)
                curveToRelative(0f, -1.31f, 0.31f, -2.54f, 0.94f, -3.77f)
                curveToRelative(0.13f, -0.25f, 0.03f, -0.55f, -0.21f, -0.67f)
                curveToRelative(-0.24f, -0.13f, -0.55f, -0.03f, -0.67f, 0.21f)
                curveToRelative(-0.71f, 1.38f, -1.06f, 2.76f, -1.06f, 4.23f)
                curveToRelative(0f, 6.52f, 9.36f, 11.72f, 9.76f, 11.94f)
                curveToRelative(0.07f, 0.04f, 0.16f, 0.06f, 0.24f, 0.06f)
                reflectiveCurveToRelative(0.17f, -0.02f, 0.24f, -0.06f)
                curveToRelative(0.09f, -0.05f, 2.12f, -1.18f, 4.33f, -3.04f)
                curveToRelative(0.21f, -0.18f, 0.24f, -0.49f, 0.06f, -0.7f)
                curveToRelative(-0.18f, -0.21f, -0.49f, -0.24f, -0.7f, -0.06f)
                close()
            }
        }.also { _MapMarkerSlash = it}

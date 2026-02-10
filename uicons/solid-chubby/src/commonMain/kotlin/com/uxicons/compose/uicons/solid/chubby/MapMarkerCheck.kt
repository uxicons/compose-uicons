package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerCheck: ImageVector? = null

val Icons.Sc.MapMarkerCheck: ImageVector
    get() = _MapMarkerCheck ?: UXIcon(name = "MapMarkerCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-5.33f, 0f, -10f, 4.67f, -10f, 10f)
                curveToRelative(0f, 6.51f, 9.13f, 11.66f, 9.51f, 11.87f)
                curveToRelative(0.15f, 0.08f, 0.32f, 0.13f, 0.49f, 0.13f)
                reflectiveCurveToRelative(0.33f, -0.04f, 0.49f, -0.13f)
                curveToRelative(0.39f, -0.22f, 9.51f, -5.36f, 9.51f, -11.87f)
                curveToRelative(0f, -5.33f, -4.67f, -10f, -10f, -10f)
                close()
                moveTo(16.89f, 9.46f)
                curveToRelative(-2.09f, 4.05f, -5.38f, 5.41f, -5.51f, 5.47f)
                curveToRelative(-0.12f, 0.05f, -0.25f, 0.07f, -0.37f, 0.07f)
                curveToRelative(-0.22f, 0f, -0.44f, -0.07f, -0.62f, -0.22f)
                curveToRelative(-0.08f, -0.07f, -2.04f, -1.63f, -3.19f, -3.19f)
                curveToRelative(-0.33f, -0.45f, -0.23f, -1.07f, 0.22f, -1.4f)
                curveToRelative(0.45f, -0.33f, 1.07f, -0.23f, 1.4f, 0.22f)
                curveToRelative(0.67f, 0.91f, 1.72f, 1.87f, 2.33f, 2.4f)
                curveToRelative(0.88f, -0.51f, 2.7f, -1.79f, 3.98f, -4.27f)
                curveToRelative(0.25f, -0.49f, 0.86f, -0.68f, 1.35f, -0.43f)
                curveToRelative(0.49f, 0.25f, 0.68f, 0.86f, 0.43f, 1.35f)
                close()
            }
        }.also { _MapMarkerCheck = it}

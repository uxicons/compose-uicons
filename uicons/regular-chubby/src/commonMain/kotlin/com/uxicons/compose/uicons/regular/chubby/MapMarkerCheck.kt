package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerCheck: ImageVector? = null

val Icons.Rc.MapMarkerCheck: ImageVector
    get() = _MapMarkerCheck ?: UXIcon(name = "MapMarkerCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.46f, 8.11f)
                curveToRelative(-0.49f, -0.25f, -1.09f, -0.06f, -1.35f, 0.43f)
                curveToRelative(-1.28f, 2.48f, -3.1f, 3.76f, -3.98f, 4.27f)
                curveToRelative(-0.61f, -0.53f, -1.66f, -1.49f, -2.33f, -2.4f)
                curveToRelative(-0.33f, -0.45f, -0.95f, -0.54f, -1.4f, -0.22f)
                curveToRelative(-0.45f, 0.33f, -0.54f, 0.95f, -0.22f, 1.4f)
                curveToRelative(1.14f, 1.56f, 3.1f, 3.13f, 3.19f, 3.19f)
                curveToRelative(0.18f, 0.14f, 0.4f, 0.22f, 0.62f, 0.22f)
                curveToRelative(0.13f, 0f, 0.25f, -0.02f, 0.37f, -0.07f)
                curveToRelative(0.14f, -0.06f, 3.43f, -1.42f, 5.51f, -5.47f)
                curveToRelative(0.25f, -0.49f, 0.06f, -1.09f, -0.43f, -1.35f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-5.33f, 0f, -10f, 4.67f, -10f, 10f)
                curveToRelative(0f, 6.51f, 9.13f, 11.66f, 9.51f, 11.87f)
                curveToRelative(0.15f, 0.08f, 0.32f, 0.13f, 0.49f, 0.13f)
                reflectiveCurveToRelative(0.33f, -0.04f, 0.49f, -0.13f)
                curveToRelative(0.39f, -0.22f, 9.51f, -5.36f, 9.51f, -11.87f)
                curveToRelative(0f, -5.33f, -4.67f, -10f, -10f, -10f)
                close()
                moveTo(12f, 20.84f)
                curveToRelative(-1.8f, -1.11f, -8f, -5.25f, -8f, -9.84f)
                reflectiveCurveToRelative(4.22f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.42f, 8f, 8f)
                reflectiveCurveToRelative(-6.2f, 8.73f, -8f, 9.84f)
                close()
            }
        }.also { _MapMarkerCheck = it}

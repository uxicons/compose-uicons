package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerMinus: ImageVector? = null

val Icons.Tc.MapMarkerMinus: ImageVector
    get() = _MapMarkerMinus ?: UXIcon(name = "MapMarkerMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1f)
                curveTo(7.18f, 1.06f, 2.35f, 5.79f, 2.35f, 10.37f)
                curveToRelative(0f, 6.31f, 9f, 12.3f, 9.38f, 12.55f)
                curveToRelative(0.08f, 0.05f, 0.18f, 0.08f, 0.27f, 0.08f)
                curveToRelative(0.1f, 0f, 0.2f, -0.03f, 0.28f, -0.09f)
                curveToRelative(0.38f, -0.26f, 9.26f, -6.4f, 9.37f, -12.57f)
                curveToRelative(-0.15f, -4.74f, -4.83f, -9.28f, -9.66f, -9.34f)
                close()
                moveTo(11.99f, 21.89f)
                curveToRelative(-1.5f, -1.04f, -8.54f, -6.22f, -8.64f, -11.53f)
                curveTo(3.49f, 6.2f, 7.77f, 2.06f, 11.99f, 2f)
                curveToRelative(4.24f, 0.06f, 8.53f, 4.21f, 8.66f, 8.35f)
                curveToRelative(-0.09f, 5.06f, -7.16f, 10.46f, -8.66f, 11.54f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.56f, 10.03f)
                horizontalLineToRelative(-5.13f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(5.13f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _MapMarkerMinus = it}

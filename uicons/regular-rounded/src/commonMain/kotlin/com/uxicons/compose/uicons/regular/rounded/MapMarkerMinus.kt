package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerMinus: ImageVector? = null

val Icons.Rr.MapMarkerMinus: ImageVector
    get() = _MapMarkerMinus ?: UXIcon(name = "MapMarkerMinus", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(174.38f, 479.02f)
                curveToRelative(44.88f, 43.91f, 116.57f, 44.09f, 161.67f, 0.41f)
                lineToRelative(85f, -78.55f)
                curveToRelative(92.08f, -90.85f, 93.07f, -239.15f, 2.22f, -331.23f)
                reflectiveCurveToRelative(-239.15f, -93.07f, -331.23f, -2.22f)
                curveToRelative(-0.75f, 0.74f, -1.49f, 1.48f, -2.22f, 2.22f)
                curveToRelative(-91.46f, 91.47f, -91.45f, 239.77f, 0.03f, 331.23f)
                curveToRelative(0.19f, 0.19f, 0.38f, 0.38f, 0.57f, 0.57f)
                lineTo(174.38f, 479.02f)
                close()
                moveTo(119.93f, 99.75f)
                curveToRelative(74.67f, -75.01f, 196.01f, -75.28f, 271.02f, -0.61f)
                reflectiveCurveToRelative(75.28f, 196.01f, 0.61f, 271.02f)
                lineToRelative(-84.85f, 78.4f)
                curveToRelative(-28.98f, 27.27f, -74.22f, 27.1f, -102.99f, -0.38f)
                lineToRelative(-83.79f, -77.42f)
                curveToRelative(-74.84f, -74.84f, -74.84f, -196.17f, -0f, -271.01f)
                curveTo(119.93f, 99.76f, 119.93f, 99.76f, 119.93f, 99.75f)
                lineTo(119.93f, 99.75f)
                close()
                moveTo(148.97f, 235.26f)
                curveToRelative(0f, -11.76f, 9.53f, -21.29f, 21.29f, -21.29f)
                horizontalLineToRelative(170.34f)
                curveToRelative(11.76f, 0f, 21.29f, 9.53f, 21.29f, 21.29f)
                reflectiveCurveToRelative(-9.53f, 21.29f, -21.29f, 21.29f)
                horizontalLineToRelative(-170.34f)
                curveTo(158.51f, 256.55f, 148.97f, 247.02f, 148.97f, 235.26f)
                close()
            }
        }.also { _MapMarkerMinus = it}

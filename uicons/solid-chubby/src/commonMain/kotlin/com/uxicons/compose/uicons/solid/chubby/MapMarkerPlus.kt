package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerPlus: ImageVector? = null

val Icons.Sc.MapMarkerPlus: ImageVector
    get() = _MapMarkerPlus ?: UXIcon(name = "MapMarkerPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1.0f)
                curveTo(7.16f, 1.07f, 2.31f, 5.81f, 2.31f, 10.46f)
                curveToRelative(0f, 6.42f, 8.77f, 12.15f, 9.14f, 12.38f)
                curveToRelative(0.47f, 0.3f, 0.94f, 0.1f, 1.11f, -0.01f)
                curveToRelative(0.37f, -0.25f, 9.02f, -6.25f, 9.13f, -12.42f)
                curveToRelative(-0.15f, -4.77f, -4.85f, -9.34f, -9.71f, -9.41f)
                close()
                moveTo(14.44f, 11.6f)
                horizontalLineToRelative(-1.44f)
                verticalLineToRelative(1.44f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.44f)
                horizontalLineToRelative(-1.44f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.44f)
                verticalLineToRelative(-1.44f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.44f)
                horizontalLineToRelative(1.44f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _MapMarkerPlus = it}

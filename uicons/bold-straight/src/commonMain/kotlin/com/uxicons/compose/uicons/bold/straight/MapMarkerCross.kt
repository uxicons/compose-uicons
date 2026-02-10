package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerCross: ImageVector? = null

val Icons.Bs.MapMarkerCross: ImageVector
    get() = _MapMarkerCross ?: UXIcon(name = "MapMarkerCross", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(173.3f, 254.42f)
                lineToRelative(41.3f, -41.28f)
                lineToRelative(-41.3f, -41.28f)
                lineToRelative(45.17f, -45.17f)
                lineTo(259.74f, 168f)
                lineToRelative(41.28f, -41.3f)
                lineToRelative(45.17f, 45.17f)
                lineToRelative(-41.3f, 41.28f)
                lineToRelative(41.3f, 41.28f)
                lineToRelative(-45.17f, 45.17f)
                lineToRelative(-41.28f, -41.3f)
                lineToRelative(-41.28f, 41.3f)
                lineTo(173.3f, 254.42f)
                close()
                moveTo(106.82f, 365.37f)
                curveToRelative(-84.44f, -81.79f, -86.59f, -216.56f, -4.8f, -301f)
                reflectiveCurveToRelative(216.56f, -86.59f, 301f, -4.8f)
                curveToRelative(1.55f, 1.5f, 3.08f, 3.02f, 4.58f, 4.57f)
                curveToRelative(83.13f, 83.13f, 83.13f, 217.91f, 0f, 301.04f)
                lineTo(257.08f, 512.4f)
                lineTo(106.82f, 365.37f)
                close()
                moveTo(108.08f, 214.62f)
                curveToRelative(-0.1f, 39.54f, 15.61f, 77.48f, 43.64f, 105.37f)
                lineToRelative(105.37f, 103.05f)
                lineToRelative(105.6f, -103.3f)
                curveToRelative(58.06f, -58.32f, 57.84f, -152.67f, -0.48f, -210.73f)
                reflectiveCurveToRelative(-152.67f, -57.84f, -210.73f, 0.48f)
                curveTo(123.68f, 137.41f, 108.07f, 175.21f, 108.08f, 214.62f)
                lineTo(108.08f, 214.62f)
                close()
            }
        }.also { _MapMarkerCross = it}

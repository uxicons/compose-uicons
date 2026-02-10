package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerEdit: ImageVector? = null

val Icons.Bs.MapMarkerEdit: ImageVector
    get() = _MapMarkerEdit ?: UXIcon(name = "MapMarkerEdit") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.83f, 14f)
                horizontalLineToRelative(-2.83f)
                verticalLineToRelative(-2.83f)
                lineToRelative(4.59f, -4.59f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                lineToRelative(-4.59f, 4.59f)
                close()
                moveTo(19.07f, 17.07f)
                curveToRelative(1.89f, -1.89f, 2.93f, -4.4f, 2.93f, -7.07f)
                reflectiveCurveToRelative(-1.04f, -5.18f, -2.93f, -7.07f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.89f, -1.89f, -4.4f, -2.93f, -7.07f, -2.93f)
                reflectiveCurveTo(6.82f, 1.04f, 4.93f, 2.93f)
                curveToRelative(-3.9f, 3.9f, -3.9f, 10.24f, 0.01f, 14.15f)
                lineToRelative(7.06f, 6.9f)
                lineToRelative(7.07f, -6.92f)
                close()
                moveTo(16.95f, 5.05f)
                horizontalLineToRelative(0f)
                curveToRelative(1.32f, 1.32f, 2.05f, 3.08f, 2.05f, 4.95f)
                reflectiveCurveToRelative(-0.73f, 3.63f, -2.04f, 4.94f)
                lineToRelative(-4.96f, 4.85f)
                lineToRelative(-4.95f, -4.84f)
                curveToRelative(-2.73f, -2.73f, -2.73f, -7.17f, 0f, -9.9f)
                curveToRelative(1.32f, -1.32f, 3.08f, -2.05f, 4.95f, -2.05f)
                reflectiveCurveToRelative(3.63f, 0.73f, 4.95f, 2.05f)
                close()
            }
        }.also { _MapMarkerEdit = it}

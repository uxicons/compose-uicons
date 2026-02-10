package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TourVirtual: ImageVector? = null

val Icons.Ss.TourVirtual: ImageVector
    get() = _TourVirtual ?: UXIcon(name = "TourVirtual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.05f, 0f, 0f, 2.52f, 0f, 6f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.0f, 1.69f, 3.81f, 4.63f, 4.97f)
                lineToRelative(1.37f, 0.54f)
                verticalLineToRelative(-14.15f)
                lineToRelative(-0.63f, -0.25f)
                curveToRelative(-2.11f, -0.83f, -3.37f, -1.99f, -3.37f, -3.11f)
                curveToRelative(0f, -1.93f, 4.02f, -4f, 10f, -4f)
                reflectiveCurveToRelative(10f, 2.07f, 10f, 4f)
                curveToRelative(0f, 1.12f, -1.26f, 2.28f, -3.37f, 3.11f)
                lineToRelative(-0.63f, 0.25f)
                verticalLineToRelative(14.15f)
                lineToRelative(1.37f, -0.54f)
                curveToRelative(2.94f, -1.16f, 4.63f, -2.97f, 4.63f, -4.97f)
                lineTo(24f, 6f)
                curveToRelative(0f, -3.48f, -5.05f, -6f, -12f, -6f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(13f, 11f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _TourVirtual = it}

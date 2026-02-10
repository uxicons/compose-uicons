package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadSignLeft: ImageVector? = null

val Icons.Ts.RoadSignLeft: ImageVector
    get() = _RoadSignLeft ?: UXIcon(name = "RoadSignLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.17f, 9.98f)
                lineTo(14.02f, 0.83f)
                curveToRelative(-1.07f, -1.07f, -2.96f, -1.07f, -4.03f, 0f)
                lineTo(0.84f, 9.98f)
                curveTo(0.3f, 10.52f, 0.0f, 11.24f, 0.0f, 12.0f)
                reflectiveCurveToRelative(0.3f, 1.48f, 0.83f, 2.01f)
                lineToRelative(9.15f, 9.15f)
                curveToRelative(0.54f, 0.54f, 1.25f, 0.83f, 2.01f, 0.83f)
                reflectiveCurveToRelative(1.48f, -0.3f, 2.02f, -0.83f)
                lineToRelative(9.15f, -9.15f)
                curveToRelative(1.11f, -1.11f, 1.11f, -2.92f, 0f, -4.03f)
                close()
                moveTo(22.46f, 13.3f)
                lineToRelative(-9.15f, 9.15f)
                curveToRelative(-0.7f, 0.7f, -1.91f, 0.7f, -2.61f, 0f)
                lineTo(1.54f, 13.3f)
                curveToRelative(-0.72f, -0.72f, -0.72f, -1.89f, 0f, -2.61f)
                lineTo(10.69f, 1.54f)
                curveToRelative(0.35f, -0.35f, 0.81f, -0.54f, 1.31f, -0.54f)
                reflectiveCurveToRelative(0.96f, 0.19f, 1.31f, 0.54f)
                lineToRelative(9.15f, 9.15f)
                curveToRelative(0.72f, 0.72f, 0.72f, 1.89f, 0f, 2.61f)
                close()
                moveTo(16f, 12.5f)
                verticalLineToRelative(4f)
                lineToRelative(-1f, 1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-6.18f)
                lineToRelative(3.28f, 3.28f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.45f, -3.45f)
                curveToRelative(-0.6f, -0.6f, -0.6f, -1.57f, 0f, -2.17f)
                lineToRelative(3.45f, -3.45f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.37f, 3.37f)
                horizontalLineToRelative(6.27f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _RoadSignLeft = it}

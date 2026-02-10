package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadSignLeft: ImageVector? = null

val Icons.Ss.RoadSignLeft: ImageVector
    get() = _RoadSignLeft ?: UXIcon(name = "RoadSignLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.05f, 9.7f)
                lineTo(14.3f, 0.95f)
                curveToRelative(-1.22f, -1.22f, -3.37f, -1.22f, -4.59f, 0f)
                lineTo(0.95f, 9.7f)
                curveToRelative(-0.61f, 0.61f, -0.95f, 1.43f, -0.95f, 2.3f)
                reflectiveCurveToRelative(0.34f, 1.68f, 0.95f, 2.29f)
                lineToRelative(8.76f, 8.76f)
                curveToRelative(0.63f, 0.63f, 1.46f, 0.95f, 2.29f, 0.95f)
                reflectiveCurveToRelative(1.66f, -0.32f, 2.3f, -0.95f)
                lineToRelative(8.76f, -8.76f)
                curveToRelative(0.61f, -0.61f, 0.95f, -1.43f, 0.95f, -2.3f)
                reflectiveCurveToRelative(-0.34f, -1.68f, -0.95f, -2.29f)
                close()
                moveTo(16f, 15.5f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.1f)
                lineToRelative(2.3f, 2.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.3f, -3.3f)
                curveToRelative(-0.77f, -0.78f, -0.77f, -2.04f, 0f, -2.81f)
                lineToRelative(3.3f, -3.3f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.29f, 2.29f)
                horizontalLineToRelative(4.09f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _RoadSignLeft = it}

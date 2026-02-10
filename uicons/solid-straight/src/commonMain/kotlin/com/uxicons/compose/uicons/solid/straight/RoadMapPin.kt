package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadMapPin: ImageVector? = null

val Icons.Ss.RoadMapPin: ImageVector
    get() = _RoadMapPin ?: UXIcon(name = "RoadMapPin") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.33f, 8.48f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(-0.22f, -1.26f, -1.2f, -2.21f, -2.42f, -2.43f)
                curveToRelative(-0.22f, 1.47f, -0.89f, 2.83f, -1.97f, 3.9f)
                lineToRelative(-3.95f, 3.86f)
                verticalLineToRelative(3.19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.19f)
                lineToRelative(-3.92f, -3.83f)
                curveToRelative(-1.09f, -1.09f, -1.77f, -2.46f, -2.0f, -3.93f)
                curveToRelative(-1.22f, 0.22f, -2.19f, 1.18f, -2.41f, 2.43f)
                horizontalLineToRelative(0f)
                reflectiveCurveTo(-0.04f, 24f, -0.04f, 24f)
                lineTo(24.06f, 24f)
                lineToRelative(-2.73f, -15.52f)
                close()
                moveTo(11f, 22f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(12f, 11.99f)
                lineToRelative(3.54f, -3.46f)
                curveToRelative(0.94f, -0.94f, 1.47f, -2.2f, 1.47f, -3.54f)
                curveToRelative(0.06f, -2.69f, -2.31f, -5.05f, -5f, -5f)
                curveToRelative(-2.69f, -0.06f, -5.06f, 2.31f, -5f, 5f)
                curveToRelative(0f, 1.34f, 0.52f, 2.6f, 1.48f, 3.55f)
                lineToRelative(3.52f, 3.44f)
                close()
                moveTo(12f, 3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
            }
        }.also { _RoadMapPin = it}

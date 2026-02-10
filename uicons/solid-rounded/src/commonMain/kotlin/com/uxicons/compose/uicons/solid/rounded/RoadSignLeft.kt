package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadSignLeft: ImageVector? = null

val Icons.Sr.RoadSignLeft: ImageVector
    get() = _RoadSignLeft ?: UXIcon(name = "RoadSignLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.53f, 8.44f)
                lineTo(15.56f, 1.47f)
                curveTo(14.61f, 0.52f, 13.35f, 0f, 12.0f, 0f)
                reflectiveCurveToRelative(-2.61f, 0.52f, -3.56f, 1.47f)
                lineTo(1.48f, 8.44f)
                curveTo(0.52f, 9.39f, 0f, 10.65f, 0f, 12.0f)
                curveToRelative(0f, 1.34f, 0.52f, 2.61f, 1.48f, 3.56f)
                lineToRelative(6.97f, 6.97f)
                curveToRelative(0.95f, 0.95f, 2.22f, 1.48f, 3.56f, 1.48f)
                horizontalLineToRelative(0f)
                curveToRelative(1.34f, 0f, 2.61f, -0.52f, 3.56f, -1.48f)
                lineToRelative(6.97f, -6.97f)
                curveToRelative(0.95f, -0.95f, 1.48f, -2.22f, 1.48f, -3.56f)
                curveToRelative(0f, -1.34f, -0.52f, -2.61f, -1.48f, -3.56f)
                close()
                moveTo(16f, 16f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3.1f)
                lineToRelative(1.8f, 1.79f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-2.8f, -2.8f)
                curveToRelative(-0.77f, -0.78f, -0.77f, -2.04f, 0f, -2.81f)
                lineToRelative(2.8f, -2.8f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-1.79f, 1.79f)
                horizontalLineToRelative(3.09f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _RoadSignLeft = it}

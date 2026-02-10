package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadMapPin: ImageVector? = null

val Icons.Rs.RoadMapPin: ImageVector
    get() = _RoadMapPin ?: UXIcon(name = "RoadMapPin") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.06f, 24f)
                lineTo(-0.04f, 24f)
                lineTo(2.67f, 8.48f)
                horizontalLineToRelative(0f)
                curveToRelative(0.22f, -1.26f, 1.2f, -2.21f, 2.41f, -2.43f)
                curveToRelative(0.1f, 0.68f, 0.3f, 1.33f, 0.6f, 1.95f)
                horizontalLineToRelative(-0.05f)
                curveToRelative(-0.49f, 0f, -0.9f, 0.35f, -0.98f, 0.83f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                lineToRelative(-2.31f, 13.17f)
                lineTo(11f, 22.0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8.68f)
                lineToRelative(-2.32f, -13.17f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.09f, -0.48f, -0.5f, -0.83f, -0.98f, -0.83f)
                horizontalLineToRelative(-0.06f)
                curveToRelative(0.29f, -0.61f, 0.49f, -1.27f, 0.59f, -1.95f)
                curveToRelative(1.22f, 0.22f, 2.19f, 1.18f, 2.42f, 2.43f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(2.73f, 15.52f, 2.73f, 15.52f)
                close()
                moveTo(8.48f, 8.55f)
                curveToRelative(-0.96f, -0.96f, -1.48f, -2.22f, -1.48f, -3.55f)
                curveTo(6.94f, 2.31f, 9.31f, -0.06f, 12f, 0f)
                curveToRelative(2.69f, -0.06f, 5.06f, 2.31f, 5f, 5f)
                curveToRelative(0f, 1.34f, -0.52f, 2.59f, -1.47f, 3.54f)
                lineToRelative(-3.54f, 3.46f)
                lineToRelative(-3.52f, -3.44f)
                close()
                moveTo(9f, 5f)
                curveToRelative(0f, 0.8f, 0.32f, 1.56f, 0.89f, 2.13f)
                lineToRelative(2.11f, 2.07f)
                lineToRelative(2.13f, -2.08f)
                curveToRelative(0.56f, -0.56f, 0.87f, -1.31f, 0.87f, -2.11f)
                curveToRelative(0.03f, -1.61f, -1.39f, -3.03f, -3f, -3f)
                curveToRelative(-1.61f, -0.03f, -3.03f, 1.39f, -3f, 3f)
                close()
                moveTo(12f, 6.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(11f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _RoadMapPin = it}

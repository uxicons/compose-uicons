package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadMapPin: ImageVector? = null

val Icons.Sr.RoadMapPin: ImageVector
    get() = _RoadMapPin ?: UXIcon(name = "RoadMapPin") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.54f, 1.46f)
                curveToRelative(-1.86f, -1.94f, -5.21f, -1.94f, -7.07f, 0f)
                curveToRelative(-1.95f, 1.87f, -1.94f, 5.21f, 0.02f, 7.09f)
                lineToRelative(1.75f, 1.71f)
                curveToRelative(0.97f, 0.95f, 2.56f, 0.95f, 3.53f, 0f)
                lineToRelative(1.77f, -1.73f)
                curveToRelative(1.94f, -1.86f, 1.94f, -5.21f, 0f, -7.07f)
                close()
                moveTo(12f, 6.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(23.92f, 18.13f)
                lineToRelative(-1.55f, -8.83f)
                curveToRelative(-0.31f, -1.75f, -1.73f, -3.05f, -3.46f, -3.26f)
                curveToRelative(-0.22f, 1.47f, -0.89f, 2.83f, -1.97f, 3.91f)
                lineToRelative(-1.78f, 1.75f)
                curveToRelative(-0.6f, 0.59f, -1.35f, 0.98f, -2.17f, 1.17f)
                verticalLineToRelative(2.14f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.14f)
                curveToRelative(-0.81f, -0.18f, -1.56f, -0.57f, -2.16f, -1.17f)
                lineToRelative(-1.75f, -1.71f)
                curveToRelative(-1.09f, -1.09f, -1.78f, -2.46f, -2.0f, -3.94f)
                curveToRelative(-1.73f, 0.21f, -3.16f, 1.51f, -3.47f, 3.27f)
                lineTo(0.1f, 18.02f)
                curveToRelative(-0.68f, 3.01f, 1.89f, 6.08f, 4.9f, 5.98f)
                horizontalLineToRelative(13.92f)
                curveToRelative(3.09f, 0.14f, 5.62f, -2.96f, 5.01f, -5.87f)
                close()
                moveTo(13.0f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _RoadMapPin = it}

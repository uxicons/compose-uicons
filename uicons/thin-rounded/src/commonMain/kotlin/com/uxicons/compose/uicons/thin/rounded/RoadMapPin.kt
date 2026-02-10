package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadMapPin: ImageVector? = null

val Icons.Tr.RoadMapPin: ImageVector
    get() = _RoadMapPin ?: UXIcon(name = "RoadMapPin") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(8.48f, 8.55f)
                curveToRelative(-0.95f, -0.95f, -1.48f, -2.21f, -1.48f, -3.55f)
                curveTo(6.95f, 2.31f, 9.31f, -0.06f, 12f, 0f)
                curveToRelative(2.69f, -0.06f, 5.05f, 2.31f, 5f, 5f)
                curveToRelative(0f, 1.34f, -0.52f, 2.59f, -1.47f, 3.54f)
                lineToRelative(-1.79f, 1.76f)
                curveToRelative(-0.96f, 0.94f, -2.52f, 0.94f, -3.48f, 0f)
                lineToRelative(-1.78f, -1.74f)
                close()
                moveTo(8f, 5f)
                curveToRelative(0f, 1.07f, 0.42f, 2.08f, 1.18f, 2.84f)
                lineToRelative(1.78f, 1.74f)
                curveToRelative(0.57f, 0.56f, 1.51f, 0.56f, 2.08f, 0f)
                lineToRelative(1.79f, -1.75f)
                curveToRelative(0.75f, -0.75f, 1.17f, -1.76f, 1.17f, -2.83f)
                curveToRelative(0.04f, -2.15f, -1.85f, -4.04f, -4f, -4f)
                curveToRelative(-2.15f, -0.04f, -4.04f, 1.85f, -4f, 4f)
                close()
                moveTo(10f, 5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(11f, 5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(23.93f, 18.51f)
                lineToRelative(-1.55f, -8.79f)
                curveToRelative(-0.3f, -1.71f, -1.58f, -3.11f, -3.25f, -3.56f)
                curveToRelative(-0.27f, -0.07f, -0.54f, 0.09f, -0.61f, 0.35f)
                curveToRelative(-0.07f, 0.27f, 0.09f, 0.54f, 0.35f, 0.61f)
                curveToRelative(1.3f, 0.35f, 2.29f, 1.44f, 2.53f, 2.77f)
                lineToRelative(1.55f, 8.79f)
                curveToRelative(0.44f, 2.18f, -1.4f, 4.37f, -3.63f, 4.32f)
                horizontalLineToRelative(-6.82f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                lineTo(4.68f, 23f)
                curveToRelative(-2.22f, 0.05f, -4.06f, -2.14f, -3.63f, -4.32f)
                lineToRelative(1.54f, -8.79f)
                curveToRelative(0.23f, -1.33f, 1.23f, -2.42f, 2.54f, -2.78f)
                curveToRelative(0.27f, -0.07f, 0.42f, -0.35f, 0.35f, -0.61f)
                curveToRelative(-0.07f, -0.27f, -0.35f, -0.42f, -0.61f, -0.35f)
                curveToRelative(-1.68f, 0.45f, -2.96f, 1.85f, -3.26f, 3.57f)
                lineTo(0.07f, 18.51f)
                curveToRelative(-0.56f, 2.77f, 1.79f, 5.56f, 4.61f, 5.49f)
                horizontalLineToRelative(14.63f)
                curveToRelative(2.82f, 0.07f, 5.17f, -2.72f, 4.61f, -5.49f)
                close()
            }
        }.also { _RoadMapPin = it}

package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainStationBuilding: ImageVector? = null

val Icons.Sr.TrainStationBuilding: ImageVector
    get() = _TrainStationBuilding ?: UXIcon(name = "TrainStationBuilding") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.27f, 8.35f)
                curveToRelative(-0.74f, -0.74f, -1.77f, -1.17f, -2.83f, -1.17f)
                lineToRelative(-2.44f, -0.18f)
                curveToRelative(0f, -1.41f, -0.6f, -2.75f, -1.64f, -3.7f)
                curveToRelative(-0.57f, -0.52f, -1.26f, -0.9f, -1.99f, -1.11f)
                curveToRelative(-0.12f, -0.04f, -0.25f, -0.05f, -0.37f, -0.07f)
                verticalLineToRelative(-1.12f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.12f)
                curveToRelative(-0.12f, 0.03f, -0.26f, 0.04f, -0.38f, 0.07f)
                curveToRelative(-0.73f, 0.21f, -1.41f, 0.58f, -1.99f, 1.1f)
                curveToRelative(-1.04f, 0.95f, -1.64f, 2.29f, -1.64f, 3.7f)
                horizontalLineToRelative(-2.41f)
                curveToRelative(-1.05f, 0f, -2.08f, 0.43f, -2.83f, 1.17f)
                lineToRelative(-1.26f, 1.16f)
                curveToRelative(-1.03f, 0.95f, -0.36f, 2.67f, 1.04f, 2.67f)
                lineToRelative(20.85f, 0.18f)
                curveToRelative(1.38f, 0f, 2.06f, -1.67f, 1.08f, -2.63f)
                lineToRelative(-1.21f, -1.2f)
                close()
                moveTo(12f, 9f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(23f, 15f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(20f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _TrainStationBuilding = it}

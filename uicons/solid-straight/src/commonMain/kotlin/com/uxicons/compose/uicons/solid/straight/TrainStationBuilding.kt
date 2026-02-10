package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainStationBuilding: ImageVector? = null

val Icons.Ss.TrainStationBuilding: ImageVector
    get() = _TrainStationBuilding ?: UXIcon(name = "TrainStationBuilding") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 14f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(4f)
                lineTo(1f, 24f)
                verticalLineToRelative(-10f)
                close()
                moveTo(24f, 10.46f)
                verticalLineToRelative(1.54f)
                lineTo(0f, 12f)
                verticalLineToRelative(-1.54f)
                lineToRelative(3.05f, -3.46f)
                horizontalLineToRelative(3.95f)
                curveToRelative(0f, -2.41f, 1.72f, -4.43f, 4f, -4.9f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.1f)
                curveToRelative(2.28f, 0.47f, 4f, 2.48f, 4f, 4.9f)
                horizontalLineToRelative(3.95f)
                lineToRelative(3.05f, 3.46f)
                close()
                moveTo(14f, 7f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _TrainStationBuilding = it}

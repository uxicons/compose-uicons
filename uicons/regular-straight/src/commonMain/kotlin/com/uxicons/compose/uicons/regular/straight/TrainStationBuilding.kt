package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainStationBuilding: ImageVector? = null

val Icons.Rs.TrainStationBuilding: ImageVector
    get() = _TrainStationBuilding ?: UXIcon(name = "TrainStationBuilding") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11.54f)
                lineToRelative(-2.96f, -4.54f)
                horizontalLineToRelative(-4.04f)
                curveToRelative(0f, -2.41f, -1.72f, -4.43f, -4f, -4.9f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.1f)
                curveToRelative(-2.28f, 0.47f, -4f, 2.48f, -4f, 4.9f)
                lineTo(2.96f, 7f)
                lineTo(0f, 11.54f)
                verticalLineToRelative(1.46f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1.46f)
                close()
                moveTo(4.04f, 9f)
                horizontalLineToRelative(4.96f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.96f)
                lineToRelative(1.3f, 2f)
                lineTo(2.74f, 11f)
                lineToRelative(1.3f, -2f)
                close()
                moveTo(21f, 22f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(9f)
                close()
                moveTo(13.5f, 7f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _TrainStationBuilding = it}

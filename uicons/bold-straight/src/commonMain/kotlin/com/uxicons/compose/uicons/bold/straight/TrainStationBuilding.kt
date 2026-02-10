package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainStationBuilding: ImageVector? = null

val Icons.Bs.TrainStationBuilding: ImageVector
    get() = _TrainStationBuilding ?: UXIcon(name = "TrainStationBuilding") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.99f, 12f)
                lineToRelative(-3.49f, -5f)
                horizontalLineToRelative(-3.55f)
                curveToRelative(0.02f, -0.17f, 0.05f, -0.33f, 0.05f, -0.5f)
                curveToRelative(0f, -2.24f, -1.47f, -4.13f, -3.5f, -4.77f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1.73f)
                curveToRelative(-2.03f, 0.64f, -3.5f, 2.53f, -3.5f, 4.77f)
                curveToRelative(0f, 0.17f, 0.03f, 0.33f, 0.05f, 0.5f)
                horizontalLineToRelative(-3.55f)
                lineTo(0.01f, 12f)
                horizontalLineToRelative(-0.01f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-0.01f)
                close()
                moveTo(12f, 4.5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(21f, 21f)
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
            }
        }.also { _TrainStationBuilding = it}

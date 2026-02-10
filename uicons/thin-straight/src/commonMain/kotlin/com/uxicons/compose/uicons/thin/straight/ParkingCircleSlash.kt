package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParkingCircleSlash: ImageVector? = null

val Icons.Ts.ParkingCircleSlash: ImageVector
    get() = _ParkingCircleSlash ?: UXIcon(name = "ParkingCircleSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(1f, 12f)
                curveToRelative(0f, -2.85f, 1.09f, -5.46f, 2.88f, -7.41f)
                lineToRelative(15.53f, 15.53f)
                curveToRelative(-1.96f, 1.79f, -4.56f, 2.88f, -7.41f, 2.88f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                close()
                moveTo(8.01f, 7.31f)
                curveToRelative(0.1f, -0.74f, 0.73f, -1.31f, 1.49f, -1.31f)
                horizontalLineToRelative(4f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 1.86f, -1.46f, 3.39f, -3.3f, 3.49f)
                lineToRelative(-5.69f, -5.69f)
                close()
                moveTo(20.12f, 19.41f)
                lineToRelative(-5.54f, -5.54f)
                curveToRelative(1.96f, -0.48f, 3.42f, -2.26f, 3.42f, -4.37f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.02f, 0f, -1.91f, 0.62f, -2.29f, 1.5f)
                lineToRelative(-2.62f, -2.62f)
                curveToRelative(1.96f, -1.79f, 4.56f, -2.88f, 7.41f, -2.88f)
                curveToRelative(6.07f, 0f, 11f, 4.93f, 11f, 11f)
                curveToRelative(0f, 2.85f, -1.09f, 5.46f, -2.88f, 7.41f)
                close()
                moveTo(9.46f, 13f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(-2.46f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1f)
                lineTo(7f, 10.54f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(1.47f)
                horizontalLineToRelative(1.47f)
                close()
            }
        }.also { _ParkingCircleSlash = it}

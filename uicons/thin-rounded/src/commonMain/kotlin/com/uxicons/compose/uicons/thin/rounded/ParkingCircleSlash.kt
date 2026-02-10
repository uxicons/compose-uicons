package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParkingCircleSlash: ImageVector? = null

val Icons.Tr.ParkingCircleSlash: ImageVector
    get() = _ParkingCircleSlash ?: UXIcon(name = "ParkingCircleSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 13.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(12f, 23f)
                curveToRelative(2.85f, 0f, 5.46f, -1.09f, 7.41f, -2.88f)
                lineToRelative(-0.02f, -0.02f)
                lineTo(3.88f, 4.59f)
                curveToRelative(-1.79f, 1.96f, -2.88f, 4.56f, -2.88f, 7.41f)
                curveToRelative(0f, 6.07f, 4.93f, 11f, 11f, 11f)
                close()
                moveTo(13.7f, 12.99f)
                curveToRelative(1.84f, -0.1f, 3.3f, -1.63f, 3.3f, -3.49f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.0f, 0f, -1.9f, 0.6f, -2.29f, 1.5f)
                lineToRelative(5.49f, 5.49f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                curveToRelative(-2.85f, 0f, -5.46f, 1.09f, -7.41f, 2.88f)
                lineToRelative(2.88f, 2.88f)
                curveToRelative(0.62f, -1.07f, 1.77f, -1.76f, 3.04f, -1.76f)
                horizontalLineToRelative(3f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 2.11f, -1.46f, 3.89f, -3.42f, 4.37f)
                lineToRelative(5.53f, 5.53f)
                lineToRelative(0.02f, 0.02f)
                curveToRelative(1.79f, -1.96f, 2.88f, -4.56f, 2.88f, -7.41f)
                close()
            }
        }.also { _ParkingCircleSlash = it}

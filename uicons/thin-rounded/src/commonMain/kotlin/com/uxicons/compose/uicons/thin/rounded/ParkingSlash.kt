package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParkingSlash: ImageVector? = null

val Icons.Tr.ParkingSlash: ImageVector
    get() = _ParkingSlash ?: UXIcon(name = "ParkingSlash") {
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
                moveTo(24f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(4.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.02f, 2.02f, 0f, 4.5f, 0f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(19.5f, 23f)
                curveToRelative(0.79f, 0f, 1.51f, -0.26f, 2.1f, -0.7f)
                lineTo(1.7f, 2.4f)
                curveToRelative(-0.44f, 0.58f, -0.7f, 1.31f, -0.7f, 2.1f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                close()
                moveTo(13.7f, 12.99f)
                curveToRelative(1.84f, -0.1f, 3.3f, -1.63f, 3.3f, -3.49f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.0f, 0f, -1.9f, 0.6f, -2.29f, 1.5f)
                lineToRelative(5.49f, 5.49f)
                close()
                moveTo(23f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(4.5f, 1f)
                curveToRelative(-0.79f, 0f, -1.51f, 0.26f, -2.1f, 0.7f)
                lineTo(7.46f, 6.76f)
                curveToRelative(0.62f, -1.07f, 1.77f, -1.76f, 3.04f, -1.76f)
                horizontalLineToRelative(3f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 2.11f, -1.46f, 3.89f, -3.42f, 4.37f)
                lineToRelative(7.72f, 7.72f)
                curveToRelative(0.44f, -0.58f, 0.7f, -1.31f, 0.7f, -2.1f)
                lineTo(23f, 4.5f)
                close()
            }
        }.also { _ParkingSlash = it}

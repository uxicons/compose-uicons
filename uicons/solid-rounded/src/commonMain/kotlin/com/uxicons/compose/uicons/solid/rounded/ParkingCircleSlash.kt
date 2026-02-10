package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParkingCircleSlash: ImageVector? = null

val Icons.Sr.ParkingCircleSlash: ImageVector
    get() = _ParkingCircleSlash ?: UXIcon(name = "ParkingCircleSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.43f, 22.24f)
                curveToRelative(-0.06f, 0.32f, -0.28f, 0.6f, -0.58f, 0.73f)
                curveToRelative(-1.54f, 0.68f, -3.17f, 1.03f, -4.85f, 1.03f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                curveToRelative(0f, -1.67f, 0.35f, -3.3f, 1.03f, -4.85f)
                curveToRelative(0.13f, -0.3f, 0.41f, -0.52f, 0.73f, -0.58f)
                curveToRelative(0.33f, -0.06f, 0.66f, 0.04f, 0.89f, 0.28f)
                lineToRelative(4.35f, 4.35f)
                verticalLineToRelative(6.8f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4.8f)
                lineToRelative(8.15f, 8.15f)
                curveToRelative(0.23f, 0.23f, 0.34f, 0.57f, 0.28f, 0.89f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 3.21f, -1.25f, 6.22f, -3.52f, 8.48f)
                curveToRelative(-0.19f, 0.19f, -0.44f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.52f, -0.1f, -0.71f, -0.29f)
                lineTo(3.52f, 4.93f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
                reflectiveCurveToRelative(0.1f, -0.52f, 0.29f, -0.71f)
                curveTo(5.78f, 1.25f, 8.8f, 0f, 12f, 0f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                close()
                moveTo(18f, 9.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.77f, 0f, -1.51f, 0.22f, -2.15f, 0.63f)
                curveToRelative(-0.47f, 0.3f, -0.6f, 0.92f, -0.3f, 1.38f)
                curveToRelative(0.3f, 0.47f, 0.92f, 0.6f, 1.38f, 0.3f)
                curveToRelative(0.32f, -0.2f, 0.69f, -0.31f, 1.07f, -0.31f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 0.89f, -0.48f, 1.71f, -1.24f, 2.16f)
                curveToRelative(-0.48f, 0.28f, -0.64f, 0.89f, -0.36f, 1.37f)
                curveToRelative(0.19f, 0.32f, 0.52f, 0.5f, 0.86f, 0.5f)
                curveToRelative(0.17f, 0f, 0.34f, -0.04f, 0.5f, -0.14f)
                curveToRelative(1.38f, -0.8f, 2.23f, -2.29f, 2.23f, -3.89f)
                close()
            }
        }.also { _ParkingCircleSlash = it}

package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StationaryBike: ImageVector? = null

val Icons.Sr.StationaryBike: ImageVector
    get() = _StationaryBike ?: UXIcon(name = "StationaryBike") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 15.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 17.67f)
                curveToRelative(0f, 2.35f, -1.68f, 4.34f, -4f, 5.05f)
                verticalLineToRelative(0.28f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(7.5f, 23f)
                curveToRelative(-0.51f, 0f, -1.01f, -0.05f, -1.5f, -0.15f)
                verticalLineToRelative(0.15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-0.87f)
                curveToRelative(-2.38f, -1.26f, -4f, -3.76f, -4f, -6.63f)
                curveToRelative(0f, -2.62f, 1.35f, -4.92f, 3.39f, -6.27f)
                lineToRelative(-1.15f, -4.23f)
                horizontalLineToRelative(-1.24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.69f)
                lineToRelative(0.92f, 3.35f)
                curveToRelative(0.72f, -0.23f, 1.48f, -0.35f, 2.28f, -0.35f)
                curveToRelative(2.44f, 0f, 3.48f, 0.41f, 5.76f, 1.32f)
                curveToRelative(0.72f, 0.29f, 1.6f, 0.64f, 2.71f, 1.05f)
                curveToRelative(0.64f, -2.23f, 1.04f, -4.21f, 1.26f, -5.53f)
                curveToRelative(0.28f, -1.65f, 1.69f, -2.84f, 3.35f, -2.84f)
                curveToRelative(0.57f, 0f, 1.07f, -0.34f, 1.29f, -0.86f)
                lineToRelative(0.21f, -0.52f)
                curveToRelative(0.21f, -0.51f, 0.8f, -0.76f, 1.3f, -0.55f)
                curveToRelative(0.51f, 0.21f, 0.76f, 0.79f, 0.55f, 1.3f)
                lineToRelative(-0.21f, 0.52f)
                curveToRelative(-0.53f, 1.28f, -1.76f, 2.1f, -3.14f, 2.1f)
                curveToRelative(-0.68f, 0f, -1.26f, 0.49f, -1.38f, 1.17f)
                curveToRelative(-0.24f, 1.4f, -0.66f, 3.51f, -1.35f, 5.88f)
                curveToRelative(0.46f, 0.16f, 0.94f, 0.33f, 1.47f, 0.5f)
                curveToRelative(3.17f, 1.27f, 4.68f, 3.26f, 4.68f, 6.12f)
                close()
                moveTo(14f, 15.5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2.16f)
                curveToRelative(-0.43f, -1.44f, -1.76f, -2.5f, -3.34f, -2.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.58f, 0f, 2.9f, -1.06f, 3.34f, -2.5f)
                horizontalLineToRelative(2.16f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _StationaryBike = it}

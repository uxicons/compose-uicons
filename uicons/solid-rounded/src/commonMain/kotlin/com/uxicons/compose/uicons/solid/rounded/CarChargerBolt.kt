package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarChargerBolt: ImageVector? = null

val Icons.Sr.CarChargerBolt: ImageVector
    get() = _CarChargerBolt ?: UXIcon(name = "CarChargerBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 14f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(19f, 5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-4.94f)
                lineToRelative(-1.11f, 1.83f)
                curveToRelative(-0.92f, 1.51f, -2.54f, 2.39f, -4.19f, 2.39f)
                curveToRelative(-0.49f, 0f, -0.97f, -0.08f, -1.45f, -0.24f)
                lineToRelative(-1.44f, 2.52f)
                curveToRelative(-0.28f, 0.48f, -0.89f, 0.64f, -1.36f, 0.37f)
                curveToRelative(-0.48f, -0.27f, -0.65f, -0.89f, -0.37f, -1.36f)
                lineToRelative(1.46f, -2.55f)
                curveToRelative(-0.57f, -0.51f, -1.02f, -1.15f, -1.29f, -1.88f)
                curveToRelative(-0.5f, -1.35f, -0.37f, -2.84f, 0.36f, -4.08f)
                lineToRelative(5.22f, -9.01f)
                curveToRelative(1.43f, -2.46f, 4.08f, -3.99f, 6.92f, -3.99f)
                horizontalLineToRelative(2.2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(14.81f, 8.85f)
                curveToRelative(-0.28f, -0.52f, -0.82f, -0.85f, -1.41f, -0.85f)
                horizontalLineToRelative(-0.97f)
                lineToRelative(1.48f, -1.88f)
                curveToRelative(0.34f, -0.43f, 0.26f, -1.06f, -0.17f, -1.4f)
                curveToRelative(-0.44f, -0.34f, -1.06f, -0.26f, -1.4f, 0.17f)
                lineToRelative(-2.05f, 2.63f)
                curveToRelative(-0.33f, 0.49f, -0.36f, 1.12f, -0.08f, 1.65f)
                reflectiveCurveToRelative(0.82f, 0.85f, 1.41f, 0.85f)
                horizontalLineToRelative(0.97f)
                lineToRelative(-1.48f, 1.88f)
                curveToRelative(-0.34f, 0.43f, -0.26f, 1.06f, 0.17f, 1.4f)
                curveToRelative(0.43f, 0.34f, 1.06f, 0.27f, 1.4f, -0.17f)
                lineToRelative(2.05f, -2.63f)
                curveToRelative(0.33f, -0.49f, 0.36f, -1.12f, 0.08f, -1.65f)
                close()
            }
        }.also { _CarChargerBolt = it}

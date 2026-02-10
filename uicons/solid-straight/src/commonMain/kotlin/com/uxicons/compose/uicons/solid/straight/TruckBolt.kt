package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckBolt: ImageVector? = null

val Icons.Ss.TruckBolt: ImageVector
    get() = _TruckBolt ?: UXIcon(name = "TruckBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.94f, 20f)
                curveToRelative(0.03f, 0.16f, 0.06f, 0.33f, 0.06f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.06f, -0.5f)
                horizontalLineToRelative(4.88f)
                close()
                moveTo(17.06f, 20f)
                curveToRelative(-0.03f, 0.16f, -0.06f, 0.33f, -0.06f, 0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.06f, -0.5f)
                horizontalLineToRelative(-4.88f)
                close()
                moveTo(15.0f, 4f)
                verticalLineToRelative(14f)
                lineTo(0f, 18f)
                lineTo(0f, 4f)
                curveTo(0f, 2.34f, 1.34f, 1f, 3f, 1f)
                horizontalLineToRelative(9f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                close()
                moveTo(10.79f, 9.64f)
                curveToRelative(-0.24f, -0.38f, -0.66f, -0.61f, -1.11f, -0.61f)
                horizontalLineToRelative(-3.21f)
                lineToRelative(2.23f, -4.05f)
                lineToRelative(-1.75f, -0.96f)
                lineToRelative(-2.8f, 5.1f)
                curveToRelative(-0.21f, 0.41f, -0.18f, 0.89f, 0.06f, 1.28f)
                curveToRelative(0.24f, 0.39f, 0.66f, 0.63f, 1.12f, 0.63f)
                horizontalLineToRelative(3.16f)
                lineToRelative(-2.37f, 3.95f)
                lineToRelative(1.72f, 1.03f)
                lineToRelative(3.05f, -5.11f)
                curveToRelative(0.19f, -0.41f, 0.16f, -0.89f, -0.09f, -1.27f)
                close()
                moveTo(19.0f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(17.0f, 18f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _TruckBolt = it}

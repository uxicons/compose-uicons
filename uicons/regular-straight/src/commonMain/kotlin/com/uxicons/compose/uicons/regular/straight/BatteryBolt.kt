package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryBolt: ImageVector? = null

val Icons.Rs.BatteryBolt: ImageVector
    get() = _BatteryBolt ?: UXIcon(name = "BatteryBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-4.9f)
                lineToRelative(1.08f, -2f)
                horizontalLineToRelative(3.82f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(20f, 7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.91f)
                lineToRelative(1.09f, -2f)
                horizontalLineToRelative(3.82f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                close()
                moveTo(2f, 6f)
                lineTo(7.26f, 6f)
                lineToRelative(1.08f, -2f)
                lineTo(0f, 4f)
                lineTo(0f, 20f)
                lineTo(7.27f, 20f)
                lineToRelative(1.09f, -2f)
                lineTo(2f, 18f)
                lineTo(2f, 6f)
                close()
                moveTo(14.76f, 12.02f)
                curveToRelative(-0.34f, -0.63f, -0.98f, -1.02f, -1.67f, -1.02f)
                lineToRelative(-4.01f, 0.05f)
                lineToRelative(3.29f, -6.04f)
                lineToRelative(-1.76f, -0.96f)
                lineToRelative(-3.53f, 6.53f)
                curveToRelative(-0.17f, 0.57f, -0.07f, 1.17f, 0.28f, 1.65f)
                curveToRelative(0.36f, 0.48f, 0.94f, 0.77f, 1.56f, 0.77f)
                horizontalLineToRelative(4.04f)
                lineToRelative(-3.03f, 6.11f)
                lineToRelative(1.79f, 0.89f)
                lineToRelative(2.99f, -6.04f)
                curveToRelative(0.36f, -0.58f, 0.37f, -1.32f, 0.04f, -1.94f)
                close()
            }
        }.also { _BatteryBolt = it}

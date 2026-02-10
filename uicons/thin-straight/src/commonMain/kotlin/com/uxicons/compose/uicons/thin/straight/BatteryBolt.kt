package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryBolt: ImageVector? = null

val Icons.Ts.BatteryBolt: ImageVector
    get() = _BatteryBolt ?: UXIcon(name = "BatteryBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.77f, 13.75f)
                lineToRelative(-2.99f, 6.03f)
                lineToRelative(-0.9f, -0.44f)
                lineToRelative(3.02f, -6.08f)
                curveToRelative(0.14f, -0.21f, 0.1f, -0.4f, 0.04f, -0.52f)
                curveToRelative(-0.04f, -0.07f, -0.14f, -0.23f, -0.35f, -0.23f)
                horizontalLineToRelative(-4.16f)
                curveToRelative(-0.47f, 0f, -0.89f, -0.21f, -1.16f, -0.57f)
                curveToRelative(-0.26f, -0.34f, -0.33f, -0.78f, -0.2f, -1.2f)
                lineToRelative(3.49f, -6.44f)
                lineToRelative(0.88f, 0.48f)
                lineToRelative(-3.42f, 6.29f)
                curveToRelative(-0.03f, 0.13f, 0.01f, 0.22f, 0.06f, 0.28f)
                curveToRelative(0.08f, 0.1f, 0.21f, 0.16f, 0.36f, 0.16f)
                horizontalLineToRelative(4.16f)
                curveToRelative(0.52f, 0f, 0.97f, 0.28f, 1.23f, 0.75f)
                curveToRelative(0.26f, 0.48f, 0.23f, 1.05f, -0.06f, 1.49f)
                close()
                moveTo(22f, 8f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4.37f)
                lineToRelative(-0.54f, 1f)
                horizontalLineToRelative(4.91f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.11f)
                lineToRelative(-0.49f, 1f)
                horizontalLineToRelative(5.6f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2f)
                lineTo(24f, 8f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(1f, 19f)
                lineTo(1f, 5f)
                horizontalLineToRelative(7.9f)
                lineToRelative(0.54f, -1f)
                lineTo(0f, 4f)
                lineTo(0f, 20f)
                lineTo(8.32f, 20f)
                lineToRelative(0.5f, -1f)
                lineTo(1f, 19f)
                close()
            }
        }.also { _BatteryBolt = it}

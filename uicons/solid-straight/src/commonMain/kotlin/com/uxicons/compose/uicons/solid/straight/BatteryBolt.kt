package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryBolt: ImageVector? = null

val Icons.Ss.BatteryBolt: ImageVector
    get() = _BatteryBolt ?: UXIcon(name = "BatteryBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(0f, 4f)
                lineTo(0f, 20f)
                lineTo(19f, 20f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                lineTo(24f, 8f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(14.1f, 13.97f)
                lineToRelative(-2.33f, 4.49f)
                lineToRelative(-1.77f, -0.92f)
                lineToRelative(2.35f, -4.54f)
                horizontalLineToRelative(-3.43f)
                curveToRelative(-0.62f, 0f, -1.21f, -0.29f, -1.56f, -0.77f)
                curveToRelative(-0.35f, -0.47f, -0.45f, -1.07f, -0.28f, -1.65f)
                lineToRelative(2.52f, -5.04f)
                lineToRelative(1.78f, 0.9f)
                lineToRelative(-2.32f, 4.55f)
                horizontalLineToRelative(3.41f)
                curveToRelative(0.69f, 0f, 1.33f, 0.39f, 1.67f, 1.02f)
                curveToRelative(0.34f, 0.62f, 0.32f, 1.37f, -0.05f, 1.95f)
                close()
            }
        }.also { _BatteryBolt = it}

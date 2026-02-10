package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryBolt: ImageVector? = null

val Icons.Bs.BatteryBolt: ImageVector
    get() = _BatteryBolt ?: UXIcon(name = "BatteryBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.65f, 14.21f)
                lineToRelative(-2.97f, 5.82f)
                lineToRelative(-2.67f, -1.36f)
                lineToRelative(2.64f, -5.16f)
                horizontalLineToRelative(-2.22f)
                curveToRelative(-0.78f, 0f, -1.51f, -0.36f, -1.96f, -0.97f)
                curveToRelative(-0.45f, -0.6f, -0.57f, -1.36f, -0.35f, -2.09f)
                lineToRelative(3.88f, -6.45f)
                lineToRelative(2.56f, 1.56f)
                lineToRelative(-3.02f, 4.95f)
                horizontalLineToRelative(2.06f)
                curveToRelative(0.88f, 0f, 1.69f, 0.49f, 2.11f, 1.28f)
                curveToRelative(0.41f, 0.77f, 0.4f, 1.7f, -0.05f, 2.43f)
                close()
                moveTo(3f, 7f)
                horizontalLineToRelative(3.77f)
                lineToRelative(1.76f, -3f)
                lineTo(0f, 4f)
                lineTo(0f, 20f)
                lineTo(6.05f, 20f)
                lineToRelative(1.55f, -3f)
                lineTo(3f, 17f)
                lineTo(3f, 7f)
                close()
                moveTo(24f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-1.93f)
                lineToRelative(-1.71f, 3f)
                horizontalLineToRelative(3.64f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.03f)
                lineToRelative(-1.54f, 3f)
                horizontalLineToRelative(4.58f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2f)
                lineTo(24f, 8f)
                close()
            }
        }.also { _BatteryBolt = it}

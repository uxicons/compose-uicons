package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryBolt: ImageVector? = null

val Icons.Rr.BatteryBolt: ImageVector
    get() = _BatteryBolt ?: UXIcon(name = "BatteryBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(14.76f, 12.02f)
                curveToRelative(-0.34f, -0.63f, -0.98f, -1.02f, -1.67f, -1.02f)
                lineToRelative(-4.01f, 0.05f)
                lineToRelative(3.03f, -5.57f)
                curveToRelative(0.26f, -0.48f, 0.08f, -1.09f, -0.4f, -1.36f)
                curveToRelative(-0.49f, -0.26f, -1.09f, -0.08f, -1.36f, 0.4f)
                curveToRelative(0f, 0f, -3.25f, 6.0f, -3.27f, 6.06f)
                curveToRelative(-0.17f, 0.57f, -0.07f, 1.17f, 0.28f, 1.65f)
                curveToRelative(0.36f, 0.48f, 0.94f, 0.77f, 1.56f, 0.77f)
                horizontalLineToRelative(4.04f)
                lineToRelative(-0.01f, 0.03f)
                lineToRelative(-2.74f, 5.53f)
                curveToRelative(-0.24f, 0.49f, -0.04f, 1.09f, 0.45f, 1.34f)
                curveToRelative(0.14f, 0.07f, 0.29f, 0.1f, 0.44f, 0.1f)
                curveToRelative(0.37f, 0f, 0.72f, -0.2f, 0.9f, -0.56f)
                lineToRelative(2.72f, -5.48f)
                curveToRelative(0.36f, -0.58f, 0.37f, -1.32f, 0.04f, -1.94f)
                close()
                moveTo(23f, 8f)
                horizontalLineToRelative(-1.1f)
                curveToRelative(-0.47f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(2.41f, 0f, 4.43f, -1.72f, 4.9f, -4f)
                horizontalLineToRelative(1.1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _BatteryBolt = it}

package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MeterBolt: ImageVector? = null

val Icons.Ts.MeterBolt: ImageVector
    get() = _MeterBolt ?: UXIcon(name = "MeterBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(1f, 12f)
                curveTo(1f, 5.93f, 5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                curveToRelative(0f, 0f, 0.06f, 1.48f, -0.4f, 3.0f)
                curveToRelative(0.34f, 0.02f, 0.67f, 0.08f, 0.98f, 0.19f)
                curveToRelative(0.28f, -1.01f, 0.43f, -2.09f, 0.43f, -3.19f)
                curveToRelative(-0.06f, -6.57f, -5.43f, -12f, -12.01f, -12f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(2.18f, 0f, 4.23f, -0.59f, 6f, -1.61f)
                verticalLineToRelative(-1.17f)
                curveToRelative(-1.73f, 1.13f, -3.79f, 1.78f, -6f, 1.78f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                close()
                moveTo(17f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                close()
                moveTo(14f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                close()
                moveTo(22.43f, 17f)
                horizontalLineToRelative(-3.84f)
                curveToRelative(-0.19f, 0f, -0.36f, -0.09f, -0.47f, -0.24f)
                curveToRelative(-0.1f, -0.14f, -0.14f, -0.3f, -0.11f, -0.46f)
                lineToRelative(3.4f, -5.02f)
                lineToRelative(-0.83f, -0.56f)
                lineToRelative(-3.52f, 5.23f)
                curveToRelative(-0.15f, 0.49f, -0.06f, 1f, 0.24f, 1.41f)
                reflectiveCurveToRelative(0.77f, 0.64f, 1.28f, 0.64f)
                horizontalLineToRelative(3.84f)
                curveToRelative(0.21f, 0f, 0.4f, 0.11f, 0.5f, 0.3f)
                curveToRelative(0.1f, 0.19f, 0.09f, 0.41f, -0.01f, 0.56f)
                lineToRelative(-3.34f, 4.46f)
                lineToRelative(0.8f, 0.6f)
                lineToRelative(3.35f, -4.49f)
                curveToRelative(0.32f, -0.48f, 0.35f, -1.1f, 0.07f, -1.61f)
                curveToRelative(-0.27f, -0.51f, -0.8f, -0.83f, -1.38f, -0.83f)
                close()
                moveTo(8f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                close()
                moveTo(4f, 11f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _MeterBolt = it}

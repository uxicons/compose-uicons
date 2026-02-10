package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightbulbMessage: ImageVector? = null

val Icons.Ss.LightbulbMessage: ImageVector
    get() = _LightbulbMessage ?: UXIcon(name = "LightbulbMessage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.91f, 24f)
                horizontalLineToRelative(-0.3f)
                lineToRelative(-2.98f, -2.0f)
                horizontalLineToRelative(-7.62f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                lineToRelative(-0.0f, 8.41f)
                curveToRelative(0f, 0.6f, -0.49f, 1.09f, -1.09f, 1.09f)
                close()
                moveTo(8.0f, 9.81f)
                curveToRelative(-1.16f, -0.41f, -2f, -1.51f, -2f, -2.82f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.3f, -0.84f, 2.4f, -2f, 2.82f)
                verticalLineToRelative(4.67f)
                curveToRelative(0.01f, -2.48f, 2.02f, -4.49f, 4.5f, -4.49f)
                horizontalLineToRelative(3.44f)
                curveToRelative(0.04f, -0.33f, 0.06f, -0.67f, 0.06f, -1.0f)
                curveToRelative(0f, -2.56f, -1.1f, -5.01f, -3.01f, -6.71f)
                curveTo(13.09f, 0.58f, 10.52f, -0.23f, 7.96f, 0.06f)
                curveTo(3.9f, 0.52f, 0.59f, 3.78f, 0.08f, 7.82f)
                curveToRelative(-0.37f, 2.93f, 0.64f, 5.76f, 2.79f, 7.76f)
                curveToRelative(1.06f, 0.98f, 1.74f, 2.17f, 2.01f, 3.42f)
                horizontalLineToRelative(3.12f)
                lineTo(8.0f, 9.81f)
                close()
                moveTo(10f, 24.0f)
                verticalLineToRelative(-3.0f)
                lineTo(5.0f, 21.0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }.also { _LightbulbMessage = it}

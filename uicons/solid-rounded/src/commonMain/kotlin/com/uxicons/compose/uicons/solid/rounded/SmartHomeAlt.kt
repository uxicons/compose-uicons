package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartHomeAlt: ImageVector? = null

val Icons.Sr.SmartHomeAlt: ImageVector
    get() = _SmartHomeAlt ?: UXIcon(name = "SmartHomeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.08f, 6.56f)
                lineTo(15.08f, 1.08f)
                curveToRelative(-1.81f, -1.42f, -4.35f, -1.42f, -6.17f, 0f)
                lineTo(1.92f, 6.56f)
                curveToRelative(-1.22f, 0.95f, -1.92f, 2.39f, -1.92f, 3.94f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -1.55f, -0.7f, -2.98f, -1.92f, -3.94f)
                close()
                moveTo(11f, 9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                close()
                moveTo(16.24f, 18.24f)
                curveToRelative(-1.13f, 1.13f, -2.64f, 1.76f, -4.24f, 1.76f)
                reflectiveCurveToRelative(-3.11f, -0.62f, -4.24f, -1.76f)
                curveToRelative(-2.1f, -2.1f, -2.32f, -5.47f, -0.53f, -7.85f)
                curveToRelative(0.33f, -0.44f, 0.96f, -0.53f, 1.4f, -0.19f)
                curveToRelative(0.44f, 0.33f, 0.53f, 0.96f, 0.2f, 1.4f)
                curveToRelative(-1.2f, 1.58f, -1.05f, 3.83f, 0.35f, 5.22f)
                curveToRelative(1.51f, 1.51f, 4.15f, 1.51f, 5.66f, 0f)
                curveToRelative(1.4f, -1.4f, 1.54f, -3.64f, 0.35f, -5.22f)
                curveToRelative(-0.33f, -0.44f, -0.25f, -1.07f, 0.2f, -1.4f)
                curveToRelative(0.44f, -0.34f, 1.07f, -0.25f, 1.4f, 0.19f)
                curveToRelative(1.8f, 2.38f, 1.57f, 5.75f, -0.53f, 7.85f)
                close()
            }
        }.also { _SmartHomeAlt = it}

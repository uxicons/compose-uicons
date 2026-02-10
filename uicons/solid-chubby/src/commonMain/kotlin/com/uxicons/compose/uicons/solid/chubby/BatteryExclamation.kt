package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryExclamation: ImageVector? = null

val Icons.Sc.BatteryExclamation: ImageVector
    get() = _BatteryExclamation ?: UXIcon(name = "BatteryExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.62f, 8.73f)
                curveToRelative(-0.09f, -0.32f, -0.34f, -0.57f, -0.66f, -0.67f)
                curveToRelative(-0.06f, -0.02f, -0.49f, -0.15f, -1.26f, -0.27f)
                curveToRelative(-0.19f, -1.32f, -0.41f, -2.08f, -0.43f, -2.13f)
                curveToRelative(-0.1f, -0.31f, -0.34f, -0.56f, -0.65f, -0.66f)
                curveToRelative(-0.12f, -0.04f, -3.13f, -0.99f, -8.63f, -0.99f)
                reflectiveCurveToRelative(-8.59f, 0.94f, -8.71f, 0.98f)
                curveToRelative(-0.33f, 0.1f, -0.58f, 0.37f, -0.67f, 0.7f)
                curveToRelative(-0.03f, 0.1f, -0.61f, 2.39f, -0.61f, 6.32f)
                reflectiveCurveToRelative(0.59f, 6.31f, 0.61f, 6.41f)
                curveToRelative(0.09f, 0.35f, 0.36f, 0.62f, 0.7f, 0.72f)
                curveToRelative(0.13f, 0.04f, 3.21f, 0.87f, 8.69f, 0.87f)
                reflectiveCurveToRelative(8.48f, -0.89f, 8.6f, -0.93f)
                curveToRelative(0.32f, -0.1f, 0.57f, -0.35f, 0.67f, -0.67f)
                curveToRelative(0.02f, -0.05f, 0.23f, -0.81f, 0.43f, -2.11f)
                curveToRelative(0.77f, -0.12f, 1.22f, -0.26f, 1.27f, -0.27f)
                curveToRelative(0.32f, -0.1f, 0.56f, -0.35f, 0.66f, -0.68f)
                curveToRelative(0.01f, -0.05f, 0.38f, -1.33f, 0.38f, -3.31f)
                reflectiveCurveToRelative(-0.36f, -3.26f, -0.38f, -3.31f)
                close()
                moveTo(11f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(12f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _BatteryExclamation = it}

package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Umbrella: ImageVector? = null

val Icons.Tr.Umbrella: ImageVector
    get() = _Umbrella ?: UXIcon(name = "Umbrella") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.73f, 10.04f)
                curveToRelative(-1.69f, -4.22f, -6.35f, -7.32f, -11.23f, -7.53f)
                lineTo(12.5f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2.02f)
                curveTo(6.62f, 2.72f, 1.94f, 5.83f, 0.25f, 10.05f)
                curveToRelative(-0.44f, 1.1f, -0.3f, 2.35f, 0.37f, 3.34f)
                curveToRelative(0.68f, 1.01f, 1.81f, 1.61f, 3.02f, 1.61f)
                lineToRelative(7.86f, -0.0f)
                verticalLineToRelative(6.25f)
                curveToRelative(0f, 0.96f, -0.79f, 1.75f, -1.75f, 1.75f)
                curveToRelative(-0.98f, 0f, -1.75f, -0.81f, -1.75f, -1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                curveToRelative(0f, 1.33f, 1.28f, 2.5f, 2.75f, 2.5f)
                curveToRelative(1.52f, 0f, 2.75f, -1.23f, 2.75f, -2.75f)
                verticalLineToRelative(-6.25f)
                lineToRelative(7.83f, -0.0f)
                curveToRelative(1.21f, 0f, 2.34f, -0.6f, 3.03f, -1.61f)
                curveToRelative(0.67f, -0.99f, 0.81f, -2.24f, 0.37f, -3.34f)
                close()
                moveTo(22.53f, 12.82f)
                curveToRelative(-0.5f, 0.73f, -1.32f, 1.17f, -2.2f, 1.17f)
                lineToRelative(-16.69f, 0.01f)
                curveToRelative(-0.88f, 0f, -1.7f, -0.44f, -2.2f, -1.17f)
                curveToRelative(-0.49f, -0.73f, -0.59f, -1.6f, -0.27f, -2.41f)
                curveTo(2.78f, 6.42f, 7.33f, 3.51f, 12f, 3.51f)
                reflectiveCurveToRelative(9.2f, 2.9f, 10.8f, 6.91f)
                curveToRelative(0.32f, 0.81f, 0.22f, 1.68f, -0.27f, 2.41f)
                close()
            }
        }.also { _Umbrella = it}

package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spinner: ImageVector? = null

val Icons.Sr.Spinner: ImageVector
    get() = _Spinner ?: UXIcon(name = "Spinner", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(268.44f, 512.05f)
                curveToRelative(96.44f, 0.25f, 184.76f, -53.92f, 228.27f, -139.99f)
                curveToRelative(5.03f, -10.65f, 0.48f, -23.37f, -10.17f, -28.4f)
                curveToRelative(-10.2f, -4.82f, -22.4f, -0.86f, -27.83f, 9.03f)
                curveToRelative(-53.37f, 105.04f, -181.79f, 146.93f, -286.83f, 93.55f)
                curveTo(66.84f, 392.88f, 24.96f, 264.46f, 78.33f, 159.42f)
                reflectiveCurveTo(260.12f, 12.5f, 365.15f, 65.87f)
                curveToRelative(40.47f, 20.56f, 73.32f, 53.5f, 93.79f, 94.02f)
                curveToRelative(4.98f, 10.68f, 17.67f, 15.3f, 28.35f, 10.32f)
                reflectiveCurveToRelative(15.3f, -17.67f, 10.32f, -28.35f)
                curveToRelative(-0.19f, -0.4f, -0.38f, -0.79f, -0.59f, -1.17f)
                curveTo(433.31f, 14.47f, 279.34f, -36.19f, 153.12f, 27.53f)
                reflectiveCurveToRelative(-176.88f, 217.69f, -113.16f, 343.9f)
                curveTo(83.49f, 457.65f, 171.85f, 512.03f, 268.44f, 512.05f)
                close()
            }
        }.also { _Spinner = it}

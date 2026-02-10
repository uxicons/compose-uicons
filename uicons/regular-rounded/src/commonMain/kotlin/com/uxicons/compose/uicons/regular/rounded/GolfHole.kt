package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfHole: ImageVector? = null

val Icons.Rr.GolfHole: ImageVector
    get() = _GolfHole ?: UXIcon(name = "GolfHole") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 18f)
                curveToRelative(0f, 3.42f, -5.16f, 6f, -12f, 6f)
                reflectiveCurveTo(0f, 21.42f, 0f, 18f)
                curveToRelative(0f, -2.63f, 3.0f, -4.79f, 7.83f, -5.64f)
                curveToRelative(0.55f, -0.09f, 1.06f, 0.27f, 1.16f, 0.81f)
                curveToRelative(0.1f, 0.54f, -0.27f, 1.06f, -0.81f, 1.16f)
                curveToRelative(-3.58f, 0.63f, -6.17f, 2.18f, -6.17f, 3.67f)
                curveToRelative(0f, 1.89f, 4.11f, 4f, 10f, 4f)
                reflectiveCurveToRelative(10f, -2.11f, 10f, -4f)
                curveToRelative(0f, -1.5f, -2.6f, -3.04f, -6.17f, -3.67f)
                curveToRelative(-0.54f, -0.1f, -0.91f, -0.62f, -0.81f, -1.16f)
                curveToRelative(0.1f, -0.54f, 0.61f, -0.91f, 1.16f, -0.81f)
                curveToRelative(4.83f, 0.85f, 7.83f, 3.02f, 7.83f, 5.64f)
                close()
                moveTo(11f, 18f)
                lineTo(11f, 2.69f)
                curveToRelative(0f, -1.39f, 0.73f, -2.05f, 1.17f, -2.32f)
                curveToRelative(0.73f, -0.45f, 1.73f, -0.5f, 2.49f, -0.12f)
                curveToRelative(0.04f, 0.02f, 5.3f, 3.56f, 5.3f, 3.56f)
                curveToRelative(0.73f, 0.54f, 1.1f, 1.36f, 1.03f, 2.21f)
                curveToRelative(-0.07f, 0.86f, -0.56f, 1.61f, -1.32f, 2.01f)
                lineToRelative(-6.67f, 3.27f)
                verticalLineToRelative(6.69f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(13f, 9.08f)
                lineToRelative(5.76f, -2.83f)
                curveToRelative(0.18f, -0.1f, 0.23f, -0.28f, 0.23f, -0.38f)
                curveToRelative(0.01f, -0.1f, -0.01f, -0.29f, -0.19f, -0.43f)
                lineToRelative(-5.08f, -3.42f)
                curveToRelative(-0.06f, -0.02f, -0.13f, -0.03f, -0.2f, -0.03f)
                curveToRelative(-0.1f, 0f, -0.21f, 0.02f, -0.3f, 0.08f)
                curveToRelative(-0.15f, 0.09f, -0.22f, 0.3f, -0.22f, 0.62f)
                verticalLineToRelative(6.39f)
                close()
            }
        }.also { _GolfHole = it}

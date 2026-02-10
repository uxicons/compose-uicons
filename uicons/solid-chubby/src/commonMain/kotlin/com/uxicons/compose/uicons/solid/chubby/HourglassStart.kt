package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HourglassStart: ImageVector? = null

val Icons.Sc.HourglassStart: ImageVector
    get() = _HourglassStart ?: UXIcon(name = "HourglassStart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.02f, 6f)
                curveToRelative(0.87f, -0.01f, 1.59f, 0.09f, 2.37f, 0.26f)
                curveToRelative(-0.62f, 1.03f, -1.44f, 1.9f, -2.38f, 2.56f)
                curveToRelative(-0.95f, -0.65f, -1.76f, -1.53f, -2.38f, -2.56f)
                curveToRelative(0.78f, -0.18f, 1.51f, -0.28f, 2.4f, -0.26f)
                close()
                moveTo(19.97f, 18.88f)
                curveToRelative(0.06f, 0.21f, 0.04f, 0.42f, -0.03f, 0.62f)
                curveToRelative(-0.06f, 0.14f, -1.43f, 3.5f, -7.93f, 3.5f)
                reflectiveCurveToRelative(-7.88f, -3.35f, -7.93f, -3.5f)
                curveToRelative(-0.08f, -0.2f, -0.09f, -0.42f, -0.03f, -0.62f)
                curveToRelative(0.99f, -3.7f, 2.43f, -5.61f, 3.93f, -6.88f)
                curveToRelative(-1.5f, -1.28f, -2.94f, -3.18f, -3.93f, -6.88f)
                curveToRelative(-0.06f, -0.2f, -0.04f, -0.42f, 0.03f, -0.62f)
                curveToRelative(0.06f, -0.14f, 1.43f, -3.5f, 7.93f, -3.5f)
                reflectiveCurveToRelative(7.88f, 3.35f, 7.93f, 3.5f)
                curveToRelative(0.08f, 0.2f, 0.09f, 0.42f, 0.03f, 0.62f)
                curveToRelative(-0.99f, 3.7f, -2.43f, 5.61f, -3.93f, 6.88f)
                curveToRelative(1.5f, 1.28f, 2.94f, 3.18f, 3.93f, 6.88f)
                close()
                moveTo(16.76f, 6f)
                curveToRelative(0.12f, -0.27f, 0.11f, -0.57f, -0.02f, -0.83f)
                reflectiveCurveToRelative(-0.36f, -0.46f, -0.64f, -0.53f)
                curveToRelative(-1.44f, -0.39f, -2.56f, -0.65f, -4.09f, -0.64f)
                curveToRelative(-1.57f, -0.02f, -2.69f, 0.25f, -4.12f, 0.64f)
                curveToRelative(-0.28f, 0.08f, -0.51f, 0.27f, -0.64f, 0.53f)
                reflectiveCurveToRelative(-0.13f, 0.56f, -0.02f, 0.83f)
                curveToRelative(0.9f, 2.06f, 2.41f, 3.79f, 4.26f, 4.87f)
                curveToRelative(0.31f, 0.18f, 0.69f, 0.18f, 1.0f, 0f)
                curveToRelative(1.85f, -1.07f, 3.37f, -2.8f, 4.26f, -4.87f)
                close()
            }
        }.also { _HourglassStart = it}

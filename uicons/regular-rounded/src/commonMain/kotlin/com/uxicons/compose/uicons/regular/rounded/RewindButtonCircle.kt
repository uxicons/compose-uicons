package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RewindButtonCircle: ImageVector? = null

val Icons.Rr.RewindButtonCircle: ImageVector
    get() = _RewindButtonCircle ?: UXIcon(name = "RewindButtonCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(16.93f, 6.9f)
                curveToRelative(-0.66f, -0.33f, -1.45f, -0.27f, -2.04f, 0.18f)
                lineToRelative(-1.88f, 1.53f)
                curveToRelative(-0.01f, -0.73f, -0.42f, -1.38f, -1.07f, -1.7f)
                curveToRelative(-0.66f, -0.33f, -1.45f, -0.27f, -2.08f, 0.2f)
                lineToRelative(-4.11f, 3.33f)
                curveToRelative(-0.5f, 0.37f, -0.79f, 0.94f, -0.79f, 1.57f)
                reflectiveCurveToRelative(0.29f, 1.2f, 0.76f, 1.54f)
                lineToRelative(4.17f, 3.39f)
                curveToRelative(0.6f, 0.44f, 1.38f, 0.51f, 2.04f, 0.18f)
                curveToRelative(0.65f, -0.33f, 1.06f, -0.98f, 1.07f, -1.7f)
                lineToRelative(1.88f, 1.53f)
                curveToRelative(0.34f, 0.26f, 0.75f, 0.39f, 1.16f, 0.39f)
                curveToRelative(0.3f, 0f, 0.6f, -0.07f, 0.88f, -0.21f)
                curveToRelative(0.66f, -0.33f, 1.07f, -1.0f, 1.07f, -1.75f)
                verticalLineToRelative(-6.72f)
                curveToRelative(0f, -0.74f, -0.41f, -1.41f, -1.07f, -1.75f)
                close()
                moveTo(11f, 15.26f)
                lineToRelative(-4.03f, -3.25f)
                lineToRelative(4.03f, -3.27f)
                verticalLineToRelative(6.52f)
                close()
                moveTo(16f, 15.26f)
                lineToRelative(-4.02f, -3.26f)
                lineToRelative(4.02f, -3.26f)
                verticalLineToRelative(6.52f)
                close()
            }
        }.also { _RewindButtonCircle = it}

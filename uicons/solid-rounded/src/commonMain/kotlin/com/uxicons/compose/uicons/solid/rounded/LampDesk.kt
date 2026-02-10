package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampDesk: ImageVector? = null

val Icons.Sr.LampDesk: ImageVector
    get() = _LampDesk ?: UXIcon(name = "LampDesk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.99f, 6.06f)
                curveToRelative(-0.07f, -0.75f, -0.48f, -1.42f, -1.1f, -1.84f)
                lineToRelative(-5.07f, -3.38f)
                curveTo(15.69f, 0.1f, 14.34f, -0.17f, 13.02f, 0.1f)
                curveToRelative(-1.32f, 0.27f, -2.47f, 1.05f, -3.22f, 2.2f)
                curveToRelative(-0.79f, 1.2f, -0.98f, 2.69f, -0.59f, 4.08f)
                lineToRelative(-2.16f, 2.16f)
                curveToRelative(-1.32f, 1.32f, -2.05f, 3.08f, -2.05f, 4.95f)
                verticalLineToRelative(8.52f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-8.52f)
                curveToRelative(0f, -1.34f, 0.52f, -2.59f, 1.47f, -3.54f)
                lineToRelative(1.68f, -1.68f)
                lineToRelative(3.08f, 4.62f)
                curveToRelative(0.42f, 0.63f, 1.09f, 1.03f, 1.84f, 1.1f)
                curveToRelative(0.08f, 0.01f, 0.17f, 0.01f, 0.25f, 0.01f)
                curveToRelative(0.66f, 0f, 1.3f, -0.26f, 1.77f, -0.73f)
                lineToRelative(0.83f, -0.83f)
                curveToRelative(0.98f, 0.81f, 2.44f, 0.76f, 3.35f, -0.16f)
                reflectiveCurveToRelative(0.97f, -2.37f, 0.16f, -3.35f)
                lineToRelative(0.83f, -0.83f)
                curveToRelative(0.53f, -0.53f, 0.8f, -1.27f, 0.72f, -2.02f)
                close()
            }
        }.also { _LampDesk = it}

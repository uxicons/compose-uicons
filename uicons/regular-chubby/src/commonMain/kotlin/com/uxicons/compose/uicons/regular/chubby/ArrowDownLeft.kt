package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownLeft: ImageVector? = null

val Icons.Rc.ArrowDownLeft: ImageVector
    get() = _ArrowDownLeft ?: UXIcon(name = "ArrowDownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.71f, 3.71f)
                lineToRelative(-16.1f, 16.16f)
                curveToRelative(2.02f, 0.23f, 4.09f, 0.14f, 6.19f, -0.29f)
                curveToRelative(0.55f, -0.12f, 1.07f, 0.23f, 1.18f, 0.77f)
                reflectiveCurveToRelative(-0.23f, 1.07f, -0.77f, 1.18f)
                curveToRelative(-1.51f, 0.32f, -3.02f, 0.47f, -4.5f, 0.47f)
                reflectiveCurveToRelative(-2.96f, -0.16f, -4.4f, -0.48f)
                curveToRelative(-0.38f, -0.08f, -0.68f, -0.38f, -0.76f, -0.76f)
                curveToRelative(-0.63f, -2.89f, -0.64f, -5.88f, -0.0f, -8.9f)
                curveToRelative(0.11f, -0.54f, 0.64f, -0.89f, 1.18f, -0.77f)
                curveToRelative(0.54f, 0.11f, 0.89f, 0.64f, 0.77f, 1.18f)
                curveToRelative(-0.44f, 2.09f, -0.52f, 4.16f, -0.29f, 6.18f)
                lineToRelative(16.09f, -16.15f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, -0.0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                close()
            }
        }.also { _ArrowDownLeft = it}

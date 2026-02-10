package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampStreet: ImageVector? = null

val Icons.Sc.LampStreet: ImageVector
    get() = _LampStreet ?: UXIcon(name = "LampStreet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 14.5f)
                curveToRelative(0f, 0.48f, -0.34f, 0.89f, -0.8f, 0.98f)
                curveToRelative(-0.08f, 0.02f, -1.64f, 0.32f, -4.22f, 0.46f)
                curveToRelative(-0.12f, 1.46f, -0.85f, 2.06f, -2.48f, 2.06f)
                reflectiveCurveToRelative(-2.36f, -0.6f, -2.48f, -2.06f)
                curveToRelative(-2.58f, -0.14f, -4.14f, -0.44f, -4.22f, -0.46f)
                curveToRelative(-0.47f, -0.09f, -0.8f, -0.5f, -0.8f, -0.98f)
                curveToRelative(0f, -4.6f, 1.83f, -6.94f, 5.86f, -7.41f)
                curveToRelative(-0.4f, -2.31f, -1.72f, -3.09f, -4.86f, -3.09f)
                curveToRelative(-3.83f, 0f, -5f, 1.15f, -5f, 4.91f)
                curveToRelative(0f, 5.35f, 0.47f, 12.42f, 0.48f, 12.49f)
                curveToRelative(0.06f, 0.83f, -0.57f, 1.54f, -1.4f, 1.6f)
                curveToRelative(-0.82f, 0.06f, -1.54f, -0.57f, -1.6f, -1.4f)
                curveToRelative(-0.01f, -0.07f, -0.48f, -7.24f, -0.48f, -12.69f)
                curveToRelative(0.0f, -5.4f, 2.54f, -7.91f, 8.0f, -7.91f)
                curveToRelative(4.82f, 0f, 7.35f, 1.94f, 7.88f, 6.07f)
                curveToRelative(4.21f, 0.4f, 6.12f, 2.73f, 6.12f, 7.43f)
                close()
            }
        }.also { _LampStreet = it}

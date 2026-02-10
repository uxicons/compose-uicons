package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatChef: ImageVector? = null

val Icons.Sc.HatChef: ImageVector
    get() = _HatChef ?: UXIcon(name = "HatChef") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.0f, 12.67f)
                curveToRelative(-0.1f, 0.97f, -0.15f, 1.95f, -0.15f, 2.91f)
                curveToRelative(0f, 0.01f, 0f, 0.03f, 0f, 0.04f)
                horizontalLineTo(20.15f)
                curveToRelative(0f, -0.01f, 0f, -0.03f, 0f, -0.04f)
                curveToRelative(0f, -0.96f, -0.05f, -1.94f, -0.15f, -2.91f)
                curveToRelative(1.46f, -0.77f, 2.39f, -2.27f, 2.39f, -3.96f)
                curveToRelative(0f, -2.48f, -2.02f, -4.49f, -4.51f, -4.49f)
                curveToRelative(-0.26f, 0f, -0.52f, 0.02f, -0.77f, 0.07f)
                curveToRelative(-0.89f, -1.97f, -2.87f, -3.28f, -5.11f, -3.28f)
                reflectiveCurveToRelative(-4.22f, 1.31f, -5.11f, 3.28f)
                curveToRelative(-0.25f, -0.04f, -0.51f, -0.07f, -0.77f, -0.07f)
                curveToRelative(-2.48f, 0f, -4.51f, 2.01f, -4.51f, 4.49f)
                curveToRelative(0f, 1.69f, 0.93f, 3.2f, 2.39f, 3.96f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.93f, 17.62f)
                curveToRelative(0.22f, 2.6f, 0.8f, 3.88f, 0.83f, 3.95f)
                curveToRelative(0.12f, 0.26f, 0.35f, 0.46f, 0.62f, 0.54f)
                curveToRelative(0.12f, 0.04f, 3.1f, 0.9f, 6.61f, 0.9f)
                reflectiveCurveToRelative(6.49f, -0.86f, 6.61f, -0.9f)
                curveToRelative(0.28f, -0.08f, 0.51f, -0.28f, 0.63f, -0.54f)
                curveToRelative(0.03f, -0.07f, 0.61f, -1.36f, 0.83f, -3.94f)
                horizontalLineTo(3.93f)
                close()
            }
        }.also { _HatChef = it}

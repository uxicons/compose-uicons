package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LessThan: ImageVector? = null

val Icons.Tr.LessThan: ImageVector
    get() = _LessThan ?: UXIcon(name = "LessThan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 24f)
                curveToRelative(-0.07f, 0f, -0.13f, -0.01f, -0.2f, -0.04f)
                lineTo(1.8f, 14.64f)
                curveToRelative(-1.1f, -0.45f, -1.83f, -1.51f, -1.8f, -2.65f)
                curveToRelative(0.03f, -1.09f, 0.74f, -2.08f, 1.81f, -2.52f)
                lineTo(23.3f, 0.04f)
                curveToRelative(0.25f, -0.11f, 0.55f, 0.0f, 0.66f, 0.26f)
                reflectiveCurveToRelative(-0.0f, 0.55f, -0.26f, 0.66f)
                lineTo(2.2f, 10.39f)
                curveToRelative(-0.72f, 0.29f, -1.18f, 0.93f, -1.2f, 1.62f)
                curveToRelative(-0.02f, 0.72f, 0.46f, 1.41f, 1.19f, 1.7f)
                lineToRelative(21.51f, 9.32f)
                curveToRelative(0.25f, 0.11f, 0.37f, 0.4f, 0.26f, 0.66f)
                curveToRelative(-0.08f, 0.19f, -0.27f, 0.3f, -0.46f, 0.3f)
                close()
            }
        }.also { _LessThan = it}

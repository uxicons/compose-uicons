package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Terminal: ImageVector? = null

val Icons.Br.Terminal: ImageVector
    get() = _Terminal ?: UXIcon(name = "Terminal") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.97f, 14.47f)
            lineToRelative(-7.44f, 7.11f)
            curveToRelative(-0.29f, 0.28f, -0.66f, 0.42f, -1.04f, 0.42f)
            curveToRelative(-0.4f, 0f, -0.79f, -0.16f, -1.08f, -0.46f)
            curveToRelative(-0.57f, -0.6f, -0.55f, -1.55f, 0.05f, -2.12f)
            lineToRelative(7.41f, -7.09f)
            curveToRelative(0.17f, -0.17f, 0.17f, -0.49f, -0.02f, -0.68f)
            lineTo(0.46f, 4.58f)
            curveToRelative(-0.6f, -0.57f, -0.62f, -1.52f, -0.05f, -2.12f)
            curveToRelative(0.57f, -0.6f, 1.52f, -0.62f, 2.12f, -0.05f)
            lineToRelative(7.41f, 7.09f)
            curveToRelative(1.39f, 1.39f, 1.39f, 3.61f, 0.02f, 4.97f)
            close()
            moveTo(22.5f, 19f)
            lineTo(11.5f, 19f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(11f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _Terminal = it }

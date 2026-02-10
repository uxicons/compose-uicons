package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _5: ImageVector? = null

val Icons.Br.Five: ImageVector
    get() = _5 ?: UXIcon(name = "Five") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 24f)
            horizontalLineTo(5.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(1.23f, 0f, 2.38f, -0.48f, 3.23f, -1.37f)
            curveToRelative(0.85f, -0.88f, 1.3f, -2.04f, 1.27f, -3.27f)
            curveToRelative(-0.07f, -2.4f, -2.2f, -4.36f, -4.75f, -4.36f)
            horizontalLineTo(5.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineTo(4.5f)
            curveTo(4f, 2.02f, 6.02f, 0f, 8.5f, 0f)
            horizontalLineToRelative(9f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(8.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(4.5f)
            horizontalLineToRelative(5.25f)
            curveToRelative(4.15f, 0f, 7.63f, 3.26f, 7.75f, 7.27f)
            curveToRelative(0.06f, 2.05f, -0.69f, 3.98f, -2.11f, 5.45f)
            curveToRelative(-1.43f, 1.47f, -3.34f, 2.28f, -5.38f, 2.28f)
            close()
        }
    }.also { _5 = it }

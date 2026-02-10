package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToLeft: ImageVector? = null

val Icons.Sc.ArrowAltToLeft: ImageVector
    get() = _ArrowAltToLeft ?: UXIcon(name = "ArrowAltToLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 19f)
                verticalLineToRelative(-4.27f)
                curveToRelative(1.24f, 0.93f, 2.95f, 1.91f, 5.05f, 2.42f)
                curveToRelative(0.44f, 0.11f, 0.9f, -0.09f, 1.11f, -0.49f)
                curveToRelative(0.04f, -0.07f, 0.78f, -1.45f, 1.1f, -3.16f)
                horizontalLineToRelative(10.23f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(11.25f)
                curveToRelative(-0.35f, -1.72f, -1.15f, -3.11f, -1.19f, -3.18f)
                curveToRelative(-0.22f, -0.38f, -0.67f, -0.57f, -1.09f, -0.47f)
                curveToRelative(-2.07f, 0.49f, -3.75f, 1.46f, -4.97f, 2.39f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _ArrowAltToLeft = it}

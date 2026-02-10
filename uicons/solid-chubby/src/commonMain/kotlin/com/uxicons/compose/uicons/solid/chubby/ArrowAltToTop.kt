package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToTop: ImageVector? = null

val Icons.Sc.ArrowAltToTop: ImageVector
    get() = _ArrowAltToTop ?: UXIcon(name = "ArrowAltToTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 4f)
                horizontalLineToRelative(4.27f)
                curveToRelative(-0.93f, 1.24f, -1.91f, 2.95f, -2.42f, 5.05f)
                curveToRelative(-0.11f, 0.44f, 0.09f, 0.9f, 0.49f, 1.11f)
                curveToRelative(0.07f, 0.04f, 1.45f, 0.78f, 3.16f, 1.1f)
                verticalLineToRelative(10.23f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(11.25f)
                curveToRelative(1.72f, -0.35f, 3.11f, -1.15f, 3.18f, -1.19f)
                curveToRelative(0.38f, -0.22f, 0.57f, -0.67f, 0.47f, -1.09f)
                curveToRelative(-0.49f, -2.07f, -1.46f, -3.75f, -2.39f, -4.97f)
                horizontalLineToRelative(4.24f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }.also { _ArrowAltToTop = it}

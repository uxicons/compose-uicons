package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromLeft: ImageVector? = null

val Icons.Sc.ArrowAltFromLeft: ImageVector
    get() = _ArrowAltFromLeft ?: UXIcon(name = "ArrowAltFromLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.0f, 18.5f)
                verticalLineToRelative(-5f)
                horizontalLineTo(13.03f)
                curveToRelative(0.35f, 1.89f, 1.18f, 3.43f, 1.23f, 3.51f)
                curveToRelative(0.22f, 0.4f, 0.68f, 0.59f, 1.11f, 0.48f)
                curveToRelative(4.57f, -1.14f, 7.33f, -4.74f, 7.43f, -4.89f)
                curveToRelative(0.47f, -0.68f, -0.02f, -1.23f, -0.04f, -1.24f)
                curveToRelative(-0.5f, -0.62f, -3.19f, -3.74f, -7.48f, -4.85f)
                curveToRelative(-0.45f, -0.12f, -0.92f, 0.1f, -1.14f, 0.51f)
                curveToRelative(-0.04f, 0.08f, -0.82f, 1.61f, -1.14f, 3.48f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _ArrowAltFromLeft = it}

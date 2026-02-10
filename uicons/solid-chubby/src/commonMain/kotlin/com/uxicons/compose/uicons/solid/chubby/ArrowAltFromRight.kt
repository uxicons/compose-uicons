package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromRight: ImageVector? = null

val Icons.Sc.ArrowAltFromRight: ImageVector
    get() = _ArrowAltFromRight ?: UXIcon(name = "ArrowAltFromRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.0f, 5.5f)
                verticalLineToRelative(5f)
                horizontalLineTo(10.97f)
                curveToRelative(-0.35f, -1.89f, -1.18f, -3.43f, -1.23f, -3.51f)
                curveToRelative(-0.22f, -0.4f, -0.68f, -0.59f, -1.11f, -0.48f)
                curveTo(4.06f, 7.64f, 1.31f, 11.24f, 1.2f, 11.4f)
                curveToRelative(-0.47f, 0.68f, 0.02f, 1.23f, 0.04f, 1.24f)
                curveToRelative(0.5f, 0.62f, 3.19f, 3.74f, 7.48f, 4.85f)
                curveToRelative(0.45f, 0.12f, 0.92f, -0.1f, 1.14f, -0.51f)
                curveToRelative(0.04f, -0.08f, 0.82f, -1.61f, 1.14f, -3.48f)
                horizontalLineToRelative(9.01f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(5.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.also { _ArrowAltFromRight = it}

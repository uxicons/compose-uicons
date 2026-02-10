package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromBottom: ImageVector? = null

val Icons.Sc.ArrowAltFromBottom: ImageVector
    get() = _ArrowAltFromBottom ?: UXIcon(name = "ArrowAltFromBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 20f)
                horizontalLineToRelative(-5f)
                verticalLineTo(10.97f)
                curveToRelative(1.89f, -0.35f, 3.43f, -1.18f, 3.51f, -1.23f)
                curveToRelative(0.4f, -0.22f, 0.59f, -0.68f, 0.48f, -1.11f)
                curveToRelative(-1.14f, -4.57f, -4.74f, -7.33f, -4.89f, -7.43f)
                curveToRelative(-0.68f, -0.47f, -1.23f, 0.02f, -1.24f, 0.04f)
                curveToRelative(-0.62f, 0.5f, -3.74f, 3.19f, -4.85f, 7.48f)
                curveToRelative(-0.12f, 0.45f, 0.1f, 0.92f, 0.51f, 1.14f)
                curveToRelative(0.08f, 0.04f, 1.61f, 0.82f, 3.48f, 1.14f)
                verticalLineToRelative(9.01f)
                horizontalLineTo(5.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _ArrowAltFromBottom = it}

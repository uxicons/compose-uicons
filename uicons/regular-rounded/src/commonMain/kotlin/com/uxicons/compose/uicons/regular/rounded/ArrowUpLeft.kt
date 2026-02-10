package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpLeft: ImageVector? = null

val Icons.Rr.ArrowUpLeft: ImageVector
    get() = _ArrowUpLeft ?: UXIcon(name = "ArrowUpLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 22.29f)
                lineTo(3.48f, 2.07f)
                curveToRelative(0.17f, -0.04f, 0.34f, -0.07f, 0.52f, -0.07f)
                horizontalLineTo(13f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(4f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineTo(13f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.18f, 0.02f, -0.35f, 0.07f, -0.52f)
                lineTo(22.29f, 23.71f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.also { _ArrowUpLeft = it}

package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _R: ImageVector? = null

val Icons.Sr.R: ImageVector
    get() = _R ?: UXIcon(name = "R") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.38f, 14.42f)
                curveToRelative(2.71f, -1.13f, 4.62f, -3.81f, 4.62f, -6.92f)
                curveToRelative(0f, -4.14f, -3.36f, -7.5f, -7.5f, -7.5f)
                lineTo(7f, 0f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                lineTo(2f, 23f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(4f, 15f)
                lineTo(14.5f, 15f)
                curveToRelative(0.3f, 0f, 0.59f, -0.02f, 0.88f, -0.06f)
                lineToRelative(4.75f, 8.54f)
                curveToRelative(0.18f, 0.33f, 0.52f, 0.52f, 0.88f, 0.52f)
                curveToRelative(0.16f, 0f, 0.33f, -0.04f, 0.48f, -0.13f)
                curveToRelative(0.48f, -0.27f, 0.66f, -0.88f, 0.39f, -1.36f)
                lineToRelative(-4.5f, -8.09f)
                close()
                moveTo(4f, 13f)
                lineTo(4f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(7.5f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                lineTo(4f, 13f)
                close()
            }
        }.also { _R = it}

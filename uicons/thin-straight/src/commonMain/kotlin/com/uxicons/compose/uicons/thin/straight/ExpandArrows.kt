package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExpandArrows: ImageVector? = null

val Icons.Ts.ExpandArrows: ImageVector
    get() = _ExpandArrows ?: UXIcon(name = "ExpandArrows") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8f)
                verticalLineTo(2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-6f)
                verticalLineTo(1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.03f, 0f, 0.06f, 0.02f, 0.09f, 0.02f)
                lineTo(11.92f, 11.19f)
                lineTo(1.78f, 1.04f)
                curveToRelative(0.07f, -0.02f, 0.14f, -0.04f, 0.22f, -0.04f)
                horizontalLineToRelative(6f)
                verticalLineTo(0f)
                horizontalLineTo(2f)
                curveTo(0.9f, 0f, 0f, 0.9f, 0f, 2f)
                verticalLineToRelative(6f)
                horizontalLineTo(1f)
                verticalLineTo(2f)
                curveToRelative(0f, -0.09f, 0.03f, -0.18f, 0.05f, -0.26f)
                lineTo(11.21f, 11.9f)
                lineTo(1.02f, 22.09f)
                curveToRelative(-0.0f, -0.03f, -0.02f, -0.06f, -0.02f, -0.09f)
                verticalLineToRelative(-6f)
                horizontalLineTo(0f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                horizontalLineTo(2f)
                curveToRelative(-0.14f, 0f, -0.27f, -0.03f, -0.39f, -0.08f)
                lineTo(11.92f, 12.6f)
                lineToRelative(10.34f, 10.34f)
                curveToRelative(-0.09f, 0.02f, -0.17f, 0.05f, -0.26f, 0.05f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.08f, -0.03f, 0.15f, -0.04f, 0.22f)
                lineTo(12.63f, 11.9f)
                lineTo(22.92f, 1.61f)
                curveToRelative(0.05f, 0.12f, 0.08f, 0.25f, 0.08f, 0.39f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                close()
            }
        }.also { _ExpandArrows = it}

package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _M: ImageVector? = null

val Icons.Ts.M: ImageVector
    get() = _M ?: UXIcon(name = "M") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                horizontalLineToRelative(-1f)
                verticalLineTo(2.06f)
                curveToRelative(0f, -0.51f, -0.24f, -0.88f, -0.65f, -1.01f)
                curveToRelative(-0.36f, -0.11f, -0.87f, -0.02f, -1.19f, 0.44f)
                lineTo(12f, 15.54f)
                lineTo(2.83f, 1.47f)
                curveToRelative(-0.31f, -0.45f, -0.82f, -0.54f, -1.18f, -0.43f)
                curveToRelative(-0.41f, 0.13f, -0.65f, 0.5f, -0.65f, 1.01f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(2.06f)
                curveTo(0f, 1.11f, 0.52f, 0.35f, 1.35f, 0.09f)
                curveToRelative(0.85f, -0.27f, 1.78f, 0.06f, 2.31f, 0.82f)
                lineTo(12f, 13.71f)
                lineTo(20.33f, 0.93f)
                curveToRelative(0.54f, -0.77f, 1.47f, -1.1f, 2.32f, -0.83f)
                curveToRelative(0.83f, 0.26f, 1.35f, 1.01f, 1.35f, 1.96f)
                verticalLineTo(24f)
                close()
            }
        }.also { _M = it}

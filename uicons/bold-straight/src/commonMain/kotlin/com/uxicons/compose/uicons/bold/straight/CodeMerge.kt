package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeMerge: ImageVector? = null

val Icons.Bs.CodeMerge: ImageVector
    get() = _CodeMerge ?: UXIcon(name = "CodeMerge") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                curveToRelative(-1.4f, 0f, -2.6f, -0.82f, -3.16f, -2f)
                horizontalLineTo(6.5f)
                curveToRelative(-0.53f, 0f, -1.03f, -0.09f, -1.5f, -0.26f)
                verticalLineToRelative(4.59f)
                curveToRelative(1.18f, 0.56f, 2f, 1.77f, 2f, 3.16f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0f, -1.4f, 0.82f, -2.6f, 2f, -3.16f)
                verticalLineTo(6.66f)
                curveTo(0.82f, 6.1f, 0f, 4.9f, 0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 1.4f, -0.82f, 2.6f, -2f, 3.16f)
                verticalLineToRelative(1.84f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(10.84f)
                curveToRelative(0.56f, -1.18f, 1.77f, -2f, 3.16f, -2f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
            }
        }.also { _CodeMerge = it}

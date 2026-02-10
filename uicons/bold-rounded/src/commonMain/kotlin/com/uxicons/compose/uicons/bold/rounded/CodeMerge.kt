package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeMerge: ImageVector? = null

val Icons.Br.CodeMerge: ImageVector
    get() = _CodeMerge ?: UXIcon(name = "CodeMerge") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 9f)
            curveToRelative(-1.4f, 0f, -2.6f, 0.82f, -3.16f, 2f)
            horizontalLineTo(7.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-1.84f)
            curveToRelative(1.18f, -0.56f, 2f, -1.77f, 2f, -3.16f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            reflectiveCurveTo(0f, 1.57f, 0f, 3.5f)
            curveToRelative(0f, 1.4f, 0.82f, 2.6f, 2f, 3.16f)
            verticalLineToRelative(10.67f)
            curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
            curveToRelative(0f, -1.4f, -0.82f, -2.6f, -2f, -3.16f)
            verticalLineToRelative(-3.94f)
            curveToRelative(0.75f, 0.38f, 1.6f, 0.6f, 2.5f, 0.6f)
            horizontalLineToRelative(9.84f)
            curveToRelative(0.56f, 1.18f, 1.77f, 2f, 3.16f, 2f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
            close()
        }
    }.also { _CodeMerge = it }

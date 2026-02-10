package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortDown: ImageVector? = null

val Icons.Br.SortDown: ImageVector
    get() = _SortDown ?: UXIcon(name = "SortDown") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.56f, 18f)
            curveToRelative(-0.85f, 0f, -1.68f, -0.35f, -2.25f, -0.96f)
            lineTo(3.29f, 11.26f)
            curveToRelative(-0.74f, -0.77f, -0.93f, -1.79f, -0.54f, -2.71f)
            curveToRelative(0.4f, -0.94f, 1.32f, -1.54f, 2.36f, -1.54f)
            horizontalLineToRelative(12.89f)
            curveToRelative(1.04f, 0f, 1.96f, 0.6f, 2.36f, 1.54f)
            curveToRelative(0.39f, 0.92f, 0.2f, 1.95f, -0.5f, 2.68f)
            lineToRelative(-6.1f, 5.87f)
            curveToRelative(-0.53f, 0.56f, -1.35f, 0.91f, -2.2f, 0.91f)
            close()
            moveTo(6.31f, 10f)
            lineToRelative(5.24f, 5f)
            curveToRelative(0.02f, -0.02f, 5.24f, -5f, 5.24f, -5f)
            horizontalLineTo(6.31f)
            close()
        }
    }.also { _SortDown = it }

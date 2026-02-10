package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperclipVertical: ImageVector? = null

val Icons.Br.PaperclipVertical: ImageVector
    get() = _PaperclipVertical ?: UXIcon(name = "PaperclipVertical") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            verticalLineTo(6.5f)
            curveTo(3f, 2.92f, 5.92f, 0f, 9.5f, 0f)
            reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
            verticalLineTo(15f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            verticalLineTo(6.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineTo(15f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
            verticalLineTo(6.5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineTo(15f)
            curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
            verticalLineTo(4.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineTo(15f)
            curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
            close()
        }
    }.also { _PaperclipVertical = it }

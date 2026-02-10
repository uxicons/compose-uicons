package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotebookAlt: ImageVector? = null

val Icons.Br.NotebookAlt: ImageVector
    get() = _NotebookAlt ?: UXIcon(name = "NotebookAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 0f)
            lineTo(8.5f, 0f)
            curveToRelative(-2.13f, 0f, -3.99f, 1.22f, -4.9f, 3f)
            horizontalLineToRelative(-1.1f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.1f)
            curveToRelative(0.91f, 1.78f, 2.77f, 3f, 4.9f, 3f)
            horizontalLineToRelative(9f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(23f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(6f, 18.5f)
            lineTo(6f, 5.5f)
            curveToRelative(0f, -1.21f, 0.86f, -2.22f, 2f, -2.45f)
            lineTo(8f, 20.95f)
            curveToRelative(-1.14f, -0.23f, -2f, -1.24f, -2f, -2.45f)
            close()
            moveTo(20f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-6.5f)
            lineTo(11f, 3f)
            horizontalLineToRelative(6.5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(13f)
            close()
        }
    }.also { _NotebookAlt = it }

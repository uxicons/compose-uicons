package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperPlaneTop: ImageVector? = null

val Icons.Br.PaperPlaneTop: ImageVector
    get() = _PaperPlaneTop ?: UXIcon(name = "PaperPlaneTop") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21.7f, 8.38f)
            lineTo(4.57f, 0.32f)
            curveTo(3.4f, -0.24f, 2.02f, -0.05f, 1.06f, 0.82f)
            curveTo(0.09f, 1.69f, -0.25f, 3.05f, 0.2f, 4.27f)
            curveToRelative(0.02f, 0.06f, 4.11f, 7.73f, 4.11f, 7.73f)
            curveToRelative(0f, 0f, -4.0f, 7.66f, -4.03f, 7.73f)
            curveToRelative(-0.45f, 1.23f, -0.1f, 2.58f, 0.86f, 3.45f)
            curveToRelative(0.6f, 0.54f, 1.36f, 0.82f, 2.12f, 0.82f)
            curveToRelative(0.47f, 0f, 0.94f, -0.1f, 1.38f, -0.32f)
            lineToRelative(17.06f, -8.05f)
            curveToRelative(1.42f, -0.67f, 2.3f, -2.06f, 2.3f, -3.62f)
            curveToRelative(-0.0f, -1.57f, -0.89f, -2.96f, -2.3f, -3.62f)
            close()
            moveTo(3.0f, 3.18f)
            curveToRelative(-0.0f, -0.04f, 0.01f, -0.08f, 0.06f, -0.13f)
            curveToRelative(0.09f, -0.08f, 0.16f, -0.05f, 0.2f, -0.03f)
            curveToRelative(0.01f, 0.0f, 0.01f, 0.01f, 0.02f, 0.01f)
            lineToRelative(15.87f, 7.47f)
            lineTo(6.9f, 10.5f)
            lineTo(3.0f, 3.18f)
            close()
            moveTo(3.34f, 20.98f)
            curveToRelative(-0.04f, 0.02f, -0.11f, 0.05f, -0.19f, -0.03f)
            curveToRelative(-0.06f, -0.05f, -0.07f, -0.1f, -0.06f, -0.14f)
            lineToRelative(3.83f, -7.31f)
            horizontalLineToRelative(12.27f)
            lineToRelative(-15.84f, 7.48f)
            close()
        }
    }.also { _PaperPlaneTop = it }

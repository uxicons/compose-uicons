package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Confluence: ImageVector? = null

val Icons.Brand.Confluence: ImageVector
    get() = _Confluence ?: UXIcon(name = "Confluence") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(0.87f, 18.06f)
            curveToRelative(-0.25f, 0.4f, -0.54f, 0.87f, -0.76f, 1.23f)
            curveToRelative(-0.22f, 0.36f, -0.11f, 0.83f, 0.25f, 1.05f)
            lineToRelative(4.97f, 3.05f)
            curveToRelative(0.36f, 0.22f, 0.83f, 0.11f, 1.05f, -0.25f)
            curveToRelative(0.18f, -0.33f, 0.43f, -0.76f, 0.72f, -1.23f)
            curveToRelative(1.96f, -3.23f, 3.95f, -2.87f, 7.5f, -1.16f)
            lineToRelative(4.93f, 2.32f)
            curveToRelative(0.4f, 0.18f, 0.83f, 0f, 1.01f, -0.36f)
            lineToRelative(2.36f, -5.33f)
            curveToRelative(0.18f, -0.36f, 0f, -0.83f, -0.36f, -1.01f)
            curveToRelative(-1.05f, -0.47f, -3.12f, -1.45f, -4.93f, -2.36f)
            curveTo(10.91f, 10.77f, 5.22f, 10.98f, 0.87f, 18.06f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.13f, 5.94f)
            curveToRelative(0.25f, -0.4f, 0.54f, -0.87f, 0.76f, -1.23f)
            curveToRelative(0.22f, -0.36f, 0.11f, -0.83f, -0.25f, -1.05f)
            lineToRelative(-4.97f, -3.05f)
            curveToRelative(-0.36f, -0.22f, -0.83f, -0.11f, -1.05f, 0.25f)
            curveToRelative(-0.18f, 0.33f, -0.43f, 0.76f, -0.72f, 1.23f)
            curveToRelative(-1.96f, 3.23f, -3.95f, 2.87f, -7.5f, 1.16f)
            lineTo(4.46f, 0.94f)
            curveToRelative(-0.4f, -0.18f, -0.83f, 0f, -1.01f, 0.36f)
            lineTo(1.09f, 6.63f)
            curveToRelative(-0.18f, 0.36f, 0f, 0.83f, 0.36f, 1.02f)
            curveToRelative(1.05f, 0.47f, 3.12f, 1.45f, 4.93f, 2.36f)
            curveTo(13.09f, 13.2f, 18.78f, 13.02f, 23.13f, 5.94f)
            close()
        }
    }.also { _Confluence = it }

package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileEdit: ImageVector? = null

val Icons.Br.FileEdit: ImageVector
    get() = _FileEdit ?: UXIcon(name = "FileEdit") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(13f, 9f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            lineTo(11f, 3f)
            horizontalLineToRelative(-5.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(6.34f)
            curveToRelative(1.47f, 0f, 2.85f, 0.57f, 3.89f, 1.61f)
            lineToRelative(2.66f, 2.66f)
            curveToRelative(1.04f, 1.04f, 1.61f, 2.42f, 1.61f, 3.89f)
            verticalLineToRelative(1.34f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(-4f)
            close()
            moveTo(23.51f, 12.85f)
            curveToRelative(-0.88f, -1.07f, -2.46f, -1.13f, -3.41f, -0.18f)
            lineToRelative(-6.81f, 6.81f)
            curveToRelative(-0.81f, 0.81f, -1.27f, 1.92f, -1.27f, 3.06f)
            verticalLineToRelative(0.95f)
            curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(0.95f)
            curveToRelative(1.15f, 0f, 2.25f, -0.46f, 3.06f, -1.27f)
            lineToRelative(6.71f, -6.71f)
            curveToRelative(0.85f, -0.85f, 1.01f, -2.24f, 0.25f, -3.17f)
            close()
        }
    }.also { _FileEdit = it }

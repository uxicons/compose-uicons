package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileExcel: ImageVector? = null

val Icons.Br.FileExcel: ImageVector
    get() = _FileExcel ?: UXIcon(name = "FileExcel") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.39f, 4.27f)
            lineToRelative(-2.66f, -2.66f)
            curveToRelative(-1.04f, -1.04f, -2.42f, -1.61f, -3.89f, -1.61f)
            lineTo(7.5f, -0f)
            curveTo(4.47f, 0f, 2f, 2.47f, 2f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(9f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(22f, 8.16f)
            curveToRelative(0f, -1.47f, -0.57f, -2.85f, -1.61f, -3.89f)
            close()
            moveTo(15.22f, 20.36f)
            curveToRelative(0.35f, 0.42f, 0.3f, 1.05f, -0.13f, 1.41f)
            curveToRelative(-0.19f, 0.16f, -0.41f, 0.23f, -0.64f, 0.23f)
            curveToRelative(-0.29f, 0f, -0.57f, -0.12f, -0.77f, -0.36f)
            lineToRelative(-1.73f, -2.08f)
            lineToRelative(-1.73f, 2.08f)
            curveToRelative(-0.2f, 0.24f, -0.48f, 0.36f, -0.77f, 0.36f)
            curveToRelative(-0.23f, 0f, -0.45f, -0.08f, -0.64f, -0.23f)
            curveToRelative(-0.42f, -0.35f, -0.48f, -0.98f, -0.13f, -1.41f)
            lineToRelative(1.97f, -2.36f)
            lineToRelative(-1.97f, -2.36f)
            curveToRelative(-0.35f, -0.42f, -0.3f, -1.05f, 0.13f, -1.41f)
            curveToRelative(0.43f, -0.35f, 1.06f, -0.3f, 1.41f, 0.13f)
            lineToRelative(1.73f, 2.08f)
            lineToRelative(1.73f, -2.08f)
            curveToRelative(0.35f, -0.42f, 0.98f, -0.48f, 1.41f, -0.13f)
            curveToRelative(0.42f, 0.35f, 0.48f, 0.98f, 0.13f, 1.41f)
            lineToRelative(-1.97f, 2.36f)
            lineToRelative(1.97f, 2.36f)
            close()
            moveTo(5f, 12f)
            lineTo(5f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(5.5f)
            lineTo(13f, 7f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(3f)
            lineTo(5f, 12f)
            close()
        }
    }.also { _FileExcel = it }

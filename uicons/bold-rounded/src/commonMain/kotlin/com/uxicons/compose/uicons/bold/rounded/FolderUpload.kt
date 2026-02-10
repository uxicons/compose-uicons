package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderUpload: ImageVector? = null

val Icons.Br.FolderUpload: ImageVector
    get() = _FolderUpload ?: UXIcon(name = "FolderUpload") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 8.15f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-1.97f, -0.03f, -1.97f, -2.97f, 0f, -3f)
            horizontalLineToRelative(1f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(21f, 8.15f)
            curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.05f, -0.5f)
            lineTo(3f, 7.65f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(1f)
            curveToRelative(1.97f, 0.03f, 1.97f, 2.97f, 0f, 3f)
            horizontalLineToRelative(-1f)
            curveTo(2.47f, 22.65f, 0f, 20.19f, 0f, 17.15f)
            lineTo(0f, 6.15f)
            curveTo(0f, 3.12f, 2.47f, 0.65f, 5.5f, 0.65f)
            horizontalLineToRelative(2.53f)
            curveToRelative(0.54f, 0f, 1.08f, 0.13f, 1.56f, 0.37f)
            lineToRelative(3.15f, 1.58f)
            curveToRelative(0.07f, 0.04f, 0.15f, 0.05f, 0.22f, 0.05f)
            horizontalLineToRelative(5.53f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(15.87f, 13.95f)
            lineToRelative(-3.16f, -3.16f)
            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
            lineToRelative(-3.16f, 3.16f)
            curveToRelative(-0.63f, 0.63f, -0.18f, 1.71f, 0.71f, 1.71f)
            horizontalLineToRelative(1.66f)
            verticalLineToRelative(5.5f)
            curveToRelative(0.03f, 1.97f, 2.97f, 1.97f, 3f, 0f)
            verticalLineToRelative(-5.5f)
            horizontalLineToRelative(1.66f)
            curveToRelative(0.89f, 0f, 1.34f, -1.08f, 0.71f, -1.71f)
            close()
        }
    }.also { _FolderUpload = it }

package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderHeart: ImageVector? = null

val Icons.Br.FolderHeart: ImageVector
    get() = _FolderHeart ?: UXIcon(name = "FolderHeart") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.5f, 12.47f)
            curveToRelative(0f, 1.95f, -2.54f, 4.37f, -3.8f, 5.38f)
            curveToRelative(-0.41f, 0.33f, -0.99f, 0.33f, -1.4f, 0f)
            curveToRelative(-1.26f, -1.01f, -3.8f, -3.43f, -3.8f, -5.38f)
            curveToRelative(0f, -1.37f, 1.01f, -2.48f, 2.25f, -2.48f)
            curveToRelative(1.09f, 0f, 2.04f, 0.86f, 2.24f, 2f)
            horizontalLineToRelative(0f)
            curveToRelative(0.2f, -1.14f, 1.16f, -2f, 2.26f, -2f)
            curveToRelative(1.24f, 0f, 2.25f, 1.11f, 2.25f, 2.48f)
            close()
            moveTo(24f, 8.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5.5f, 23f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 6.5f)
            curveTo(0f, 3.47f, 2.47f, 1f, 5.5f, 1f)
            horizontalLineToRelative(2.53f)
            curveToRelative(0.54f, 0f, 1.08f, 0.13f, 1.56f, 0.37f)
            lineToRelative(3.16f, 1.58f)
            curveToRelative(0.07f, 0.04f, 0.15f, 0.05f, 0.22f, 0.05f)
            horizontalLineToRelative(5.53f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(21f, 8.5f)
            curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.05f, -0.5f)
            lineTo(3f, 8f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(21f, 8.5f)
            close()
        }
    }.also { _FolderHeart = it }

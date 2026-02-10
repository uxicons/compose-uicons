package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderCheck: ImageVector? = null

val Icons.Br.FolderCheck: ImageVector
    get() = _FolderCheck ?: UXIcon(name = "FolderCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.09f, 11.47f)
            curveToRelative(0.57f, 0.6f, 0.55f, 1.55f, -0.05f, 2.12f)
            lineToRelative(-3.58f, 3.41f)
            curveToRelative(-1.28f, 1.33f, -3.65f, 1.33f, -4.93f, -0.03f)
            lineToRelative(-1.52f, -1.35f)
            curveToRelative(-0.62f, -0.55f, -0.67f, -1.5f, -0.12f, -2.12f)
            curveToRelative(0.55f, -0.62f, 1.5f, -0.67f, 2.12f, -0.12f)
            lineToRelative(1.58f, 1.41f)
            curveToRelative(0.36f, 0.28f, 0.45f, 0.28f, 0.78f, 0.06f)
            lineToRelative(3.61f, -3.44f)
            curveToRelative(0.6f, -0.57f, 1.55f, -0.55f, 2.12f, 0.05f)
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
            curveToRelative(0.07f, 0.03f, 0.15f, 0.05f, 0.22f, 0.05f)
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
    }.also { _FolderCheck = it }

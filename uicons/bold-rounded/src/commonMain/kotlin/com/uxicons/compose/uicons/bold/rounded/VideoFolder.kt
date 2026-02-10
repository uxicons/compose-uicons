package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoFolder: ImageVector? = null

val Icons.Br.VideoFolder: ImageVector
    get() = _VideoFolder ?: UXIcon(name = "VideoFolder") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14f, 9.1f)
            verticalLineToRelative(-7.19f)
            curveToRelative(0f, -1.45f, 1.57f, -2.37f, 2.83f, -1.66f)
            lineToRelative(6.2f, 3.6f)
            curveToRelative(1.29f, 0.73f, 1.29f, 2.59f, 0f, 3.31f)
            lineToRelative(-6.2f, 3.6f)
            curveToRelative(-1.27f, 0.71f, -2.83f, -0.2f, -2.83f, -1.66f)
            close()
            moveTo(10f, 13.0f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(3f)
            curveToRelative(0.87f, 0f, 1.6f, -0.56f, 1.88f, -1.33f)
            lineToRelative(1.5f, 1.12f)
            curveToRelative(0.67f, 0.5f, 1.62f, 0.03f, 1.62f, -0.81f)
            verticalLineToRelative(-3.94f)
            curveToRelative(0f, -0.84f, -0.96f, -1.31f, -1.62f, -0.81f)
            lineToRelative(-1.49f, 1.12f)
            curveToRelative(-0.27f, -0.78f, -1.01f, -1.35f, -1.88f, -1.35f)
            close()
            moveTo(22.5f, 10f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-13f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-9.5f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.57f, -0.32f, -1.09f, -0.83f, -1.34f)
            lineToRelative(-1.58f, -0.79f)
            curveToRelative(-0.48f, -0.24f, -1.02f, -0.37f, -1.56f, -0.37f)
            horizontalLineToRelative(-2.53f)
            curveToRelative(-3.03f, 0.0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _VideoFolder = it }

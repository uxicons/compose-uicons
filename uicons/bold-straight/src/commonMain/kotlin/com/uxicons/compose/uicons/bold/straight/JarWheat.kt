package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JarWheat: ImageVector? = null

val Icons.Bs.JarWheat: ImageVector
    get() = _JarWheat ?: UXIcon(name = "JarWheat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 3.26f)
                lineTo(20f, 0f)
                lineTo(4f, 0f)
                verticalLineToRelative(3.26f)
                curveToRelative(-1.22f, 1.01f, -2f, 2.54f, -2f, 4.24f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(22f, 7.5f)
                curveToRelative(0f, -1.7f, -0.78f, -3.23f, -2f, -4.24f)
                close()
                moveTo(19f, 20.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.84f)
                curveToRelative(0.55f, -1.25f, 0.84f, -3.5f, 0.84f, -3.5f)
                curveToRelative(0f, 0f, -3.02f, 0.39f, -4.0f, 1.12f)
                verticalLineToRelative(-1.39f)
                curveToRelative(0.93f, -0.42f, 2.23f, -1.06f, 2.72f, -1.55f)
                curveToRelative(0.8f, -0.8f, 1.28f, -4.18f, 1.28f, -4.18f)
                curveToRelative(0f, 0f, -3.02f, 0.39f, -4.0f, 1.12f)
                verticalLineToRelative(-0.93f)
                curveToRelative(0.53f, -0.74f, 1.0f, -1.55f, 1.0f, -2.12f)
                curveToRelative(0f, -1.3f, -2.5f, -4.54f, -2.5f, -4.54f)
                curveToRelative(0f, 0f, -2.5f, 3.24f, -2.5f, 4.54f)
                curveToRelative(0f, 0.56f, 0.47f, 1.38f, 1.0f, 2.11f)
                verticalLineToRelative(0.93f)
                curveToRelative(-0.97f, -0.73f, -4.0f, -1.12f, -4.0f, -1.12f)
                curveToRelative(0f, 0f, 0.42f, 3.33f, 1.23f, 4.13f)
                curveToRelative(0.5f, 0.5f, 1.83f, 1.16f, 2.77f, 1.59f)
                verticalLineToRelative(1.4f)
                curveToRelative(-0.97f, -0.73f, -4.0f, -1.12f, -4.0f, -1.12f)
                curveToRelative(0f, 0f, 0.29f, 2.26f, 0.84f, 3.5f)
                horizontalLineToRelative(-1.83f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(5.0f, 7.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(13f)
                close()
            }
        }.also { _JarWheat = it}

package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Storyset: ImageVector? = null

val Icons.Brand.Storyset: ImageVector
    get() = _Storyset ?: UXIcon(name = "Storyset") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 8f)
            horizontalLineTo(0.07f)
            curveTo(0.07f, 3.57f, 3.68f, 0f, 8.07f, 0f)
            verticalLineTo(2.68f)
            curveToRelative(-2.89f, 0f, -5.31f, 2.38f, -5.31f, 5.31f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.25f, 16f)
            horizontalLineToRelative(2.68f)
            curveToRelative(0f, 4.43f, -3.61f, 8f, -8f, 8f)
            verticalLineToRelative(-2.68f)
            curveToRelative(2.93f, 0.04f, 5.31f, -2.34f, 5.31f, -5.31f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.74f, 9.49f)
            curveToRelative(-0.96f, -0.49f, -2.49f, -0.96f, -3.86f, -1f)
            curveToRelative(-1.23f, 0f, -1.86f, 0.45f, -1.86f, 1.11f)
            curveToRelative(0f, 0.71f, 0.89f, 0.89f, 1.97f, 1.04f)
            lineToRelative(1.08f, 0.15f)
            curveToRelative(2.64f, 0.41f, 4.09f, 1.56f, 4.09f, 3.61f)
            curveToRelative(0f, 2.49f, -2.05f, 4.13f, -5.54f, 4.13f)
            curveToRelative(-1.64f, 0f, -3.79f, -0.3f, -5.39f, -1.41f)
            lineToRelative(1.3f, -2.49f)
            curveToRelative(1.04f, 0.67f, 2.3f, 1.19f, 4.13f, 1.19f)
            curveToRelative(1.53f, 0f, 2.24f, -0.41f, 2.24f, -1.15f)
            curveToRelative(0f, -0.6f, -0.6f, -0.93f, -2.01f, -1.11f)
            lineToRelative(-1f, -0.15f)
            curveToRelative(-2.79f, -0.37f, -4.2f, -1.6f, -4.2f, -3.69f)
            curveToRelative(0f, -2.49f, 1.94f, -3.94f, 5.1f, -3.94f)
            curveToRelative(1.94f, 0f, 3.46f, 0.37f, 5.06f, 1.15f)
            lineToRelative(-1.09f, 2.56f)
            close()
        }
    }.also { _Storyset = it }

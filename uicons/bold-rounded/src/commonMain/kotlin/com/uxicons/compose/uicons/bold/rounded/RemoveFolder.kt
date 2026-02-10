package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RemoveFolder: ImageVector? = null

val Icons.Br.RemoveFolder: ImageVector
    get() = _RemoveFolder ?: UXIcon(name = "RemoveFolder") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.56f, 17.56f)
            lineToRelative(-1.94f, 1.95f)
            lineToRelative(1.94f, 1.93f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineToRelative(-1.94f, -1.93f)
            lineToRelative(-1.91f, 1.92f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            curveToRelative(-0.59f, -0.58f, -0.59f, -1.53f, 0f, -2.12f)
            lineToRelative(1.91f, -1.92f)
            lineToRelative(-1.94f, -1.93f)
            curveToRelative(-0.59f, -0.58f, -0.59f, -1.53f, 0f, -2.12f)
            curveToRelative(0.58f, -0.59f, 1.54f, -0.59f, 2.12f, 0f)
            lineToRelative(1.94f, 1.93f)
            lineToRelative(1.94f, -1.95f)
            curveToRelative(0.58f, -0.59f, 1.54f, -0.59f, 2.12f, 0f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.53f, 0f, 2.12f)
            close()
            moveTo(18.5f, 3f)
            horizontalLineToRelative(-5.53f)
            curveToRelative(-0.08f, 0f, -0.15f, -0.02f, -0.22f, -0.05f)
            lineToRelative(-3.16f, -1.58f)
            curveToRelative(-0.48f, -0.24f, -1.02f, -0.37f, -1.56f, -0.37f)
            horizontalLineToRelative(-2.53f)
            curveTo(2.47f, 1f, 0f, 3.47f, 0f, 6.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(6f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineTo(5.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineTo(8f)
            horizontalLineTo(20.95f)
            curveToRelative(0.03f, 0.16f, 0.05f, 0.33f, 0.05f, 0.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
        }
    }.also { _RemoveFolder = it }

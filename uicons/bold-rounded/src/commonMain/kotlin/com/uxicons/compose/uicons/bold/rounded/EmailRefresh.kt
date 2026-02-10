package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailRefresh: ImageVector? = null

val Icons.Br.EmailRefresh: ImageVector
    get() = _EmailRefresh ?: UXIcon(name = "EmailRefresh") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 14.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineTo(5.5f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineTo(8.5f)
            curveTo(0f, 5.47f, 2.47f, 3f, 5.5f, 3f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.96f, 0f, -1.78f, 0.55f, -2.2f, 1.34f)
            lineToRelative(6.93f, 6.93f)
            curveToRelative(0.94f, 0.94f, 2.59f, 0.94f, 3.54f, 0f)
            lineToRelative(0.33f, -0.33f)
            curveToRelative(0.59f, -0.58f, 1.53f, -0.58f, 2.12f, 0.0f)
            curveToRelative(0.58f, 0.59f, 0.58f, 1.54f, -0.0f, 2.12f)
            lineToRelative(-0.33f, 0.33f)
            curveToRelative(-1.04f, 1.04f, -2.42f, 1.61f, -3.89f, 1.61f)
            reflectiveCurveToRelative(-2.85f, -0.57f, -3.89f, -1.61f)
            lineTo(3f, 11.28f)
            verticalLineToRelative(7.22f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(22.46f, 0.77f)
            lineToRelative(-0.62f, 0.62f)
            curveToRelative(-1.06f, -0.88f, -2.4f, -1.39f, -3.84f, -1.39f)
            curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            curveToRelative(1.37f, 0f, 2.71f, -0.47f, 3.77f, -1.33f)
            curveToRelative(0.65f, -0.52f, 0.74f, -1.47f, 0.22f, -2.11f)
            curveToRelative(-0.52f, -0.64f, -1.47f, -0.74f, -2.11f, -0.22f)
            curveToRelative(-0.54f, 0.44f, -1.19f, 0.67f, -1.89f, 0.67f)
            curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            curveToRelative(0.62f, 0f, 1.21f, 0.2f, 1.7f, 0.53f)
            lineToRelative(-0.93f, 0.93f)
            curveToRelative(-0.57f, 0.57f, -0.17f, 1.54f, 0.64f, 1.54f)
            horizontalLineToRelative(3.24f)
            curveToRelative(0.75f, 0f, 1.35f, -0.61f, 1.35f, -1.35f)
            verticalLineTo(1.4f)
            curveToRelative(0f, -0.8f, -0.97f, -1.2f, -1.54f, -0.64f)
            close()
        }
    }.also { _EmailRefresh = it }

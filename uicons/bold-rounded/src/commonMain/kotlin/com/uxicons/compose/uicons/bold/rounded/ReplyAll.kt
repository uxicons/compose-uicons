package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReplyAll: ImageVector? = null

val Icons.Br.ReplyAll: ImageVector
    get() = _ReplyAll ?: UXIcon(name = "ReplyAll") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 8f)
            horizontalLineToRelative(-7.19f)
            lineToRelative(5.34f, -5.34f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            reflectiveCurveToRelative(-1.53f, -0.59f, -2.12f, 0f)
            lineTo(7.33f, 7.73f)
            curveToRelative(-0.97f, 0.97f, -0.97f, 2.56f, 0f, 3.54f)
            lineToRelative(7.19f, 7.19f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            lineToRelative(-5.34f, -5.34f)
            horizontalLineToRelative(7.19f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineTo(13.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.46f, 10.56f)
            curveToRelative(-0.28f, -0.28f, -0.44f, -0.66f, -0.44f, -1.06f)
            reflectiveCurveToRelative(0.16f, -0.78f, 0.44f, -1.06f)
            lineTo(9.23f, 2.66f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            reflectiveCurveTo(7.7f, -0.04f, 7.11f, 0.54f)
            lineTo(1.33f, 6.32f)
            curveTo(0.48f, 7.17f, 0.02f, 8.3f, 0.02f, 9.5f)
            reflectiveCurveToRelative(0.47f, 2.33f, 1.32f, 3.18f)
            lineToRelative(5.78f, 5.78f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            lineTo(3.46f, 10.56f)
            close()
        }
    }.also { _ReplyAll = it }

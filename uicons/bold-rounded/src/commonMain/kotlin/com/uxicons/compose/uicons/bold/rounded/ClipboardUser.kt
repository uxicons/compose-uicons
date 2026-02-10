package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardUser: ImageVector? = null

val Icons.Br.ClipboardUser: ImageVector
    get() = _ClipboardUser ?: UXIcon(name = "ClipboardUser") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(9.5f, 10.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(12f, 14f)
            curveToRelative(-2.32f, 0f, -4.41f, 1.58f, -4.97f, 3.75f)
            curveToRelative(-0.08f, 0.3f, -0.01f, 0.62f, 0.18f, 0.86f)
            curveToRelative(0.19f, 0.24f, 0.48f, 0.39f, 0.79f, 0.39f)
            horizontalLineToRelative(8f)
            curveToRelative(0.31f, 0f, 0.6f, -0.14f, 0.79f, -0.39f)
            curveToRelative(0.19f, -0.24f, 0.26f, -0.56f, 0.18f, -0.86f)
            curveToRelative(-0.56f, -2.17f, -2.65f, -3.75f, -4.97f, -3.75f)
            close()
            moveTo(22f, 7.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(7.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(2f, 7.5f)
            curveToRelative(0f, -2.98f, 2.38f, -5.41f, 5.34f, -5.5f)
            curveToRelative(0.56f, -1.18f, 1.77f, -2.0f, 3.16f, -2.0f)
            horizontalLineToRelative(3f)
            curveToRelative(1.4f, 0f, 2.6f, 0.82f, 3.16f, 2.0f)
            curveToRelative(2.96f, 0.09f, 5.34f, 2.52f, 5.34f, 5.5f)
            close()
            moveTo(19f, 7.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(19f, 7.5f)
            close()
        }
    }.also { _ClipboardUser = it }

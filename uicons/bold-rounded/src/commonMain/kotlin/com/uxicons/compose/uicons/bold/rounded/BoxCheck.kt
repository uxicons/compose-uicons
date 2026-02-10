package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxCheck: ImageVector? = null

val Icons.Br.BoxCheck: ImageVector
    get() = _BoxCheck ?: UXIcon(name = "BoxCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.11f, 12.49f)
            curveToRelative(0.56f, 0.61f, 0.52f, 1.56f, -0.1f, 2.12f)
            lineToRelative(-3.74f, 3.41f)
            curveToRelative(-0.61f, 0.61f, -1.49f, 0.98f, -2.42f, 0.98f)
            reflectiveCurveToRelative(-1.81f, -0.36f, -2.48f, -1.02f)
            lineToRelative(-1.43f, -1.41f)
            curveToRelative(-0.59f, -0.58f, -0.6f, -1.53f, -0.01f, -2.12f)
            curveToRelative(0.58f, -0.59f, 1.53f, -0.6f, 2.12f, -0.01f)
            lineToRelative(1.43f, 1.41f)
            curveToRelative(0.13f, 0.14f, 0.28f, 0.15f, 0.36f, 0.15f)
            reflectiveCurveToRelative(0.23f, -0.02f, 0.35f, -0.15f)
            lineToRelative(3.79f, -3.46f)
            curveToRelative(0.61f, -0.56f, 1.56f, -0.52f, 2.12f, 0.1f)
            close()
            moveTo(24f, 6.5f)
            curveToRelative(0f, 0.95f, -0.38f, 1.81f, -1f, 2.45f)
            verticalLineToRelative(9.55f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(6.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(1f, 8.95f)
            curveToRelative(-0.62f, -0.63f, -1f, -1.5f, -1f, -2.45f)
            verticalLineToRelative(-1f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            verticalLineToRelative(1f)
            close()
            moveTo(3f, 6.5f)
            curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
            lineTo(20.5f, 7f)
            curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(5.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(1f)
            close()
            moveTo(20f, 18.5f)
            lineTo(20f, 10f)
            lineTo(4f, 10f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
        }
    }.also { _BoxCheck = it }

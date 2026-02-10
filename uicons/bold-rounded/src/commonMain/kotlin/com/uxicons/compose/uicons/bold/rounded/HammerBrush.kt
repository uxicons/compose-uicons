package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HammerBrush: ImageVector? = null

val Icons.Br.HammerBrush: ImageVector
    get() = _HammerBrush ?: UXIcon(name = "HammerBrush") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21.51f, 13.33f)
            lineToRelative(-2.0f, -1f)
            curveToRelative(0.6f, -2.54f, 0.99f, -5.45f, 0.99f, -6.33f)
            curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
            curveToRelative(0f, 0.88f, 0.38f, 3.79f, 0.99f, 6.33f)
            lineToRelative(-2f, 1f)
            curveToRelative(-1.53f, 0.77f, -2.49f, 2.31f, -2.49f, 4.03f)
            verticalLineToRelative(4.15f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(8f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-4.15f)
            curveToRelative(0f, -1.72f, -0.95f, -3.26f, -2.49f, -4.03f)
            close()
            moveTo(17.5f, 4.75f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            close()
            moveTo(21f, 21f)
            horizontalLineToRelative(-3.28f)
            lineToRelative(-0.74f, -2.67f)
            curveToRelative(-0.17f, -0.44f, -0.79f, -0.44f, -0.95f, 0f)
            lineToRelative(-0.74f, 2.67f)
            horizontalLineToRelative(-1.28f)
            verticalLineToRelative(-3.65f)
            curveToRelative(0f, -0.12f, 0.02f, -0.24f, 0.05f, -0.35f)
            horizontalLineToRelative(6.9f)
            curveToRelative(0.03f, 0.12f, 0.05f, 0.23f, 0.05f, 0.35f)
            verticalLineToRelative(3.65f)
            close()
            moveTo(11.5f, 5f)
            curveToRelative(-0.65f, 0f, -1.2f, -0.42f, -1.41f, -1f)
            horizontalLineToRelative(-1.09f)
            curveToRelative(0f, 0.38f, -0.22f, 0.71f, -0.54f, 0.88f)
            lineToRelative(0.54f, 11.54f)
            curveToRelative(0.05f, 1.41f, -1.08f, 2.59f, -2.5f, 2.59f)
            reflectiveCurveToRelative(-2.55f, -1.17f, -2.5f, -2.59f)
            lineToRelative(0.48f, -11.41f)
            lineTo(1f, 5f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            curveTo(0f, 1.79f, 1.79f, 0f, 4f, 0f)
            horizontalLineToRelative(4f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            horizontalLineToRelative(1.09f)
            curveToRelative(0.21f, -0.58f, 0.76f, -1f, 1.41f, -1f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.45f, 1.65f)
            verticalLineToRelative(2f)
            curveToRelative(0.05f, 0.68f, -0.62f, 1.35f, -1.45f, 1.35f)
            close()
        }
    }.also { _HammerBrush = it }

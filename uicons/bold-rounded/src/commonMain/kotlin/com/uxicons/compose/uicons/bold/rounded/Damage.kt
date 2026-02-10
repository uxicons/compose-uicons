package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Damage: ImageVector? = null

val Icons.Br.Damage: ImageVector
    get() = _Damage ?: UXIcon(name = "Damage") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19f, 0f)
            horizontalLineTo(5f)
            curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            horizontalLineToRelative(14f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            verticalLineTo(5f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            close()
            moveTo(5f, 22f)
            curveToRelative(-0.72f, 0f, -1.37f, -0.27f, -1.89f, -0.69f)
            lineToRelative(8.34f, -4.16f)
            curveToRelative(0.49f, -0.25f, 0.69f, -0.85f, 0.45f, -1.34f)
            curveToRelative(-0.25f, -0.49f, -0.85f, -0.7f, -1.34f, -0.45f)
            lineToRelative(-2.55f, 1.27f)
            verticalLineToRelative(-2.64f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
            verticalLineToRelative(3.63f)
            lineToRelative(-3.94f, 1.97f)
            curveToRelative(-0.04f, -0.2f, -0.06f, -0.4f, -0.06f, -0.6f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
            horizontalLineToRelative(2.02f)
            lineToRelative(2.26f, 4.38f)
            curveToRelative(0.52f, 1.0f, 1.54f, 1.62f, 2.67f, 1.62f)
            horizontalLineToRelative(1.47f)
            lineToRelative(1.71f, 3.0f)
            curveToRelative(0.18f, 0.32f, 0.52f, 0.5f, 0.87f, 0.5f)
            curveToRelative(0.17f, 0f, 0.34f, -0.04f, 0.49f, -0.13f)
            curveToRelative(0.48f, -0.27f, 0.65f, -0.89f, 0.37f, -1.36f)
            lineToRelative(-1.15f, -2.0f)
            horizontalLineToRelative(2.28f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
            horizontalLineToRelative(-6.05f)
            curveToRelative(-0.38f, 0f, -0.72f, -0.21f, -0.89f, -0.54f)
            lineToRelative(-1.79f, -3.46f)
            horizontalLineToRelative(9.72f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 0.22f, -0.03f, 0.43f, -0.07f, 0.64f)
            lineToRelative(-5.29f, -4.41f)
            curveToRelative(-0.42f, -0.35f, -1.05f, -0.29f, -1.41f, 0.13f)
            curveToRelative(-0.35f, 0.42f, -0.3f, 1.05f, 0.13f, 1.41f)
            lineToRelative(5.49f, 4.58f)
            curveToRelative(-0.51f, 0.41f, -1.15f, 0.66f, -1.85f, 0.66f)
            horizontalLineTo(5f)
            close()
        }
    }.also { _Damage = it }

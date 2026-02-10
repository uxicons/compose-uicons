package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Igloo: ImageVector? = null

val Icons.Br.Igloo: ImageVector
    get() = _Igloo ?: UXIcon(name = "Igloo") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(2f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(2f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-6.5f)
            curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
            close()
            moveTo(17f, 10f)
            horizontalLineToRelative(3.78f)
            curveToRelative(0.15f, 0.64f, 0.22f, 1.31f, 0.22f, 2f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-4f)
            close()
            moveTo(19.48f, 7f)
            horizontalLineToRelative(-5.98f)
            lineTo(13.5f, 3.13f)
            curveToRelative(2.49f, 0.42f, 4.63f, 1.86f, 5.98f, 3.87f)
            close()
            moveTo(10.5f, 3.13f)
            verticalLineToRelative(3.87f)
            lineTo(4.52f, 7f)
            curveToRelative(1.35f, -2.02f, 3.49f, -3.46f, 5.98f, -3.87f)
            close()
            moveTo(7f, 14f)
            lineTo(3f, 14f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.69f, 0.08f, -1.36f, 0.22f, -2f)
            horizontalLineToRelative(3.78f)
            verticalLineToRelative(4f)
            close()
            moveTo(7f, 21f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-1.5f)
            lineTo(7f, 17f)
            verticalLineToRelative(4f)
            close()
            moveTo(12f, 13f)
            curveToRelative(-0.71f, 0f, -1.39f, 0.15f, -2f, 0.42f)
            verticalLineToRelative(-3.42f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(3.42f)
            curveToRelative(-0.61f, -0.27f, -1.29f, -0.42f, -2f, -0.42f)
            close()
            moveTo(18.5f, 21f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
        }
    }.also { _Igloo = it }

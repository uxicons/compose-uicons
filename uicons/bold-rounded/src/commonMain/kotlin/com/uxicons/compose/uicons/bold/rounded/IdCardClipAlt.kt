package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IdCardClipAlt: ImageVector? = null

val Icons.Br.IdCardClipAlt: ImageVector
    get() = _IdCardClipAlt ?: UXIcon(name = "IdCardClipAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 4f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-3.5f)
            curveTo(2.47f, 4f, 0f, 6.47f, 0f, 9.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-9f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-9f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(3.77f)
            curveToRelative(0.35f, 0.6f, 0.99f, 1f, 1.73f, 1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.74f, 0f, 1.39f, -0.4f, 1.73f, -1f)
            horizontalLineToRelative(3.77f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(9f)
            close()
            moveTo(9.5f, 11.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(15.97f, 18f)
            curveToRelative(0.06f, 0.24f, 0.01f, 0.49f, -0.14f, 0.69f)
            curveToRelative(-0.15f, 0.2f, -0.38f, 0.31f, -0.63f, 0.31f)
            horizontalLineToRelative(-6.4f)
            curveToRelative(-0.25f, 0f, -0.48f, -0.11f, -0.63f, -0.31f)
            curveToRelative(-0.15f, -0.2f, -0.2f, -0.45f, -0.14f, -0.69f)
            curveToRelative(0.45f, -1.74f, 2.12f, -3f, 3.98f, -3f)
            reflectiveCurveToRelative(3.53f, 1.26f, 3.98f, 3f)
            close()
        }
    }.also { _IdCardClipAlt = it }

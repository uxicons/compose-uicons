package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square5: ImageVector? = null

val Icons.Rr.Square5: ImageVector
    get() = _Square5 ?: UXIcon(name = "Square5") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1.07f, -0.22f, 1.45f, -0.62f)
                curveToRelative(0.38f, -0.4f, 0.57f, -0.93f, 0.55f, -1.48f)
                curveToRelative(-0.06f, -1.04f, -1.03f, -1.89f, -2.17f, -1.89f)
                horizontalLineToRelative(-2.83f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.83f)
                curveToRelative(2.22f, 0f, 4.05f, 1.66f, 4.16f, 3.79f)
                curveToRelative(0.06f, 1.11f, -0.33f, 2.16f, -1.09f, 2.97f)
                curveToRelative(-0.75f, 0.79f, -1.81f, 1.25f, -2.9f, 1.25f)
                close()
                moveTo(24f, 19f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                close()
                moveTo(19f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                close()
            }
        }.also { _Square5 = it}

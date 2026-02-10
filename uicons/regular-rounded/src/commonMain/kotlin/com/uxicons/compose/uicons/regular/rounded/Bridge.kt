package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bridge: ImageVector? = null

val Icons.Rr.Bridge: ImageVector
    get() = _Bridge ?: UXIcon(name = "Bridge") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.47f, 0.87f, 2.83f, 2.26f, 3.54f)
                curveToRelative(1.69f, 0.86f, 2.74f, 2.57f, 2.74f, 4.46f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.89f, 1.05f, -3.6f, 2.74f, -4.46f)
                curveToRelative(1.4f, -0.71f, 2.26f, -2.07f, 2.26f, -3.54f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(22f, 4.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.5f)
                lineTo(18.5f, 2f)
                horizontalLineToRelative(1f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(13f, 5f)
                lineTo(13f, 2f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(7.5f, 5f)
                lineTo(7.5f, 2f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(4.5f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                lineTo(2f, 5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(20.83f, 11.76f)
                curveToRelative(-1.21f, 0.61f, -2.17f, 1.54f, -2.84f, 2.65f)
                curveToRelative(-1.23f, -2.04f, -3.45f, -3.4f, -5.99f, -3.4f)
                reflectiveCurveToRelative(-4.77f, 1.37f, -5.99f, 3.4f)
                curveToRelative(-0.66f, -1.11f, -1.63f, -2.03f, -2.84f, -2.65f)
                curveToRelative(-0.72f, -0.37f, -1.17f, -1.04f, -1.17f, -1.76f)
                verticalLineToRelative(-3.0f)
                lineTo(22f, 7f)
                verticalLineToRelative(3.0f)
                curveToRelative(0f, 0.72f, -0.45f, 1.39f, -1.17f, 1.76f)
                close()
            }
        }.also { _Bridge = it}

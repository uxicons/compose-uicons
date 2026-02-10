package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Monkey: ImageVector? = null

val Icons.Sr.Monkey: ImageVector
    get() = _Monkey ?: UXIcon(name = "Monkey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-5.89f)
                curveToRelative(0f, -1.0f, 0.68f, -1.92f, 1.66f, -2.08f)
                curveToRelative(1.25f, -0.21f, 2.34f, 0.76f, 2.34f, 1.97f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(22f, 3.5f)
                curveToRelative(-0.13f, 0f, -0.25f, 0.01f, -0.37f, 0.04f)
                curveToRelative(-0.79f, -2.06f, -2.79f, -3.54f, -5.13f, -3.54f)
                reflectiveCurveToRelative(-4.34f, 1.47f, -5.13f, 3.54f)
                curveToRelative(-0.12f, -0.02f, -0.24f, -0.04f, -0.37f, -0.04f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                curveToRelative(0.13f, 0f, 0.25f, -0.01f, 0.37f, -0.04f)
                curveToRelative(0.27f, 0.71f, 0.69f, 1.35f, 1.21f, 1.89f)
                curveToRelative(-5.97f, 1.49f, -8.11f, 7.48f, -8.5f, 11.69f)
                curveToRelative(-1.25f, -0.91f, -2.08f, -2.38f, -2.08f, -4.04f)
                lineTo(2.0f, 6f)
                curveToRelative(0f, -2.47f, 1.53f, -4f, 4f, -4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                curveTo(2.41f, 0f, 0f, 2.41f, 0f, 6f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                curveToRelative(0.73f, 0f, 1.41f, 0.21f, 2f, 0.56f)
                verticalLineToRelative(-4.82f)
                curveToRelative(0.72f, -0.6f, 1.29f, -1.38f, 1.63f, -2.28f)
                curveToRelative(0.12f, 0.02f, 0.24f, 0.04f, 0.37f, 0.04f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _Monkey = it}

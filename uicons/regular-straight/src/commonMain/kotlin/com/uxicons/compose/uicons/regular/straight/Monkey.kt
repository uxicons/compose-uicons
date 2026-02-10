package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Monkey: ImageVector? = null

val Icons.Rs.Monkey: ImageVector
    get() = _Monkey ?: UXIcon(name = "Monkey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 3.5f)
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
                lineTo(2f, 6f)
                curveToRelative(0f, -2.47f, 1.53f, -4f, 4f, -4f)
                lineTo(6f, 0f)
                curveTo(2.41f, 0f, 0f, 2.41f, 0f, 6f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-12.26f)
                curveToRelative(0.72f, -0.6f, 1.29f, -1.38f, 1.63f, -2.28f)
                curveToRelative(0.12f, 0.02f, 0.24f, 0.04f, 0.37f, 0.04f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(18f, 22f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(18f, 14.35f)
                curveToRelative(-0.46f, -0.22f, -0.96f, -0.35f, -1.5f, -0.35f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.34f, 0f, -0.66f, -0.04f, -0.98f, -0.1f)
                curveToRelative(0.15f, -2.38f, 1.25f, -10.9f, 9.48f, -10.9f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3.35f)
                close()
                moveTo(16.5f, 9f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _Monkey = it}

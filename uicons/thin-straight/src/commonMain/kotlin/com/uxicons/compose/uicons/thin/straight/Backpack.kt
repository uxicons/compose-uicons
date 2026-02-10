package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Backpack: ImageVector? = null

val Icons.Ts.Backpack: ImageVector
    get() = _Backpack ?: UXIcon(name = "Backpack") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 11f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                close()
                moveTo(24f, 14f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(4.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.95f, 1.61f, -5.53f, 4f, -6.92f)
                verticalLineToRelative(-1.08f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(1.08f)
                curveToRelative(2.39f, 1.39f, 4f, 3.96f, 4f, 6.92f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(9f, 4.59f)
                curveToRelative(0.93f, -0.38f, 1.94f, -0.59f, 3f, -0.59f)
                reflectiveCurveToRelative(2.07f, 0.21f, 3f, 0.59f)
                verticalLineToRelative(-0.59f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                verticalLineToRelative(0.59f)
                close()
                moveTo(5f, 12f)
                verticalLineToRelative(6.14f)
                curveToRelative(1.36f, -2.46f, 3.99f, -4.14f, 7f, -4.14f)
                reflectiveCurveToRelative(5.63f, 1.67f, 7f, 4.14f)
                verticalLineToRelative(-6.14f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                close()
                moveTo(19f, 22f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-1f)
                close()
                moveTo(4f, 22.95f)
                verticalLineToRelative(-7.95f)
                lineTo(1f, 15f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 1.76f, 1.31f, 3.2f, 3f, 3.45f)
                close()
                moveTo(23f, 15f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7.95f)
                curveToRelative(1.69f, -0.24f, 3f, -1.69f, 3f, -3.45f)
                verticalLineToRelative(-4.5f)
                close()
            }
        }.also { _Backpack = it}

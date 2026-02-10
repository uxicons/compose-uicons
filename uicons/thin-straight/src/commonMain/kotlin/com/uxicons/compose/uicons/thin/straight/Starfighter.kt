package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Starfighter: ImageVector? = null

val Icons.Ts.Starfighter: ImageVector
    get() = _Starfighter ?: UXIcon(name = "Starfighter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 6f)
                lineTo(23f, 14f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.07f, -5.98f, -1.31f, -14f, -4.0f, -14f)
                reflectiveCurveToRelative(-3.93f, 8.02f, -4.0f, 14f)
                lineTo(1f, 14f)
                lineTo(1f, 6f)
                lineTo(0f, 6f)
                verticalLineToRelative(15f)
                lineTo(1f, 21f)
                verticalLineToRelative(-2.85f)
                lineToRelative(6.3f, 5.85f)
                horizontalLineToRelative(1.7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.75f)
                lineToRelative(6.25f, -5.85f)
                verticalLineToRelative(2.85f)
                horizontalLineToRelative(1f)
                lineTo(24f, 6f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(12f, 1f)
                curveToRelative(0.73f, 0f, 1.55f, 1.75f, 2.14f, 4.54f)
                curveToRelative(-0.66f, -0.36f, -1.37f, -0.54f, -2.14f, -0.54f)
                reflectiveCurveToRelative(-1.49f, 0.18f, -2.14f, 0.54f)
                curveToRelative(0.59f, -2.79f, 1.41f, -4.54f, 2.14f, -4.54f)
                close()
                moveTo(8f, 23f)
                horizontalLineToRelative(-0.3f)
                lineTo(1f, 16.78f)
                verticalLineToRelative(-1.78f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(8f)
                close()
                moveTo(9f, 21f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -2.8f, 0.23f, -5.4f, 0.59f, -7.55f)
                curveToRelative(0.7f, -0.63f, 1.51f, -0.95f, 2.41f, -0.95f)
                reflectiveCurveToRelative(1.71f, 0.32f, 2.41f, 0.95f)
                curveToRelative(0.36f, 2.15f, 0.59f, 4.75f, 0.59f, 7.55f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(16.35f, 23f)
                horizontalLineToRelative(-0.35f)
                lineTo(16f, 15f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1.78f)
                lineToRelative(-6.65f, 6.22f)
                close()
            }
        }.also { _Starfighter = it}

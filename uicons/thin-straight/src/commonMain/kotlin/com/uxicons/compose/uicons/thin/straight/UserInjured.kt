package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserInjured: ImageVector? = null

val Icons.Ts.UserInjured: ImageVector
    get() = _UserInjured ?: UXIcon(name = "UserInjured") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 14f)
                lineTo(7f, 14f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.12f)
                lineToRelative(-2.22f, -8f)
                horizontalLineToRelative(6.34f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(11.84f, 23f)
                horizontalLineToRelative(-6.34f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2.62f)
                lineToRelative(2.22f, 8f)
                close()
                moveTo(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(15.31f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(16.9f, 5f)
                horizontalLineToRelative(-5.86f)
                lineToRelative(4.04f, -2.94f)
                curveToRelative(0.92f, 0.72f, 1.58f, 1.75f, 1.82f, 2.94f)
                close()
                moveTo(12f, 1f)
                curveToRelative(0.77f, 0f, 1.51f, 0.18f, 2.16f, 0.49f)
                lineToRelative(-4.82f, 3.51f)
                horizontalLineToRelative(-2.24f)
                curveToRelative(0.47f, -2.28f, 2.48f, -4f, 4.9f, -4f)
                close()
                moveTo(17f, 6f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                horizontalLineToRelative(10f)
                close()
            }
        }.also { _UserInjured = it}

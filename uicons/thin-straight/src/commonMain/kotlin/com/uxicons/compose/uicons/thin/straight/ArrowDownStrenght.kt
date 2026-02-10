package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownStrenght: ImageVector? = null

val Icons.Ts.ArrowDownStrenght: ImageVector
    get() = _ArrowDownStrenght ?: UXIcon(name = "ArrowDownStrenght") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23f)
                verticalLineToRelative(1f)
                lineTo(0f, 24f)
                verticalLineToRelative(-1f)
                lineTo(24f, 23f)
                close()
                moveTo(0.47f, 16.88f)
                lineToRelative(-0.44f, 0.9f)
                curveToRelative(0.18f, 0.09f, 4.57f, 2.23f, 11.97f, 2.23f)
                horizontalLineToRelative(0.0f)
                curveToRelative(7.4f, 0f, 11.79f, -2.13f, 11.97f, -2.23f)
                lineToRelative(-0.44f, -0.9f)
                curveToRelative(-0.04f, 0.02f, -4.38f, 2.12f, -11.53f, 2.12f)
                curveToRelative(-7.15f, 0f, -11.49f, -2.1f, -11.53f, -2.12f)
                close()
                moveTo(12.0f, 16f)
                reflectiveCurveToRelative(0f, 0f, 0.0f, 0f)
                curveToRelative(7.3f, -0.0f, 11.79f, -5.23f, 11.98f, -5.45f)
                lineToRelative(-0.77f, -0.65f)
                curveToRelative(-0.04f, 0.05f, -4.38f, 5.09f, -11.21f, 5.09f)
                curveToRelative(-6.82f, 0f, -11.18f, -5.04f, -11.22f, -5.1f)
                lineTo(0.01f, 10.55f)
                curveToRelative(0.19f, 0.22f, 4.68f, 5.45f, 11.98f, 5.45f)
                close()
                moveTo(12f, 11f)
                curveToRelative(0.38f, 0f, 0.76f, -0.15f, 1.05f, -0.44f)
                lineToRelative(3.3f, -3.3f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(-0.0f, -9.7f)
                horizontalLineToRelative(-1f)
                lineToRelative(0.0f, 9.7f)
                lineToRelative(-3.15f, -3.15f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.3f, 3.3f)
                curveToRelative(0.29f, 0.29f, 0.67f, 0.44f, 1.05f, 0.44f)
                close()
            }
        }.also { _ArrowDownStrenght = it}

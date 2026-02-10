package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Escalator: ImageVector? = null

val Icons.Rs.Escalator: ImageVector
    get() = _Escalator ?: UXIcon(name = "Escalator") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-3.63f)
                lineToRelative(-11.6f, 9.82f)
                curveToRelative(-0.9f, 0.76f, -2.05f, 1.18f, -3.23f, 1.18f)
                lineTo(0f, 24f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(3.63f)
                lineToRelative(1.37f, -1.16f)
                verticalLineToRelative(-5.84f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(1f)
                curveToRelative(1.63f, 0f, 2.96f, 1.3f, 3.0f, 2.92f)
                lineToRelative(3.24f, -2.74f)
                curveToRelative(0.9f, -0.76f, 2.05f, -1.18f, 3.23f, -1.18f)
                horizontalLineToRelative(5.54f)
                close()
                moveTo(7f, 13.15f)
                lineToRelative(3f, -2.54f)
                verticalLineToRelative(-1.61f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.15f)
                close()
                moveTo(22f, 7f)
                horizontalLineToRelative(-3.54f)
                curveToRelative(-0.71f, 0f, -1.4f, 0.25f, -1.94f, 0.71f)
                lineToRelative(-12.16f, 10.29f)
                horizontalLineToRelative(-2.37f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3.54f)
                curveToRelative(0.71f, 0f, 1.4f, -0.25f, 1.94f, -0.71f)
                lineToRelative(12.16f, -10.29f)
                horizontalLineToRelative(2.37f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _Escalator = it}

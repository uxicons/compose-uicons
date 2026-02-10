package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Challenge: ImageVector? = null

val Icons.Bs.Challenge: ImageVector
    get() = _Challenge ?: UXIcon(name = "Challenge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 7f)
                verticalLineToRelative(4.01f)
                horizontalLineToRelative(4f)
                lineToRelative(-3f, 3f)
                horizontalLineToRelative(-1.88f)
                lineToRelative(-3.13f, 3.12f)
                curveToRelative(-0.07f, 1.04f, -0.9f, 1.87f, -2f, 1.87f)
                reflectiveCurveToRelative(-2f, -0.93f, -2f, -2f)
                reflectiveCurveToRelative(0.82f, -1.94f, 1.87f, -2f)
                horizontalLineToRelative(0.01f)
                lineToRelative(3.13f, -3.12f)
                verticalLineToRelative(-1.88f)
                lineToRelative(3f, -3f)
                close()
                moveTo(18.74f, 15.19f)
                lineToRelative(-2.94f, 2.94f)
                curveToRelative(-0.49f, 1.65f, -2.01f, 2.87f, -3.82f, 2.87f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -1.81f, 1.22f, -3.32f, 2.87f, -3.82f)
                lineToRelative(2.94f, -2.94f)
                curveToRelative(-0.58f, -0.15f, -1.18f, -0.24f, -1.81f, -0.24f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                curveToRelative(0f, -0.63f, -0.09f, -1.23f, -0.24f, -1.81f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-0.97f)
                curveToRelative(-0.58f, 1.17f, -1.4f, 2.19f, -2.41f, 3f)
                horizontalLineToRelative(6.38f)
                verticalLineToRelative(-12.16f)
                lineToRelative(-3f, 3f)
                verticalLineToRelative(6.16f)
                close()
                moveTo(21f, 2f)
                horizontalLineToRelative(-3f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(6.34f)
                curveToRelative(-1.0f, -0.81f, -1.82f, -1.83f, -2.41f, -3f)
                horizontalLineToRelative(-0.93f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(3.34f)
                curveToRelative(1.54f, -1.25f, 3.51f, -2f, 5.64f, -2f)
                curveToRelative(0.66f, 0f, 1.3f, 0.07f, 1.97f, 0.22f)
                lineToRelative(3.22f, -3.22f)
                horizontalLineToRelative(2.83f)
                verticalLineToRelative(4.01f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4.01f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _Challenge = it}

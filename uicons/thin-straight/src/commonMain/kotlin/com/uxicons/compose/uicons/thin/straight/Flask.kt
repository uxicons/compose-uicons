package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flask: ImageVector? = null

val Icons.Ts.Flask: ImageVector
    get() = _Flask ?: UXIcon(name = "Flask") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 9.43f)
                lineTo(17f, 1f)
                horizontalLineToRelative(2f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8.43f)
                curveToRelative(-1.85f, 1.65f, -7f, 6.6f, -7f, 10.78f)
                curveToRelative(0f, 2.23f, 1.73f, 3.43f, 2.65f, 3.76f)
                lineToRelative(18.62f, 0.03f)
                curveToRelative(0.92f, -0.32f, 2.73f, -1.55f, 2.73f, -3.79f)
                curveToRelative(0f, -4.18f, -5.15f, -9.13f, -7f, -10.78f)
                close()
                moveTo(21.09f, 23f)
                lineTo(2.91f, 23f)
                curveToRelative(-0.36f, -0.15f, -1.91f, -0.92f, -1.91f, -2.79f)
                curveToRelative(0f, -1.34f, 0.64f, -2.81f, 1.53f, -4.21f)
                horizontalLineToRelative(16.51f)
                curveToRelative(-0.25f, -0.33f, -0.51f, -0.67f, -0.79f, -1f)
                lineTo(3.21f, 15f)
                curveToRelative(1.73f, -2.37f, 4.12f, -4.53f, 4.79f, -5.11f)
                lineTo(8f, 1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8.89f)
                curveToRelative(1.14f, 1.0f, 7f, 6.33f, 7f, 10.33f)
                curveToRelative(0f, 1.87f, -1.55f, 2.63f, -1.91f, 2.79f)
                close()
            }
        }.also { _Flask = it}

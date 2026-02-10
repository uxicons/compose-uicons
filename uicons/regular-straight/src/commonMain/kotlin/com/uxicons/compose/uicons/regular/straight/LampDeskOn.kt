package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampDeskOn: ImageVector? = null

val Icons.Rs.LampDeskOn: ImageVector
    get() = _LampDeskOn ?: UXIcon(name = "LampDeskOn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.21f, 12.79f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.5f, -2.5f)
                close()
                moveTo(16f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(21f, 10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18.27f, 12.27f)
                curveToRelative(-0.98f, 0.98f, -2.56f, 0.98f, -3.54f, 0f)
                curveToRelative(-0.06f, -0.06f, -0.09f, -0.12f, -0.14f, -0.17f)
                lineToRelative(-2.86f, 2.86f)
                lineToRelative(-4.11f, -6.16f)
                lineToRelative(-2.62f, 2.62f)
                verticalLineToRelative(10.59f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-11.41f)
                lineToRelative(3.53f, -3.53f)
                curveToRelative(-0.93f, -1.85f, -0.59f, -4.13f, 0.9f, -5.63f)
                curveToRelative(1.64f, -1.64f, 4.23f, -1.9f, 6.16f, -0.61f)
                lineToRelative(7.37f, 4.91f)
                lineToRelative(-2.86f, 2.86f)
                curveToRelative(0.06f, 0.05f, 0.12f, 0.08f, 0.17f, 0.14f)
                curveToRelative(0.98f, 0.98f, 0.98f, 2.56f, 0f, 3.54f)
                close()
                moveTo(12.04f, 11.81f)
                lineTo(17.82f, 6.04f)
                lineTo(12.48f, 2.48f)
                curveToRelative(-0.48f, -0.32f, -1.04f, -0.48f, -1.59f, -0.48f)
                curveToRelative(-0.74f, 0f, -1.49f, 0.29f, -2.04f, 0.84f)
                curveToRelative(-0.97f, 0.97f, -1.12f, 2.5f, -0.36f, 3.63f)
                lineToRelative(3.56f, 5.34f)
                close()
            }
        }.also { _LampDeskOn = it}

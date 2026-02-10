package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackFist: ImageVector? = null

val Icons.Bs.HandBackFist: ImageVector
    get() = _HandBackFist ?: UXIcon(name = "HandBackFist") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 0f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(0.94f)
                lineToRelative(-3.98f, 3.98f)
                curveToRelative(-1.36f, 1.36f, -1.36f, 3.58f, 0.02f, 4.97f)
                lineToRelative(3.95f, 3.79f)
                verticalLineToRelative(6.33f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-5.71f)
                lineToRelative(1.61f, -4.02f)
                curveToRelative(0.26f, -0.65f, 0.39f, -1.34f, 0.39f, -2.04f)
                lineTo(23.0f, 2.18f)
                reflectiveCurveTo(11.45f, 0f, 10f, 0f)
                close()
                moveTo(20f, 12.23f)
                curveToRelative(0f, 0.32f, -0.06f, 0.63f, -0.18f, 0.93f)
                lineToRelative(-1.82f, 4.55f)
                verticalLineToRelative(3.29f)
                lineTo(9f, 21f)
                verticalLineToRelative(-4.61f)
                lineToRelative(-4.85f, -4.66f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(1.85f, -1.85f)
                verticalLineToRelative(1.82f)
                horizontalLineToRelative(3f)
                lineTo(9f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(0.71f, 0f, 5.44f, 0.81f, 10f, 1.67f)
                verticalLineToRelative(7.56f)
                close()
            }
        }.also { _HandBackFist = it}

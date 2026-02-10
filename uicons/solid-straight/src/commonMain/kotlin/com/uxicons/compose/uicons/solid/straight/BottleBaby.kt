package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BottleBaby: ImageVector? = null

val Icons.Ss.BottleBaby: ImageVector
    get() = _BottleBaby ?: UXIcon(name = "BottleBaby") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 6f)
                verticalLineToRelative(1f)
                lineTo(7f, 7f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1.27f)
                curveToRelative(-0.17f, -0.87f, -0.27f, -1.64f, -0.27f, -2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.36f, -0.1f, 1.13f, -0.27f, 2f)
                horizontalLineToRelative(1.27f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(17.89f, 9.44f)
                lineToRelative(-0.39f, -0.44f)
                lineTo(6.5f, 9f)
                lineToRelative(-0.39f, 0.44f)
                curveToRelative(-0.67f, 0.76f, -1.18f, 1.63f, -1.54f, 2.56f)
                horizontalLineToRelative(3.43f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.92f)
                curveToRelative(-0.04f, 0.35f, -0.07f, 0.71f, -0.07f, 1.06f)
                verticalLineToRelative(0.94f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(4f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(4f, 22f)
                verticalLineToRelative(2f)
                lineTo(20f, 24f)
                lineTo(20f, 15.06f)
                curveToRelative(0f, -2.07f, -0.75f, -4.07f, -2.11f, -5.62f)
                close()
            }
        }.also { _BottleBaby = it}

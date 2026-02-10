package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BottleBaby: ImageVector? = null

val Icons.Rs.BottleBaby: ImageVector
    get() = _BottleBaby ?: UXIcon(name = "BottleBaby") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.89f, 9.44f)
                lineToRelative(-0.89f, -1.01f)
                verticalLineToRelative(-2.43f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-1.27f)
                curveToRelative(0.17f, -0.87f, 0.27f, -1.64f, 0.27f, -2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.36f, 0.1f, 1.13f, 0.27f, 2f)
                horizontalLineToRelative(-1.27f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2.43f)
                lineToRelative(-0.89f, 1.01f)
                curveToRelative(-1.36f, 1.56f, -2.11f, 3.55f, -2.11f, 5.62f)
                verticalLineToRelative(8.94f)
                lineTo(20f, 24f)
                lineTo(20f, 15.06f)
                curveToRelative(0f, -2.07f, -0.75f, -4.07f, -2.11f, -5.62f)
                close()
                moveTo(9f, 6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 22f)
                lineTo(6f, 22f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                lineTo(6f, 18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.9f)
                curveToRelative(0.2f, -1.2f, 0.71f, -2.32f, 1.52f, -3.24f)
                lineToRelative(0.66f, -0.76f)
                horizontalLineToRelative(7.44f)
                lineToRelative(0.66f, 0.76f)
                curveToRelative(1.04f, 1.19f, 1.62f, 2.72f, 1.62f, 4.31f)
                verticalLineToRelative(6.94f)
                close()
            }
        }.also { _BottleBaby = it}

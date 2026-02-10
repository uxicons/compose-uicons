package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BottleBaby: ImageVector? = null

val Icons.Bs.BottleBaby: ImageVector
    get() = _BottleBaby ?: UXIcon(name = "BottleBaby") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.9f, 9.53f)
                lineToRelative(-0.9f, -1.02f)
                verticalLineToRelative(-1.51f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-1.37f)
                curveToRelative(0.23f, -1.34f, 0.37f, -2.57f, 0.37f, -3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.43f, 0.14f, 1.66f, 0.37f, 3f)
                horizontalLineToRelative(-1.37f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1.51f)
                lineToRelative(-0.9f, 1.02f)
                curveToRelative(-1.36f, 1.55f, -2.1f, 3.54f, -2.1f, 5.6f)
                verticalLineToRelative(8.87f)
                lineTo(20f, 24.0f)
                lineTo(20f, 15.13f)
                curveToRelative(0f, -2.06f, -0.75f, -4.05f, -2.1f, -5.6f)
                close()
                moveTo(17f, 21f)
                lineTo(7f, 21f)
                verticalLineToRelative(-5f)
                lineTo(15f, 16f)
                verticalLineToRelative(-0.87f)
                curveToRelative(0f, -0.78f, -0.27f, -1.52f, -0.74f, -2.13f)
                lineTo(7.45f, 13f)
                curveToRelative(0.23f, -0.54f, 0.53f, -1.05f, 0.92f, -1.49f)
                lineToRelative(1.32f, -1.51f)
                horizontalLineToRelative(4.64f)
                lineToRelative(1.32f, 1.51f)
                curveToRelative(0.88f, 1.0f, 1.36f, 2.29f, 1.36f, 3.62f)
                verticalLineToRelative(5.87f)
                close()
            }
        }.also { _BottleBaby = it}

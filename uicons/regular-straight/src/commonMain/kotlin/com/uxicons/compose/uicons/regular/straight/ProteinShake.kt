package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ProteinShake: ImageVector? = null

val Icons.Rs.ProteinShake: ImageVector
    get() = _ProteinShake ?: UXIcon(name = "ProteinShake") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.94f, 3.82f)
                curveToRelative(-0.47f, -1.1f, -1.56f, -1.82f, -2.76f, -1.82f)
                horizontalLineToRelative(-6.18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-0.18f)
                curveToRelative(-1.2f, 0f, -2.28f, 0.71f, -2.76f, 1.82f)
                lineToRelative(-1.06f, 2.48f)
                lineToRelative(0.0f, 1.77f)
                lineToRelative(1.06f, 15.93f)
                horizontalLineToRelative(13.87f)
                lineToRelative(1.06f, -16f)
                verticalLineToRelative(-1.71f)
                lineToRelative(-1.06f, -2.48f)
                close()
                moveTo(7.82f, 4f)
                horizontalLineToRelative(8.36f)
                curveToRelative(0.4f, 0f, 0.76f, 0.24f, 0.92f, 0.6f)
                lineToRelative(0.6f, 1.4f)
                horizontalLineToRelative(-11.39f)
                lineToRelative(0.6f, -1.39f)
                curveToRelative(0.16f, -0.37f, 0.52f, -0.61f, 0.92f, -0.61f)
                close()
                moveTo(6.93f, 22f)
                lineTo(6.8f, 20f)
                horizontalLineToRelative(3.2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.33f)
                lineToRelative(-0.13f, -2f)
                horizontalLineToRelative(3.46f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.6f)
                lineToRelative(-0.13f, -2f)
                horizontalLineToRelative(3.73f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.87f)
                lineToRelative(-0.13f, -2f)
                horizontalLineToRelative(12.0f)
                lineToRelative(-0.93f, 14f)
                horizontalLineToRelative(-10.13f)
                close()
            }
        }.also { _ProteinShake = it}

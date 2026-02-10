package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JugBottle: ImageVector? = null

val Icons.Rs.JugBottle: ImageVector
    get() = _JugBottle ?: UXIcon(name = "JugBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.49f, 6.11f)
                lineToRelative(-6.49f, -1.08f)
                verticalLineToRelative(-3.02f)
                horizontalLineToRelative(1f)
                lineTo(14f, 0f)
                lineTo(5f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.18f)
                lineToRelative(-2.05f, 0.77f)
                curveToRelative(-1.17f, 0.44f, -1.95f, 1.56f, -1.95f, 2.81f)
                verticalLineToRelative(15.24f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-14.94f)
                curveToRelative(0f, -1.47f, -1.05f, -2.72f, -2.51f, -2.96f)
                close()
                moveTo(17f, 9.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(4f, 22f)
                verticalLineToRelative(-13.24f)
                curveToRelative(0f, -0.41f, 0.26f, -0.79f, 0.65f, -0.94f)
                lineToRelative(3.35f, -1.26f)
                lineTo(8f, 2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4.72f)
                lineToRelative(4.64f, 0.77f)
                curveToRelative(-0.4f, 0.57f, -0.64f, 1.26f, -0.64f, 2.01f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.54f, 0f, 1.04f, -0.12f, 1.5f, -0.34f)
                verticalLineToRelative(3.84f)
                lineTo(4f, 22.0f)
                close()
            }
        }.also { _JugBottle = it}

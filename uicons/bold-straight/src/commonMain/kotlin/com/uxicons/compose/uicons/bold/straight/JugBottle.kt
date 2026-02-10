package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JugBottle: ImageVector? = null

val Icons.Bs.JugBottle: ImageVector
    get() = _JugBottle ?: UXIcon(name = "JugBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.14f, 5.59f)
                lineToRelative(-5.14f, -0.96f)
                verticalLineToRelative(-1.62f)
                horizontalLineToRelative(1f)
                lineTo(15f, 0f)
                lineTo(5f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1.83f)
                lineToRelative(-1.73f, 0.65f)
                curveToRelative(-1.36f, 0.51f, -2.27f, 1.83f, -2.27f, 3.28f)
                verticalLineToRelative(15.24f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-14.97f)
                curveToRelative(0f, -1.68f, -1.2f, -3.13f, -2.85f, -3.44f)
                close()
                moveTo(17f, 9.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(5f, 21f)
                verticalLineToRelative(-12.24f)
                curveToRelative(0f, -0.21f, 0.13f, -0.4f, 0.33f, -0.47f)
                lineToRelative(3.67f, -1.38f)
                verticalLineToRelative(-3.91f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.12f)
                lineToRelative(3.4f, 0.64f)
                curveToRelative(-0.26f, 0.53f, -0.4f, 1.12f, -0.4f, 1.75f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                curveToRelative(0.34f, 0f, 0.68f, -0.04f, 1f, -0.13f)
                verticalLineToRelative(2.13f)
                lineTo(5f, 21.0f)
                close()
            }
        }.also { _JugBottle = it}

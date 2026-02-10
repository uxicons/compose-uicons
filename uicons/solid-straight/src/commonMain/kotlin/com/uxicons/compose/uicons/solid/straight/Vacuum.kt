package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vacuum: ImageVector? = null

val Icons.Ss.Vacuum: ImageVector
    get() = _Vacuum ?: UXIcon(name = "Vacuum") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                close()
                moveTo(19.5f, 7.32f)
                verticalLineToRelative(-2.32f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-2.51f)
                curveToRelative(-2.49f, 0f, -4.62f, 1.86f, -4.95f, 4.33f)
                lineToRelative(-2.41f, 17.68f)
                lineToRelative(-4.63f, 0.02f)
                lineToRelative(0.01f, 2f)
                lineToRelative(6.37f, -0.03f)
                lineToRelative(2.65f, -19.4f)
                curveToRelative(0.2f, -1.48f, 1.48f, -2.6f, 2.97f, -2.6f)
                horizontalLineToRelative(2.51f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(4.02f)
                curveToRelative(-0.63f, -0.84f, -1.02f, -1.87f, -1.02f, -3f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                curveToRelative(1.13f, 0f, 2.16f, 0.39f, 3f, 1.02f)
                verticalLineToRelative(-3.52f)
                curveToRelative(0f, -2.89f, -1.89f, -5.34f, -4.5f, -6.18f)
                close()
            }
        }.also { _Vacuum = it}

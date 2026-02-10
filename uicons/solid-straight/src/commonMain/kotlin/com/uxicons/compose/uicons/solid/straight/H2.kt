package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H2: ImageVector? = null

val Icons.Ss.H2: ImageVector
    get() = _H2 ?: UXIcon(name = "H2") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                lineTo(2f, 13f)
                verticalLineToRelative(7f)
                lineTo(0f, 20f)
                lineTo(0f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-7f)
                close()
                moveTo(19.14f, 15.59f)
                curveToRelative(2.17f, -1.5f, 4.86f, -3.37f, 4.86f, -6.59f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 2.17f, -1.94f, 3.52f, -4f, 4.95f)
                curveToRelative(-1.97f, 1.36f, -4f, 2.78f, -4f, 5.05f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7.67f)
                curveToRelative(0.54f, -0.83f, 1.65f, -1.6f, 2.81f, -2.41f)
                close()
            }
        }.also { _H2 = it}

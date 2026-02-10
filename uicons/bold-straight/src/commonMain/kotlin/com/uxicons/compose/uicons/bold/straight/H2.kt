package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H2: ImageVector? = null

val Icons.Bs.H2: ImageVector
    get() = _H2 ?: UXIcon(name = "H2") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7f)
                lineTo(3f, 13f)
                verticalLineToRelative(7f)
                lineTo(0f, 20f)
                lineTo(0f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                close()
                moveTo(19.56f, 15.64f)
                curveToRelative(1.98f, -1.58f, 4.44f, -3.56f, 4.44f, -6.64f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 1.64f, -1.61f, 2.93f, -3.31f, 4.29f)
                curveToRelative(-1.81f, 1.45f, -3.69f, 2.95f, -3.69f, 5.21f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6.05f)
                curveToRelative(0.46f, -0.45f, 1.04f, -0.91f, 1.61f, -1.36f)
                close()
            }
        }.also { _H2 = it}

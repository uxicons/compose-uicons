package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TSquare: ImageVector? = null

val Icons.Bs.TSquare: ImageVector
    get() = _TSquare ?: UXIcon(name = "TSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5f)
                reflectiveCurveToRelative(-3.76f, -0.75f, -6.06f, -3.56f)
                curveToRelative(-0.75f, -0.92f, -1.88f, -1.44f, -3.07f, -1.44f)
                horizontalLineToRelative(-5.75f)
                curveToRelative(-1.19f, 0f, -2.31f, 0.53f, -3.07f, 1.44f)
                curveToRelative(-2.3f, 2.81f, -6.06f, 3.56f, -6.06f, 3.56f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(7f)
                close()
                moveTo(10f, 21f)
                verticalLineToRelative(-18f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _TSquare = it}

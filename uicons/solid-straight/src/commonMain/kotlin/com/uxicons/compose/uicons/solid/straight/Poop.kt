package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Poop: ImageVector? = null

val Icons.Ss.Poop: ImageVector
    get() = _Poop ?: UXIcon(name = "Poop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.52f, 17.03f)
                horizontalLineToRelative(-3.52f)
                verticalLineToRelative(-2.03f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-2.15f)
                curveToRelative(-0.49f, -1.87f, -2.17f, -4f, -3.85f, -4f)
                curveToRelative(0f, 2f, -0.75f, 3.25f, -1.5f, 4f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineTo(4.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.62f)
                verticalLineToRelative(0.03f)
                horizontalLineTo(3.48f)
                curveToRelative(-1.92f, 0f, -3.48f, 1.56f, -3.48f, 3.48f)
                reflectiveCurveToRelative(1.56f, 3.48f, 3.48f, 3.48f)
                horizontalLineToRelative(17.03f)
                curveToRelative(1.92f, 0f, 3.48f, -1.56f, 3.48f, -3.48f)
                reflectiveCurveToRelative(-1.56f, -3.48f, -3.48f, -3.48f)
                close()
            }
        }.also { _Poop = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoVaping: ImageVector? = null

val Icons.Ss.NoVaping: ImageVector
    get() = _NoVaping ?: UXIcon(name = "NoVaping") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 11f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(22f, 17.5f)
                curveToRelative(0f, 0.88f, -0.26f, 1.69f, -0.7f, 2.39f)
                lineToRelative(-6.19f, -6.19f)
                curveToRelative(0.69f, -0.44f, 1.51f, -0.7f, 2.39f, -0.7f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(13f, 17.5f)
                curveToRelative(0f, -0.88f, 0.26f, -1.69f, 0.7f, -2.39f)
                lineToRelative(6.19f, 6.19f)
                curveToRelative(-0.69f, 0.44f, -1.51f, 0.7f, -2.39f, 0.7f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                close()
                moveTo(12.03f, 24f)
                horizontalLineToRelative(-12.03f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(13f)
                curveToRelative(1.0f, 0f, 1.89f, 0.5f, 2.43f, 1.26f)
                curveToRelative(-3.69f, 0.93f, -6.43f, 4.26f, -6.43f, 8.23f)
                curveToRelative(0f, 2.61f, 1.18f, 4.94f, 3.03f, 6.5f)
                close()
                moveTo(8f, 6f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _NoVaping = it}

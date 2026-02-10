package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoVaping: ImageVector? = null

val Icons.Rs.NoVaping: ImageVector
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
                moveTo(10.3f, 22f)
                horizontalLineToRelative(-8.3f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(11f)
                curveToRelative(0.47f, 0f, 0.85f, 0.34f, 0.96f, 0.78f)
                curveToRelative(0.6f, -0.28f, 1.24f, -0.49f, 1.91f, -0.62f)
                curveToRelative(-0.37f, -1.24f, -1.5f, -2.16f, -2.87f, -2.16f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(22f)
                horizontalLineToRelative(12.03f)
                curveToRelative(-0.68f, -0.57f, -1.26f, -1.25f, -1.73f, -2f)
                close()
                moveTo(2f, 4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _NoVaping = it}

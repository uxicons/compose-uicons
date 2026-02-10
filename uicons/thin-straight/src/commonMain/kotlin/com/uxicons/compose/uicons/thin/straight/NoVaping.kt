package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoVaping: ImageVector? = null

val Icons.Ts.NoVaping: ImageVector
    get() = _NoVaping ?: UXIcon(name = "NoVaping") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 23f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.79f, 0f, 1.42f, 0.61f, 1.49f, 1.38f)
                curveToRelative(0.32f, -0.1f, 0.64f, -0.17f, 0.97f, -0.23f)
                curveToRelative(-0.17f, -1.21f, -1.2f, -2.15f, -2.46f, -2.15f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(22f)
                horizontalLineToRelative(12.03f)
                curveToRelative(-0.36f, -0.3f, -0.7f, -0.64f, -1.0f, -1f)
                close()
                moveTo(3.5f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(1f, 3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(17.5f, 11f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(23f, 17.5f)
                curveToRelative(0f, 1.34f, -0.48f, 2.56f, -1.28f, 3.52f)
                lineToRelative(-7.74f, -7.74f)
                curveToRelative(0.95f, -0.8f, 2.18f, -1.28f, 3.52f, -1.28f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                close()
                moveTo(12f, 17.5f)
                curveToRelative(0f, -1.34f, 0.48f, -2.56f, 1.28f, -3.52f)
                lineToRelative(7.74f, 7.74f)
                curveToRelative(-0.95f, 0.8f, -2.18f, 1.28f, -3.52f, 1.28f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                close()
            }
        }.also { _NoVaping = it}

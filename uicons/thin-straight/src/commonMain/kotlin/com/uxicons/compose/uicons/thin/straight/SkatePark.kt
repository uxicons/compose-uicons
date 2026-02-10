package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkatePark: ImageVector? = null

val Icons.Ts.SkatePark: ImageVector
    get() = _SkatePark ?: UXIcon(name = "SkatePark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.8f, 23f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(15.76f)
                curveToRelative(-12.59f, -3.96f, -12.76f, -18.33f, -12.76f, -18.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.76f, 0.23f, 18.5f, 18.8f, 18.5f)
                close()
                moveTo(21.01f, 16f)
                curveToRelative(-0.46f, 0f, -0.89f, -0.18f, -1.21f, -0.5f)
                lineToRelative(-7.3f, -7.3f)
                curveToRelative(-0.32f, -0.32f, -0.5f, -0.75f, -0.5f, -1.21f)
                verticalLineToRelative(-2.99f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.99f)
                curveToRelative(0f, 0.72f, 0.28f, 1.41f, 0.79f, 1.92f)
                lineToRelative(7.3f, 7.3f)
                curveToRelative(0.51f, 0.51f, 1.19f, 0.79f, 1.92f, 0.79f)
                horizontalLineToRelative(2.99f)
                verticalLineToRelative(-1f)
                close()
                moveTo(10.71f, 10.71f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0f)
                close()
                moveTo(18.71f, 18.71f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0f)
                close()
            }
        }.also { _SkatePark = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Build: ImageVector? = null

val Icons.Bs.Build: ImageVector
    get() = _Build ?: UXIcon(name = "Build") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 11f)
                verticalLineToRelative(5f)
                lineTo(0f, 16f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-11f)
                close()
                moveTo(10f, 21f)
                lineTo(3f, 21f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
                moveTo(21f, 16f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                close()
                moveTo(1.51f, 8.99f)
                lineToRelative(9.49f, 4.09f)
                verticalLineToRelative(-5.08f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.46f, 0.61f, 1.18f, 1f, 2.0f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.82f, 0f, -1.54f, 0.39f, -2.0f, 1f)
                horizontalLineToRelative(-2.5f)
                lineTo(11f, 0.02f)
                lineTo(1.51f, 4.11f)
                curveToRelative(-0.93f, 0.47f, -1.51f, 1.41f, -1.51f, 2.44f)
                reflectiveCurveToRelative(0.58f, 1.97f, 1.51f, 2.44f)
                close()
                moveTo(8f, 4.58f)
                verticalLineToRelative(3.95f)
                lineToRelative(-4.58f, -1.97f)
                lineToRelative(4.58f, -1.97f)
                close()
            }
        }.also { _Build = it}

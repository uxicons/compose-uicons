package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BalanceScaleRight: ImageVector? = null

val Icons.Bs.BalanceScaleRight: ImageVector
    get() = _BalanceScaleRight ?: UXIcon(name = "BalanceScaleRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13.74f)
                lineToRelative(-3.36f, -9.52f)
                lineToRelative(-7.14f, -1.61f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 1.93f)
                lineTo(3.29f, 0.3f)
                lineTo(0f, 10.77f)
                verticalLineToRelative(0.73f)
                curveToRelative(0f, 2.48f, 2.01f, 4.5f, 4.5f, 4.5f)
                curveToRelative(2.32f, 0f, 4.22f, -1.75f, 4.47f, -4f)
                horizontalLineToRelative(0.03f)
                verticalLineToRelative(-1.26f)
                lineToRelative(-2.36f, -6.61f)
                lineToRelative(3.86f, 0.87f)
                verticalLineToRelative(16.0f)
                lineTo(4f, 21.0f)
                verticalLineToRelative(3f)
                lineTo(20f, 24.0f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6.5f)
                lineTo(13.5f, 5.68f)
                lineToRelative(4.02f, 0.91f)
                lineToRelative(-2.52f, 7.15f)
                verticalLineToRelative(0.76f)
                curveToRelative(0f, 2.48f, 2.01f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(-0.76f)
                close()
                moveTo(3.07f, 11f)
                lineToRelative(1.32f, -4.22f)
                lineToRelative(1.51f, 4.22f)
                lineTo(3.07f, 11f)
                close()
                moveTo(18.09f, 14f)
                lineToRelative(1.41f, -3.99f)
                lineToRelative(1.41f, 3.99f)
                horizontalLineToRelative(-2.82f)
                close()
            }
        }.also { _BalanceScaleRight = it}

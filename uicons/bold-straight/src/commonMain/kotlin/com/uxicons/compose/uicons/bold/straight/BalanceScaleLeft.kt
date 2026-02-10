package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BalanceScaleLeft: ImageVector? = null

val Icons.Bs.BalanceScaleLeft: ImageVector
    get() = _BalanceScaleLeft ?: UXIcon(name = "BalanceScaleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10.77f)
                lineTo(20.71f, 0.3f)
                lineToRelative(-7.21f, 1.63f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 2.61f)
                lineToRelative(-7.14f, 1.61f)
                lineTo(0f, 13.74f)
                verticalLineToRelative(0.76f)
                curveToRelative(0f, 2.48f, 2.01f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(-0.76f)
                lineToRelative(-2.52f, -7.15f)
                lineToRelative(4.02f, -0.91f)
                verticalLineToRelative(15.32f)
                lineTo(4f, 21f)
                verticalLineToRelative(3f)
                lineTo(20f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6.5f)
                lineTo(13.5f, 5.0f)
                lineToRelative(3.86f, -0.87f)
                lineToRelative(-2.36f, 6.61f)
                verticalLineToRelative(1.26f)
                curveToRelative(0.25f, 2.25f, 2.18f, 4f, 4.5f, 4f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(-0.73f)
                close()
                moveTo(3.09f, 14f)
                lineToRelative(1.41f, -3.99f)
                lineToRelative(1.41f, 3.99f)
                lineTo(3.09f, 14f)
                close()
                moveTo(18.09f, 11f)
                lineToRelative(1.51f, -4.22f)
                lineToRelative(1.32f, 4.22f)
                horizontalLineToRelative(-2.83f)
                close()
            }
        }.also { _BalanceScaleLeft = it}

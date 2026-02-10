package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Invest: ImageVector? = null

val Icons.Ts.Invest: ImageVector
    get() = _Invest ?: UXIcon(name = "Invest") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 6.51f)
                verticalLineToRelative(1.07f)
                curveToRelative(2.93f, 1.19f, 5f, 4.07f, 5f, 7.42f)
                curveToRelative(0f, 2.03f, -0.76f, 3.88f, -2.0f, 5.29f)
                lineToRelative(-5.5f, -5.5f)
                verticalLineTo(1.29f)
                lineToRelative(2.65f, 2.57f)
                lineToRelative(0.7f, -0.72f)
                lineTo(13.06f, 0.44f)
                curveToRelative(-0.58f, -0.58f, -1.54f, -0.58f, -2.12f, -0.01f)
                lineToRelative(-2.79f, 2.71f)
                lineToRelative(0.7f, 0.72f)
                lineToRelative(2.65f, -2.57f)
                verticalLineToRelative(4.73f)
                curveToRelative(-4.73f, 0.26f, -8.5f, 4.19f, -8.5f, 8.99f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -3.91f, -2.51f, -7.25f, -6f, -8.48f)
                close()
                moveTo(4f, 15f)
                curveToRelative(0f, -4.24f, 3.32f, -7.72f, 7.5f, -7.98f)
                verticalLineToRelative(8.19f)
                lineToRelative(5.79f, 5.79f)
                curveToRelative(-1.41f, 1.25f, -3.26f, 2.0f, -5.29f, 2.0f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                close()
            }
        }.also { _Invest = it}

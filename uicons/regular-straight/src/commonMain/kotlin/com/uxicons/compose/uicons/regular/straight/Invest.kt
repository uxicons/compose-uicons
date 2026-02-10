package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Invest: ImageVector? = null

val Icons.Rs.Invest: ImageVector
    get() = _Invest ?: UXIcon(name = "Invest") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 6.53f)
                verticalLineToRelative(2.16f)
                curveToRelative(2.36f, 1.13f, 4f, 3.53f, 4f, 6.32f)
                curveToRelative(0f, 1.57f, -0.52f, 3.02f, -1.4f, 4.19f)
                lineToRelative(-4.6f, -4.6f)
                verticalLineTo(3f)
                lineToRelative(1.6f, 1.6f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.6f, -2.6f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                lineToRelative(-2.58f, 2.58f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.58f, -1.58f)
                verticalLineToRelative(3.06f)
                curveToRelative(-4.49f, 0.5f, -8f, 4.32f, -8f, 8.94f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -3.91f, -2.51f, -7.24f, -6f, -8.47f)
                close()
                moveTo(5f, 15f)
                curveToRelative(0f, -3.52f, 2.61f, -6.44f, 6f, -6.93f)
                verticalLineToRelative(7.34f)
                lineToRelative(5.19f, 5.19f)
                curveToRelative(-1.17f, 0.88f, -2.62f, 1.4f, -4.19f, 1.4f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                close()
            }
        }.also { _Invest = it}

package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scalpel: ImageVector? = null

val Icons.Ts.Scalpel: ImageVector
    get() = _Scalpel ?: UXIcon(name = "Scalpel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.24f, 1.77f)
                curveToRelative(-0.98f, -0.98f, -2.69f, -0.98f, -3.67f, 0f)
                lineTo(0f, 21.42f)
                verticalLineToRelative(1.58f)
                horizontalLineToRelative(2.61f)
                curveToRelative(3.63f, -0.15f, 7.15f, -1.76f, 9.73f, -4.35f)
                lineToRelative(0.65f, -2.92f)
                lineToRelative(10.25f, -10.29f)
                curveToRelative(1.01f, -1.01f, 1.01f, -2.66f, 0f, -3.67f)
                close()
                moveTo(11.43f, 18.15f)
                curveToRelative(-2.39f, 2.35f, -5.53f, 3.72f, -8.84f, 3.85f)
                horizontalLineToRelative(-1.59f)
                verticalLineToRelative(-0.17f)
                lineToRelative(8.49f, -8.52f)
                lineToRelative(2.5f, 2.34f)
                lineToRelative(-0.56f, 2.5f)
                close()
                moveTo(22.53f, 4.74f)
                lineToRelative(-10.01f, 10.04f)
                lineToRelative(-2.33f, -2.18f)
                lineTo(20.29f, 2.47f)
                curveToRelative(0.6f, -0.6f, 1.65f, -0.6f, 2.25f, 0f)
                curveToRelative(0.62f, 0.62f, 0.62f, 1.64f, 0f, 2.26f)
                close()
            }
        }.also { _Scalpel = it}

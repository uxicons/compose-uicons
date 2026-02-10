package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldXmark: ImageVector? = null

val Icons.Ss.ShieldXmark: ImageVector
    get() = _ShieldXmark ?: UXIcon(name = "ShieldXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.26f, 2.4f)
                lineTo(12f, -0.0f)
                lineToRelative(-7.26f, 2.41f)
                curveToRelative(-1.64f, 0.54f, -2.74f, 2.07f, -2.74f, 3.8f)
                verticalLineToRelative(5.76f)
                curveToRelative(0f, 6.57f, 7.0f, 10.58f, 9.15f, 11.65f)
                lineToRelative(0.81f, 0.4f)
                lineToRelative(0.84f, -0.34f)
                curveToRelative(2.16f, -0.87f, 9.21f, -4.29f, 9.21f, -11.72f)
                verticalLineToRelative(-5.76f)
                curveToRelative(0f, -1.73f, -1.1f, -3.25f, -2.74f, -3.8f)
                close()
                moveTo(16.15f, 14.23f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.73f, -2.73f)
                lineToRelative(-2.73f, 2.73f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.73f, -2.73f)
                lineToRelative(-2.73f, -2.73f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.73f, 2.73f)
                lineToRelative(2.73f, -2.73f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.73f, 2.73f)
                lineToRelative(2.73f, 2.73f)
                close()
            }
        }.also { _ShieldXmark = it}

package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeMute: ImageVector? = null

val Icons.Ts.VolumeMute: ImageVector
    get() = _VolumeMute ?: UXIcon(name = "VolumeMute") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.73f, 12f)
                lineToRelative(4.15f, 4.15f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-4.15f, -4.15f)
                lineToRelative(-4.15f, 4.15f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(4.15f, -4.15f)
                lineToRelative(-4.15f, -4.15f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(4.15f, 4.15f)
                lineToRelative(4.15f, -4.15f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-4.15f, 4.15f)
                close()
                moveTo(5.32f, 6f)
                lineTo(12f, 0.58f)
                verticalLineToRelative(22.87f)
                lineToRelative(-6.68f, -5.46f)
                horizontalLineToRelative(-2.82f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2.82f)
                close()
                moveTo(5.68f, 7f)
                horizontalLineToRelative(-3.18f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.18f)
                lineToRelative(5.32f, 4.35f)
                lineTo(11f, 2.68f)
                lineToRelative(-5.32f, 4.32f)
                close()
            }
        }.also { _VolumeMute = it}

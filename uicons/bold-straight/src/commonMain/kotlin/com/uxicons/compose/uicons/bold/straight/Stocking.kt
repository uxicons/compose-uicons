package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stocking: ImageVector? = null

val Icons.Bs.Stocking: ImageVector
    get() = _Stocking ?: UXIcon(name = "Stocking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                lineTo(6f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6.35f)
                lineToRelative(-3.09f, 0.96f)
                curveTo(1.23f, 11.47f, -0.83f, 15.4f, 0.32f, 19.09f)
                curveToRelative(0.92f, 2.94f, 3.6f, 4.91f, 6.68f, 4.91f)
                curveToRelative(0.71f, 0f, 1.41f, -0.11f, 2.09f, -0.32f)
                lineToRelative(8f, -2.5f)
                curveToRelative(2.94f, -0.92f, 4.91f, -3.6f, 4.91f, -6.68f)
                lineTo(22f, 3f)
                horizontalLineToRelative(2f)
                lineTo(24f, 0f)
                close()
                moveTo(19f, 14.5f)
                curveToRelative(0f, 1.76f, -1.13f, 3.29f, -2.81f, 3.82f)
                lineToRelative(-8.0f, 2.5f)
                curveToRelative(-0.39f, 0.12f, -0.79f, 0.18f, -1.19f, 0.18f)
                curveToRelative(-1.76f, 0f, -3.29f, -1.13f, -3.82f, -2.81f)
                curveToRelative(-0.66f, -2.1f, 0.52f, -4.35f, 2.62f, -5.01f)
                lineToRelative(5.19f, -1.62f)
                lineTo(11f, 3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(11.5f)
                close()
            }
        }.also { _Stocking = it}

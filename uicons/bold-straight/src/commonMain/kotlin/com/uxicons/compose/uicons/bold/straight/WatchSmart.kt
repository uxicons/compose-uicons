package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WatchSmart: ImageVector? = null

val Icons.Bs.WatchSmart: ImageVector
    get() = _WatchSmart ?: UXIcon(name = "WatchSmart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 2.34f)
                lineTo(19f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.34f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.39f, 0.82f, 2.6f, 2f, 3.16f)
                verticalLineToRelative(2.34f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.34f)
                curveToRelative(1.18f, -0.56f, 2f, -1.77f, 2f, -3.16f)
                lineTo(21f, 5.5f)
                curveToRelative(0f, -1.39f, -0.82f, -2.6f, -2f, -3.16f)
                close()
                moveTo(18f, 18.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                lineTo(6.5f, 19f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                lineTo(6f, 5.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(13f)
                close()
                moveTo(13.5f, 11.38f)
                lineToRelative(2.56f, 2.56f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-3.44f, -3.44f)
                verticalLineToRelative(-5.62f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4.38f)
                close()
            }
        }.also { _WatchSmart = it}

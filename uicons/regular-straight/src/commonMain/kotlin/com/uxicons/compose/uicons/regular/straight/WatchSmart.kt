package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WatchSmart: ImageVector? = null

val Icons.Rs.WatchSmart: ImageVector
    get() = _WatchSmart ?: UXIcon(name = "WatchSmart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 3.17f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-8f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.17f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.52f, -2f, 2.83f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.3f, 0.84f, 2.42f, 2f, 2.83f)
                verticalLineToRelative(3.17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.17f)
                curveToRelative(1.16f, -0.41f, 2f, -1.52f, 2f, -2.83f)
                lineTo(20f, 6f)
                curveToRelative(0f, -1.3f, -0.84f, -2.42f, -2f, -2.83f)
                close()
                moveTo(18f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(7f, 19f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(6f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(12f)
                close()
                moveTo(13f, 11.59f)
                lineToRelative(2.71f, 2.71f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.29f, -3.29f)
                verticalLineToRelative(-5.41f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.59f)
                close()
            }
        }.also { _WatchSmart = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WatchSmart: ImageVector? = null

val Icons.Ss.WatchSmart: ImageVector
    get() = _WatchSmart ?: UXIcon(name = "WatchSmart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 22f)
                curveToRelative(0.34f, 0f, 0.68f, -0.04f, 1f, -0.1f)
                verticalLineToRelative(2.1f)
                lineTo(6f, 24f)
                verticalLineToRelative(-2.1f)
                curveToRelative(0.32f, 0.07f, 0.66f, 0.1f, 1f, 0.1f)
                horizontalLineToRelative(10f)
                close()
                moveTo(17f, 2f)
                curveToRelative(0.34f, 0f, 0.68f, 0.04f, 1f, 0.1f)
                lineTo(18f, 0f)
                lineTo(6f, 0f)
                verticalLineToRelative(2.1f)
                curveToRelative(0.32f, -0.07f, 0.66f, -0.1f, 1f, -0.1f)
                horizontalLineToRelative(10f)
                close()
                moveTo(20f, 7f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(7f, 20f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(4f, 7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(15.71f, 14.29f)
                lineToRelative(-2.71f, -2.71f)
                verticalLineToRelative(-4.59f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5.41f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.also { _WatchSmart = it}

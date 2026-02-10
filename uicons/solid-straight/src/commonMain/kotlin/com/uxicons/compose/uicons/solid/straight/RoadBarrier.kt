package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadBarrier: ImageVector? = null

val Icons.Ss.RoadBarrier: ImageVector
    get() = _RoadBarrier ?: UXIcon(name = "RoadBarrier") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2f)
                lineTo(24f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-5.88f)
                lineToRelative(5.88f, -5.88f)
                verticalLineToRelative(-2.83f)
                lineTo(13.29f, 15f)
                lineTo(7.91f, 15f)
                lineTo(18.91f, 4f)
                horizontalLineToRelative(3.09f)
                lineTo(22f, 2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(16.09f, 4f)
                horizontalLineToRelative(-5.38f)
                lineTo(2f, 12.71f)
                verticalLineToRelative(-2.83f)
                lineTo(7.88f, 4f)
                lineTo(2f, 4f)
                lineTo(2f, 2f)
                lineTo(0f, 2f)
                lineTo(0f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(3.09f)
                lineTo(16.09f, 4f)
                close()
            }
        }.also { _RoadBarrier = it}

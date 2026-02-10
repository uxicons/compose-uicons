package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadBarrier: ImageVector? = null

val Icons.Bs.RoadBarrier: ImageVector
    get() = _RoadBarrier ?: UXIcon(name = "RoadBarrier") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                verticalLineToRelative(2f)
                lineTo(3f, 4f)
                lineTo(3f, 2f)
                lineTo(0f, 2f)
                lineTo(0f, 22f)
                lineTo(3f, 22f)
                verticalLineToRelative(-6f)
                lineTo(21f, 16f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                lineTo(24f, 2f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(17.12f, 7f)
                horizontalLineToRelative(2.76f)
                lineToRelative(-6f, 6f)
                horizontalLineToRelative(-2.76f)
                lineToRelative(6f, -6f)
                close()
                moveTo(6.88f, 13f)
                horizontalLineToRelative(-2.76f)
                lineToRelative(6f, -6f)
                horizontalLineToRelative(2.76f)
                lineToRelative(-6f, 6f)
                close()
                moveTo(5.88f, 7f)
                lineToRelative(-2.88f, 2.88f)
                verticalLineToRelative(-2.88f)
                horizontalLineToRelative(2.88f)
                close()
                moveTo(18.12f, 13f)
                lineToRelative(2.88f, -2.88f)
                verticalLineToRelative(2.88f)
                horizontalLineToRelative(-2.88f)
                close()
            }
        }.also { _RoadBarrier = it}

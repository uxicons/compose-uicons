package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadBarrier: ImageVector? = null

val Icons.Rs.RoadBarrier: ImageVector
    get() = _RoadBarrier ?: UXIcon(name = "RoadBarrier") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 2f)
                verticalLineToRelative(2f)
                lineTo(2f, 4f)
                lineTo(2f, 2f)
                lineTo(0f, 2f)
                lineTo(0f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(-7f)
                lineTo(22f, 15f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                lineTo(24f, 2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(16.91f, 6f)
                horizontalLineToRelative(4.17f)
                lineToRelative(-7f, 7f)
                horizontalLineToRelative(-4.17f)
                lineToRelative(7f, -7f)
                close()
                moveTo(7.09f, 13f)
                lineTo(2.91f, 13f)
                lineToRelative(7f, -7f)
                horizontalLineToRelative(4.17f)
                lineToRelative(-7f, 7f)
                close()
                moveTo(7.09f, 6f)
                lineTo(2f, 11.09f)
                lineTo(2f, 6f)
                lineTo(7.09f, 6f)
                close()
                moveTo(16.91f, 13f)
                lineToRelative(5.09f, -5.09f)
                verticalLineToRelative(5.09f)
                horizontalLineToRelative(-5.09f)
                close()
            }
        }.also { _RoadBarrier = it}

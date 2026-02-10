package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilterList: ImageVector? = null

val Icons.Ss.FilterList: ImageVector
    get() = _FilterList ?: UXIcon(name = "FilterList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2.37f)
                lineToRelative(6f, 7f)
                verticalLineToRelative(4.13f)
                lineToRelative(6f, 4.5f)
                verticalLineToRelative(-8.63f)
                lineToRelative(6f, -7f)
                verticalLineToRelative(-2.37f)
                close()
                moveTo(14f, 19f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-2f)
                close()
                moveTo(14f, 15f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8.19f)
                lineToRelative(1.71f, -2f)
                horizontalLineToRelative(6.48f)
                close()
            }
        }.also { _FilterList = it}

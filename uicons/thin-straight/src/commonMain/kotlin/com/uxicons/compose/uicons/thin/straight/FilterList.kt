package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilterList: ImageVector? = null

val Icons.Ts.FilterList: ImageVector
    get() = _FilterList ?: UXIcon(name = "FilterList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.22f, 13f)
                horizontalLineToRelative(9.78f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-10.64f)
                lineToRelative(0.86f, -1f)
                close()
                moveTo(16.79f, 10f)
                lineToRelative(-0.86f, 1f)
                horizontalLineToRelative(8.06f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-7.21f)
                close()
                moveTo(17f, 6.68f)
                lineToRelative(-6f, 7f)
                verticalLineToRelative(8.31f)
                lineToRelative(-5f, -3.75f)
                verticalLineToRelative(-4.57f)
                lineTo(0f, 6.68f)
                verticalLineToRelative(-2.19f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(12f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(2.19f)
                close()
                moveTo(16f, 4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.81f)
                lineToRelative(6f, 7f)
                verticalLineToRelative(4.43f)
                lineToRelative(3f, 2.25f)
                verticalLineToRelative(-6.68f)
                lineToRelative(6f, -7f)
                verticalLineToRelative(-1.81f)
                close()
                moveTo(13f, 20f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(1f)
                close()
                moveTo(13f, 17f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _FilterList = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilterList: ImageVector? = null

val Icons.Bs.FilterList: ImageVector
    get() = _FilterList ?: UXIcon(name = "FilterList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 5.49f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 1.99f)
                curveTo(1.57f, 1.99f, 0f, 3.56f, 0f, 5.49f)
                verticalLineToRelative(2.09f)
                lineToRelative(6f, 6.51f)
                verticalLineToRelative(4.15f)
                lineToRelative(5f, 3.77f)
                verticalLineToRelative(-7.93f)
                lineToRelative(6f, -6.51f)
                verticalLineToRelative(-2.09f)
                close()
                moveTo(14f, 6.4f)
                lineToRelative(-5.5f, 5.97f)
                lineTo(3f, 6.4f)
                verticalLineToRelative(-0.91f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(10f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(0.91f)
                close()
                moveTo(14f, 19f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-3f)
                close()
                moveTo(14f, 14f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-8.36f)
                lineToRelative(2.77f, -3f)
                horizontalLineToRelative(5.59f)
                close()
            }
        }.also { _FilterList = it}

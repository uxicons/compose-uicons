package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchBar: ImageVector? = null

val Icons.Bs.SearchBar: ImageVector
    get() = _SearchBar ?: UXIcon(name = "SearchBar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 17.41f)
                lineToRelative(-3.81f, 0.4f)
                lineToRelative(2.42f, 4.76f)
                lineToRelative(-2.68f, 1.36f)
                lineToRelative(-2.47f, -4.87f)
                lineToRelative(-2.96f, 2.71f)
                verticalLineToRelative(-11.06f)
                curveToRelative(0f, -0.7f, 0.71f, -0.91f, 1.17f, -0.49f)
                close()
                moveTo(9f, 14f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(9f)
                close()
                moveTo(20.5f, 0f)
                horizontalLineToRelative(-17f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-12.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(9.11f)
                lineToRelative(3f, 2.59f)
                verticalLineToRelative(-11.7f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }.also { _SearchBar = it}

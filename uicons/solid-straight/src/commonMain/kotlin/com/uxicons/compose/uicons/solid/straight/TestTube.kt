package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TestTube: ImageVector? = null

val Icons.Ss.TestTube: ImageVector
    get() = _TestTube ?: UXIcon(name = "TestTube") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(7f, 9f)
                verticalLineToRelative(10f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 0f)
                verticalLineToRelative(-10f)
                close()
            }
        }.also { _TestTube = it}

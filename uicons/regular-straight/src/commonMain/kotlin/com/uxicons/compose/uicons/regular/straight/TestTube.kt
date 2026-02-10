package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TestTube: ImageVector? = null

val Icons.Rs.TestTube: ImageVector
    get() = _TestTube ?: UXIcon(name = "TestTube") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(17f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 0f)
                verticalLineToRelative(-17f)
                horizontalLineToRelative(2f)
                close()
                moveTo(12f, 22f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                close()
                moveTo(15f, 7f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _TestTube = it}

package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TestTube: ImageVector? = null

val Icons.Br.TestTube: ImageVector
    get() = _TestTube ?: UXIcon(name = "TestTube") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.5f, 0f)
            horizontalLineToRelative(-11f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(16f)
            arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 0f)
            verticalLineToRelative(-16f)
            horizontalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
            moveTo(12f, 21f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
            verticalLineToRelative(-9f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(9f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
            close()
            moveTo(14f, 7f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            close()
        }
    }.also { _TestTube = it }

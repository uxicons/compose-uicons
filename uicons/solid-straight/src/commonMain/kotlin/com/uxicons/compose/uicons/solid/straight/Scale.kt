package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scale: ImageVector? = null

val Icons.Ss.Scale: ImageVector
    get() = _Scale ?: UXIcon(name = "Scale") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.91f)
                lineToRelative(1.8f, -3.55f)
                lineToRelative(-1.78f, -0.91f)
                lineToRelative(-2.26f, 4.45f)
                horizontalLineToRelative(-2.84f)
                verticalLineToRelative(-2f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 0f)
                close()
                moveTo(21f, 2f)
                horizontalLineToRelative(-2.69f)
                arcToRelative(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.69f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-4f)
                arcToRelative(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.69f, -3f)
                horizontalLineToRelative(-2.69f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                close()
            }
        }.also { _Scale = it}

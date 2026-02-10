package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Umbrella: ImageVector? = null

val Icons.Ss.Umbrella: ImageVector
    get() = _Umbrella ?: UXIcon(name = "Umbrella") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 14f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11f, -11.95f)
                verticalLineToRelative(-2.05f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.05f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11f, 11.95f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                horizontalLineToRelative(-2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(11f)
                close()
            }
        }.also { _Umbrella = it}

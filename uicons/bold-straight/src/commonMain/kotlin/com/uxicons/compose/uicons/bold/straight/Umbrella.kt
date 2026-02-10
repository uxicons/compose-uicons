package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Umbrella: ImageVector? = null

val Icons.Bs.Umbrella: ImageVector
    get() = _Umbrella ?: UXIcon(name = "Umbrella") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 13.5f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.5f, -11.9f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1.6f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.5f, 11.9f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(0.25f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 0f)
                verticalLineToRelative(-5.25f)
                horizontalLineToRelative(10.5f)
                close()
                moveTo(3.12f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.75f, 0f)
                close()
            }
        }.also { _Umbrella = it}

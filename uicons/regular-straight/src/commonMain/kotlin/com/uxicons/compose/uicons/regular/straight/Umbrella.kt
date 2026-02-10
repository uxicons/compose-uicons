package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Umbrella: ImageVector? = null

val Icons.Rs.Umbrella: ImageVector
    get() = _Umbrella ?: UXIcon(name = "Umbrella") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 2.05f)
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
                verticalLineToRelative(-1f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11f, -11.95f)
                close()
                moveTo(2.05f, 13f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.9f, 0f)
                close()
            }
        }.also { _Umbrella = it}

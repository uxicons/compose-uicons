package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pallet: ImageVector? = null

val Icons.Rs.Pallet: ImageVector
    get() = _Pallet ?: UXIcon(name = "Pallet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 17f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineTo(2f)
                verticalLineToRelative(3f)
                horizontalLineTo(0f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(24f)
                close()
            }
        }.also { _Pallet = it}

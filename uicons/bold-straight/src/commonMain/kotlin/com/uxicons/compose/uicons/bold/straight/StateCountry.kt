package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StateCountry: ImageVector? = null

val Icons.Bs.StateCountry: ImageVector
    get() = _StateCountry ?: UXIcon(name = "StateCountry") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                lineTo(0f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                lineToRelative(-5.5f, -2f)
                lineToRelative(-5.5f, 2f)
                close()
                moveTo(7f, 21f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 4f)
                verticalLineToRelative(-2f)
                lineToRelative(-5.5f, -2f)
                lineToRelative(-5.5f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                close()
                moveTo(20f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveTo(20.62f, 18f)
                lineToRelative(3.38f, 3.38f)
                verticalLineToRelative(2.62f)
                horizontalLineToRelative(-1.62f)
                lineToRelative(-3f, -3f)
                horizontalLineToRelative(-5.38f)
                verticalLineToRelative(-5.0f)
                lineToRelative(-8f, -6.58f)
                verticalLineToRelative(-3.42f)
                horizontalLineToRelative(-3.12f)
                lineTo(0f, 3.12f)
                lineTo(0f, 0f)
                horizontalLineToRelative(1.12f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(4.88f)
                verticalLineToRelative(5.0f)
                lineToRelative(8f, 6.58f)
                verticalLineToRelative(3.42f)
                horizontalLineToRelative(3.62f)
                close()
            }
        }.also { _StateCountry = it}

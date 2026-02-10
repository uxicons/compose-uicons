package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NftSquare: ImageVector? = null

val Icons.Ss.NftSquare: ImageVector
    get() = _NftSquare ?: UXIcon(name = "NftSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 0.09f)
                lineTo(1f, 6.15f)
                verticalLineToRelative(11.79f)
                lineToRelative(11.0f, 5.98f)
                lineToRelative(11.0f, -6.02f)
                lineTo(23f, 6.11f)
                lineTo(12.0f, 0.09f)
                close()
                moveTo(9.5f, 15f)
                horizontalLineToRelative(-1.33f)
                lineToRelative(-1.44f, -3.25f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-1.23f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1.33f)
                verticalLineToRelative(0.01f)
                lineToRelative(1.46f, 3.24f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(1.21f)
                verticalLineToRelative(6f)
                close()
                moveTo(14f, 10.25f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(1.47f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(2.03f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.25f)
                close()
                moveTo(18.75f, 10.25f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(-4.75f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(-1.25f)
                horizontalLineToRelative(3.75f)
                verticalLineToRelative(1.25f)
                close()
            }
        }.also { _NftSquare = it}

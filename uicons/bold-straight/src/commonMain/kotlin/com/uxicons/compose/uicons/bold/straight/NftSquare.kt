package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NftSquare: ImageVector? = null

val Icons.Bs.NftSquare: ImageVector
    get() = _NftSquare ?: UXIcon(name = "NftSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 0.06f)
                lineTo(1f, 6.11f)
                verticalLineToRelative(11.85f)
                lineToRelative(11.0f, 5.98f)
                lineToRelative(11.0f, -6.02f)
                lineTo(23f, 6.08f)
                lineTo(12.0f, 0.06f)
                close()
                moveTo(20f, 16.14f)
                lineToRelative(-8.0f, 4.38f)
                lineToRelative(-8.0f, -4.34f)
                lineTo(4f, 7.89f)
                lineTo(12.0f, 3.48f)
                lineToRelative(8.0f, 4.38f)
                verticalLineToRelative(8.29f)
                close()
                moveTo(11f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(1.47f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(2.03f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(-6f)
                close()
                moveTo(8.29f, 9f)
                horizontalLineToRelative(1.21f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1.33f)
                lineToRelative(-1.44f, -3.25f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-1.23f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1.33f)
                verticalLineToRelative(0.01f)
                lineToRelative(1.46f, 3.24f)
                verticalLineToRelative(-3.25f)
                close()
                moveTo(16.25f, 10.25f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(-1.25f)
                horizontalLineToRelative(3.75f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(-4.75f)
                close()
            }
        }.also { _NftSquare = it}

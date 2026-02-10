package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NftSquare: ImageVector? = null

val Icons.Ts.NftSquare: ImageVector
    get() = _NftSquare ?: UXIcon(name = "NftSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 0.03f)
                lineTo(1f, 6.08f)
                verticalLineToRelative(11.93f)
                lineToRelative(11.0f, 5.98f)
                lineToRelative(11.0f, -6.02f)
                lineTo(23f, 6.04f)
                lineTo(12.0f, 0.03f)
                close()
                moveTo(22f, 17.38f)
                lineToRelative(-10.0f, 5.47f)
                lineTo(2f, 17.42f)
                lineTo(2f, 6.67f)
                lineTo(12.0f, 1.17f)
                lineToRelative(10.0f, 5.47f)
                verticalLineToRelative(10.75f)
                close()
                moveTo(16.5f, 10f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5f)
                close()
                moveTo(11f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                close()
                moveTo(8.5f, 9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-0.91f)
                lineToRelative(-2.09f, -3.8f)
                verticalLineToRelative(3.8f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(0.93f)
                lineToRelative(2.07f, 3.76f)
                verticalLineToRelative(-3.76f)
                close()
            }
        }.also { _NftSquare = it}

package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Second: ImageVector? = null

val Icons.Ts.Second: ImageVector
    get() = _Second ?: UXIcon(name = "Second") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 15f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                lineTo(0f, 9f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                lineTo(0f, 14f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(4f, 14f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(13.06f, 21f)
                horizontalLineToRelative(10.94f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -2.25f, 2.48f, -4.15f, 5.11f, -6.15f)
                curveToRelative(2.9f, -2.22f, 5.89f, -4.51f, 5.89f, -7.35f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                curveToRelative(-2.41f, 0f, -4.43f, 1.72f, -4.9f, 4f)
                horizontalLineToRelative(-1.02f)
                curveToRelative(0.48f, -2.83f, 2.95f, -5f, 5.92f, -5f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 3.33f, -3.34f, 5.89f, -6.29f, 8.14f)
                curveToRelative(-2.19f, 1.68f, -4.28f, 3.27f, -4.65f, 4.86f)
                close()
            }
        }.also { _Second = it}

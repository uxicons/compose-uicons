package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScalpelPath: ImageVector? = null

val Icons.Ts.ScalpelPath: ImageVector
    get() = _ScalpelPath ?: UXIcon(name = "ScalpelPath") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 23f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                close()
                moveTo(23.24f, 4.44f)
                lineToRelative(-10.25f, 10.29f)
                lineToRelative(-0.65f, 2.92f)
                curveToRelative(-2.59f, 2.6f, -6.11f, 4.21f, -9.73f, 4.36f)
                lineTo(0f, 22f)
                verticalLineToRelative(-1.59f)
                lineTo(19.58f, 0.76f)
                curveToRelative(0.98f, -0.98f, 2.69f, -0.98f, 3.67f, 0f)
                curveToRelative(1.01f, 1.01f, 1.01f, 2.66f, 0f, 3.67f)
                close()
                moveTo(11.99f, 14.64f)
                lineToRelative(-2.5f, -2.34f)
                lineTo(1f, 20.83f)
                verticalLineToRelative(0.17f)
                horizontalLineToRelative(1.59f)
                curveToRelative(3.3f, -0.13f, 6.44f, -1.5f, 8.84f, -3.86f)
                lineToRelative(0.56f, -2.5f)
                close()
                moveTo(22.53f, 1.47f)
                curveToRelative(-0.6f, -0.6f, -1.65f, -0.6f, -2.25f, 0f)
                lineToRelative(-10.09f, 10.13f)
                lineToRelative(2.33f, 2.18f)
                lineTo(22.53f, 3.73f)
                curveToRelative(0.62f, -0.62f, 0.62f, -1.64f, 0f, -2.26f)
                close()
                moveTo(20f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(14f, 24f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _ScalpelPath = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shirt: ImageVector? = null

val Icons.Bs.Shirt: ImageVector
    get() = _Shirt ?: UXIcon(name = "Shirt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4.39f)
                verticalLineToRelative(19.61f)
                horizontalLineToRelative(-9.17f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(3.17f)
                lineTo(21f, 6.61f)
                lineToRelative(-2.61f, -0.8f)
                lineToRelative(-3.39f, 3.7f)
                lineToRelative(-3f, -3.5f)
                lineToRelative(2.49f, -3f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(2.51f, 3f)
                lineToRelative(-3f, 3.5f)
                lineToRelative(-3.39f, -3.7f)
                lineToRelative(-2.61f, 0.8f)
                verticalLineToRelative(14.39f)
                horizontalLineToRelative(3.17f)
                lineToRelative(3f, 3f)
                lineTo(0f, 24f)
                lineTo(0f, 4.39f)
                lineToRelative(3.77f, -1.16f)
                lineTo(6.99f, 0f)
                lineToRelative(0.01f, 0.01f)
                verticalLineToRelative(-0.01f)
                horizontalLineToRelative(9.99f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(3.24f, 3.24f)
                lineToRelative(3.77f, 1.16f)
                close()
                moveTo(13.5f, 10f)
                horizontalLineToRelative(-3f)
                lineToRelative(-2f, 10.5f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(-2f, -10.5f)
                close()
            }
        }.also { _Shirt = it}

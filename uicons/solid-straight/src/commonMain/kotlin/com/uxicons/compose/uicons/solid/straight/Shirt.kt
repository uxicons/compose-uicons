package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shirt: ImageVector? = null

val Icons.Ss.Shirt: ImageVector
    get() = _Shirt ?: UXIcon(name = "Shirt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.09f, -0.01f)
                lineToRelative(-4.09f, 4.09f)
                lineTo(7.91f, 0f)
                lineToRelative(8.18f, -0.01f)
                close()
                moveTo(9.68f, 8.26f)
                lineToRelative(1.13f, -2.54f)
                lineTo(5.83f, 0.74f)
                lineToRelative(-1.83f, 1.84f)
                lineToRelative(5.68f, 5.68f)
                close()
                moveTo(13.78f, 19.31f)
                lineToRelative(-1.78f, -7.96f)
                lineToRelative(-1.78f, 7.96f)
                lineToRelative(1.78f, 1.78f)
                lineToRelative(1.78f, -1.78f)
                close()
                moveTo(14.05f, 11.36f)
                lineToRelative(1.92f, 8.58f)
                lineToRelative(-3.97f, 3.97f)
                lineToRelative(-3.97f, -3.97f)
                lineToRelative(1.92f, -8.58f)
                lineTo(2.43f, 3.85f)
                lineToRelative(-2.43f, 1.62f)
                verticalLineToRelative(18.54f)
                horizontalLineToRelative(24f)
                lineTo(24f, 5.46f)
                lineToRelative(-2.43f, -1.62f)
                lineToRelative(-7.52f, 7.52f)
                close()
                moveTo(20f, 2.58f)
                lineToRelative(-1.84f, -1.84f)
                lineToRelative(-4.97f, 4.97f)
                lineToRelative(1.13f, 2.54f)
                lineToRelative(5.68f, -5.68f)
                close()
            }
        }.also { _Shirt = it}

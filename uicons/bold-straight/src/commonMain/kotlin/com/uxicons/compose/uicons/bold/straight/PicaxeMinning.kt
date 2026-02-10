package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PicaxeMinning: ImageVector? = null

val Icons.Bs.PicaxeMinning: ImageVector
    get() = _PicaxeMinning ?: UXIcon(name = "PicaxeMinning") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.02f, 15.87f)
                lineToRelative(10.85f, -10.85f)
                curveToRelative(-2.06f, -1.61f, -4.41f, -2.56f, -6.87f, -3.02f)
                lineToRelative(-0.03f, -2f)
                curveToRelative(3.86f, 0f, 7.05f, 0.83f, 9.38f, 2.54f)
                lineToRelative(1.2f, -1.2f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-1.2f, 1.2f)
                curveToRelative(1.7f, 2.33f, 2.53f, 5.51f, 2.53f, 9.37f)
                lineToRelative(-2f, -0.03f)
                curveToRelative(-0.46f, -2.45f, -1.41f, -4.8f, -3.01f, -6.85f)
                lineToRelative(-10.84f, 10.85f)
                close()
                moveTo(21f, 0f)
                verticalLineToRelative(12.88f)
                lineToRelative(-3f, 3f)
                verticalLineToRelative(3.12f)
                horizontalLineToRelative(-4.12f)
                lineToRelative(-2f, 2f)
                horizontalLineToRelative(-11.88f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(13.12f)
                lineToRelative(2f, -2f)
                horizontalLineToRelative(5.88f)
                verticalLineToRelative(-4.88f)
                lineToRelative(3f, -3f)
                verticalLineToRelative(-14.12f)
                close()
                moveTo(8f, 17.33f)
                lineTo(10.5f, 19f)
                lineTo(13f, 16.5f)
                lineTo(10.8f, 14f)
                lineTo(8f, 15.26f)
                verticalLineToRelative(2.07f)
                close()
            }
        }.also { _PicaxeMinning = it}

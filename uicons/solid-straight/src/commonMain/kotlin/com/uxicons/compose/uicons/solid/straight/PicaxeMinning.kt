package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PicaxeMinning: ImageVector? = null

val Icons.Ss.PicaxeMinning: ImageVector
    get() = _PicaxeMinning ?: UXIcon(name = "PicaxeMinning") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(-0.01f, 16.61f)
                lineToRelative(11.27f, -11.27f)
                curveToRelative(-2.15f, -1.81f, -4.64f, -2.85f, -7.26f, -3.34f)
                lineToRelative(-0.03f, -2f)
                curveToRelative(4.09f, 0f, 7.43f, 0.94f, 9.78f, 2.85f)
                lineToRelative(1.15f, -1.15f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.15f, 1.15f)
                curveToRelative(1.9f, 2.35f, 2.83f, 5.69f, 2.83f, 9.77f)
                lineToRelative(-2f, -0.03f)
                curveToRelative(-0.49f, -2.61f, -1.53f, -5.1f, -3.33f, -7.25f)
                lineToRelative(-11.27f, 11.27f)
                close()
                moveTo(24f, 24.04f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12.59f)
                lineToRelative(2f, -2f)
                horizontalLineToRelative(4.41f)
                verticalLineToRelative(-3.41f)
                lineToRelative(3f, -3f)
                verticalLineToRelative(-13.62f)
                horizontalLineToRelative(2f)
                close()
                moveTo(8f, 17.33f)
                lineTo(11f, 19.54f)
                lineTo(13f, 16.5f)
                lineTo(10.8f, 14.0f)
                lineTo(8f, 15.27f)
                verticalLineToRelative(2.07f)
                close()
            }
        }.also { _PicaxeMinning = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlignSlash: ImageVector? = null

val Icons.Bs.AlignSlash: ImageVector
    get() = _AlignSlash ?: UXIcon(name = "AlignSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.05f, 11f)
                lineTo(0f, 11f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.05f)
                lineToRelative(3f, 3f)
                close()
                moveTo(0f, 18f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(16.05f)
                lineToRelative(-3f, -3f)
                lineTo(0f, 18f)
                close()
                moveTo(8.05f, 13f)
                lineTo(0f, 13f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(11.05f)
                lineToRelative(-3f, -3f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(-3f)
                lineTo(5.12f, 3f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineToRelative(21.8f, 21.8f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-0.84f, -0.84f)
                horizontalLineToRelative(0.88f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.88f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(5.88f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-8.88f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(10.88f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-13.88f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(15.88f)
                close()
            }
        }.also { _AlignSlash = it}

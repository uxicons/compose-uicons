package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LiraSign: ImageVector? = null

val Icons.Ss.LiraSign: ImageVector
    get() = _LiraSign ?: UXIcon(name = "LiraSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 13f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                horizontalLineToRelative(-3f)
                verticalLineTo(13.35f)
                lineToRelative(8f, -2.19f)
                verticalLineToRelative(-2.05f)
                lineToRelative(-8f, 2.19f)
                verticalLineToRelative(-2.05f)
                lineToRelative(8f, -2.19f)
                verticalLineToRelative(-2.05f)
                lineToRelative(-8f, 2.19f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineTo(7.74f)
                lineToRelative(-4f, 1.1f)
                verticalLineToRelative(2.05f)
                lineToRelative(4f, -1.1f)
                verticalLineToRelative(2.05f)
                lineToRelative(-4f, 1.1f)
                verticalLineToRelative(2.05f)
                lineToRelative(4f, -1.1f)
                verticalLineToRelative(10.1f)
                horizontalLineToRelative(5f)
                curveToRelative(6.07f, 0f, 11f, -4.93f, 11f, -11f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _LiraSign = it}

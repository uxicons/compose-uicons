package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DumbbellRay: ImageVector? = null

val Icons.Bs.DumbbellRay: ImageVector
    get() = _DumbbellRay ?: UXIcon(name = "DumbbellRay") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 16f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                lineTo(6f, 19f)
                verticalLineToRelative(5f)
                lineTo(3f, 24f)
                verticalLineToRelative(-2f)
                lineTo(1f, 22f)
                verticalLineToRelative(-3f)
                lineTo(0f, 19f)
                verticalLineToRelative(-3f)
                lineTo(1f, 16f)
                verticalLineToRelative(-3f)
                lineTo(3f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                close()
                moveTo(8.42f, 9f)
                horizontalLineToRelative(3.08f)
                lineToRelative(-1.41f, 5f)
                horizontalLineToRelative(1.2f)
                lineToRelative(5.06f, -7.59f)
                curveToRelative(0.4f, -0.6f, -0.03f, -1.41f, -0.75f, -1.41f)
                horizontalLineToRelative(-3.06f)
                lineTo(14.5f, 0f)
                horizontalLineToRelative(-4.3f)
                lineToRelative(-2.66f, 7.81f)
                curveToRelative(-0.18f, 0.59f, 0.26f, 1.19f, 0.88f, 1.19f)
                close()
            }
        }.also { _DumbbellRay = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BorderAll: ImageVector? = null

val Icons.Bs.BorderAll: ImageVector
    get() = _BorderAll ?: UXIcon(name = "BorderAll") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 3.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-7.5f)
                lineTo(13.5f, 3f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(3.5f, 3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7.5f)
                lineTo(3f, 10.5f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(3f, 13.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(7.5f)
                lineTo(3f, 21f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(13.5f, 21f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-7.5f)
                close()
            }
        }.also { _BorderAll = it}

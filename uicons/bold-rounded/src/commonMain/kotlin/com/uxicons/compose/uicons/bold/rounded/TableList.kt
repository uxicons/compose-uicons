package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableList: ImageVector? = null

val Icons.Br.TableList: ImageVector
    get() = _TableList ?: UXIcon(name = "TableList") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 1f)
            lineTo(5.5f, 1f)
            curveTo(2.47f, 1f, 0f, 3.47f, 0f, 6.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 6.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(3f, 10f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-3f)
            close()
            moveTo(9f, 10f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-12f)
            verticalLineToRelative(-3f)
            close()
            moveTo(21f, 6.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-12f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(9.5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(5.5f, 4f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(3f, 16.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(18.5f, 19f)
            horizontalLineToRelative(-9.5f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
        }
    }.also { _TableList = it }

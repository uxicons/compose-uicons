package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardList: ImageVector? = null

val Icons.Bs.ClipboardList: ImageVector
    get() = _ClipboardList ?: UXIcon(name = "ClipboardList") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 17f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                close()
                moveTo(10f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(17f, 9f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(10f, 9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(22f, 20.5f)
                lineTo(22f, 2f)
                horizontalLineToRelative(-5.34f)
                curveToRelative(-0.56f, -1.18f, -1.77f, -2f, -3.16f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.39f, 0f, -2.6f, 0.82f, -3.16f, 2f)
                lineTo(2f, 2f)
                lineTo(2f, 20.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                close()
                moveTo(10f, 5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(5.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                lineTo(5f, 5f)
                horizontalLineToRelative(5f)
                close()
            }
        }.also { _ClipboardList = it}

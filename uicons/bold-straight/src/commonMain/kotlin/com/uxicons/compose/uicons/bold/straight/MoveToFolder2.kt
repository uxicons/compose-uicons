package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoveToFolder2: ImageVector? = null

val Icons.Bs.MoveToFolder2: ImageVector
    get() = _MoveToFolder2 ?: UXIcon(name = "MoveToFolder2") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 6.5f)
                verticalLineToRelative(9.73f)
                lineToRelative(-3f, -3.07f)
                verticalLineToRelative(-5.16f)
                lineTo(3f, 8f)
                verticalLineToRelative(12f)
                lineTo(12f, 20f)
                verticalLineToRelative(3f)
                lineTo(0f, 23f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.57f, 1.57f, 1f, 3.5f, 1f)
                horizontalLineToRelative(4.85f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(20f, 15f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                lineToRelative(3.71f, -3.79f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-3.71f, -3.79f)
                close()
            }
        }.also { _MoveToFolder2 = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoveToFolder2: ImageVector? = null

val Icons.Ss.MoveToFolder2: ImageVector
    get() = _MoveToFolder2 ?: UXIcon(name = "MoveToFolder2") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.42f, 17.59f)
                curveToRelative(0.77f, 0.78f, 0.77f, 2.04f, 0f, 2.81f)
                lineToRelative(-3.3f, 3.3f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.29f, -2.29f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8.01f)
                lineToRelative(-2.3f, -2.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.3f, 3.3f)
                close()
                moveTo(21f, 2f)
                lineTo(12.24f, 2f)
                lineTo(8.24f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(3f)
                lineTo(24f, 6f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(0f, 22f)
                lineTo(11f, 22f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(4.59f)
                lineToRelative(4.53f, -4.53f)
                lineToRelative(3.88f, 3.88f)
                verticalLineToRelative(-7.35f)
                lineTo(0f, 8f)
                verticalLineToRelative(14f)
                close()
            }
        }.also { _MoveToFolder2 = it}

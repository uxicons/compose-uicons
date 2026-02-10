package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoveToFolder: ImageVector? = null

val Icons.Ss.MoveToFolder: ImageVector
    get() = _MoveToFolder ?: UXIcon(name = "MoveToFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 9f)
                verticalLineToRelative(14f)
                lineTo(24f, 23f)
                lineTo(24f, 9f)
                lineTo(0f, 9f)
                close()
                moveTo(17.42f, 17.41f)
                lineToRelative(-3.3f, 3.3f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.29f, -2.29f)
                lineTo(7f, 17.01f)
                verticalLineToRelative(-2f)
                lineTo(15.01f, 15.01f)
                lineToRelative(-2.3f, -2.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.3f, 3.3f)
                curveToRelative(0.77f, 0.78f, 0.77f, 2.04f, 0f, 2.81f)
                close()
                moveTo(0f, 7f)
                verticalLineToRelative(-3f)
                curveTo(0f, 2.35f, 1.35f, 1f, 3f, 1f)
                horizontalLineToRelative(5.24f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.76f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                lineTo(0f, 7f)
                close()
            }
        }.also { _MoveToFolder = it}

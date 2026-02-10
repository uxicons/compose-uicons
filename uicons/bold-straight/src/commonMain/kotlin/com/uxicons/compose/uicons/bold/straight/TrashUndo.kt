package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashUndo: ImageVector? = null

val Icons.Bs.TrashUndo: ImageVector
    get() = _TrashUndo ?: UXIcon(name = "TrashUndo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                lineTo(1f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.62f)
                lineToRelative(1.23f, 14.79f)
                curveToRelative(0.15f, 1.8f, 1.68f, 3.21f, 3.49f, 3.21f)
                horizontalLineToRelative(9.32f)
                curveToRelative(1.81f, 0f, 3.34f, -1.41f, 3.49f, -3.21f)
                lineToRelative(1.23f, -14.79f)
                horizontalLineToRelative(1.62f)
                verticalLineToRelative(-3f)
                close()
                moveTo(17.16f, 20.54f)
                curveToRelative(-0.02f, 0.26f, -0.24f, 0.46f, -0.5f, 0.46f)
                lineTo(7.34f, 21f)
                curveToRelative(-0.26f, 0f, -0.48f, -0.2f, -0.5f, -0.46f)
                lineToRelative(-1.21f, -14.54f)
                horizontalLineToRelative(12.74f)
                lineToRelative(-1.21f, 14.54f)
                close()
                moveTo(7.29f, 13.21f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(3.71f, -3.79f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(3f)
                lineToRelative(-3.71f, -3.79f)
                close()
            }
        }.also { _TrashUndo = it}

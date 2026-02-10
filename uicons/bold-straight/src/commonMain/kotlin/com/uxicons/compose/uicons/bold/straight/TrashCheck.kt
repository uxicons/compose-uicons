package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCheck: ImageVector? = null

val Icons.Bs.TrashCheck: ImageVector
    get() = _TrashCheck ?: UXIcon(name = "TrashCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.78f, 13.85f)
                lineToRelative(2.08f, -2.16f)
                lineToRelative(2.18f, 2.11f)
                lineToRelative(4.08f, -4.0f)
                lineToRelative(2.1f, 2.14f)
                lineToRelative(-4.42f, 4.33f)
                curveToRelative(-0.48f, 0.48f, -1.12f, 0.72f, -1.75f, 0.72f)
                curveToRelative(-0.64f, 0f, -1.28f, -0.24f, -1.77f, -0.73f)
                lineToRelative(-2.5f, -2.42f)
                close()
                moveTo(23f, 6f)
                horizontalLineToRelative(-1.62f)
                lineToRelative(-1.23f, 14.79f)
                curveToRelative(-0.15f, 1.8f, -1.68f, 3.21f, -3.49f, 3.21f)
                lineTo(7.34f, 24f)
                curveToRelative(-1.81f, 0f, -3.34f, -1.41f, -3.49f, -3.21f)
                lineToRelative(-1.23f, -14.79f)
                horizontalLineToRelative(-1.62f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                close()
                moveTo(18.37f, 6f)
                lineTo(5.63f, 6f)
                lineToRelative(1.21f, 14.54f)
                curveToRelative(0.02f, 0.26f, 0.24f, 0.46f, 0.5f, 0.46f)
                horizontalLineToRelative(9.32f)
                curveToRelative(0.26f, 0f, 0.48f, -0.2f, 0.5f, -0.46f)
                lineToRelative(1.21f, -14.54f)
                close()
            }
        }.also { _TrashCheck = it}

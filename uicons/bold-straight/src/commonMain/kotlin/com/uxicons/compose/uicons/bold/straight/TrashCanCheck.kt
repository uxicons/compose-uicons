package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCanCheck: ImageVector? = null

val Icons.Bs.TrashCanCheck: ImageVector
    get() = _TrashCanCheck ?: UXIcon(name = "TrashCanCheck") {
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
                horizontalLineToRelative(-2f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(3f, 6f)
                lineTo(1f, 6f)
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
                moveTo(18f, 6f)
                lineTo(6f, 6f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(12f)
                lineTo(18f, 6f)
                close()
            }
        }.also { _TrashCanCheck = it}

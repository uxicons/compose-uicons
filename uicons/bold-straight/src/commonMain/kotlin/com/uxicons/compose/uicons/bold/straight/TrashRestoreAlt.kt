package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashRestoreAlt: ImageVector? = null

val Icons.Bs.TrashRestoreAlt: ImageVector
    get() = _TrashRestoreAlt ?: UXIcon(name = "TrashRestoreAlt") {
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
                horizontalLineToRelative(2f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(21f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(18f, 21f)
                lineTo(6f, 21f)
                lineTo(6f, 6f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(15f)
                close()
                moveTo(7.5f, 13f)
                lineToRelative(3.79f, -3.71f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(3.79f, 3.71f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _TrashRestoreAlt = it}

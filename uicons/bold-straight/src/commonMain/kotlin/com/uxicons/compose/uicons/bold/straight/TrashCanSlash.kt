package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCanSlash: ImageVector? = null

val Icons.Bs.TrashCanSlash: ImageVector
    get() = _TrashCanSlash ?: UXIcon(name = "TrashCanSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 18.88f)
                lineTo(21f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.88f)
                lineTo(2.12f, 0.0f)
                lineTo(0.0f, 2.12f)
                lineToRelative(21.88f, 21.88f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-3.0f, -3.0f)
                close()
                moveTo(18f, 15.88f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(-4.88f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1.88f)
                lineToRelative(-4.88f, -4.88f)
                horizontalLineToRelative(9.88f)
                verticalLineToRelative(9.88f)
                close()
                moveTo(11f, 15.95f)
                verticalLineToRelative(2.05f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5.05f)
                lineToRelative(3f, 3f)
                close()
                moveTo(16.05f, 21.0f)
                lineToRelative(2.95f, 2.95f)
                curveToRelative(-0.16f, 0.03f, -0.33f, 0.05f, -0.5f, 0.05f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(3f, 7.95f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(10.05f)
                horizontalLineToRelative(10.05f)
                close()
            }
        }.also { _TrashCanSlash = it}

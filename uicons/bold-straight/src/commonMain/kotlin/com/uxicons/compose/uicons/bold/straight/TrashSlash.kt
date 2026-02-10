package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashSlash: ImageVector? = null

val Icons.Bs.TrashSlash: ImageVector
    get() = _TrashSlash ?: UXIcon(name = "TrashSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.36f, 18.24f)
                lineToRelative(1.02f, -12.24f)
                horizontalLineToRelative(1.62f)
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
                lineToRelative(-3.64f, -3.64f)
                close()
                moveTo(17.58f, 15.46f)
                lineTo(8.12f, 6f)
                horizontalLineToRelative(10.25f)
                lineToRelative(-0.79f, 9.46f)
                close()
                moveTo(16.05f, 21.0f)
                lineToRelative(2.46f, 2.46f)
                curveToRelative(-0.54f, 0.34f, -1.18f, 0.54f, -1.85f, 0.54f)
                lineTo(7.34f, 24.0f)
                curveToRelative(-1.81f, 0f, -3.34f, -1.41f, -3.49f, -3.21f)
                lineToRelative(-1.09f, -13.08f)
                lineToRelative(3.28f, 3.28f)
                lineToRelative(0.8f, 9.54f)
                curveToRelative(0.02f, 0.26f, 0.24f, 0.46f, 0.5f, 0.46f)
                horizontalLineToRelative(8.71f)
                close()
            }
        }.also { _TrashSlash = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentGavel: ImageVector? = null

val Icons.Bs.DocumentGavel: ImageVector
    get() = _DocumentGavel ?: UXIcon(name = "DocumentGavel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.19f, 19.31f)
                lineToRelative(-1.32f, 1.32f)
                lineToRelative(0.75f, 0.75f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-5f, -5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(0.75f, 0.75f)
                lineToRelative(4.68f, -4.68f)
                lineToRelative(-0.75f, -0.75f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(5f, 5f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-0.75f, -0.75f)
                lineToRelative(-1.23f, 1.23f)
                lineToRelative(4.75f, 4.75f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-4.75f, -4.75f)
                close()
                moveTo(3f, 21f)
                lineTo(3f, 3f)
                lineTo(12f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6.24f)
                lineToRelative(1.76f, 1.76f)
                lineTo(20f, 5.67f)
                lineTo(14.38f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(13.58f, 24f)
                lineToRelative(-3f, -3f)
                lineTo(3f, 21f)
                close()
            }
        }.also { _DocumentGavel = it}

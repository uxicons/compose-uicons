package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentGavel: ImageVector? = null

val Icons.Rs.DocumentGavel: ImageVector
    get() = _DocumentGavel ?: UXIcon(name = "DocumentGavel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(11f, 2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7.93f)
                lineToRelative(1.06f, 1.06f)
                verticalLineToRelative(-2.48f)
                lineTo(12.41f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(13.88f, 24f)
                lineToRelative(-2f, -2f)
                lineTo(2f, 22f)
                close()
                moveTo(13f, 3.41f)
                lineToRelative(3.59f, 3.59f)
                horizontalLineToRelative(-3.59f)
                lineTo(13f, 3.41f)
                close()
                moveTo(22.56f, 23.98f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-4.22f, -4.23f)
                lineToRelative(1.43f, -1.43f)
                lineToRelative(0.54f, 0.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-5.31f, -5.31f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(0.54f, 0.54f)
                lineToRelative(-4.37f, 4.37f)
                lineToRelative(-0.54f, -0.54f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(5.31f, 5.31f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-0.54f, -0.54f)
                lineToRelative(1.52f, -1.52f)
                lineToRelative(4.22f, 4.23f)
                close()
                moveTo(13.99f, 18.45f)
                lineToRelative(4.37f, -4.37f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-4.37f, 4.37f)
                lineToRelative(-1.41f, -1.41f)
                close()
            }
        }.also { _DocumentGavel = it}

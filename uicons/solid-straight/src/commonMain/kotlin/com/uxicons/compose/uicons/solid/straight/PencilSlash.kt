package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PencilSlash: ImageVector? = null

val Icons.Ss.PencilSlash: ImageVector
    get() = _PencilSlash ?: UXIcon(name = "PencilSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.73f, 23.98f)
                lineToRelative(-0.02f, 0.02f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3.71f)
                lineToRelative(0.02f, -0.02f)
                lineToRelative(3.71f, 3.71f)
                close()
                moveTo(23.23f, 4.48f)
                curveToRelative(1.02f, -1.02f, 1.02f, -2.69f, 0f, -3.71f)
                curveToRelative(-1.02f, -1.02f, -2.69f, -1.02f, -3.71f, 0f)
                lineToRelative(-3.5f, 3.5f)
                lineToRelative(3.71f, 3.71f)
                lineToRelative(3.5f, -3.5f)
                close()
                moveTo(1.43f, 18.86f)
                lineToRelative(3.71f, 3.71f)
                lineToRelative(6.58f, -6.58f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(-6.58f, 6.58f)
                close()
                moveTo(18.31f, 9.4f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(-3.75f, 3.75f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-9.39f, -9.39f)
                lineToRelative(3.75f, -3.75f)
                close()
            }
        }.also { _PencilSlash = it}

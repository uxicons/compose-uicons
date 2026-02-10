package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenSlash: ImageVector? = null

val Icons.Ss.PenSlash: ImageVector
    get() = _PenSlash ?: UXIcon(name = "PenSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.73f, 7.98f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(3.5f, -3.5f)
                curveToRelative(1.02f, -1.02f, 2.69f, -1.02f, 3.71f, 0f)
                curveToRelative(1.02f, 1.02f, 1.02f, 2.69f, 0f, 3.71f)
                lineToRelative(-3.5f, 3.5f)
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
                moveTo(0f, 20.29f)
                verticalLineToRelative(3.71f)
                horizontalLineToRelative(3.71f)
                lineToRelative(8.02f, -8.02f)
                lineToRelative(-3.71f, -3.71f)
                lineTo(0f, 20.29f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.73f, 7.98f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(3.5f, -3.5f)
                curveToRelative(1.02f, -1.02f, 2.69f, -1.02f, 3.71f, 0f)
                curveToRelative(1.02f, 1.02f, 1.02f, 2.69f, 0f, 3.71f)
                lineToRelative(-3.5f, 3.5f)
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
                moveTo(0f, 20.29f)
                verticalLineToRelative(3.71f)
                horizontalLineToRelative(3.71f)
                lineToRelative(8.02f, -8.02f)
                lineToRelative(-3.71f, -3.71f)
                lineTo(0f, 20.29f)
                close()
            }
        }.also { _PenSlash = it}

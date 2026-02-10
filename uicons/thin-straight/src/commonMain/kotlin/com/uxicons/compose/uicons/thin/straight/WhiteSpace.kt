package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WhiteSpace: ImageVector? = null

val Icons.Ts.WhiteSpace: ImageVector
    get() = _WhiteSpace ?: UXIcon(name = "WhiteSpace") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 0f)
                verticalLineTo(24f)
                horizontalLineToRelative(-1f)
                verticalLineTo(11.99f)
                curveToRelative(-0.0f, 0.38f, -0.15f, 0.76f, -0.44f, 1.05f)
                lineToRelative(-3.54f, 3.54f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.37f, -3.37f)
                horizontalLineTo(2.31f)
                lineToRelative(3.37f, 3.37f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.54f, -3.54f)
                curveToRelative(-0.29f, -0.29f, -0.43f, -0.67f, -0.44f, -1.05f)
                verticalLineToRelative(12.01f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineTo(1f)
                verticalLineTo(11.97f)
                curveToRelative(0.0f, -0.38f, 0.15f, -0.76f, 0.44f, -1.05f)
                lineToRelative(3.54f, -3.54f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.41f, 3.41f)
                horizontalLineTo(21.73f)
                lineToRelative(-3.41f, -3.41f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.54f, 3.54f)
                curveToRelative(0.29f, 0.29f, 0.43f, 0.67f, 0.44f, 1.05f)
                verticalLineTo(0f)
                horizontalLineToRelative(1f)
                close()
            }
        }.also { _WhiteSpace = it}

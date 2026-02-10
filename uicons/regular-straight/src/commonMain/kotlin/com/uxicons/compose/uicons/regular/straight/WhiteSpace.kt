package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WhiteSpace: ImageVector? = null

val Icons.Rs.WhiteSpace: ImageVector
    get() = _WhiteSpace ?: UXIcon(name = "WhiteSpace") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 0f)
                verticalLineTo(24f)
                horizontalLineToRelative(-2f)
                verticalLineTo(12.0f)
                curveToRelative(-0.01f, 0.5f, -0.2f, 1.01f, -0.58f, 1.39f)
                lineToRelative(-3.54f, 3.54f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.52f, -2.52f)
                horizontalLineTo(5.02f)
                lineToRelative(2.52f, 2.52f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.54f, -3.54f)
                curveToRelative(-0.38f, -0.38f, -0.58f, -0.89f, -0.58f, -1.39f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineTo(2f)
                verticalLineTo(11.96f)
                curveToRelative(0.01f, -0.5f, 0.2f, -1.01f, 0.58f, -1.39f)
                lineToRelative(3.54f, -3.54f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.56f, 2.56f)
                horizontalLineToRelative(14.05f)
                lineToRelative(-2.56f, -2.56f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.54f, 3.54f)
                curveToRelative(0.38f, 0.38f, 0.58f, 0.89f, 0.58f, 1.39f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _WhiteSpace = it}

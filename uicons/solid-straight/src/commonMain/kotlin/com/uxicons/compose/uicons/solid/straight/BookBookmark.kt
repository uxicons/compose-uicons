package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookBookmark: ImageVector? = null

val Icons.Ss.BookBookmark: ImageVector
    get() = _BookBookmark ?: UXIcon(name = "BookBookmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 18f)
                curveToRelative(-0.74f, -0.0f, -1.45f, 0.27f, -2f, 0.77f)
                verticalLineTo(3f)
                curveTo(2f, 1.34f, 3.34f, 0f, 5f, 0f)
                horizontalLineToRelative(1f)
                verticalLineTo(18f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(20f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineTo(11f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-2.5f, 2.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(-5f)
                verticalLineTo(18f)
                horizontalLineToRelative(14f)
                verticalLineTo(2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(2f, 22f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineTo(22f)
                verticalLineToRelative(-4f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
            }
        }.also { _BookBookmark = it}

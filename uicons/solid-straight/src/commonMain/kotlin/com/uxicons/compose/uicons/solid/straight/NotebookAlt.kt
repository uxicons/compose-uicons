package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotebookAlt: ImageVector? = null

val Icons.Ss.NotebookAlt: ImageVector
    get() = _NotebookAlt ?: UXIcon(name = "NotebookAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineTo(1f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(-2f)
                horizontalLineTo(1f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(-2f)
                horizontalLineTo(1f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(-2f)
                horizontalLineTo(1f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(-2f)
                horizontalLineTo(1f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(0f)
                horizontalLineToRelative(5f)
                verticalLineTo(24f)
                horizontalLineTo(3f)
                close()
                moveTo(20f, 0f)
                horizontalLineTo(10f)
                verticalLineTo(24f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _NotebookAlt = it}

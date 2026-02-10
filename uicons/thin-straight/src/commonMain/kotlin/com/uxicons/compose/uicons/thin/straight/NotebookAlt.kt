package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotebookAlt: ImageVector? = null

val Icons.Ts.NotebookAlt: ImageVector
    get() = _NotebookAlt ?: UXIcon(name = "NotebookAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(3f)
                verticalLineToRelative(3.5f)
                horizontalLineTo(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(3f)
                verticalLineToRelative(3.5f)
                horizontalLineTo(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(20.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(4f, 1f)
                horizontalLineToRelative(4f)
                verticalLineTo(23f)
                horizontalLineTo(4f)
                verticalLineTo(1f)
                close()
                moveTo(22f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(9f)
                verticalLineTo(1f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineTo(21.5f)
                close()
            }
        }.also { _NotebookAlt = it}

package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotebookAlt: ImageVector? = null

val Icons.Rs.NotebookAlt: ImageVector
    get() = _NotebookAlt ?: UXIcon(name = "NotebookAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 0f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(20f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(5f, 2f)
                horizontalLineToRelative(3f)
                verticalLineTo(22f)
                horizontalLineToRelative(-3f)
                verticalLineTo(2f)
                close()
                moveTo(21f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(10f)
                verticalLineTo(2f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineTo(21f)
                close()
            }
        }.also { _NotebookAlt = it}

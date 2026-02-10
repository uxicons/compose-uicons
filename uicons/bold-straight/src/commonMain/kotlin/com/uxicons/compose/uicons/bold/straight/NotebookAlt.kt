package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotebookAlt: ImageVector? = null

val Icons.Bs.NotebookAlt: ImageVector
    get() = _NotebookAlt ?: UXIcon(name = "NotebookAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 0f)
                lineTo(3f, 0f)
                lineTo(3f, 3f)
                lineTo(1f, 3f)
                verticalLineToRelative(3f)
                lineTo(3f, 6f)
                verticalLineToRelative(2f)
                lineTo(1f, 8f)
                verticalLineToRelative(3f)
                lineTo(3f, 11f)
                verticalLineToRelative(2f)
                lineTo(1f, 13f)
                verticalLineToRelative(3f)
                lineTo(3f, 16f)
                verticalLineToRelative(2f)
                lineTo(1f, 18f)
                verticalLineToRelative(3f)
                lineTo(3f, 21f)
                verticalLineToRelative(3f)
                lineTo(19.5f, 24f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(23f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(6f, 3f)
                horizontalLineToRelative(2f)
                lineTo(8f, 21f)
                horizontalLineToRelative(-2f)
                lineTo(6f, 3f)
                close()
                moveTo(20f, 20.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(11f, 21f)
                lineTo(11f, 3f)
                horizontalLineToRelative(8.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(20f, 20.5f)
                close()
            }
        }.also { _NotebookAlt = it}

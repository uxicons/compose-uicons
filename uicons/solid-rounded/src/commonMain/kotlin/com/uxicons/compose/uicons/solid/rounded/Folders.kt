package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Folders: ImageVector? = null

val Icons.Sr.Folders: ImageVector
    get() = _Folders ?: UXIcon(name = "Folders") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.9f, 7f)
                lineTo(4f, 7f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(2.06f)
                curveToRelative(0.46f, 0f, 0.93f, 0.11f, 1.34f, 0.32f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.14f, 0.07f, 0.29f, 0.1f, 0.45f, 0.1f)
                horizontalLineToRelative(3f)
                curveToRelative(2.41f, 0f, 4.43f, 1.72f, 4.9f, 4f)
                close()
                moveTo(4f, 9f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-5f)
                lineTo(4f, 9f)
                close()
                moveTo(19f, 21f)
                lineTo(5f, 21f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 8f)
                curveToRelative(-0.01f, -1.31f, -2.0f, -1.31f, -2f, 0f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(1.31f, -0.01f, 1.31f, -2.0f, 0f, -2f)
                close()
            }
        }.also { _Folders = it}

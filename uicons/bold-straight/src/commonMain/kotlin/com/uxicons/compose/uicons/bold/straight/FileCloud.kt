package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileCloud: ImageVector? = null

val Icons.Bs.FileCloud: ImageVector
    get() = _FileCloud ?: UXIcon(name = "FileCloud") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 15.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-5.67f)
                curveToRelative(-1.01f, 0f, -1.83f, -0.82f, -1.83f, -1.83f)
                curveToRelative(0f, -0.97f, 0.76f, -1.75f, 1.71f, -1.81f)
                curveToRelative(-0.13f, -0.35f, -0.21f, -0.72f, -0.21f, -1.11f)
                curveToRelative(0f, -1.79f, 1.46f, -3.25f, 3.25f, -3.25f)
                curveToRelative(1.73f, 0f, 3.12f, 1.35f, 3.23f, 3.05f)
                curveToRelative(1.15f, 0.22f, 2.02f, 1.24f, 2.02f, 2.45f)
                close()
                moveTo(22f, 5.66f)
                lineTo(22f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveTo(2f, 1.35f, 3.35f, 0f, 5f, 0f)
                horizontalLineToRelative(11.38f)
                lineToRelative(5.62f, 5.66f)
                close()
                moveTo(19f, 21f)
                lineTo(19f, 8f)
                horizontalLineToRelative(-5f)
                lineTo(14f, 3f)
                lineTo(5f, 3f)
                lineTo(5f, 21f)
                horizontalLineToRelative(14f)
                close()
            }
        }.also { _FileCloud = it}

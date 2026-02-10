package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _R: ImageVector? = null

val Icons.Tr.R: ImageVector
    get() = _R ?: UXIcon(name = "R") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.94f, 23.26f)
                lineToRelative(-4.84f, -8.72f)
                curveTo(24.83f, 11.6f, 22.88f, 0.12f, 14.5f, 0f)
                horizontalLineTo(6.5f)
                curveTo(4.02f, 0f, 2f, 2.02f, 2f, 4.5f)
                verticalLineTo(23.5f)
                curveToRelative(-0.01f, 0.65f, 1.01f, 0.65f, 1f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(14.5f)
                curveToRelative(0.55f, 0f, 1.09f, -0.06f, 1.61f, -0.17f)
                lineToRelative(4.95f, 8.92f)
                curveToRelative(0.14f, 0.24f, 0.44f, 0.33f, 0.68f, 0.19f)
                curveToRelative(0.24f, -0.14f, 0.33f, -0.44f, 0.19f, -0.68f)
                close()
                moveTo(3f, 14f)
                verticalLineTo(4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineTo(14.5f)
                curveToRelative(8.59f, 0.27f, 8.59f, 12.73f, 0f, 13f)
                horizontalLineTo(3f)
                close()
            }
        }.also { _R = it}

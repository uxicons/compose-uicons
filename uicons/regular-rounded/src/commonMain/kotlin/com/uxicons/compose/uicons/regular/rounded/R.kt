package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _R: ImageVector? = null

val Icons.Rr.R: ImageVector
    get() = _R ?: UXIcon(name = "R") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.38f, 14.42f)
                curveTo(24.84f, 11.26f, 22.71f, 0.1f, 14.5f, 0f)
                lineTo(7f, 0f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                lineTo(2f, 23f)
                curveToRelative(0.01f, 1.31f, 2.0f, 1.31f, 2f, 0f)
                lineTo(4f, 15f)
                lineTo(14.5f, 15f)
                curveToRelative(0.3f, 0f, 0.59f, -0.02f, 0.88f, -0.06f)
                lineToRelative(4.75f, 8.54f)
                curveToRelative(0.27f, 0.49f, 0.89f, 0.66f, 1.36f, 0.39f)
                curveToRelative(0.48f, -0.27f, 0.66f, -0.88f, 0.39f, -1.36f)
                lineToRelative(-4.5f, -8.09f)
                close()
                moveTo(4f, 13f)
                lineTo(4f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(7.5f)
                curveToRelative(7.27f, 0.23f, 7.26f, 10.77f, 0f, 11f)
                lineTo(4f, 13f)
                close()
            }
        }.also { _R = it}

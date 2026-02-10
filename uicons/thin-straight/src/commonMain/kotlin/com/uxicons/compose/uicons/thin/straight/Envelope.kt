package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Envelope: ImageVector? = null

val Icons.Ts.Envelope: ImageVector
    get() = _Envelope ?: UXIcon(name = "Envelope") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 2f)
                horizontalLineTo(2.5f)
                curveTo(1.12f, 2f, 0f, 3.12f, 0f, 4.5f)
                verticalLineTo(22f)
                horizontalLineTo(24f)
                verticalLineTo(4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 3f)
                horizontalLineTo(21.5f)
                curveToRelative(0.53f, 0f, 1f, 0.28f, 1.27f, 0.7f)
                lineTo(14.49f, 11.97f)
                curveToRelative(-0.66f, 0.66f, -1.54f, 1.02f, -2.48f, 1.02f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.91f, -0.02f, -1.83f, -0.36f, -2.49f, -1.02f)
                lineTo(1.23f, 3.7f)
                curveToRelative(0.27f, -0.42f, 0.73f, -0.7f, 1.27f, -0.7f)
                close()
                moveTo(1f, 21f)
                verticalLineTo(4.88f)
                lineToRelative(7.8f, 7.8f)
                curveToRelative(0.85f, 0.85f, 1.98f, 1.32f, 3.18f, 1.32f)
                horizontalLineToRelative(0.04f)
                curveToRelative(1.2f, 0f, 2.33f, -0.47f, 3.18f, -1.32f)
                lineToRelative(7.8f, -7.8f)
                verticalLineTo(21f)
                horizontalLineTo(1f)
                close()
            }
        }.also { _Envelope = it}

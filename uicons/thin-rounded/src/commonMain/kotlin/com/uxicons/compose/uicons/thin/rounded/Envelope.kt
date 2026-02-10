package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Envelope: ImageVector? = null

val Icons.Tr.Envelope: ImageVector
    get() = _Envelope ?: UXIcon(name = "Envelope") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 2f)
                lineTo(4.5f, 2f)
                curveTo(2.02f, 2f, 0f, 4.02f, 0f, 6.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(4.5f, 3f)
                horizontalLineToRelative(15f)
                curveToRelative(1.08f, 0f, 2.04f, 0.51f, 2.69f, 1.28f)
                lineToRelative(-7.69f, 7.69f)
                curveToRelative(-0.66f, 0.66f, -1.56f, 1.02f, -2.5f, 1.02f)
                curveToRelative(-0.91f, -0.02f, -1.83f, -0.36f, -2.49f, -1.02f)
                lineTo(1.81f, 4.28f)
                curveToRelative(0.64f, -0.78f, 1.6f, -1.28f, 2.69f, -1.28f)
                close()
                moveTo(23f, 17.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 21f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 6.5f)
                curveToRelative(0f, -0.48f, 0.1f, -0.93f, 0.27f, -1.35f)
                lineToRelative(7.53f, 7.53f)
                curveToRelative(0.85f, 0.85f, 1.98f, 1.32f, 3.18f, 1.32f)
                reflectiveCurveToRelative(2.38f, -0.47f, 3.23f, -1.32f)
                lineToRelative(7.53f, -7.53f)
                curveToRelative(0.17f, 0.41f, 0.27f, 0.87f, 0.27f, 1.35f)
                verticalLineToRelative(11f)
                close()
            }
        }.also { _Envelope = it}

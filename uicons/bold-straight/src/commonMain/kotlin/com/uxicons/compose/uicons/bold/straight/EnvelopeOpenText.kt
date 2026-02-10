package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeOpenText: ImageVector? = null

val Icons.Bs.EnvelopeOpenText: ImageVector
    get() = _EnvelopeOpenText ?: UXIcon(name = "EnvelopeOpenText") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.61f, 8.98f)
                lineToRelative(-1.61f, -1.55f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(6.5f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(3.94f)
                lineToRelative(-1.61f, 1.54f)
                curveTo(0.51f, 9.83f, 0.0f, 11.01f, 0.0f, 12.23f)
                verticalLineToRelative(11.77f)
                lineTo(24f, 24f)
                lineTo(24f, 12.23f)
                curveToRelative(0f, -1.22f, -0.51f, -2.41f, -1.39f, -3.25f)
                close()
                moveTo(7f, 4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                lineTo(7f, 7f)
                verticalLineToRelative(-3f)
                close()
                moveTo(7f, 9f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                lineTo(7f, 12f)
                verticalLineToRelative(-3f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 12.28f)
                lineToRelative(5.11f, 5.11f)
                curveToRelative(1.07f, 1.07f, 2.48f, 1.61f, 3.89f, 1.61f)
                reflectiveCurveToRelative(2.82f, -0.54f, 3.89f, -1.61f)
                lineToRelative(5.11f, -5.11f)
                verticalLineToRelative(8.72f)
                close()
            }
        }.also { _EnvelopeOpenText = it}

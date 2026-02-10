package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeOpenText: ImageVector? = null

val Icons.Ss.EnvelopeOpenText: ImageVector
    get() = _EnvelopeOpenText ?: UXIcon(name = "EnvelopeOpenText") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.58f, 10.49f)
                curveToRelative(0.26f, 0.54f, 0.42f, 1.13f, 0.42f, 1.74f)
                verticalLineToRelative(11.77f)
                lineTo(0f, 24.0f)
                lineTo(0f, 12.23f)
                curveToRelative(0.0f, -0.61f, 0.16f, -1.2f, 0.42f, -1.74f)
                lineToRelative(8.05f, 8.05f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.46f)
                lineToRelative(8.05f, -8.05f)
                close()
                moveTo(3f, 10.24f)
                lineTo(3f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(7.24f)
                lineToRelative(-6.88f, 6.88f)
                curveToRelative(-1.13f, 1.13f, -3.11f, 1.13f, -4.24f, 0f)
                lineTo(3f, 10.24f)
                close()
                moveTo(7f, 6f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                lineTo(7f, 4f)
                verticalLineToRelative(2f)
                close()
                moveTo(7f, 10f)
                lineTo(15f, 10f)
                verticalLineToRelative(-2f)
                lineTo(7f, 8f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _EnvelopeOpenText = it}

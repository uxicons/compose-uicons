package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeOpenText: ImageVector? = null

val Icons.Rs.EnvelopeOpenText: ImageVector
    get() = _EnvelopeOpenText ?: UXIcon(name = "EnvelopeOpenText") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.77f, 9.34f)
                lineToRelative(-1.77f, -1.69f)
                lineTo(21f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(6f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(3f, 7.65f)
                lineToRelative(-1.77f, 1.69f)
                curveTo(0.45f, 10.09f, 0.0f, 11.15f, 0.0f, 12.23f)
                verticalLineToRelative(11.77f)
                lineTo(24f, 24f)
                lineTo(24f, 12.23f)
                curveToRelative(0f, -1.09f, -0.45f, -2.14f, -1.23f, -2.89f)
                close()
                moveTo(6f, 2f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(19f, 12.24f)
                lineToRelative(-4.88f, 4.88f)
                curveToRelative(-1.13f, 1.13f, -3.11f, 1.13f, -4.24f, 0f)
                lineToRelative(-4.88f, -4.88f)
                lineTo(5f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 12.23f)
                curveToRelative(0.0f, -0.05f, 0.0f, -0.1f, 0.01f, -0.15f)
                lineToRelative(6.46f, 6.46f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.46f)
                lineToRelative(6.46f, -6.46f)
                curveToRelative(0.0f, 0.05f, 0.01f, 0.1f, 0.01f, 0.15f)
                verticalLineToRelative(9.77f)
                close()
                moveTo(17f, 7f)
                lineTo(7f, 7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                close()
                moveTo(15f, 11f)
                lineTo(7f, 11f)
                verticalLineToRelative(-2f)
                lineTo(15f, 9f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _EnvelopeOpenText = it}

package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeOpenText: ImageVector? = null

val Icons.Ts.EnvelopeOpenText: ImageVector
    get() = _EnvelopeOpenText ?: UXIcon(name = "EnvelopeOpenText") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.95f, 9.22f)
                lineToRelative(-1.95f, -1.9f)
                lineTo(21f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(3f, 7.33f)
                lineToRelative(-1.95f, 1.89f)
                curveToRelative(-0.67f, 0.66f, -1.05f, 1.57f, -1.05f, 2.5f)
                verticalLineToRelative(12.28f)
                lineTo(24f, 24f)
                lineTo(24f, 11.72f)
                curveToRelative(0f, -0.94f, -0.38f, -1.85f, -1.05f, -2.5f)
                close()
                moveTo(22.25f, 9.94f)
                curveToRelative(0.04f, 0.04f, 0.09f, 0.09f, 0.13f, 0.14f)
                lineToRelative(-1.38f, 1.38f)
                verticalLineToRelative(-2.73f)
                lineToRelative(1.25f, 1.22f)
                close()
                moveTo(5.5f, 1f)
                horizontalLineToRelative(13f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(20f, 12.45f)
                lineToRelative(-5.53f, 5.53f)
                curveToRelative(-1.32f, 1.32f, -3.63f, 1.32f, -4.95f, 0f)
                lineToRelative(-5.53f, -5.53f)
                lineTo(4f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3f, 8.72f)
                verticalLineToRelative(2.73f)
                lineToRelative(-1.38f, -1.38f)
                curveToRelative(0.04f, -0.05f, 0.08f, -0.09f, 0.13f, -0.14f)
                lineToRelative(1.25f, -1.22f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 11.72f)
                curveToRelative(0f, -0.25f, 0.04f, -0.51f, 0.12f, -0.75f)
                lineToRelative(7.7f, 7.7f)
                curveToRelative(0.85f, 0.85f, 1.98f, 1.32f, 3.18f, 1.32f)
                reflectiveCurveToRelative(2.33f, -0.47f, 3.18f, -1.32f)
                lineToRelative(7.7f, -7.7f)
                curveToRelative(0.07f, 0.24f, 0.12f, 0.49f, 0.12f, 0.75f)
                verticalLineToRelative(11.28f)
                close()
                moveTo(17f, 6f)
                lineTo(7f, 6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                close()
                moveTo(15f, 10f)
                lineTo(7f, 10f)
                verticalLineToRelative(-1f)
                lineTo(15f, 9f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _EnvelopeOpenText = it}

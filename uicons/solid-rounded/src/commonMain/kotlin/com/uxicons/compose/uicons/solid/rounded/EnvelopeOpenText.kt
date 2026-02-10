package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeOpenText: ImageVector? = null

val Icons.Sr.EnvelopeOpenText: ImageVector
    get() = _EnvelopeOpenText ?: UXIcon(name = "EnvelopeOpenText") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.88f, 17.12f)
                curveToRelative(1.13f, 1.13f, 3.11f, 1.13f, 4.24f, 0f)
                lineToRelative(6.88f, -6.88f)
                lineTo(21f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                lineTo(7f, 0f)
                curveTo(4.79f, 0f, 3f, 1.79f, 3f, 4f)
                verticalLineToRelative(6.24f)
                lineToRelative(6.88f, 6.88f)
                close()
                moveTo(8f, 4f)
                horizontalLineToRelative(8f)
                curveToRelative(1.31f, 0.01f, 1.31f, 2.0f, 0f, 2f)
                lineTo(8f, 6f)
                curveToRelative(-1.31f, -0.01f, -1.31f, -1.99f, 0f, -2f)
                close()
                moveTo(8f, 8f)
                horizontalLineToRelative(6f)
                curveToRelative(1.31f, 0.01f, 1.31f, 2.0f, 0f, 2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.31f, -0.01f, -1.31f, -1.99f, 0f, -2f)
                close()
                moveTo(23.5f, 10.57f)
                curveToRelative(0.32f, 0.67f, 0.5f, 1.39f, 0.5f, 2.14f)
                verticalLineToRelative(6.29f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24.0f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6.29f)
                curveToRelative(0f, -0.75f, 0.18f, -1.47f, 0.5f, -2.14f)
                lineToRelative(7.96f, 7.97f)
                curveToRelative(1.86f, 1.94f, 5.21f, 1.94f, 7.07f, 0f)
                lineToRelative(7.96f, -7.97f)
                close()
            }
        }.also { _EnvelopeOpenText = it}

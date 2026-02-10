package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeOpen: ImageVector? = null

val Icons.Tr.EnvelopeOpen: ImageVector
    get() = _EnvelopeOpen ?: UXIcon(name = "EnvelopeOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.61f, 8.37f)
                lineTo(15.31f, 1.37f)
                curveToRelative(-0.88f, -0.88f, -2.06f, -1.37f, -3.31f, -1.37f)
                reflectiveCurveToRelative(-2.43f, 0.49f, -3.3f, 1.36f)
                lineTo(1.39f, 8.37f)
                curveToRelative(-0.88f, 0.84f, -1.39f, 2.03f, -1.39f, 3.25f)
                verticalLineToRelative(7.88f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-7.88f)
                curveToRelative(0f, -1.22f, -0.51f, -2.4f, -1.39f, -3.25f)
                close()
                moveTo(2.08f, 9.09f)
                lineToRelative(7.32f, -7.01f)
                curveToRelative(0.69f, -0.69f, 1.62f, -1.08f, 2.6f, -1.08f)
                reflectiveCurveToRelative(1.91f, 0.38f, 2.61f, 1.09f)
                lineToRelative(7.31f, 7.0f)
                curveToRelative(0.07f, 0.07f, 0.15f, 0.15f, 0.21f, 0.23f)
                lineToRelative(-7.66f, 7.66f)
                curveToRelative(-1.32f, 1.32f, -3.63f, 1.32f, -4.95f, 0f)
                lineTo(1.86f, 9.31f)
                curveToRelative(0.07f, -0.08f, 0.14f, -0.15f, 0.21f, -0.23f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-7.88f)
                curveToRelative(0f, -0.5f, 0.11f, -0.99f, 0.31f, -1.44f)
                lineToRelative(7.51f, 7.51f)
                curveToRelative(0.85f, 0.85f, 1.98f, 1.32f, 3.18f, 1.32f)
                reflectiveCurveToRelative(2.33f, -0.47f, 3.18f, -1.32f)
                lineToRelative(7.51f, -7.51f)
                curveToRelative(0.2f, 0.45f, 0.31f, 0.94f, 0.31f, 1.44f)
                verticalLineToRelative(7.88f)
                close()
            }
        }.also { _EnvelopeOpen = it}

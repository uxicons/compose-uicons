package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TwoNails: ImageVector? = null

val Icons.Ss.TwoNails: ImageVector
    get() = _TwoNails ?: UXIcon(name = "TwoNails") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 7f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.64f, -0.25f, 1.22f, -0.65f, 1.66f)
                curveToRelative(-0.51f, -0.41f, -1.15f, -0.66f, -1.85f, -0.66f)
                curveToRelative(-0.69f, 0f, -1.32f, 0.25f, -1.83f, 0.65f)
                curveToRelative(-0.42f, -0.48f, -0.67f, -1.12f, -0.67f, -1.8f)
                lineTo(16f, 7f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(23f, 9.62f)
                verticalLineToRelative(4.38f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-1f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-4.38f)
                curveToRelative(-0.64f, 0.99f, -1f, 2.15f, -1f, 3.38f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(11f)
                lineTo(24f, 13f)
                curveToRelative(0f, -1.23f, -0.36f, -2.39f, -1f, -3.38f)
                close()
                moveTo(6f, 0f)
                horizontalLineToRelative(-1f)
                curveTo(3.9f, 0f, 3f, 0.9f, 3f, 2f)
                verticalLineToRelative(6.35f)
                curveToRelative(0f, 0.67f, 0.25f, 1.31f, 0.67f, 1.8f)
                curveToRelative(0.51f, -0.4f, 1.14f, -0.65f, 1.83f, -0.65f)
                curveToRelative(0.7f, 0f, 1.34f, 0.26f, 1.85f, 0.66f)
                curveToRelative(0.4f, -0.44f, 0.65f, -1.02f, 0.65f, -1.66f)
                lineTo(8f, 2f)
                curveTo(8f, 0.9f, 7.11f, 0f, 6f, 0f)
                close()
                moveTo(10f, 4.62f)
                verticalLineToRelative(4.38f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-1f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(1f, 4.62f)
                curveToRelative(-0.64f, 0.99f, -1f, 2.15f, -1f, 3.38f)
                verticalLineToRelative(16f)
                lineTo(11f, 24f)
                lineTo(11f, 8f)
                curveToRelative(0f, -1.23f, -0.36f, -2.39f, -1f, -3.38f)
                close()
            }
        }.also { _TwoNails = it}

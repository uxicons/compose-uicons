package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TwoNails: ImageVector? = null

val Icons.Sr.TwoNails: ImageVector
    get() = _TwoNails ?: UXIcon(name = "TwoNails") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 7.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.64f, -0.25f, 1.22f, -0.65f, 1.66f)
                curveToRelative(-0.51f, -0.41f, -1.15f, -0.66f, -1.85f, -0.66f)
                curveToRelative(-0.69f, 0f, -1.32f, 0.25f, -1.83f, 0.65f)
                curveToRelative(-0.42f, -0.48f, -0.67f, -1.12f, -0.67f, -1.8f)
                lineTo(16f, 7.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 9.62f)
                verticalLineToRelative(4.38f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-1f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-4.38f)
                curveToRelative(-0.64f, 0.99f, -1f, 2.15f, -1f, 3.38f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(9f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(24f, 13f)
                curveToRelative(0f, -1.23f, -0.36f, -2.39f, -1f, -3.38f)
                close()
                moveTo(5.5f, 0f)
                horizontalLineToRelative(0f)
                curveTo(4.12f, 0f, 3f, 1.12f, 3f, 2.5f)
                verticalLineToRelative(5.85f)
                curveToRelative(0f, 0.67f, 0.25f, 1.31f, 0.67f, 1.8f)
                curveToRelative(0.51f, -0.4f, 1.14f, -0.65f, 1.83f, -0.65f)
                curveToRelative(0.7f, 0f, 1.34f, 0.26f, 1.85f, 0.66f)
                curveToRelative(0.4f, -0.44f, 0.65f, -1.02f, 0.65f, -1.66f)
                lineTo(8f, 2.5f)
                curveTo(8f, 1.12f, 6.88f, 0f, 5.5f, 0f)
                close()
                moveTo(10f, 4.62f)
                verticalLineToRelative(4.38f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-1f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(1f, 4.62f)
                curveToRelative(-0.64f, 0.99f, -1f, 2.15f, -1f, 3.38f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(10f, 24f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(11f, 8f)
                curveToRelative(0f, -1.23f, -0.36f, -2.39f, -1f, -3.38f)
                close()
            }
        }.also { _TwoNails = it}

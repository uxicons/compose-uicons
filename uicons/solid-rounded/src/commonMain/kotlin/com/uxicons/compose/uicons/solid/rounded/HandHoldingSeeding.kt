package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandHoldingSeeding: ImageVector? = null

val Icons.Sr.HandHoldingSeeding: ImageVector
    get() = _HandHoldingSeeding ?: UXIcon(name = "HandHoldingSeeding") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.0f, 1.25f)
                curveTo(3.95f, 0.55f, 4.55f, -0.05f, 5.25f, 0.0f)
                curveToRelative(4.49f, 0.32f, 6.51f, 2.4f, 6.75f, 7.0f)
                curveTo(12.24f, 2.4f, 14.26f, 0.32f, 18.75f, 0.0f)
                curveToRelative(0.7f, -0.05f, 1.29f, 0.54f, 1.25f, 1.25f)
                curveToRelative(-0.32f, 4.49f, -2.41f, 6.49f, -7.0f, 6.73f)
                curveToRelative(0f, 0.01f, 0.01f, 0.02f, 0.01f, 0.03f)
                verticalLineToRelative(2f)
                curveToRelative(-0.01f, 1.31f, -2.0f, 1.31f, -2f, 0f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.01f, 0.01f, -0.02f, 0.01f, -0.03f)
                curveToRelative(-4.6f, -0.24f, -6.69f, -2.24f, -7.0f, -6.73f)
                close()
                moveTo(23.44f, 13.26f)
                curveToRelative(-0.52f, -0.72f, -1.32f, -1.18f, -2.2f, -1.25f)
                curveToRelative(-0.88f, -0.08f, -1.74f, 0.25f, -2.33f, 0.84f)
                lineToRelative(-1.95f, 1.79f)
                curveToRelative(0.28f, 2.31f, -1.65f, 4.38f, -3.96f, 4.37f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.31f, -0.01f, -1.31f, -2.0f, 0f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(2.63f, -0.05f, 2.63f, -3.95f, 0f, -4f)
                horizontalLineToRelative(-3.91f)
                curveToRelative(-2.94f, 0f, -5.7f, 1.15f, -7.8f, 3.24f)
                lineToRelative(-1.02f, 1.07f)
                curveToRelative(-0.18f, 0.19f, -0.27f, 0.43f, -0.27f, 0.69f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineTo(11.32f)
                curveToRelative(2.75f, 0f, 5.38f, -1.02f, 7.41f, -2.87f)
                lineToRelative(4.32f, -3.94f)
                curveToRelative(1.07f, -1.07f, 1.24f, -2.77f, 0.4f, -3.94f)
                close()
            }
        }.also { _HandHoldingSeeding = it}

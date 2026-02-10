package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandHoldingSeeding: ImageVector? = null

val Icons.Ss.HandHoldingSeeding: ImageVector
    get() = _HandHoldingSeeding ?: UXIcon(name = "HandHoldingSeeding") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 0f)
                curveToRelative(5.54f, 0f, 7.86f, 2.15f, 7.99f, 7.5f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(0.13f, -5.35f, 2.45f, -7.5f, 7.99f, -7.5f)
                curveToRelative(0f, 5.37f, -2.02f, 7.71f, -7f, 7.97f)
                verticalLineToRelative(3.03f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.03f)
                curveToRelative(-4.98f, -0.26f, -7f, -2.61f, -7f, -7.97f)
                close()
                moveTo(23.44f, 13.26f)
                curveToRelative(-0.52f, -0.72f, -1.32f, -1.18f, -2.2f, -1.25f)
                curveToRelative(-0.88f, -0.08f, -1.74f, 0.25f, -2.33f, 0.84f)
                lineToRelative(-1.91f, 1.75f)
                verticalLineToRelative(1.4f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6.19f)
                curveToRelative(-2.94f, 0f, -5.7f, 1.15f, -7.78f, 3.22f)
                lineTo(0.02f, 17.24f)
                lineToRelative(-0.02f, 6.76f)
                horizontalLineTo(11.32f)
                curveToRelative(2.75f, 0f, 5.38f, -1.02f, 7.41f, -2.87f)
                lineToRelative(4.32f, -3.94f)
                curveToRelative(1.07f, -1.07f, 1.24f, -2.77f, 0.4f, -3.94f)
                close()
            }
        }.also { _HandHoldingSeeding = it}

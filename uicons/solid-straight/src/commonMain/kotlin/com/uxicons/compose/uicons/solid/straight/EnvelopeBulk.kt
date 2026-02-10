package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeBulk: ImageVector? = null

val Icons.Ss.EnvelopeBulk: ImageVector
    get() = _EnvelopeBulk ?: UXIcon(name = "EnvelopeBulk") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.02f, 18.59f)
                curveToRelative(0.53f, 0.53f, 1.45f, 0.53f, 1.98f, 0f)
                lineToRelative(5.91f, -5.91f)
                curveToRelative(-0.52f, -0.43f, -1.18f, -0.68f, -1.9f, -0.68f)
                lineTo(3f, 12f)
                curveToRelative(-0.72f, 0f, -1.38f, 0.25f, -1.89f, 0.68f)
                lineToRelative(5.92f, 5.92f)
                close()
                moveTo(10.41f, 20.0f)
                curveToRelative(-0.64f, 0.64f, -1.5f, 0.99f, -2.4f, 0.99f)
                reflectiveCurveToRelative(-1.76f, -0.35f, -2.4f, -0.99f)
                lineTo(0.05f, 14.45f)
                curveToRelative(-0.03f, 0.18f, -0.05f, 0.36f, -0.05f, 0.55f)
                verticalLineToRelative(9f)
                lineTo(16f, 24f)
                lineTo(16f, 15f)
                curveToRelative(0f, -0.18f, -0.02f, -0.36f, -0.05f, -0.54f)
                lineToRelative(-5.54f, 5.54f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(21f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(11f, 4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(6f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                close()
            }
        }.also { _EnvelopeBulk = it}

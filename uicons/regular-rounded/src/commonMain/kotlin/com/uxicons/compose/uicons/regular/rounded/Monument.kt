package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Monument: ImageVector? = null

val Icons.Rr.Monument: ImageVector
    get() = _Monument ?: UXIcon(name = "Monument") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                lineTo(23f, 22f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(2f, 19f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.06f)
                lineToRelative(1.49f, -12.69f)
                curveToRelative(0.13f, -1.11f, 0.64f, -2.16f, 1.43f, -2.95f)
                lineToRelative(1.18f, -1.18f)
                curveToRelative(1.51f, -1.51f, 4.15f, -1.51f, 5.66f, 0f)
                lineToRelative(1.18f, 1.18f)
                curveToRelative(0.79f, 0.79f, 1.3f, 1.84f, 1.43f, 2.95f)
                lineToRelative(1.49f, 12.69f)
                horizontalLineToRelative(2.06f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(3f, 20f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(16.92f, 18f)
                lineToRelative(-1.29f, -11f)
                horizontalLineToRelative(-2.63f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(3.92f)
                close()
                moveTo(8.66f, 5f)
                horizontalLineToRelative(6.68f)
                curveToRelative(-0.14f, -0.46f, -0.4f, -0.89f, -0.74f, -1.23f)
                lineToRelative(-1.18f, -1.18f)
                curveToRelative(-0.76f, -0.76f, -2.07f, -0.76f, -2.83f, 0f)
                lineToRelative(-1.18f, 1.18f)
                curveToRelative(-0.34f, 0.34f, -0.6f, 0.77f, -0.74f, 1.23f)
                close()
                moveTo(7.08f, 18f)
                horizontalLineToRelative(3.92f)
                lineTo(11f, 7f)
                horizontalLineToRelative(-2.63f)
                lineToRelative(-1.29f, 11f)
                close()
            }
        }.also { _Monument = it}

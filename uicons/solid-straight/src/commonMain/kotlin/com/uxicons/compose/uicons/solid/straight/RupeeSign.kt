package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RupeeSign: ImageVector? = null

val Icons.Ss.RupeeSign: ImageVector
    get() = _RupeeSign ?: UXIcon(name = "RupeeSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 7.5f)
                curveTo(15f, 3.36f, 11.64f, 0f, 7.5f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 15f)
                reflectiveCurveToRelative(5.75f, 0.01f, 5.87f, 0f)
                lineToRelative(4.86f, 9f)
                horizontalLineToRelative(2.27f)
                lineToRelative(-5.07f, -9.41f)
                curveToRelative(2.94f, -1.01f, 5.07f, -3.8f, 5.07f, -7.09f)
                close()
                moveTo(7.5f, 13f)
                lineTo(2f, 13f)
                lineTo(2f, 2f)
                lineTo(7.5f, 2f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(24f, 21f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.47f, -0.3f, -0.88f, -0.74f, -1.03f)
                lineToRelative(-3.15f, -1.05f)
                curveToRelative(-1.26f, -0.42f, -2.11f, -1.6f, -2.11f, -2.92f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.47f, 0.3f, 0.88f, 0.74f, 1.03f)
                lineToRelative(3.15f, 1.05f)
                curveToRelative(1.26f, 0.42f, 2.11f, 1.6f, 2.11f, 2.92f)
                close()
            }
        }.also { _RupeeSign = it}

package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTrendUp: ImageVector? = null

val Icons.Sr.ArrowTrendUp: ImageVector
    get() = _ArrowTrendUp ?: UXIcon(name = "ArrowTrendUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 6f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5.59f)
                lineToRelative(-6.56f, 6.56f)
                curveToRelative(-0.56f, 0.56f, -1.48f, 0.56f, -2.05f, 0f)
                lineToRelative(-2.54f, -2.54f)
                curveToRelative(-1.34f, -1.34f, -3.53f, -1.34f, -4.88f, 0f)
                lineTo(0.29f, 16.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(4.27f, -4.27f)
                curveToRelative(0.55f, -0.55f, 1.5f, -0.55f, 2.05f, 0f)
                lineToRelative(2.54f, 2.54f)
                curveToRelative(1.34f, 1.34f, 3.53f, 1.34f, 4.88f, 0f)
                lineToRelative(6.56f, -6.56f)
                verticalLineToRelative(5.59f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _ArrowTrendUp = it}

package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTrendDown: ImageVector? = null

val Icons.Rr.ArrowTrendDown: ImageVector
    get() = _ArrowTrendDown ?: UXIcon(name = "ArrowTrendDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5.59f)
                lineToRelative(-6.56f, -6.56f)
                curveToRelative(-1.34f, -1.34f, -3.53f, -1.34f, -4.88f, 0f)
                lineToRelative(-2.58f, 2.58f)
                curveToRelative(-0.54f, 0.54f, -1.43f, 0.54f, -1.97f, 0f)
                lineTo(1.71f, 6.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(4.31f, 4.31f)
                curveToRelative(1.32f, 1.32f, 3.48f, 1.32f, 4.8f, 0f)
                lineToRelative(2.58f, -2.58f)
                curveToRelative(0.56f, -0.56f, 1.48f, -0.56f, 2.05f, 0f)
                lineToRelative(6.56f, 6.56f)
                horizontalLineToRelative(-5.59f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ArrowTrendDown = it}

package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnDownLeft: ImageVector? = null

val Icons.Rr.ArrowTurnDownLeft: ImageVector
    get() = _ArrowTurnDownLeft ?: UXIcon(name = "ArrowTurnDownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineTo(11f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineTo(2.58f)
                lineToRelative(5.14f, -5.3f)
                curveToRelative(0.38f, -0.4f, 0.37f, -1.03f, -0.02f, -1.41f)
                curveToRelative(-0.4f, -0.38f, -1.03f, -0.38f, -1.41f, 0.02f)
                lineTo(0.88f, 12.88f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.07f, -0.01f, 4.23f)
                lineToRelative(5.41f, 5.59f)
                curveToRelative(0.2f, 0.2f, 0.46f, 0.3f, 0.72f, 0.3f)
                reflectiveCurveToRelative(0.5f, -0.09f, 0.7f, -0.28f)
                curveToRelative(0.4f, -0.38f, 0.41f, -1.02f, 0.02f, -1.41f)
                lineToRelative(-5.14f, -5.3f)
                horizontalLineTo(19f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ArrowTurnDownLeft = it}

package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnDownRight: ImageVector? = null

val Icons.Rr.ArrowTurnDownRight: ImageVector
    get() = _ArrowTurnDownRight ?: UXIcon(name = "ArrowTurnDownRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.13f, 12.89f)
                lineToRelative(-5.41f, -5.59f)
                curveToRelative(-0.38f, -0.4f, -1.02f, -0.41f, -1.41f, -0.02f)
                curveToRelative(-0.4f, 0.38f, -0.41f, 1.02f, -0.02f, 1.41f)
                lineToRelative(5.14f, 5.3f)
                horizontalLineTo(5f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineTo(11f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineTo(21.42f)
                lineToRelative(-5.14f, 5.3f)
                curveToRelative(-0.38f, 0.4f, -0.37f, 1.03f, 0.02f, 1.41f)
                curveToRelative(0.19f, 0.19f, 0.44f, 0.28f, 0.7f, 0.28f)
                reflectiveCurveToRelative(0.52f, -0.1f, 0.72f, -0.3f)
                lineToRelative(5.4f, -5.58f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0.01f, -4.23f)
                close()
            }
        }.also { _ArrowTurnDownRight = it}

package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnLeftUp: ImageVector? = null

val Icons.Rr.ArrowTurnLeftUp: ImageVector
    get() = _ArrowTurnLeftUp ?: UXIcon(name = "ArrowTurnLeftUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(13f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineTo(2.39f)
                curveToRelative(-0.04f, 0.03f, -0.08f, 0.04f, -0.12f, 0.07f)
                lineTo(2.7f, 7.6f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, -0.01f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.01f, -1.41f)
                lineTo(6.47f, 1.04f)
                curveToRelative(1.35f, -1.35f, 3.71f, -1.35f, 5.06f, 0.0f)
                lineToRelative(5.17f, 5.13f)
                curveToRelative(0.39f, 0.39f, 0.4f, 1.02f, 0.01f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.3f, -0.71f, 0.3f)
                curveToRelative(-0.25f, 0f, -0.51f, -0.1f, -0.7f, -0.29f)
                lineTo(10.12f, 2.46f)
                curveToRelative(-0.03f, -0.03f, -0.08f, -0.05f, -0.12f, -0.08f)
                verticalLineTo(19f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _ArrowTurnLeftUp = it}

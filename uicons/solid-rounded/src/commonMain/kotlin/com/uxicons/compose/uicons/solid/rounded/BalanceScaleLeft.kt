package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BalanceScaleLeft: ImageVector? = null

val Icons.Sr.BalanceScaleLeft: ImageVector
    get() = _BalanceScaleLeft ?: UXIcon(name = "BalanceScaleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.94f, 10.65f)
                lineToRelative(-3.07f, -8.34f)
                curveToRelative(-0.42f, -1.15f, -1.63f, -1.78f, -2.82f, -1.47f)
                lineToRelative(-5.04f, 1.34f)
                verticalLineTo(1f)
                curveToRelative(-0.01f, -1.31f, -1.99f, -1.31f, -2f, 0f)
                verticalLineToRelative(1.73f)
                lineToRelative(-5.25f, 1.4f)
                curveToRelative(-1.25f, 0.34f, -2.27f, 1.26f, -2.72f, 2.48f)
                lineTo(0.06f, 14.65f)
                curveToRelative(-0.04f, 0.11f, -0.06f, 0.65f, -0.06f, 0.65f)
                curveToRelative(-0.08f, 3.92f, 4.75f, 6.27f, 7.6f, 3.46f)
                curveToRelative(0.89f, -0.85f, 1.4f, -2.04f, 1.4f, -3.26f)
                curveToRelative(0f, 0f, -0.02f, -0.73f, -0.06f, -0.84f)
                lineTo(5.87f, 6.22f)
                curveToRelative(0.12f, -0.06f, 0.26f, -0.11f, 0.39f, -0.15f)
                lineToRelative(4.74f, -1.26f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                curveToRelative(-1.31f, 0.01f, -1.31f, 1.99f, 0f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.31f, -0.01f, 1.31f, -1.99f, 0f, -2f)
                horizontalLineToRelative(-6f)
                verticalLineTo(4.27f)
                lineToRelative(4.9f, -1.31f)
                lineToRelative(-2.83f, 7.69f)
                curveToRelative(-0.04f, 0.11f, -0.06f, 0.65f, -0.06f, 0.65f)
                curveToRelative(0f, 2.51f, 1.87f, 4.57f, 4.26f, 4.69f)
                curveToRelative(1.25f, 0.07f, 2.43f, -0.37f, 3.34f, -1.23f)
                curveToRelative(0.89f, -0.85f, 1.4f, -2.04f, 1.4f, -3.26f)
                curveToRelative(0f, 0f, -0.02f, -0.73f, -0.06f, -0.85f)
                close()
                moveTo(6.57f, 14f)
                horizontalLineTo(2.43f)
                lineToRelative(2.08f, -5.65f)
                lineToRelative(2.06f, 5.65f)
                close()
                moveTo(19.5f, 4.39f)
                lineToRelative(2.07f, 5.61f)
                horizontalLineToRelative(-4.13f)
                lineToRelative(2.07f, -5.61f)
                close()
            }
        }.also { _BalanceScaleLeft = it}

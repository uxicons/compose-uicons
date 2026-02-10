package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownStrenght: ImageVector? = null

val Icons.Rr.ArrowDownStrenght: ImageVector
    get() = _ArrowDownStrenght ?: UXIcon(name = "ArrowDownStrenght") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                lineTo(23f, 22f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(0.62f, 17.96f)
                curveToRelative(3.51f, 1.43f, 7.32f, 2.15f, 11.33f, 2.15f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0f, 0.0f, 0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(4.07f, 0f, 7.92f, -0.74f, 11.42f, -2.19f)
                curveToRelative(0.51f, -0.21f, 0.75f, -0.8f, 0.54f, -1.31f)
                reflectiveCurveToRelative(-0.8f, -0.75f, -1.31f, -0.54f)
                curveToRelative(-3.26f, 1.35f, -6.85f, 2.04f, -10.66f, 2.04f)
                curveToRelative(-3.75f, 0f, -7.31f, -0.68f, -10.58f, -2.01f)
                curveToRelative(-0.51f, -0.21f, -1.09f, 0.04f, -1.3f, 0.55f)
                reflectiveCurveToRelative(0.04f, 1.09f, 0.55f, 1.3f)
                close()
                moveTo(10.68f, 10.95f)
                curveToRelative(0.73f, 0.73f, 1.91f, 0.73f, 2.64f, 0f)
                lineToRelative(2.89f, -2.89f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(-0.0f, -7.45f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                lineToRelative(0.0f, 7.44f)
                lineToRelative(-1.79f, -1.79f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(2.89f, 2.89f)
                close()
                moveTo(11.99f, 16f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0f, 0.0f, 0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(6.01f, -0.0f, 10.2f, -3.71f, 11.72f, -5.31f)
                curveToRelative(0.38f, -0.4f, 0.37f, -1.03f, -0.03f, -1.41f)
                curveToRelative(-0.4f, -0.38f, -1.03f, -0.37f, -1.41f, 0.03f)
                curveToRelative(-1.34f, 1.41f, -5.04f, 4.69f, -10.28f, 4.69f)
                curveToRelative(-5.23f, 0f, -8.93f, -3.28f, -10.28f, -4.69f)
                curveToRelative(-0.38f, -0.4f, -1.01f, -0.41f, -1.41f, -0.03f)
                curveToRelative(-0.4f, 0.38f, -0.41f, 1.01f, -0.03f, 1.41f)
                curveToRelative(1.52f, 1.6f, 5.72f, 5.31f, 11.72f, 5.31f)
                close()
            }
        }.also { _ArrowDownStrenght = it}

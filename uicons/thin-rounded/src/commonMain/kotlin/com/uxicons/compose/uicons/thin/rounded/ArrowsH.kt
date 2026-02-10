package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsH: ImageVector? = null

val Icons.Tr.ArrowsH: ImageVector
    get() = _ArrowsH ?: UXIcon(name = "ArrowsH") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.0f, 11.99f)
                curveToRelative(0f, -0.01f, 0.0f, -0.02f, 0.0f, -0.03f)
                curveToRelative(-0.0f, -0.81f, -0.32f, -1.57f, -0.9f, -2.14f)
                lineToRelative(-3.73f, -3.67f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.01f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.01f, 0.71f)
                lineToRelative(3.73f, 3.67f)
                curveToRelative(0.27f, 0.27f, 0.46f, 0.61f, 0.54f, 0.97f)
                horizontalLineTo(1.06f)
                curveToRelative(0.09f, -0.36f, 0.27f, -0.7f, 0.54f, -0.97f)
                lineToRelative(3.73f, -3.67f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.01f)
                lineTo(0.9f, 9.82f)
                curveTo(0.32f, 10.38f, 0.0f, 11.15f, 0f, 11.96f)
                curveToRelative(0f, 0.01f, 0.0f, 0.02f, 0.0f, 0.03f)
                lineToRelative(-0.0f, 0.01f)
                curveToRelative(0f, 0.01f, 0.01f, 0.02f, 0.01f, 0.04f)
                curveToRelative(0.02f, 0.78f, 0.32f, 1.51f, 0.88f, 2.07f)
                lineToRelative(3.75f, 3.75f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-3.75f, -3.75f)
                curveToRelative(-0.25f, -0.25f, -0.42f, -0.56f, -0.51f, -0.9f)
                horizontalLineTo(22.92f)
                curveToRelative(-0.09f, 0.34f, -0.26f, 0.65f, -0.51f, 0.9f)
                lineToRelative(-3.75f, 3.75f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(3.75f, -3.75f)
                curveToRelative(0.56f, -0.55f, 0.86f, -1.29f, 0.88f, -2.07f)
                curveToRelative(0f, -0.01f, 0.01f, -0.02f, 0.01f, -0.04f)
                lineToRelative(-0.0f, -0.01f)
                close()
            }
        }.also { _ArrowsH = it}

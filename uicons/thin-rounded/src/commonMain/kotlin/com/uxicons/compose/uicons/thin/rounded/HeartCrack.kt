package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartCrack: ImageVector? = null

val Icons.Tr.HeartCrack: ImageVector
    get() = _HeartCrack ?: UXIcon(name = "HeartCrack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23f)
                curveToRelative(-0.83f, 0f, -1.65f, -0.28f, -2.34f, -0.83f)
                curveTo(6.07f, 19.28f, 0f, 13f, 0f, 7.82f)
                curveTo(0f, 4.06f, 2.8f, 1f, 6.25f, 1f)
                curveToRelative(2.54f, 0f, 4.79f, 1.8f, 5.75f, 4.3f)
                curveToRelative(0.96f, -2.5f, 3.21f, -4.3f, 5.75f, -4.3f)
                curveToRelative(3.45f, 0f, 6.25f, 3.06f, 6.25f, 6.81f)
                curveToRelative(0f, 6.25f, -8.04f, 13.05f, -9.66f, 14.35f)
                curveToRelative(-0.69f, 0.56f, -1.52f, 0.83f, -2.34f, 0.83f)
                close()
                moveTo(6.25f, 2f)
                curveTo(3.4f, 2f, 1f, 4.67f, 1f, 7.82f)
                curveToRelative(0f, 4.81f, 5.83f, 10.8f, 9.28f, 13.58f)
                curveToRelative(1.01f, 0.82f, 2.42f, 0.82f, 3.44f, 0f)
                curveToRelative(4.28f, -3.45f, 9.28f, -9.08f, 9.28f, -13.58f)
                curveToRelative(0f, -3.15f, -2.4f, -5.81f, -5.25f, -5.81f)
                reflectiveCurveToRelative(-5.25f, 2.75f, -5.25f, 6f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.14f, -0.06f, 0.26f, -0.15f, 0.35f)
                lineToRelative(-2.15f, 2.15f)
                curveToRelative(-0.28f, 0.28f, -0.28f, 0.74f, 0f, 1.02f)
                lineToRelative(3.32f, 3.32f)
                curveToRelative(0.64f, 0.64f, 0.64f, 1.67f, 0f, 2.31f)
                lineToRelative(-1.69f, 1.69f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(1.69f, -1.69f)
                curveToRelative(0.25f, -0.25f, 0.25f, -0.65f, 0f, -0.9f)
                lineToRelative(-3.32f, -3.32f)
                curveToRelative(-0.67f, -0.67f, -0.67f, -1.77f, 0f, -2.44f)
                lineToRelative(2f, -2f)
                curveToRelative(-0.1f, -3.16f, -2.46f, -5.79f, -5.25f, -5.79f)
                close()
            }
        }.also { _HeartCrack = it}

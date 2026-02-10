package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonFalling: ImageVector? = null

val Icons.Rr.PersonFalling: ImageVector
    get() = _PersonFalling ?: UXIcon(name = "PersonFalling") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.75f, 18.34f)
                lineToRelative(-3.52f, -3.59f)
                curveToRelative(-0.47f, -0.48f, -1.12f, -0.75f, -1.78f, -0.75f)
                horizontalLineToRelative(-2.4f)
                lineToRelative(-3.37f, -7.62f)
                lineToRelative(2.8f, -1.49f)
                curveToRelative(0.11f, -0.06f, 0.21f, -0.14f, 0.3f, -0.24f)
                lineToRelative(2.5f, -3f)
                curveToRelative(0.35f, -0.42f, 0.3f, -1.05f, -0.13f, -1.41f)
                curveToRelative(-0.43f, -0.35f, -1.05f, -0.3f, -1.41f, 0.13f)
                lineToRelative(-2.37f, 2.85f)
                lineToRelative(-5.11f, 2.72f)
                curveToRelative(-1.59f, 0.85f, -2.98f, 2.09f, -4.0f, 3.57f)
                lineTo(0.18f, 15.43f)
                curveToRelative(-0.31f, 0.46f, -0.2f, 1.08f, 0.26f, 1.39f)
                curveToRelative(0.45f, 0.31f, 1.08f, 0.2f, 1.39f, -0.26f)
                lineToRelative(4.07f, -5.93f)
                curveToRelative(0.23f, -0.34f, 0.49f, -0.66f, 0.77f, -0.96f)
                lineToRelative(6.08f, 13.72f)
                curveToRelative(0.22f, 0.51f, 0.83f, 0.73f, 1.32f, 0.51f)
                curveToRelative(0.51f, -0.22f, 0.73f, -0.81f, 0.51f, -1.32f)
                lineToRelative(-2.92f, -6.59f)
                horizontalLineToRelative(5.8f)
                curveToRelative(0.13f, 0f, 0.26f, 0.05f, 0.36f, 0.15f)
                lineToRelative(3.52f, 3.59f)
                curveToRelative(0.39f, 0.4f, 1.02f, 0.4f, 1.41f, 0.01f)
                curveToRelative(0.4f, -0.39f, 0.4f, -1.02f, 0.01f, -1.41f)
                close()
                moveTo(8.23f, 8.29f)
                curveToRelative(0.31f, -0.21f, 1.67f, -0.97f, 1.67f, -0.97f)
                lineToRelative(2.96f, 6.68f)
                horizontalLineToRelative(-2.09f)
                lineToRelative(-2.53f, -5.71f)
                close()
                moveTo(4f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
            }
        }.also { _PersonFalling = it}

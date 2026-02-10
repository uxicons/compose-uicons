package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonFalling: ImageVector? = null

val Icons.Tr.PersonFalling: ImageVector
    get() = _PersonFalling ?: UXIcon(name = "PersonFalling") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.87f, 19.17f)
                lineToRelative(-3.09f, -3.49f)
                curveToRelative(-0.38f, -0.43f, -0.93f, -0.68f, -1.5f, -0.68f)
                horizontalLineToRelative(-3.23f)
                lineTo(11.02f, 6.16f)
                lineToRelative(2.88f, -1.54f)
                curveToRelative(0.27f, -0.15f, 0.52f, -0.34f, 0.72f, -0.58f)
                lineToRelative(2.75f, -3.21f)
                curveToRelative(0.18f, -0.21f, 0.15f, -0.53f, -0.06f, -0.7f)
                curveToRelative(-0.21f, -0.18f, -0.52f, -0.16f, -0.7f, 0.05f)
                lineToRelative(-2.75f, 3.21f)
                curveToRelative(-0.12f, 0.14f, -0.27f, 0.26f, -0.43f, 0.35f)
                lineToRelative(-5.57f, 2.97f)
                curveToRelative(-1.12f, 0.6f, -2.08f, 1.48f, -2.78f, 2.56f)
                lineTo(1.07f, 15.74f)
                curveToRelative(-0.15f, 0.23f, -0.07f, 0.54f, 0.16f, 0.69f)
                curveToRelative(0.23f, 0.14f, 0.54f, 0.08f, 0.69f, -0.16f)
                lineToRelative(4.01f, -6.47f)
                curveToRelative(0.17f, -0.26f, 0.35f, -0.5f, 0.56f, -0.73f)
                lineToRelative(6.55f, 14.64f)
                curveToRelative(0.11f, 0.26f, 0.41f, 0.36f, 0.66f, 0.25f)
                curveToRelative(0.25f, -0.11f, 0.36f, -0.41f, 0.25f, -0.66f)
                lineToRelative(-3.27f, -7.3f)
                horizontalLineToRelative(7.6f)
                curveToRelative(0.29f, 0f, 0.56f, 0.12f, 0.75f, 0.34f)
                lineToRelative(3.09f, 3.49f)
                curveToRelative(0.18f, 0.21f, 0.5f, 0.23f, 0.7f, 0.04f)
                curveToRelative(0.21f, -0.18f, 0.23f, -0.5f, 0.04f, -0.71f)
                close()
                moveTo(7.25f, 8.33f)
                curveToRelative(0.34f, -0.28f, 0.69f, -0.54f, 1.08f, -0.74f)
                lineToRelative(1.8f, -0.96f)
                lineToRelative(3.82f, 8.37f)
                horizontalLineToRelative(-3.71f)
                lineToRelative(-2.99f, -6.67f)
                close()
                moveTo(6.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(7.88f, 0f, 6.5f, 0f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(6.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }.also { _PersonFalling = it}

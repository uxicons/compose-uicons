package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageImage: ImageVector? = null

val Icons.Tr.MessageImage: ImageVector
    get() = _MessageImage ?: UXIcon(name = "MessageImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(3.61f)
                lineToRelative(3.9f, 3.28f)
                curveToRelative(0.29f, 0.25f, 0.65f, 0.38f, 1.0f, 0.38f)
                curveToRelative(0.35f, 0f, 0.7f, -0.12f, 0.98f, -0.37f)
                lineToRelative(3.98f, -3.29f)
                horizontalLineToRelative(3.53f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(1f, 3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.26f, 0f, 2.31f, 0.94f, 2.48f, 2.15f)
                lineToRelative(-7.31f, 7.31f)
                curveToRelative(-0.71f, 0.71f, -1.95f, 0.71f, -2.66f, 0f)
                lineToRelative(-0.64f, -0.64f)
                curveToRelative(-1.09f, -1.09f, -2.98f, -1.09f, -4.07f, 0f)
                lineToRelative(-7.24f, 7.24f)
                curveToRelative(-0.04f, -0.18f, -0.07f, -0.37f, -0.07f, -0.56f)
                lineTo(1.0f, 3.5f)
                close()
                moveTo(20.5f, 19f)
                horizontalLineToRelative(-3.71f)
                curveToRelative(-0.12f, 0f, -0.23f, 0.04f, -0.32f, 0.11f)
                lineToRelative(-4.14f, 3.42f)
                curveToRelative(-0.19f, 0.17f, -0.48f, 0.17f, -0.68f, -0.01f)
                lineToRelative(-4.05f, -3.41f)
                curveToRelative(-0.09f, -0.07f, -0.2f, -0.12f, -0.32f, -0.12f)
                horizontalLineToRelative(-3.79f)
                curveToRelative(-0.81f, 0f, -1.52f, -0.38f, -1.98f, -0.98f)
                lineToRelative(7.49f, -7.49f)
                curveToRelative(0.71f, -0.71f, 1.95f, -0.71f, 2.66f, 0f)
                lineToRelative(0.64f, 0.64f)
                curveToRelative(1.09f, 1.09f, 2.98f, 1.09f, 4.07f, 0f)
                lineToRelative(6.63f, -6.63f)
                verticalLineToRelative(11.96f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(5f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _MessageImage = it}

package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageSlash: ImageVector? = null

val Icons.Tr.MessageSlash: ImageVector
    get() = _MessageSlash ?: UXIcon(name = "MessageSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.85f, 23.15f)
                lineToRelative(-3.61f, -3.61f)
                curveToRelative(1.07f, -0.62f, 1.76f, -1.77f, 1.76f, -3.04f)
                lineTo(22.0f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(5.5f, 2f)
                curveToRelative(-0.76f, 0f, -1.49f, 0.25f, -2.1f, 0.7f)
                lineTo(0.85f, 0.15f)
                curveTo(0.66f, -0.05f, 0.34f, -0.05f, 0.15f, 0.15f)
                reflectiveCurveTo(-0.05f, 0.66f, 0.15f, 0.85f)
                lineToRelative(23f, 23f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(5.5f, 3f)
                horizontalLineToRelative(13f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.0f, -0.6f, 1.9f, -1.5f, 2.29f)
                lineTo(4.12f, 3.41f)
                curveToRelative(0.41f, -0.27f, 0.89f, -0.41f, 1.38f, -0.41f)
                close()
                moveTo(16.31f, 19.18f)
                curveToRelative(0.18f, 0.21f, 0.15f, 0.53f, -0.07f, 0.7f)
                lineToRelative(-3.38f, 2.79f)
                curveToRelative(-0.24f, 0.21f, -0.55f, 0.32f, -0.86f, 0.32f)
                curveToRelative(-0.31f, 0f, -0.63f, -0.11f, -0.88f, -0.34f)
                lineToRelative(-3.17f, -2.67f)
                horizontalLineToRelative(-2.46f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(2.0f, 6.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(2.64f)
                curveToRelative(0.12f, 0f, 0.23f, 0.04f, 0.32f, 0.12f)
                lineToRelative(3.31f, 2.79f)
                curveToRelative(0.13f, 0.12f, 0.31f, 0.11f, 0.43f, 0.01f)
                lineToRelative(3.39f, -2.81f)
                curveToRelative(0.21f, -0.18f, 0.53f, -0.15f, 0.7f, 0.07f)
                close()
            }
        }.also { _MessageSlash = it}

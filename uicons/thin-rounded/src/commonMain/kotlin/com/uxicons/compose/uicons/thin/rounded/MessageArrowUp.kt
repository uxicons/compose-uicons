package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageArrowUp: ImageVector? = null

val Icons.Tr.MessageArrowUp: ImageVector
    get() = _MessageArrowUp ?: UXIcon(name = "MessageArrowUp") {
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
                moveTo(23f, 16.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-3.71f)
                curveToRelative(-0.12f, 0f, -0.23f, 0.04f, -0.32f, 0.11f)
                lineToRelative(-4.14f, 3.42f)
                curveToRelative(-0.19f, 0.17f, -0.47f, 0.17f, -0.68f, -0.01f)
                lineToRelative(-4.05f, -3.41f)
                curveToRelative(-0.09f, -0.07f, -0.2f, -0.12f, -0.32f, -0.12f)
                horizontalLineToRelative(-3.79f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(1f, 3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(13f)
                close()
                moveTo(16.85f, 8.77f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                reflectiveCurveToRelative(-0.51f, 0.2f, -0.71f, 0f)
                lineToRelative(-3.04f, -3.04f)
                curveToRelative(-0.18f, -0.18f, -0.39f, -0.3f, -0.61f, -0.37f)
                verticalLineToRelative(9.43f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(11.5f, 6.1f)
                curveToRelative(-0.19f, 0.07f, -0.36f, 0.18f, -0.51f, 0.33f)
                lineToRelative(-3.14f, 3.14f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(3.14f, -3.14f)
                curveToRelative(0.97f, -0.97f, 2.56f, -0.97f, 3.54f, 0f)
                lineToRelative(3.04f, 3.04f)
                close()
            }
        }.also { _MessageArrowUp = it}

package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EditMessage: ImageVector? = null

val Icons.Tr.EditMessage: ImageVector
    get() = _EditMessage ?: UXIcon(name = "EditMessage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 7.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-3.53f)
                lineToRelative(-3.98f, 3.29f)
                curveToRelative(-0.28f, 0.24f, -0.63f, 0.37f, -0.98f, 0.37f)
                curveToRelative(-0.36f, 0f, -0.72f, -0.13f, -1.0f, -0.38f)
                lineToRelative(-3.9f, -3.28f)
                lineTo(3.5f, 20f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(3.5f, 1f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.79f)
                curveToRelative(0.12f, 0f, 0.23f, 0.04f, 0.32f, 0.12f)
                lineToRelative(4.05f, 3.41f)
                curveToRelative(0.2f, 0.18f, 0.48f, 0.18f, 0.67f, 0.01f)
                lineToRelative(4.14f, -3.42f)
                curveToRelative(0.09f, -0.07f, 0.2f, -0.11f, 0.32f, -0.11f)
                horizontalLineToRelative(3.71f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(23f, 7.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(12.03f, 8.44f)
                lineTo(19.73f, 0.73f)
                curveToRelative(0.97f, -0.97f, 2.56f, -0.97f, 3.54f, 0f)
                curveToRelative(0.47f, 0.47f, 0.73f, 1.1f, 0.73f, 1.77f)
                reflectiveCurveToRelative(-0.26f, 1.3f, -0.73f, 1.77f)
                lineToRelative(-7.71f, 7.71f)
                curveToRelative(-0.66f, 0.66f, -1.54f, 1.02f, -2.48f, 1.02f)
                horizontalLineToRelative(-1.59f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0f, -0.92f, 0.37f, -1.82f, 1.02f, -2.48f)
                close()
                moveTo(12.73f, 9.15f)
                curveToRelative(-0.47f, 0.47f, -0.73f, 1.11f, -0.73f, 1.77f)
                verticalLineToRelative(1.09f)
                horizontalLineToRelative(1.09f)
                curveToRelative(0.67f, 0f, 1.3f, -0.26f, 1.77f, -0.73f)
                lineToRelative(7.71f, -7.71f)
                curveToRelative(0.28f, -0.28f, 0.44f, -0.66f, 0.44f, -1.06f)
                reflectiveCurveToRelative(-0.16f, -0.78f, -0.44f, -1.06f)
                curveToRelative(-0.58f, -0.58f, -1.54f, -0.58f, -2.12f, 0f)
                lineToRelative(-7.71f, 7.71f)
                close()
            }
        }.also { _EditMessage = it}

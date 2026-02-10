package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Images: ImageVector? = null

val Icons.Tr.Images: ImageVector
    get() = _Images ?: UXIcon(name = "Images") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(24f, 4.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(9.5f, 16f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(5f, 4.5f)
                curveTo(5f, 2.02f, 7.02f, 0f, 9.5f, 0f)
                horizontalLineToRelative(10f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(6.88f, 13.82f)
                lineToRelative(6.17f, -6.17f)
                curveToRelative(0.82f, -0.82f, 2.15f, -0.82f, 2.97f, 0f)
                lineToRelative(1.04f, 1.04f)
                curveToRelative(0.42f, 0.41f, 1.14f, 0.42f, 1.55f, 0f)
                lineToRelative(4.39f, -4.39f)
                curveToRelative(-0.1f, -1.84f, -1.63f, -3.3f, -3.49f, -3.3f)
                lineTo(9.5f, 1f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.89f, 0.33f, 1.7f, 0.88f, 2.32f)
                close()
                moveTo(23f, 11.5f)
                lineTo(23f, 5.71f)
                lineToRelative(-3.69f, 3.69f)
                curveToRelative(-0.79f, 0.79f, -2.18f, 0.79f, -2.97f, 0f)
                lineToRelative(-1.04f, -1.04f)
                curveToRelative(-0.43f, -0.43f, -1.13f, -0.43f, -1.55f, 0f)
                lineToRelative(-6.11f, 6.11f)
                curveToRelative(0.54f, 0.34f, 1.18f, 0.54f, 1.86f, 0.54f)
                horizontalLineToRelative(10f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                close()
                moveTo(18.64f, 18.03f)
                curveToRelative(-0.27f, -0.07f, -0.54f, 0.09f, -0.61f, 0.36f)
                lineToRelative(-0.52f, 2.04f)
                curveToRelative(-0.51f, 1.86f, -2.44f, 2.96f, -4.3f, 2.45f)
                lineToRelative(-9.63f, -2.61f)
                curveToRelative(-1.86f, -0.51f, -2.96f, -2.44f, -2.45f, -4.3f)
                lineToRelative(1.84f, -6.83f)
                curveToRelative(0.07f, -0.27f, -0.09f, -0.54f, -0.35f, -0.61f)
                curveToRelative(-0.26f, -0.07f, -0.54f, 0.08f, -0.61f, 0.35f)
                lineTo(0.16f, 15.7f)
                curveToRelative(-0.32f, 1.16f, -0.17f, 2.37f, 0.43f, 3.42f)
                reflectiveCurveToRelative(1.56f, 1.79f, 2.72f, 2.11f)
                lineToRelative(9.63f, 2.61f)
                curveToRelative(0.4f, 0.11f, 0.8f, 0.16f, 1.19f, 0.16f)
                curveToRelative(1.98f, 0f, 3.79f, -1.31f, 4.34f, -3.32f)
                lineToRelative(0.53f, -2.04f)
                curveToRelative(0.07f, -0.27f, -0.09f, -0.54f, -0.36f, -0.61f)
                close()
            }
        }.also { _Images = it}

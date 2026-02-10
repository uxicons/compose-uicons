package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrazilFlag: ImageVector? = null

val Icons.Tr.BrazilFlag: ImageVector
    get() = _BrazilFlag ?: UXIcon(name = "BrazilFlag") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 2f)
                lineTo(4.5f, 2f)
                curveTo(2.02f, 2f, 0f, 4.02f, 0f, 6.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 17.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 21f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(11f)
                close()
                moveTo(21.04f, 10.18f)
                lineToRelative(-7.07f, -5.49f)
                curveToRelative(-1.15f, -0.9f, -2.77f, -0.9f, -3.94f, -0.02f)
                lineTo(2.92f, 10.08f)
                curveToRelative(-1.26f, 0.9f, -1.25f, 2.93f, 0f, 3.84f)
                lineToRelative(7.13f, 5.43f)
                curveToRelative(1.15f, 0.87f, 2.75f, 0.88f, 3.9f, 0.0f)
                lineToRelative(7.06f, -5.35f)
                curveToRelative(1.25f, -0.9f, 1.26f, -2.92f, 0.02f, -3.83f)
                close()
                moveTo(20.41f, 13.21f)
                lineToRelative(-7.06f, 5.35f)
                curveToRelative(-0.79f, 0.6f, -1.9f, 0.6f, -2.7f, -0.0f)
                lineTo(3.52f, 13.12f)
                curveToRelative(-0.73f, -0.53f, -0.73f, -1.72f, 0f, -2.24f)
                lineToRelative(7.11f, -5.41f)
                curveToRelative(0.8f, -0.61f, 1.92f, -0.61f, 2.72f, 0.01f)
                lineToRelative(7.07f, 5.49f)
                curveToRelative(0.73f, 0.53f, 0.72f, 1.72f, -0.01f, 2.24f)
                close()
                moveTo(12f, 8f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                curveToRelative(0f, -0.22f, 0.03f, -0.43f, 0.07f, -0.64f)
                curveToRelative(0.86f, 0.08f, 3.38f, 0.46f, 5.4f, 2.33f)
                curveToRelative(-0.54f, 0.79f, -1.45f, 1.3f, -2.47f, 1.3f)
                close()
                moveTo(14.9f, 12.73f)
                curveToRelative(-1.99f, -1.7f, -4.31f, -2.19f, -5.43f, -2.33f)
                curveToRelative(0.53f, -0.84f, 1.46f, -1.4f, 2.53f, -1.4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 0.25f, -0.04f, 0.5f, -0.1f, 0.73f)
                close()
            }
        }.also { _BrazilFlag = it}

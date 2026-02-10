package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trophy: ImageVector? = null

val Icons.Rc.Trophy: ImageVector
    get() = _Trophy ?: UXIcon(name = "Trophy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8.01f)
                horizontalLineToRelative(-0.43f)
                lineTo(19.57f, 2.96f)
                curveToRelative(0f, -0.45f, -0.3f, -0.84f, -0.73f, -0.96f)
                curveTo(14.11f, 0.66f, 9.89f, 0.66f, 5.15f, 2.0f)
                curveToRelative(-0.43f, 0.12f, -0.73f, 0.52f, -0.73f, 0.96f)
                verticalLineToRelative(5.05f)
                horizontalLineToRelative(-0.43f)
                curveToRelative(-1.46f, 0f, -2.64f, 1.18f, -2.64f, 2.64f)
                verticalLineToRelative(0.86f)
                curveToRelative(0f, 2.38f, 1.94f, 4.32f, 4.32f, 4.32f)
                horizontalLineToRelative(1.83f)
                curveToRelative(0.33f, 0.23f, 0.68f, 0.42f, 1.05f, 0.59f)
                curveToRelative(0.53f, 0.24f, 0.81f, 0.84f, 0.66f, 1.43f)
                lineToRelative(-0.83f, 3.15f)
                horizontalLineToRelative(-1.62f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10.48f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.62f)
                lineToRelative(-0.83f, -3.15f)
                curveToRelative(-0.15f, -0.59f, 0.12f, -1.19f, 0.66f, -1.43f)
                curveToRelative(0.37f, -0.17f, 0.72f, -0.37f, 1.05f, -0.59f)
                horizontalLineToRelative(1.83f)
                curveToRelative(2.38f, 0f, 4.32f, -1.94f, 4.32f, -4.32f)
                verticalLineToRelative(-0.86f)
                curveToRelative(0f, -1.46f, -1.18f, -2.64f, -2.64f, -2.64f)
                close()
                moveTo(3.36f, 11.5f)
                verticalLineToRelative(-0.86f)
                curveToRelative(0f, -0.35f, 0.29f, -0.64f, 0.64f, -0.64f)
                horizontalLineToRelative(0.43f)
                curveToRelative(0.0f, 1.38f, 0.41f, 2.7f, 1.13f, 3.81f)
                curveToRelative(-1.22f, -0.06f, -2.2f, -1.08f, -2.2f, -2.32f)
                close()
                moveTo(14.61f, 14.6f)
                curveToRelative(-1.42f, 0.65f, -2.16f, 2.23f, -1.76f, 3.76f)
                lineToRelative(0.7f, 2.65f)
                horizontalLineToRelative(-3.09f)
                lineToRelative(0.7f, -2.65f)
                curveToRelative(0.4f, -1.53f, -0.34f, -3.11f, -1.76f, -3.76f)
                curveToRelative(-1.8f, -0.82f, -2.96f, -2.63f, -2.96f, -4.61f)
                lineTo(6.42f, 3.73f)
                curveToRelative(3.83f, -0.97f, 7.32f, -0.97f, 11.15f, 0f)
                verticalLineToRelative(6.26f)
                curveToRelative(0f, 1.98f, -1.16f, 3.79f, -2.96f, 4.61f)
                close()
                moveTo(20.64f, 11.5f)
                curveToRelative(0f, 1.24f, -0.97f, 2.25f, -2.2f, 2.32f)
                curveToRelative(0.72f, -1.12f, 1.13f, -2.44f, 1.13f, -3.81f)
                horizontalLineToRelative(0.43f)
                curveToRelative(0.35f, 0f, 0.64f, 0.29f, 0.64f, 0.64f)
                verticalLineToRelative(0.86f)
                close()
            }
        }.also { _Trophy = it}

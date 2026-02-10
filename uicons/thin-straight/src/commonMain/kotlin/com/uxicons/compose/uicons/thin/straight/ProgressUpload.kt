package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ProgressUpload: ImageVector? = null

val Icons.Ts.ProgressUpload: ImageVector
    get() = _ProgressUpload ?: UXIcon(name = "ProgressUpload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.0f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                curveToRelative(-1.17f, 0f, -2.32f, -0.17f, -3.43f, -0.5f)
                lineToRelative(0.29f, -0.96f)
                curveToRelative(1.01f, 0.3f, 2.07f, 0.46f, 3.14f, 0.46f)
                curveToRelative(6.07f, 0f, 11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.06f, 1f, 12.0f, 1f)
                curveToRelative(-1.07f, 0f, -2.13f, 0.15f, -3.14f, 0.46f)
                lineToRelative(-0.29f, -0.96f)
                curveToRelative(1.11f, -0.33f, 2.26f, -0.5f, 3.43f, -0.5f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                close()
                moveTo(11.5f, 7.21f)
                verticalLineToRelative(10.79f)
                horizontalLineToRelative(1f)
                lineTo(12.5f, 7.21f)
                reflectiveCurveToRelative(0.01f, 0.01f, 0.01f, 0.01f)
                lineToRelative(3.73f, 3.64f)
                lineToRelative(0.7f, -0.71f)
                lineToRelative(-3.72f, -3.64f)
                curveToRelative(-0.65f, -0.65f, -1.79f, -0.65f, -2.43f, -0.0f)
                lineToRelative(-3.73f, 3.64f)
                lineToRelative(0.7f, 0.71f)
                lineToRelative(3.73f, -3.65f)
                reflectiveCurveToRelative(0.01f, -0.0f, 0.01f, -0.01f)
                close()
                moveTo(2.89f, 4.19f)
                lineToRelative(0.76f, 0.65f)
                curveToRelative(0.68f, -0.8f, 1.48f, -1.49f, 2.36f, -2.06f)
                lineToRelative(-0.55f, -0.84f)
                curveToRelative(-0.96f, 0.63f, -1.83f, 1.38f, -2.57f, 2.25f)
                close()
                moveTo(0.12f, 10.3f)
                lineToRelative(0.99f, 0.14f)
                curveToRelative(0.15f, -1.03f, 0.44f, -2.04f, 0.87f, -2.99f)
                lineToRelative(-0.91f, -0.41f)
                curveToRelative(-0.47f, 1.04f, -0.79f, 2.14f, -0.95f, 3.27f)
                close()
                moveTo(0.12f, 13.7f)
                curveToRelative(0.16f, 1.13f, 0.48f, 2.23f, 0.95f, 3.27f)
                lineToRelative(0.91f, -0.41f)
                curveToRelative(-0.43f, -0.95f, -0.73f, -1.96f, -0.87f, -2.99f)
                lineToRelative(-0.99f, 0.14f)
                close()
                moveTo(3.66f, 19.17f)
                lineToRelative(-0.76f, 0.65f)
                curveToRelative(0.75f, 0.87f, 1.61f, 1.62f, 2.56f, 2.24f)
                lineToRelative(0.55f, -0.84f)
                curveToRelative(-0.88f, -0.57f, -1.67f, -1.26f, -2.35f, -2.06f)
                close()
            }
        }.also { _ProgressUpload = it}

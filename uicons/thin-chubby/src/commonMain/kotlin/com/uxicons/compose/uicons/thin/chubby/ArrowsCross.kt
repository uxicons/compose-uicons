package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsCross: ImageVector? = null

val Icons.Tc.ArrowsCross: ImageVector
    get() = _ArrowsCross ?: UXIcon(name = "ArrowsCross") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.43f, 9.11f)
                curveToRelative(-0.08f, 0.26f, 0.06f, 0.64f, 0.48f, 0.65f)
                curveToRelative(0.21f, 0.01f, 0.41f, -0.14f, 0.48f, -0.35f)
                curveToRelative(1.4f, -4.38f, 0.01f, -7.38f, -0.05f, -7.51f)
                curveToRelative(-0.05f, -0.1f, -0.13f, -0.19f, -0.24f, -0.24f)
                curveToRelative(-0.12f, -0.06f, -3.13f, -1.44f, -7.51f, -0.05f)
                curveToRelative(-0.26f, 0.08f, -0.41f, 0.36f, -0.33f, 0.63f)
                curveToRelative(0.08f, 0.26f, 0.36f, 0.41f, 0.63f, 0.33f)
                curveToRelative(2.81f, -0.89f, 5.01f, -0.54f, 6.07f, -0.24f)
                lineTo(1.15f, 22.15f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.52f, 0f, 0.71f)
                curveToRelative(0.29f, 0.28f, 0.61f, 0.1f, 0.71f, 0f)
                lineTo(21.67f, 3.03f)
                curveToRelative(0.3f, 1.06f, 0.65f, 3.25f, -0.25f, 6.08f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.75f, 14.26f)
                curveToRelative(-0.26f, 0.08f, -0.41f, 0.36f, -0.33f, 0.63f)
                curveToRelative(0.89f, 2.81f, 0.54f, 5.01f, 0.24f, 6.07f)
                lineToRelative(-6.17f, -6.17f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(6.17f, 6.17f)
                curveToRelative(-1.06f, 0.3f, -3.25f, 0.65f, -6.08f, -0.24f)
                curveToRelative(-0.26f, -0.09f, -0.54f, 0.06f, -0.63f, 0.33f)
                curveToRelative(-0.08f, 0.26f, 0.06f, 0.54f, 0.33f, 0.63f)
                curveToRelative(1.46f, 0.47f, 2.77f, 0.62f, 3.87f, 0.62f)
                curveToRelative(2.2f, 0f, 3.56f, -0.63f, 3.65f, -0.67f)
                curveToRelative(0.1f, -0.05f, 0.19f, -0.13f, 0.24f, -0.24f)
                curveToRelative(0.06f, -0.12f, 1.44f, -3.12f, 0.05f, -7.51f)
                curveToRelative(-0.08f, -0.26f, -0.37f, -0.41f, -0.63f, -0.33f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 9.2f)
                curveToRelative(0.1f, 0.1f, 0.39f, 0.28f, 0.71f, 0f)
                curveToRelative(0.21f, -0.18f, 0.2f, -0.51f, 0f, -0.71f)
                lineTo(1.85f, 1.15f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(7.35f, 7.35f)
                close()
            }
        }.also { _ArrowsCross = it}

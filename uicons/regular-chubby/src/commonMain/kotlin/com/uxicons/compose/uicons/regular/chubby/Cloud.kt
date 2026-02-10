package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cloud: ImageVector? = null

val Icons.Rc.Cloud: ImageVector
    get() = _Cloud ?: UXIcon(name = "Cloud") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.3f, 10.07f)
                curveToRelative(-0.09f, -4.03f, -3.34f, -7.28f, -7.32f, -7.28f)
                curveToRelative(-4.04f, 0f, -7.32f, 3.34f, -7.32f, 7.45f)
                curveToRelative(0f, 0.27f, 0.01f, 0.54f, 0.04f, 0.81f)
                curveToRelative(-2.15f, 0.61f, -3.71f, 2.62f, -3.71f, 4.99f)
                curveToRelative(0f, 2.85f, 2.28f, 5.18f, 5.09f, 5.18f)
                horizontalLineToRelative(11.26f)
                curveToRelative(3.11f, 0f, 5.65f, -2.58f, 5.65f, -5.75f)
                curveToRelative(0f, -2.43f, -1.51f, -4.58f, -3.7f, -5.39f)
                close()
                moveTo(17.35f, 19.21f)
                lineTo(6.09f, 19.21f)
                curveToRelative(-1.7f, 0f, -3.09f, -1.43f, -3.09f, -3.18f)
                curveToRelative(0f, -1.69f, 1.28f, -3.08f, 2.92f, -3.17f)
                curveToRelative(0.3f, -0.02f, 0.57f, -0.17f, 0.75f, -0.41f)
                curveToRelative(0.18f, -0.24f, 0.24f, -0.55f, 0.16f, -0.84f)
                curveToRelative(-0.11f, -0.45f, -0.17f, -0.91f, -0.17f, -1.38f)
                curveToRelative(0f, -3.01f, 2.38f, -5.45f, 5.32f, -5.45f)
                reflectiveCurveToRelative(5.32f, 2.45f, 5.32f, 5.45f)
                curveToRelative(0f, 0.16f, -0.01f, 0.33f, -0.02f, 0.48f)
                curveToRelative(-0.04f, 0.51f, 0.3f, 0.96f, 0.79f, 1.07f)
                curveToRelative(1.69f, 0.35f, 2.92f, 1.9f, 2.92f, 3.67f)
                curveToRelative(0f, 2.07f, -1.64f, 3.75f, -3.65f, 3.75f)
                close()
            }
        }.also { _Cloud = it}

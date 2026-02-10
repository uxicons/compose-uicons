package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserHeadset: ImageVector? = null

val Icons.Sc.UserHeadset: ImageVector
    get() = _UserHeadset ?: UXIcon(name = "UserHeadset") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.0f, 10.46f)
                curveToRelative(0f, 3.74f, -1.8f, 5.54f, -5.5f, 5.54f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.43f, 0f, -2f, -0.57f, -2f, -2f)
                reflectiveCurveToRelative(0.57f, -2f, 2f, -2f)
                curveToRelative(1.03f, 0f, 1.61f, 0.3f, 1.85f, 1f)
                horizontalLineToRelative(2.65f)
                curveToRelative(2.03f, 0f, 2.5f, -0.47f, 2.5f, -2.5f)
                curveToRelative(-0.13f, -4.85f, -1.9f, -6.5f, -7f, -6.5f)
                reflectiveCurveToRelative(-6.87f, 1.65f, -7.0f, 6.54f)
                curveToRelative(-0.02f, 0.81f, -0.69f, 1.46f, -1.5f, 1.46f)
                curveToRelative(-0.84f, 0.0f, -1.52f, -0.7f, -1.5f, -1.54f)
                curveToRelative(0.17f, -6.54f, 3.26f, -9.46f, 10.0f, -9.46f)
                reflectiveCurveToRelative(9.83f, 2.92f, 10.0f, 9.46f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-2.85f, 0f, -6.78f, 0.49f, -7.96f, 4.74f)
                curveToRelative(-0.08f, 0.3f, -0.02f, 0.62f, 0.18f, 0.87f)
                curveToRelative(0.2f, 0.25f, 0.5f, 0.39f, 0.82f, 0.39f)
                horizontalLineToRelative(13.92f)
                curveToRelative(0.32f, 0f, 0.63f, -0.14f, 0.82f, -0.39f)
                curveToRelative(0.2f, -0.25f, 0.26f, -0.57f, 0.18f, -0.87f)
                curveToRelative(-1.18f, -4.25f, -5.11f, -4.74f, -7.96f, -4.74f)
                close()
                moveTo(12f, 10f)
                curveToRelative(1.24f, 0f, 2.21f, 0.35f, 2.89f, 1f)
                horizontalLineToRelative(2.11f)
                curveToRelative(0f, -3.41f, -1.59f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 1.59f, -5f, 5f)
                curveToRelative(0f, 1.56f, 0.35f, 2.73f, 1.04f, 3.55f)
                curveToRelative(-0.02f, -0.18f, -0.04f, -0.35f, -0.04f, -0.55f)
                curveToRelative(0f, -2.54f, 1.46f, -4f, 4f, -4f)
                close()
            }
        }.also { _UserHeadset = it}

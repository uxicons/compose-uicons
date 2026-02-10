package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellSchool: ImageVector? = null

val Icons.Rc.BellSchool: ImageVector
    get() = _BellSchool ?: UXIcon(name = "BellSchool") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.97f, 10.15f)
                moveToRelative(-1.43f, 0f)
                arcToRelative(1.43f, 1.43f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.86f, 0f)
                arcToRelative(1.43f, 1.43f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.86f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.8f, 6.95f)
                curveToRelative(-2.64f, 0f, -3.2f, 1.74f, -3.2f, 3.2f)
                reflectiveCurveToRelative(0.56f, 3.2f, 3.2f, 3.2f)
                curveToRelative(0.35f, 0f, 0.66f, -0.03f, 0.94f, -0.09f)
                curveToRelative(-0.74f, 4.03f, -3.04f, 6.55f, -6.85f, 7.5f)
                curveToRelative(-0.7f, 0.17f, -1.44f, 0.02f, -2.01f, -0.43f)
                curveToRelative(-0.41f, -0.32f, -0.69f, -0.75f, -0.82f, -1.23f)
                curveToRelative(2.25f, -0.12f, 4.96f, -0.72f, 6.54f, -3.21f)
                curveToRelative(0.3f, -0.47f, 0.16f, -1.08f, -0.31f, -1.38f)
                curveToRelative(-0.47f, -0.3f, -1.08f, -0.16f, -1.38f, 0.31f)
                curveToRelative(-1.01f, 1.59f, -2.84f, 2.31f, -5.93f, 2.31f)
                curveToRelative(-4.3f, 0f, -6.97f, -1.17f, -6.97f, -6.98f)
                reflectiveCurveTo(5.79f, 3.17f, 9.97f, 3.17f)
                curveToRelative(3.1f, 0f, 4.93f, 0.71f, 5.94f, 2.3f)
                curveToRelative(0.29f, 0.47f, 0.91f, 0.6f, 1.38f, 0.31f)
                curveToRelative(0.47f, -0.29f, 0.6f, -0.91f, 0.31f, -1.38f)
                curveToRelative(-1.83f, -2.9f, -5.23f, -3.23f, -7.63f, -3.23f)
                curveTo(6.12f, 1.17f, 1f, 2.1f, 1f, 10.15f)
                curveToRelative(0f, 7.4f, 4.33f, 8.79f, 8.02f, 8.96f)
                curveToRelative(0.16f, 1.1f, 0.73f, 2.1f, 1.62f, 2.8f)
                curveToRelative(0.78f, 0.61f, 1.71f, 0.93f, 2.67f, 0.93f)
                curveToRelative(0.35f, 0f, 0.71f, -0.04f, 1.06f, -0.13f)
                curveToRelative(5.63f, -1.39f, 8.64f, -5.71f, 8.64f, -12.48f)
                curveToRelative(0f, -1.57f, -0.56f, -3.27f, -3.2f, -3.27f)
                close()
                moveTo(19.8f, 11.35f)
                curveToRelative(-0.94f, 0f, -1.2f, -0.15f, -1.2f, -1.2f)
                curveToRelative(0f, -1.04f, 0.27f, -1.2f, 1.2f, -1.2f)
                curveToRelative(0.94f, 0f, 1.2f, 0.15f, 1.2f, 1.2f)
                curveToRelative(0f, 1.04f, -0.27f, 1.2f, -1.2f, 1.2f)
                close()
            }
        }.also { _BellSchool = it}

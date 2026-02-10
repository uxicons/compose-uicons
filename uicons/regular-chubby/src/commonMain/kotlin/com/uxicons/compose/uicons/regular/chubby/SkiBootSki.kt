package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkiBootSki: ImageVector? = null

val Icons.Rc.SkiBootSki: ImageVector
    get() = _SkiBootSki ?: UXIcon(name = "SkiBootSki") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 14f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 16f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.65f)
                curveToRelative(-0.55f, 0.57f, -2.76f, 2.35f, -9f, 2.35f)
                curveToRelative(-7.01f, 0f, -9.47f, -1.35f, -9.48f, -1.36f)
                curveToRelative(-0.47f, -0.28f, -1.09f, -0.13f, -1.37f, 0.34f)
                reflectiveCurveToRelative(-0.13f, 1.09f, 0.34f, 1.37f)
                curveToRelative(0.28f, 0.17f, 2.96f, 1.64f, 10.52f, 1.64f)
                curveToRelative(8.58f, 0f, 10.65f, -3.14f, 10.86f, -3.5f)
                curveToRelative(0.09f, -0.15f, 0.14f, -0.33f, 0.14f, -0.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.4f, 17.8f)
                curveToRelative(0.23f, 0.17f, 2.47f, 1.7f, 9.6f, 1.7f)
                curveToRelative(5.75f, 0f, 7.52f, -1.61f, 7.71f, -1.79f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.28f, -1.18f, -4.03f, -3.02f, -4.47f)
                curveToRelative(-0.03f, -0.01f, -0.07f, -0.01f, -0.1f, -0.02f)
                lineToRelative(-2.82f, -0.38f)
                lineToRelative(0.43f, -6.06f)
                curveToRelative(0.03f, -0.36f, -0.14f, -0.7f, -0.44f, -0.9f)
                curveToRelative(-0.18f, -0.12f, -1.84f, -1.17f, -5.05f, -1.17f)
                reflectiveCurveToRelative(-4.88f, 1.05f, -5.05f, 1.17f)
                curveToRelative(-0.25f, 0.17f, -0.41f, 0.43f, -0.44f, 0.73f)
                lineToRelative(-1.5f, 14f)
                curveToRelative(-0.04f, 0.35f, 0.11f, 0.69f, 0.39f, 0.91f)
                close()
                moveTo(5.44f, 3.64f)
                curveToRelative(0.57f, -0.25f, 1.76f, -0.64f, 3.56f, -0.64f)
                curveToRelative(1.7f, 0f, 2.85f, 0.35f, 3.46f, 0.6f)
                lineToRelative(-0.1f, 1.4f)
                horizontalLineToRelative(-3.35f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3.21f)
                lineToRelative(-0.14f, 2f)
                horizontalLineToRelative(-4.07f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4.93f)
                lineToRelative(3.63f, 0.48f)
                curveToRelative(1.06f, 0.29f, 1.44f, 1.53f, 1.44f, 2.52f)
                verticalLineToRelative(2.47f)
                curveToRelative(-0.65f, 0.35f, -2.37f, 1.03f, -6f, 1.03f)
                curveToRelative(-4.7f, 0f, -7.02f, -0.7f, -7.93f, -1.08f)
                close()
            }
        }.also { _SkiBootSki = it}

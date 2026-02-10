package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentImage: ImageVector? = null

val Icons.Tc.CommentImage: ImageVector
    get() = _CommentImage ?: UXIcon(name = "CommentImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-5.12f, 0f, -11f, 1.25f, -11f, 11f)
                curveToRelative(0f, 7.71f, 3.29f, 11f, 11f, 11f)
                curveToRelative(3.89f, 0f, 7.27f, -0.67f, 9.42f, -1.22f)
                curveToRelative(0.17f, -0.04f, 0.31f, -0.18f, 0.36f, -0.36f)
                curveToRelative(0.81f, -3.12f, 1.22f, -6.29f, 1.22f, -9.42f)
                curveToRelative(0f, -7.71f, -3.29f, -11f, -11f, -11f)
                close()
                moveTo(20.88f, 20.88f)
                curveToRelative(-2.1f, 0.53f, -5.26f, 1.12f, -8.88f, 1.12f)
                curveToRelative(-7.1f, 0f, -10f, -2.9f, -10f, -10f)
                reflectiveCurveToRelative(2.9f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 2.9f, 10f, 10f)
                curveToRelative(0f, 2.95f, -0.38f, 5.93f, -1.12f, 8.88f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.09f, 9.43f)
                reflectiveCurveToRelative(-2.93f, 3.12f, -3.01f, 3.19f)
                curveToRelative(-0.41f, 0.36f, -0.91f, 0.58f, -1.44f, 0.58f)
                curveToRelative(-0.56f, -0.02f, -1.11f, -0.28f, -1.5f, -0.72f)
                curveToRelative(-0.59f, -0.68f, -1.47f, -1.08f, -2.35f, -1.08f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.81f, 0.0f, -1.54f, 0.33f, -2.05f, 0.93f)
                curveToRelative(-0.81f, 0.94f, -2.81f, 3.93f, -2.89f, 4.05f)
                curveToRelative(-0.15f, 0.23f, -0.1f, 0.55f, 0.14f, 0.69f)
                curveToRelative(0.32f, 0.19f, 0.6f, 0.01f, 0.69f, -0.14f)
                curveToRelative(0.02f, -0.03f, 2.04f, -3.06f, 2.82f, -3.96f)
                curveToRelative(0.32f, -0.38f, 0.78f, -0.58f, 1.3f, -0.58f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.6f, 0f, 1.2f, 0.28f, 1.6f, 0.74f)
                curveToRelative(0.57f, 0.65f, 1.38f, 1.03f, 2.22f, 1.06f)
                curveToRelative(0.82f, 0.03f, 1.6f, -0.29f, 2.18f, -0.88f)
                curveToRelative(0.45f, -0.46f, 3.0f, -3.19f, 3.03f, -3.21f)
                curveToRelative(0.19f, -0.2f, 0.17f, -0.53f, -0.03f, -0.71f)
                curveToRelative(-0.29f, -0.25f, -0.59f, -0.1f, -0.71f, 0.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.92f, 8.32f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
        }.also { _CommentImage = it}

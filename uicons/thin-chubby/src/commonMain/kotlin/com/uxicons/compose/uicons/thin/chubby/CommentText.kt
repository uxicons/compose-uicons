package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentText: ImageVector? = null

val Icons.Tc.CommentText: ImageVector
    get() = _CommentText ?: UXIcon(name = "CommentText") {
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
                moveToRelative(17.22f, 6.88f)
                curveToRelative(-0.06f, -0.12f, -0.18f, -0.22f, -0.31f, -0.25f)
                curveToRelative(-0.09f, -0.03f, -2.31f, -0.62f, -4.91f, -0.62f)
                reflectiveCurveToRelative(-4.78f, 0.6f, -4.88f, 0.62f)
                curveToRelative(-0.13f, 0.04f, -0.24f, 0.12f, -0.31f, 0.24f)
                curveToRelative(-0.03f, 0.05f, -0.62f, 1.15f, -0.81f, 2.56f)
                curveToRelative(-0.04f, 0.27f, 0.15f, 0.53f, 0.43f, 0.56f)
                curveToRelative(0.28f, 0.03f, 0.53f, -0.15f, 0.56f, -0.43f)
                curveToRelative(0.12f, -0.91f, 0.45f, -1.69f, 0.61f, -2.03f)
                curveToRelative(0.55f, -0.13f, 2.1f, -0.47f, 3.9f, -0.52f)
                verticalLineToRelative(9.94f)
                curveToRelative(-0.96f, -0.18f, -1.65f, -0.81f, -1.66f, -0.82f)
                curveToRelative(-0.2f, -0.19f, -0.52f, -0.17f, -0.71f, 0.03f)
                curveToRelative(-0.19f, 0.2f, -0.17f, 0.52f, 0.03f, 0.7f)
                curveToRelative(0.05f, 0.05f, 1.24f, 1.13f, 2.84f, 1.13f)
                reflectiveCurveToRelative(2.79f, -1.08f, 2.84f, -1.13f)
                curveToRelative(0.2f, -0.19f, 0.21f, -0.5f, 0.03f, -0.71f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.21f, -0.71f, -0.03f)
                curveToRelative(-0.01f, 0.01f, -0.7f, 0.64f, -1.66f, 0.82f)
                verticalLineToRelative(-9.94f)
                curveToRelative(1.8f, 0.06f, 3.36f, 0.39f, 3.92f, 0.52f)
                curveToRelative(0.15f, 0.35f, 0.46f, 1.12f, 0.58f, 2.03f)
                curveToRelative(0.03f, 0.25f, 0.25f, 0.43f, 0.49f, 0.43f)
                curveToRelative(0.02f, 0f, 0.04f, -0.0f, 0.07f, -0.0f)
                curveToRelative(0.27f, -0.04f, 0.47f, -0.29f, 0.43f, -0.56f)
                curveToRelative(-0.19f, -1.42f, -0.75f, -2.51f, -0.77f, -2.56f)
                close()
            }
        }.also { _CommentText = it}

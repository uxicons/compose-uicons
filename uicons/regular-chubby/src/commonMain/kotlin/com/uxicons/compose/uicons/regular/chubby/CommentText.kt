package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentText: ImageVector? = null

val Icons.Rc.CommentText: ImageVector
    get() = _CommentText ?: UXIcon(name = "CommentText") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-5.12f, 0f, -11f, 1.25f, -11f, 11f)
                reflectiveCurveToRelative(5.88f, 11f, 11f, 11f)
                curveToRelative(3.76f, 0f, 7.03f, -0.64f, 9.1f, -1.18f)
                curveToRelative(0.35f, -0.09f, 0.62f, -0.36f, 0.72f, -0.72f)
                curveToRelative(0.79f, -3.02f, 1.18f, -6.08f, 1.18f, -9.1f)
                curveToRelative(-0.0f, -9.75f, -5.88f, -11f, -11.0f, -11f)
                close()
                moveTo(20.02f, 20.02f)
                curveToRelative(-1.96f, 0.47f, -4.8f, 0.97f, -8.03f, 0.97f)
                curveToRelative(-5.4f, 0f, -9f, -1.53f, -9f, -9f)
                reflectiveCurveToRelative(3.6f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 1.53f, 9f, 9f)
                curveToRelative(0f, 2.66f, -0.33f, 5.36f, -0.97f, 8.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.47f, 7.66f)
                curveToRelative(-0.12f, -0.29f, -0.37f, -0.51f, -0.68f, -0.59f)
                curveToRelative(-0.09f, -0.02f, -2.24f, -0.56f, -4.78f, -0.56f)
                reflectiveCurveToRelative(-4.69f, 0.54f, -4.78f, 0.56f)
                curveToRelative(-0.29f, 0.07f, -0.54f, 0.28f, -0.66f, 0.55f)
                curveToRelative(-0.04f, 0.08f, -0.38f, 0.85f, -0.56f, 2.24f)
                curveToRelative(-0.07f, 0.55f, 0.31f, 1.05f, 0.86f, 1.12f)
                curveToRelative(0.04f, 0.01f, 0.09f, 0.01f, 0.14f, 0.01f)
                curveToRelative(0.49f, 0f, 0.92f, -0.36f, 0.99f, -0.87f)
                curveToRelative(0.07f, -0.54f, 0.17f, -0.95f, 0.25f, -1.23f)
                curveToRelative(0.58f, -0.12f, 1.59f, -0.29f, 2.76f, -0.36f)
                verticalLineToRelative(7.39f)
                curveToRelative(-0.72f, -0.09f, -1.25f, -0.23f, -1.25f, -0.23f)
                curveToRelative(-0.53f, -0.15f, -1.08f, 0.16f, -1.23f, 0.69f)
                curveToRelative(-0.15f, 0.53f, 0.16f, 1.08f, 0.69f, 1.23f)
                curveToRelative(0.05f, 0.01f, 1.31f, 0.37f, 2.79f, 0.37f)
                reflectiveCurveToRelative(2.74f, -0.35f, 2.79f, -0.36f)
                curveToRelative(0.53f, -0.15f, 0.84f, -0.7f, 0.69f, -1.23f)
                curveToRelative(-0.15f, -0.53f, -0.71f, -0.84f, -1.23f, -0.69f)
                curveToRelative(-0.01f, 0.0f, -0.53f, 0.15f, -1.25f, 0.23f)
                verticalLineToRelative(-7.4f)
                curveToRelative(1.17f, 0.07f, 2.18f, 0.24f, 2.77f, 0.36f)
                curveToRelative(0.08f, 0.29f, 0.17f, 0.7f, 0.24f, 1.24f)
                curveToRelative(0.07f, 0.55f, 0.56f, 0.93f, 1.12f, 0.86f)
                curveToRelative(0.55f, -0.07f, 0.93f, -0.58f, 0.86f, -1.12f)
                curveToRelative(-0.18f, -1.37f, -0.48f, -2.12f, -0.52f, -2.2f)
                close()
            }
        }.also { _CommentText = it}

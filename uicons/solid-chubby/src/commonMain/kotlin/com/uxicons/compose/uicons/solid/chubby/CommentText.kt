package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentText: ImageVector? = null

val Icons.Sc.CommentText: ImageVector
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
                moveTo(16.62f, 11.15f)
                curveToRelative(-0.55f, 0.07f, -1.05f, -0.32f, -1.11f, -0.87f)
                curveToRelative(-0.07f, -0.58f, -0.16f, -1.06f, -0.24f, -1.4f)
                curveToRelative(-0.51f, -0.11f, -1.33f, -0.26f, -2.27f, -0.33f)
                verticalLineToRelative(6.88f)
                curveToRelative(0.72f, -0.09f, 1.25f, -0.23f, 1.25f, -0.23f)
                curveToRelative(0.53f, -0.15f, 1.08f, 0.16f, 1.23f, 0.69f)
                reflectiveCurveToRelative(-0.16f, 1.08f, -0.69f, 1.23f)
                curveToRelative(-0.05f, 0.01f, -1.32f, 0.36f, -2.79f, 0.36f)
                reflectiveCurveToRelative(-2.74f, -0.35f, -2.79f, -0.37f)
                curveToRelative(-0.53f, -0.15f, -0.84f, -0.7f, -0.69f, -1.23f)
                curveToRelative(0.15f, -0.53f, 0.7f, -0.84f, 1.23f, -0.69f)
                curveToRelative(0.01f, 0.0f, 0.53f, 0.14f, 1.25f, 0.23f)
                verticalLineToRelative(-6.88f)
                curveToRelative(-0.94f, 0.07f, -1.76f, 0.22f, -2.27f, 0.33f)
                curveToRelative(-0.07f, 0.34f, -0.17f, 0.82f, -0.24f, 1.41f)
                curveToRelative(-0.06f, 0.51f, -0.53f, 0.93f, -1.11f, 0.87f)
                curveToRelative(-0.55f, -0.06f, -0.94f, -0.57f, -0.87f, -1.11f)
                curveToRelative(0.16f, -1.34f, 0.42f, -2.24f, 0.44f, -2.27f)
                curveToRelative(0.1f, -0.33f, 0.36f, -0.59f, 0.69f, -0.68f)
                curveToRelative(0.08f, -0.02f, 2.06f, -0.57f, 4.37f, -0.57f)
                reflectiveCurveToRelative(4.29f, 0.55f, 4.37f, 0.57f)
                curveToRelative(0.33f, 0.09f, 0.59f, 0.35f, 0.69f, 0.68f)
                curveToRelative(0.01f, 0.04f, 0.27f, 0.93f, 0.44f, 2.28f)
                curveToRelative(0.07f, 0.55f, -0.32f, 1.05f, -0.87f, 1.11f)
                close()
            }
        }.also { _CommentText = it}

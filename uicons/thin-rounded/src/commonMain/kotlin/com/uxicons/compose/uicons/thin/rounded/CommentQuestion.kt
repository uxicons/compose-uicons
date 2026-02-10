package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentQuestion: ImageVector? = null

val Icons.Tr.CommentQuestion: ImageVector
    get() = _CommentQuestion ?: UXIcon(name = "CommentQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(24f, 19.5f)
                verticalLineToRelative(-7.14f)
                curveToRelative(0f, -3.4f, -1.39f, -6.69f, -3.82f, -9.03f)
                curveTo(17.86f, 1.07f, 14.82f, -0.08f, 11.63f, 0.01f)
                curveTo(5.31f, 0.22f, 0.09f, 5.54f, 0.0f, 11.86f)
                curveToRelative(-0.04f, 3.1f, 1.13f, 6.03f, 3.31f, 8.24f)
                curveToRelative(2.48f, 2.51f, 5.96f, 3.89f, 9.81f, 3.89f)
                horizontalLineToRelative(6.37f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                close()
                moveTo(19.49f, 4.04f)
                curveToRelative(2.23f, 2.16f, 3.51f, 5.19f, 3.51f, 8.31f)
                verticalLineToRelative(7.14f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-6.37f)
                curveToRelative(-3.58f, 0f, -6.82f, -1.28f, -9.1f, -3.6f)
                curveToRelative(-1.99f, -2.02f, -3.07f, -4.7f, -3.03f, -7.53f)
                curveTo(1.09f, 6.08f, 5.87f, 1.21f, 11.66f, 1.01f)
                curveToRelative(0.12f, -0.01f, 0.25f, -0.01f, 0.37f, -0.01f)
                curveToRelative(2.78f, 0f, 5.42f, 1.07f, 7.45f, 3.04f)
                close()
                moveTo(12.5f, 15.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.94f, 0.67f, -2.1f, 1.47f, -2.54f)
                curveToRelative(1.5f, -0.83f, 2.31f, -2.52f, 2.01f, -4.22f)
                curveToRelative(-0.28f, -1.61f, -1.6f, -2.94f, -3.22f, -3.22f)
                curveToRelative(-1.1f, -0.2f, -2.2f, 0.06f, -3.09f, 0.71f)
                curveToRelative(-0.88f, 0.65f, -1.46f, 1.63f, -1.6f, 2.7f)
                curveToRelative(-0.04f, 0.27f, 0.16f, 0.52f, 0.43f, 0.56f)
                curveToRelative(0.27f, 0.04f, 0.52f, -0.16f, 0.56f, -0.43f)
                curveToRelative(0.1f, -0.81f, 0.54f, -1.54f, 1.2f, -2.03f)
                curveToRelative(0.67f, -0.49f, 1.49f, -0.68f, 2.32f, -0.53f)
                curveToRelative(1.2f, 0.21f, 2.19f, 1.2f, 2.4f, 2.4f)
                curveToRelative(0.23f, 1.3f, -0.36f, 2.55f, -1.51f, 3.18f)
                curveToRelative(-1.12f, 0.61f, -1.99f, 2.12f, -1.99f, 3.42f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                close()
            }
        }.also { _CommentQuestion = it}

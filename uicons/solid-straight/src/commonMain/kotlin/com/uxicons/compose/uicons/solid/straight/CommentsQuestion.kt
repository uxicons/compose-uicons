package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentsQuestion: ImageVector? = null

val Icons.Ss.CommentsQuestion: ImageVector
    get() = _CommentsQuestion ?: UXIcon(name = "CommentsQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 0f)
                curveTo(4.04f, 0f, 0f, 4.04f, 0f, 9f)
                verticalLineToRelative(9f)
                lineTo(9f, 18f)
                curveToRelative(4.96f, 0f, 9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(13.96f, 0f, 9f, 0f)
                close()
                moveTo(10f, 14.08f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.08f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.08f)
                close()
                moveTo(10.45f, 9.63f)
                curveToRelative(-0.19f, 0.1f, -0.45f, 0.56f, -0.45f, 0.88f)
                verticalLineToRelative(0.49f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.49f)
                curveToRelative(0f, -1.03f, 0.64f, -2.16f, 1.48f, -2.63f)
                curveToRelative(0.29f, -0.16f, 0.59f, -0.54f, 0.5f, -1.07f)
                curveToRelative(-0.07f, -0.39f, -0.4f, -0.72f, -0.79f, -0.79f)
                curveToRelative(-0.31f, -0.06f, -0.6f, 0.02f, -0.83f, 0.22f)
                curveToRelative(-0.23f, 0.19f, -0.36f, 0.47f, -0.36f, 0.77f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.89f, 0.39f, -1.73f, 1.07f, -2.3f)
                curveToRelative(0.68f, -0.57f, 1.58f, -0.81f, 2.46f, -0.65f)
                curveToRelative(1.21f, 0.21f, 2.2f, 1.21f, 2.42f, 2.42f)
                curveToRelative(0.22f, 1.27f, -0.38f, 2.54f, -1.51f, 3.16f)
                close()
                moveTo(24f, 16f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.96f, 0f, -5.54f, -1.61f, -6.92f, -4.0f)
                horizontalLineToRelative(0f)
                curveToRelative(6.01f, -0.04f, 10.87f, -4.91f, 10.92f, -10.92f)
                horizontalLineToRelative(0f)
                curveToRelative(2.39f, 1.39f, 4.0f, 3.96f, 4.0f, 6.92f)
                close()
            }
        }.also { _CommentsQuestion = it}

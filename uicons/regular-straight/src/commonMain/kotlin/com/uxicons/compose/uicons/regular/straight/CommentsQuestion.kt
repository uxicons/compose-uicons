package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentsQuestion: ImageVector? = null

val Icons.Rs.CommentsQuestion: ImageVector
    get() = _CommentsQuestion ?: UXIcon(name = "CommentsQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 16f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.96f, 0f, -5.54f, -1.61f, -6.92f, -4.0f)
                curveToRelative(0.77f, -0.01f, 1.52f, -0.09f, 2.24f, -0.25f)
                curveToRelative(1.1f, 1.37f, 2.79f, 2.25f, 4.68f, 2.25f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.89f, -0.88f, -3.58f, -2.25f, -4.68f)
                curveToRelative(0.16f, -0.72f, 0.24f, -1.47f, 0.25f, -2.24f)
                curveToRelative(2.39f, 1.39f, 4.0f, 3.96f, 4.0f, 6.92f)
                close()
                moveTo(18f, 9f)
                curveTo(18f, 4.04f, 13.96f, 0f, 9f, 0f)
                reflectiveCurveTo(0f, 4.04f, 0f, 9f)
                verticalLineToRelative(9f)
                lineTo(9f, 18f)
                curveToRelative(4.96f, 0f, 9f, -4.04f, 9f, -9f)
                close()
                moveTo(2f, 9f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                lineTo(2f, 16f)
                verticalLineToRelative(-7f)
                close()
                moveTo(10f, 10.51f)
                curveToRelative(0f, -0.31f, 0.26f, -0.77f, 0.45f, -0.88f)
                curveToRelative(1.12f, -0.62f, 1.73f, -1.89f, 1.51f, -3.16f)
                curveToRelative(-0.21f, -1.21f, -1.21f, -2.21f, -2.42f, -2.42f)
                curveToRelative(-0.89f, -0.16f, -1.78f, 0.08f, -2.46f, 0.65f)
                curveToRelative(-0.68f, 0.57f, -1.07f, 1.41f, -1.07f, 2.3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.3f, 0.13f, -0.58f, 0.36f, -0.77f)
                curveToRelative(0.23f, -0.19f, 0.53f, -0.27f, 0.83f, -0.22f)
                curveToRelative(0.39f, 0.07f, 0.72f, 0.4f, 0.79f, 0.79f)
                curveToRelative(0.09f, 0.53f, -0.21f, 0.91f, -0.5f, 1.07f)
                curveToRelative(-0.84f, 0.47f, -1.48f, 1.59f, -1.48f, 2.63f)
                verticalLineToRelative(0.49f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.49f)
                close()
                moveTo(10f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _CommentsQuestion = it}

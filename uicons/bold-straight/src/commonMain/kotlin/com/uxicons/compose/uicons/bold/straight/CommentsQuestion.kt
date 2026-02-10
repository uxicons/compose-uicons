package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentsQuestion: ImageVector? = null

val Icons.Bs.CommentsQuestion: ImageVector
    get() = _CommentsQuestion ?: UXIcon(name = "CommentsQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 18f)
                lineTo(0f, 18f)
                lineTo(0f, 9f)
                curveTo(0f, 4.04f, 4.04f, 0f, 9f, 0f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(3f, 15f)
                horizontalLineToRelative(6f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveTo(3f, 5.69f, 3f, 9f)
                verticalLineToRelative(6f)
                close()
                moveTo(10f, 10.51f)
                curveToRelative(0f, -0.31f, 0.26f, -0.77f, 0.45f, -0.88f)
                curveToRelative(1.12f, -0.62f, 1.73f, -1.89f, 1.51f, -3.16f)
                curveToRelative(-0.21f, -1.21f, -1.21f, -2.21f, -2.42f, -2.42f)
                curveToRelative(-0.89f, -0.16f, -1.78f, 0.08f, -2.46f, 0.65f)
                curveToRelative(-0.68f, 0.57f, -1.07f, 1.41f, -1.07f, 2.3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.3f, 0.13f, -0.58f, 0.36f, -0.77f)
                curveToRelative(0.23f, -0.19f, 0.52f, -0.27f, 0.83f, -0.22f)
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
                moveTo(20.0f, 9.08f)
                curveToRelative(-0.01f, 1.16f, -0.2f, 2.27f, -0.54f, 3.32f)
                curveToRelative(0.95f, 0.91f, 1.54f, 2.18f, 1.54f, 3.6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.42f, 0f, -2.69f, -0.6f, -3.6f, -1.54f)
                curveToRelative(-1.05f, 0.34f, -2.16f, 0.53f, -3.32f, 0.54f)
                curveToRelative(1.39f, 2.39f, 3.96f, 4.0f, 6.92f, 4.0f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -2.96f, -1.61f, -5.54f, -4.0f, -6.92f)
                close()
            }
        }.also { _CommentsQuestion = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentQuestion: ImageVector? = null

val Icons.Bs.CommentQuestion: ImageVector
    get() = _CommentQuestion ?: UXIcon(name = "CommentQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                verticalLineToRelative(12f)
                close()
                moveTo(12f, 3f)
                curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                horizontalLineToRelative(9f)
                lineTo(21f, 12f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                close()
                moveTo(13.5f, 13.38f)
                curveToRelative(0f, -0.29f, 0.26f, -0.77f, 0.43f, -0.88f)
                curveToRelative(1.5f, -0.83f, 2.31f, -2.52f, 2.01f, -4.22f)
                curveToRelative(-0.28f, -1.62f, -1.61f, -2.94f, -3.23f, -3.23f)
                curveToRelative(-1.18f, -0.21f, -2.38f, 0.11f, -3.28f, 0.87f)
                curveToRelative(-0.91f, 0.76f, -1.43f, 1.88f, -1.43f, 3.06f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, -0.3f, 0.13f, -0.57f, 0.36f, -0.77f)
                curveToRelative(0.13f, -0.11f, 0.42f, -0.29f, 0.84f, -0.22f)
                curveToRelative(0.38f, 0.07f, 0.72f, 0.41f, 0.79f, 0.79f)
                curveToRelative(0.09f, 0.53f, -0.21f, 0.91f, -0.5f, 1.07f)
                curveToRelative(-1.13f, 0.62f, -1.98f, 2.13f, -1.98f, 3.5f)
                verticalLineToRelative(0.62f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.62f)
                close()
                moveTo(13.5f, 16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _CommentQuestion = it}

package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentQuestion: ImageVector? = null

val Icons.Tc.CommentQuestion: ImageVector
    get() = _CommentQuestion ?: UXIcon(name = "CommentQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 1f)
                horizontalLineToRelative(-0.01f)
                curveTo(4.93f, 1.04f, 1.13f, 4.84f, 1.0f, 12.01f)
                curveToRelative(0.13f, 7.25f, 3.83f, 10.95f, 11.0f, 10.99f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(23.0f, 11.99f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.95f, -10.99f, -10.99f)
                close()
                moveTo(22.0f, 22f)
                lineTo(12.0f, 22f)
                curveToRelative(-6.61f, -0.04f, -9.88f, -3.31f, -10f, -9.99f)
                curveToRelative(0.12f, -6.6f, 3.48f, -9.97f, 10.0f, -10.01f)
                curveToRelative(4.48f, 0.03f, 9.85f, 1.79f, 10.0f, 10f)
                verticalLineToRelative(10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 6.29f)
                curveToRelative(-2.28f, 0.01f, -3.56f, 1.3f, -3.6f, 3.61f)
                curveToRelative(-0.01f, 0.28f, 0.21f, 0.5f, 0.49f, 0.51f)
                curveToRelative(0.25f, -0.01f, 0.5f, -0.21f, 0.51f, -0.49f)
                curveToRelative(0.03f, -1.78f, 0.86f, -2.62f, 2.6f, -2.63f)
                curveToRelative(1.72f, 0.01f, 2.58f, 0.87f, 2.61f, 2.61f)
                curveToRelative(-0.03f, 1.81f, -0.84f, 2.62f, -2.61f, 2.63f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(1.52f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.05f)
                curveToRelative(1.99f, -0.18f, 3.06f, -1.42f, 3.1f, -3.61f)
                curveToRelative(-0.04f, -2.32f, -1.32f, -3.6f, -3.61f, -3.61f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 16.96f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
        }.also { _CommentQuestion = it}

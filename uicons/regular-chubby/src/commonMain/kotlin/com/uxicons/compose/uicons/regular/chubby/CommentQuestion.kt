package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentQuestion: ImageVector? = null

val Icons.Rc.CommentQuestion: ImageVector
    get() = _CommentQuestion ?: UXIcon(name = "CommentQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 1f)
                reflectiveCurveToRelative(-0.01f, 0f, -0.01f, 0f)
                curveTo(4.95f, 1.04f, 1.15f, 4.84f, 1.03f, 12.02f)
                curveToRelative(0.13f, 7.14f, 3.92f, 10.94f, 10.97f, 10.98f)
                horizontalLineToRelative(9.97f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(22.97f, 11.98f)
                curveToRelative(-0.12f, -7.04f, -4.02f, -10.94f, -10.97f, -10.98f)
                close()
                moveTo(20.97f, 21f)
                lineTo(12.01f, 21f)
                curveToRelative(-6.01f, -0.04f, -8.87f, -2.9f, -8.98f, -8.98f)
                curveToRelative(0.11f, -6.03f, 3.04f, -8.98f, 8.97f, -9.02f)
                curveToRelative(5.85f, 0.04f, 8.87f, 3.07f, 8.97f, 9f)
                verticalLineToRelative(9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 5.73f)
                curveToRelative(-2.46f, 0.01f, -3.9f, 1.46f, -3.94f, 3.96f)
                curveToRelative(-0.01f, 0.55f, 0.43f, 1.01f, 0.98f, 1.02f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.54f, 0f, 0.99f, -0.44f, 1f, -0.98f)
                curveToRelative(0.03f, -1.43f, 0.57f, -1.98f, 1.94f, -1.99f)
                curveToRelative(1.35f, 0.01f, 1.93f, 0.6f, 1.96f, 1.96f)
                curveToRelative(-0.03f, 1.44f, -0.56f, 1.98f, -1.95f, 1.99f)
                curveToRelative(-0.55f, 0.0f, -0.99f, 0.45f, -0.99f, 1f)
                verticalLineToRelative(1.45f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-0.54f)
                curveToRelative(1.87f, -0.35f, 2.91f, -1.7f, 2.95f, -3.9f)
                curveToRelative(-0.04f, -2.46f, -1.52f, -3.94f, -3.96f, -3.96f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17.27f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
        }.also { _CommentQuestion = it}

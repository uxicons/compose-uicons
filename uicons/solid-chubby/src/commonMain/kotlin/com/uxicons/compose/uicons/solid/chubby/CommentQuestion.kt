package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentQuestion: ImageVector? = null

val Icons.Sc.CommentQuestion: ImageVector
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
                moveTo(12f, 19.03f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13f, 12.84f)
                verticalLineToRelative(0.54f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.45f)
                curveToRelative(0f, -0.55f, 0.44f, -1.0f, 0.99f, -1f)
                curveToRelative(1.4f, -0.01f, 1.93f, -0.55f, 1.95f, -1.99f)
                curveToRelative(-0.02f, -1.35f, -0.61f, -1.95f, -1.96f, -1.96f)
                curveToRelative(-1.37f, 0.01f, -1.92f, 0.57f, -1.94f, 1.99f)
                curveToRelative(-0.01f, 0.55f, -0.46f, 0.98f, -1f, 0.98f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.55f, -0.01f, -0.99f, -0.47f, -0.98f, -1.02f)
                curveToRelative(0.04f, -2.5f, 1.48f, -3.94f, 3.94f, -3.96f)
                curveToRelative(2.44f, 0.02f, 3.91f, 1.5f, 3.96f, 3.96f)
                curveToRelative(-0.04f, 2.21f, -1.08f, 3.56f, -2.95f, 3.9f)
                close()
            }
        }.also { _CommentQuestion = it}

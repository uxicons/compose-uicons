package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentQuestion: ImageVector? = null

val Icons.Ts.CommentQuestion: ImageVector
    get() = _CommentQuestion ?: UXIcon(name = "CommentQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                horizontalLineToRelative(12f)
                lineTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(23f, 23f)
                lineTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                verticalLineToRelative(11f)
                close()
                moveTo(15.94f, 8.28f)
                curveToRelative(0.3f, 1.7f, -0.51f, 3.4f, -2.01f, 4.23f)
                curveToRelative(-0.76f, 0.42f, -1.43f, 1.65f, -1.43f, 2.63f)
                verticalLineToRelative(0.87f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.87f)
                curveToRelative(0f, -1.34f, 0.87f, -2.91f, 1.95f, -3.5f)
                curveToRelative(1.14f, -0.63f, 1.73f, -1.88f, 1.51f, -3.18f)
                curveToRelative(-0.21f, -1.2f, -1.2f, -2.19f, -2.4f, -2.4f)
                curveToRelative(-0.91f, -0.15f, -1.78f, 0.07f, -2.48f, 0.65f)
                curveToRelative(-0.68f, 0.57f, -1.07f, 1.41f, -1.07f, 2.3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -1.19f, 0.52f, -2.3f, 1.43f, -3.06f)
                curveToRelative(0.91f, -0.76f, 2.11f, -1.08f, 3.29f, -0.87f)
                curveToRelative(1.61f, 0.28f, 2.93f, 1.6f, 3.22f, 3.21f)
                close()
                moveTo(13f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _CommentQuestion = it}

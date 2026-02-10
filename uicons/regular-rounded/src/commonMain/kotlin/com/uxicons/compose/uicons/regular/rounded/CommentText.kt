package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentText: ImageVector? = null

val Icons.Rr.CommentText: ImageVector
    get() = _CommentText ?: UXIcon(name = "CommentText") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.84f, 0.03f)
                curveTo(9.36f, -0.2f, 5.96f, 1.07f, 3.51f, 3.52f)
                curveTo(1.06f, 5.98f, -0.21f, 9.38f, 0.03f, 12.85f)
                curveToRelative(0.44f, 6.35f, 6.05f, 11.15f, 13.05f, 11.15f)
                horizontalLineToRelative(5.92f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6.66f)
                curveTo(24f, 5.86f, 19.1f, 0.45f, 12.84f, 0.03f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-5.92f)
                curveToRelative(-6.04f, 0f, -10.69f, -3.9f, -11.06f, -9.28f)
                curveToRelative(-0.2f, -2.9f, 0.85f, -5.74f, 2.9f, -7.78f)
                curveToRelative(1.88f, -1.89f, 4.43f, -2.93f, 7.09f, -2.93f)
                curveToRelative(0.23f, 0f, 0.46f, 0.01f, 0.69f, 0.02f)
                curveToRelative(5.21f, 0.35f, 9.3f, 4.88f, 9.3f, 10.31f)
                verticalLineToRelative(6.66f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 7f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineTo(9f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _CommentText = it}

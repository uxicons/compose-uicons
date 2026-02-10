package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentSmile: ImageVector? = null

val Icons.Sr.CommentSmile: ImageVector
    get() = _CommentSmile ?: UXIcon(name = "CommentSmile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.84f, 0.03f)
                curveToRelative(-3.46f, -0.23f, -6.87f, 1.04f, -9.33f, 3.49f)
                curveTo(1.06f, 5.98f, -0.21f, 9.38f, 0.03f, 12.85f)
                curveToRelative(0.44f, 6.35f, 6.05f, 11.15f, 13.05f, 11.15f)
                horizontalLineToRelative(5.92f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6.66f)
                curveTo(24f, 5.86f, 19.1f, 0.45f, 12.84f, 0.03f)
                close()
                moveTo(8.5f, 8f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(16.7f, 15.21f)
                curveToRelative(-0.07f, 0.07f, -1.84f, 1.79f, -4.7f, 1.79f)
                reflectiveCurveToRelative(-4.63f, -1.72f, -4.7f, -1.79f)
                curveToRelative(-0.39f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.4f, 1.42f, -0.01f)
                curveToRelative(0.05f, 0.04f, 1.28f, 1.21f, 3.3f, 1.21f)
                reflectiveCurveToRelative(3.25f, -1.17f, 3.3f, -1.22f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.37f, 1.41f, 0.02f)
                curveToRelative(0.38f, 0.39f, 0.38f, 1.02f, -0.01f, 1.41f)
                close()
                moveTo(15.5f, 11f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _CommentSmile = it}

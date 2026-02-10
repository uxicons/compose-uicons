package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentSmile: ImageVector? = null

val Icons.Rr.CommentSmile: ImageVector
    get() = _CommentSmile ?: UXIcon(name = "CommentSmile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.71f, 13.8f)
                curveToRelative(0.38f, 0.39f, 0.38f, 1.02f, -0.01f, 1.41f)
                curveToRelative(-0.07f, 0.07f, -1.84f, 1.79f, -4.7f, 1.79f)
                reflectiveCurveToRelative(-4.63f, -1.72f, -4.7f, -1.79f)
                curveToRelative(-0.39f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.4f, 1.42f, -0.01f)
                curveToRelative(0.05f, 0.04f, 1.28f, 1.21f, 3.3f, 1.21f)
                reflectiveCurveToRelative(3.25f, -1.17f, 3.3f, -1.22f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.37f, 1.41f, 0.02f)
                close()
                moveTo(8.5f, 11f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(15.5f, 8f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24f, 12.34f)
                verticalLineToRelative(6.66f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-5.92f)
                curveTo(6.08f, 24f, 0.47f, 19.21f, 0.03f, 12.85f)
                curveToRelative(-0.24f, -3.48f, 1.03f, -6.88f, 3.48f, -9.33f)
                curveTo(5.96f, 1.06f, 9.37f, -0.2f, 12.84f, 0.03f)
                curveToRelative(6.26f, 0.42f, 11.16f, 5.83f, 11.16f, 12.31f)
                close()
                moveTo(22f, 12.34f)
                curveToRelative(0f, -5.43f, -4.08f, -9.96f, -9.3f, -10.32f)
                curveToRelative(-0.23f, -0.02f, -0.46f, -0.02f, -0.69f, -0.02f)
                curveToRelative(-2.66f, 0f, -5.21f, 1.05f, -7.09f, 2.93f)
                curveToRelative(-2.04f, 2.05f, -3.1f, 4.88f, -2.9f, 7.78f)
                curveToRelative(0.37f, 5.38f, 5.02f, 9.29f, 11.06f, 9.29f)
                horizontalLineToRelative(5.92f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-6.66f)
                close()
            }
        }.also { _CommentSmile = it}

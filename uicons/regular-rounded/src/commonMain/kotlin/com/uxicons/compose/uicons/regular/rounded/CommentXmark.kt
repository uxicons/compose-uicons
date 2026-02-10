package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentXmark: ImageVector? = null

val Icons.Rr.CommentXmark: ImageVector
    get() = _CommentXmark ?: UXIcon(name = "CommentXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.71f, 9.71f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(2.29f, 2.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(-2.29f, 2.29f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(-2.29f, -2.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(2.29f, -2.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(24f, 12.34f)
                verticalLineToRelative(6.66f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-5.92f)
                curveTo(6.08f, 24f, 0.47f, 19.21f, 0.03f, 12.85f)
                curveTo(-0.21f, 9.38f, 1.06f, 5.98f, 3.51f, 3.52f)
                curveTo(5.96f, 1.07f, 9.36f, -0.21f, 12.84f, 0.03f)
                curveToRelative(6.26f, 0.43f, 11.16f, 5.83f, 11.16f, 12.31f)
                close()
                moveTo(22f, 12.34f)
                curveToRelative(0f, -5.43f, -4.08f, -9.96f, -9.3f, -10.31f)
                curveToRelative(-0.23f, -0.02f, -0.46f, -0.02f, -0.69f, -0.02f)
                curveToRelative(-2.66f, 0f, -5.21f, 1.05f, -7.09f, 2.93f)
                curveToRelative(-2.04f, 2.05f, -3.1f, 4.88f, -2.9f, 7.78f)
                curveToRelative(0.37f, 5.38f, 5.02f, 9.28f, 11.06f, 9.28f)
                horizontalLineToRelative(5.92f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-6.66f)
                close()
            }
        }.also { _CommentXmark = it}

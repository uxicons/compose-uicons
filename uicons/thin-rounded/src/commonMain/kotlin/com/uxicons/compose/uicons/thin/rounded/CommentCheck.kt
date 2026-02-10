package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentCheck: ImageVector? = null

val Icons.Tr.CommentCheck: ImageVector
    get() = _CommentCheck ?: UXIcon(name = "CommentCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 16.5f)
                curveToRelative(-0.39f, 0f, -0.77f, -0.15f, -1.06f, -0.44f)
                lineToRelative(-4.29f, -4.2f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, -0.01f, -0.71f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.2f, 0.71f, -0.01f)
                lineToRelative(4.29f, 4.21f)
                curveToRelative(0.2f, 0.2f, 0.52f, 0.2f, 0.71f, 0.0f)
                lineToRelative(7.29f, -7.21f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.19f, 0.71f, 0.0f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.51f, -0.0f, 0.71f)
                lineToRelative(-7.29f, 7.21f)
                curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
                close()
                moveTo(24f, 19.5f)
                verticalLineToRelative(-7.14f)
                curveTo(24f, 5.87f, 19.1f, 0.45f, 12.84f, 0.03f)
                curveToRelative(-3.47f, -0.24f, -6.88f, 1.04f, -9.33f, 3.49f)
                reflectiveCurveTo(-0.21f, 9.38f, 0.03f, 12.85f)
                curveToRelative(0.44f, 6.35f, 6.07f, 11.15f, 13.1f, 11.15f)
                horizontalLineToRelative(6.37f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                close()
                moveTo(12.77f, 1.03f)
                curveToRelative(5.74f, 0.39f, 10.23f, 5.37f, 10.23f, 11.33f)
                verticalLineToRelative(7.14f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-6.37f)
                curveToRelative(-6.6f, 0f, -11.7f, -4.3f, -12.11f, -10.21f)
                curveToRelative(-0.22f, -3.19f, 0.94f, -6.31f, 3.19f, -8.56f)
                curveToRelative(2.07f, -2.07f, 4.88f, -3.23f, 7.8f, -3.23f)
                curveToRelative(0.25f, 0f, 0.5f, 0.01f, 0.75f, 0.03f)
                close()
            }
        }.also { _CommentCheck = it}

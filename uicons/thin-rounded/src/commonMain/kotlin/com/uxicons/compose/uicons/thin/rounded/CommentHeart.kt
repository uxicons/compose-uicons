package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentHeart: ImageVector? = null

val Icons.Tr.CommentHeart: ImageVector
    get() = _CommentHeart ?: UXIcon(name = "CommentHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.75f, 7f)
                curveToRelative(-1.2f, 0f, -2.19f, 0.55f, -2.75f, 1.43f)
                curveToRelative(-0.56f, -0.88f, -1.55f, -1.43f, -2.75f, -1.43f)
                curveToRelative(-1.79f, 0f, -3.25f, 1.57f, -3.25f, 3.5f)
                curveToRelative(0f, 3.36f, 5.48f, 7.25f, 5.71f, 7.41f)
                curveToRelative(0.09f, 0.06f, 0.19f, 0.09f, 0.29f, 0.09f)
                reflectiveCurveToRelative(0.2f, -0.03f, 0.29f, -0.09f)
                curveToRelative(0.23f, -0.16f, 5.71f, -4.05f, 5.71f, -7.41f)
                curveToRelative(0f, -1.93f, -1.46f, -3.5f, -3.25f, -3.5f)
                close()
                moveTo(12f, 16.88f)
                curveToRelative(-1.62f, -1.2f, -5f, -4.16f, -5f, -6.38f)
                curveToRelative(0f, -1.38f, 1.01f, -2.5f, 2.25f, -2.5f)
                curveToRelative(1.32f, 0f, 2.25f, 0.92f, 2.25f, 2.23f)
                verticalLineToRelative(0.27f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-0.27f)
                curveToRelative(0f, -1.31f, 0.93f, -2.23f, 2.25f, -2.23f)
                curveToRelative(1.24f, 0f, 2.25f, 1.12f, 2.25f, 2.5f)
                curveToRelative(0f, 2.22f, -3.38f, 5.18f, -5f, 6.38f)
                close()
                moveTo(12.84f, 0.03f)
                curveToRelative(-3.48f, -0.24f, -6.88f, 1.04f, -9.33f, 3.49f)
                curveTo(1.06f, 5.98f, -0.21f, 9.38f, 0.03f, 12.85f)
                curveToRelative(0.44f, 6.35f, 6.07f, 11.15f, 13.1f, 11.15f)
                horizontalLineToRelative(6.37f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-7.14f)
                curveTo(24f, 5.87f, 19.1f, 0.45f, 12.84f, 0.03f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-6.37f)
                curveToRelative(-6.6f, 0f, -11.7f, -4.3f, -12.11f, -10.21f)
                curveToRelative(-0.22f, -3.19f, 0.94f, -6.31f, 3.19f, -8.56f)
                curveToRelative(2.07f, -2.07f, 4.88f, -3.23f, 7.8f, -3.23f)
                curveToRelative(0.25f, 0f, 0.5f, 0.01f, 0.75f, 0.03f)
                curveToRelative(5.74f, 0.39f, 10.23f, 5.37f, 10.23f, 11.33f)
                verticalLineToRelative(7.14f)
                close()
            }
        }.also { _CommentHeart = it}

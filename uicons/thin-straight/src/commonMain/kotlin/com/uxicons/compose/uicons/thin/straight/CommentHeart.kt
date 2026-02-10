package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentHeart: ImageVector? = null

val Icons.Ts.CommentHeart: ImageVector
    get() = _CommentHeart ?: UXIcon(name = "CommentHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-11f)
                curveTo(5.93f, 23f, 1f, 18.07f, 1f, 12f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                verticalLineToRelative(11f)
                close()
                moveTo(14.75f, 7f)
                curveToRelative(-1.2f, 0f, -2.19f, 0.55f, -2.75f, 1.42f)
                curveToRelative(-0.56f, -0.88f, -1.55f, -1.42f, -2.75f, -1.42f)
                curveToRelative(-1.79f, 0f, -3.25f, 1.56f, -3.25f, 3.47f)
                curveToRelative(0f, 3.33f, 5.48f, 7.18f, 5.71f, 7.34f)
                lineToRelative(0.28f, 0.2f)
                lineToRelative(0.28f, -0.2f)
                curveToRelative(0.23f, -0.16f, 5.71f, -4.01f, 5.71f, -7.34f)
                curveToRelative(0f, -1.91f, -1.46f, -3.47f, -3.25f, -3.47f)
                close()
                moveTo(12f, 16.79f)
                curveToRelative(-1.62f, -1.19f, -5f, -4.12f, -5f, -6.32f)
                curveToRelative(0f, -1.36f, 1.01f, -2.47f, 2.25f, -2.47f)
                curveToRelative(1.32f, 0f, 2.25f, 0.9f, 2.25f, 2.2f)
                verticalLineToRelative(0.8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.8f)
                curveToRelative(0f, -1.3f, 0.93f, -2.2f, 2.25f, -2.2f)
                curveToRelative(1.24f, 0f, 2.25f, 1.11f, 2.25f, 2.47f)
                curveToRelative(0f, 2.19f, -3.38f, 5.12f, -5f, 6.32f)
                close()
            }
        }.also { _CommentHeart = it}

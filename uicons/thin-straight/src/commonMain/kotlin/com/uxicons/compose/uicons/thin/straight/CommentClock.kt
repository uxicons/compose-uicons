package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentClock: ImageVector? = null

val Icons.Ts.CommentClock: ImageVector
    get() = _CommentClock ?: UXIcon(name = "CommentClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 11f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                close()
                moveTo(18.5f, 1f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.02f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(19.8f, 7.51f)
                lineTo(18f, 5.71f)
                verticalLineToRelative(-2.71f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.29f)
                lineToRelative(1.51f, 1.51f)
                close()
                moveTo(12f, 10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(8f, 10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(23f, 11.49f)
                curveToRelative(0.36f, -0.27f, 0.69f, -0.57f, 1f, -0.9f)
                verticalLineToRelative(9.41f)
                horizontalLineToRelative(-7.03f)
                lineToRelative(-3.98f, 3.29f)
                curveToRelative(-0.56f, 0.5f, -1.42f, 0.49f, -1.98f, -0.01f)
                lineToRelative(-3.9f, -3.28f)
                horizontalLineToRelative(-7.11f)
                verticalLineToRelative(-17.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(10.91f)
                curveToRelative(-0.33f, 0.31f, -0.63f, 0.64f, -0.9f, 1f)
                horizontalLineToRelative(-10.01f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(6.47f)
                lineToRelative(4.19f, 3.53f)
                curveToRelative(0.2f, 0.17f, 0.48f, 0.18f, 0.68f, 0.01f)
                lineToRelative(4.28f, -3.54f)
                horizontalLineToRelative(6.39f)
                verticalLineToRelative(-7.51f)
                close()
            }
        }.also { _CommentClock = it}

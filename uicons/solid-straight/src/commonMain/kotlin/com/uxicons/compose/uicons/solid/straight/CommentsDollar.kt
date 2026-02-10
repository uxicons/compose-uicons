package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentsDollar: ImageVector? = null

val Icons.Ss.CommentsDollar: ImageVector
    get() = _CommentsDollar ?: UXIcon(name = "CommentsDollar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 0f)
                curveTo(4.04f, 0f, 0f, 4.04f, 0f, 9f)
                verticalLineToRelative(9f)
                lineTo(9f, 18f)
                curveToRelative(4.96f, 0f, 9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(13.96f, 0f, 9f, 0f)
                close()
                moveTo(7.64f, 7.76f)
                lineToRelative(3.04f, 0.51f)
                curveToRelative(1.34f, 0.22f, 2.31f, 1.37f, 2.31f, 2.73f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.38f, -0.27f, -0.7f, -0.64f, -0.76f)
                lineToRelative(-3.04f, -0.51f)
                curveToRelative(-1.34f, -0.22f, -2.31f, -1.37f, -2.31f, -2.73f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.38f, 0.27f, 0.7f, 0.64f, 0.76f)
                close()
                moveTo(24f, 16f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.96f, 0f, -5.54f, -1.61f, -6.92f, -4.0f)
                horizontalLineToRelative(0f)
                curveToRelative(6.0f, -0.04f, 10.87f, -4.92f, 10.92f, -10.92f)
                horizontalLineToRelative(0f)
                curveToRelative(2.39f, 1.39f, 4.0f, 3.96f, 4.0f, 6.92f)
                close()
            }
        }.also { _CommentsDollar = it}

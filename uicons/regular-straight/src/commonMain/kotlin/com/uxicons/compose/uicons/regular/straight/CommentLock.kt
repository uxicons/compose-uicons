package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentLock: ImageVector? = null

val Icons.Rs.CommentLock: ImageVector
    get() = _CommentLock ?: UXIcon(name = "CommentLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                verticalLineToRelative(18.85f)
                curveToRelative(0.03f, 1.16f, -1.0f, 2.17f, -2.15f, 2.15f)
                curveToRelative(-0.42f, 0f, -0.83f, -0.12f, -1.19f, -0.36f)
                lineToRelative(-4.51f, -3.64f)
                horizontalLineToRelative(-16.15f)
                verticalLineToRelative(-5.03f)
                curveToRelative(0.58f, 0.44f, 1.26f, 0.77f, 2f, 0.92f)
                verticalLineToRelative(2.1f)
                horizontalLineToRelative(14.85f)
                lineToRelative(4.9f, 3.96f)
                curveToRelative(0.09f, 0.08f, 0.24f, 0.04f, 0.24f, -0.11f)
                verticalLineToRelative(-18.85f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-10.21f)
                curveToRelative(-0.21f, -0.75f, -0.59f, -1.42f, -1.07f, -2f)
                horizontalLineToRelative(11.28f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(0f, 11f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                close()
                moveTo(4f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(2f, 11f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(6.5f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _CommentLock = it}

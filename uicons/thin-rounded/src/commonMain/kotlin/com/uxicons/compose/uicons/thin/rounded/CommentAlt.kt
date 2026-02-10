package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAlt: ImageVector? = null

val Icons.Tr.CommentAlt: ImageVector
    get() = _CommentAlt ?: UXIcon(name = "CommentAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 0f)
                lineTo(3f, 0f)
                curveTo(1.07f, 0f, -0.5f, 1.57f, -0.5f, 3.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(3.61f)
                lineToRelative(3.9f, 3.28f)
                curveToRelative(0.29f, 0.25f, 0.65f, 0.38f, 1.0f, 0.38f)
                curveToRelative(0.35f, 0f, 0.7f, -0.12f, 0.98f, -0.37f)
                lineToRelative(3.98f, -3.29f)
                horizontalLineToRelative(3.53f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(23.5f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(22.5f, 16.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-3.71f)
                curveToRelative(-0.12f, 0f, -0.23f, 0.04f, -0.32f, 0.11f)
                lineToRelative(-4.14f, 3.42f)
                curveToRelative(-0.19f, 0.17f, -0.48f, 0.17f, -0.68f, -0.01f)
                lineToRelative(-4.05f, -3.41f)
                curveToRelative(-0.09f, -0.07f, -0.2f, -0.12f, -0.32f, -0.12f)
                lineTo(3f, 19f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(0.5f, 3.5f)
                curveTo(0.5f, 2.12f, 1.62f, 1f, 3f, 1f)
                lineTo(20f, 1f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(13f)
                close()
                moveTo(5f, 6.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(5.5f, 7f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(19f, 10.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(5.5f, 11f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(19f, 14.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(5.5f, 15f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _CommentAlt = it}

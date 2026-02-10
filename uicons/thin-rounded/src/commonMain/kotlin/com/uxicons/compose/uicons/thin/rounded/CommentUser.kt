package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentUser: ImageVector? = null

val Icons.Tr.CommentUser: ImageVector
    get() = _CommentUser ?: UXIcon(name = "CommentUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(12f, 5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(17f, 15.5f)
                curveToRelative(0f, -2.4f, -2.34f, -4.5f, -5f, -4.5f)
                reflectiveCurveToRelative(-5f, 2.1f, -5f, 4.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -1.65f, 1.71f, -3.5f, 4f, -3.5f)
                reflectiveCurveToRelative(4f, 1.85f, 4f, 3.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                close()
                moveTo(12.0f, 23.66f)
                curveToRelative(-0.36f, 0f, -0.71f, -0.13f, -1.0f, -0.38f)
                lineToRelative(-3.9f, -3.28f)
                horizontalLineToRelative(-3.61f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(-0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-3.53f)
                lineToRelative(-3.98f, 3.29f)
                curveToRelative(-0.28f, 0.24f, -0.63f, 0.37f, -0.98f, 0.37f)
                close()
                moveTo(3.5f, 1f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.79f)
                curveToRelative(0.12f, 0f, 0.23f, 0.04f, 0.32f, 0.12f)
                lineToRelative(4.05f, 3.41f)
                curveToRelative(0.2f, 0.18f, 0.48f, 0.18f, 0.68f, 0.01f)
                lineToRelative(4.14f, -3.42f)
                curveToRelative(0.09f, -0.07f, 0.2f, -0.11f, 0.32f, -0.11f)
                horizontalLineToRelative(3.71f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(23f, 3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(3.5f, 1f)
                close()
            }
        }.also { _CommentUser = it}

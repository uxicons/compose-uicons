package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAltMinus: ImageVector? = null

val Icons.Sc.CommentAltMinus: ImageVector
    get() = _CommentAltMinus ?: UXIcon(name = "CommentAltMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.8f, 2.71f)
                curveToRelative(-0.11f, -0.32f, -0.38f, -0.57f, -0.7f, -0.65f)
                curveToRelative(-0.17f, -0.04f, -4.29f, -1.06f, -9.09f, -1.06f)
                reflectiveCurveToRelative(-8.92f, 1.01f, -9.09f, 1.06f)
                curveToRelative(-0.33f, 0.08f, -0.6f, 0.33f, -0.7f, 0.65f)
                curveToRelative(-0.05f, 0.14f, -1.2f, 3.6f, -1.2f, 8.23f)
                curveToRelative(0f, 4.79f, 1.16f, 8.11f, 1.21f, 8.25f)
                curveToRelative(0.11f, 0.32f, 0.39f, 0.56f, 0.72f, 0.64f)
                curveToRelative(0.13f, 0.03f, 3.12f, 0.71f, 5.96f, 0.93f)
                curveToRelative(0.91f, 0.99f, 2.43f, 2.25f, 3.19f, 2.25f)
                curveToRelative(0.61f, -0.05f, 2.17f, -1.28f, 3.03f, -2.25f)
                curveToRelative(2.83f, -0.22f, 5.83f, -0.9f, 5.96f, -0.93f)
                curveToRelative(0.34f, -0.08f, 0.61f, -0.32f, 0.72f, -0.65f)
                curveToRelative(0.05f, -0.14f, 1.21f, -3.51f, 1.21f, -8.24f)
                curveToRelative(0f, -4.64f, -1.15f, -8.09f, -1.2f, -8.23f)
                close()
                moveTo(16f, 12f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _CommentAltMinus = it}

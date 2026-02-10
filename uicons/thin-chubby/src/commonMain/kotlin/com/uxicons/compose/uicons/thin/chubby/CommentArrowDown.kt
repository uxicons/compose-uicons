package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentArrowDown: ImageVector? = null

val Icons.Tc.CommentArrowDown: ImageVector
    get() = _CommentArrowDown ?: UXIcon(name = "CommentArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-5.12f, 0f, -11f, 1.25f, -11f, 11f)
                curveToRelative(0f, 7.71f, 3.29f, 11f, 11f, 11f)
                curveToRelative(3.89f, 0f, 7.27f, -0.67f, 9.42f, -1.22f)
                curveToRelative(0.17f, -0.04f, 0.31f, -0.18f, 0.36f, -0.36f)
                curveToRelative(0.81f, -3.12f, 1.22f, -6.29f, 1.22f, -9.42f)
                curveToRelative(0f, -7.71f, -3.29f, -11f, -11f, -11f)
                close()
                moveTo(20.88f, 20.88f)
                curveToRelative(-2.1f, 0.53f, -5.26f, 1.12f, -8.88f, 1.12f)
                curveToRelative(-7.1f, 0f, -10f, -2.9f, -10f, -10f)
                reflectiveCurveToRelative(2.9f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 2.9f, 10f, 10f)
                curveToRelative(0f, 2.95f, -0.38f, 5.93f, -1.12f, 8.88f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.73f, 12.06f)
                curveToRelative(-0.24f, -0.13f, -0.55f, -0.03f, -0.67f, 0.21f)
                curveToRelative(-0.85f, 1.64f, -1.92f, 2.3f, -2.56f, 2.56f)
                verticalLineToRelative(-6.33f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(6.33f)
                curveToRelative(-0.64f, -0.26f, -1.7f, -0.92f, -2.56f, -2.56f)
                curveToRelative(-0.13f, -0.24f, -0.43f, -0.34f, -0.67f, -0.21f)
                reflectiveCurveToRelative(-0.34f, 0.43f, -0.21f, 0.67f)
                curveToRelative(1.54f, 2.96f, 3.79f, 3.25f, 3.89f, 3.26f)
                curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f)
                reflectiveCurveToRelative(0.04f, 0f, 0.06f, -0.0f)
                curveToRelative(0.1f, -0.01f, 2.35f, -0.3f, 3.89f, -3.26f)
                curveToRelative(0.13f, -0.24f, 0.03f, -0.55f, -0.21f, -0.67f)
                close()
            }
        }.also { _CommentArrowDown = it}

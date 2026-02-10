package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentDots: ImageVector? = null

val Icons.Tc.CommentDots: ImageVector
    get() = _CommentDots ?: UXIcon(name = "CommentDots") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.75f, 12f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                close()
                moveTo(16f, 11.25f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f)
                close()
                moveTo(8f, 11.25f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 3.59f, -0.52f, 9.95f, -0.53f, 10.02f)
                curveToRelative(-0.02f, 0.24f, -0.21f, 0.44f, -0.46f, 0.46f)
                curveToRelative(-0.06f, 0.01f, -6.16f, 0.53f, -10.02f, 0.53f)
                curveToRelative(-7.81f, 0f, -11f, -3.19f, -11f, -11f)
                reflectiveCurveToRelative(3.19f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 3.19f, 11f, 11f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -7.2f, -2.8f, -10f, -10f, -10f)
                reflectiveCurveToRelative(-10f, 2.8f, -10f, 10f)
                reflectiveCurveToRelative(2.8f, 10f, 10f, 10f)
                curveToRelative(3.23f, 0f, 8.07f, -0.37f, 9.51f, -0.49f)
                curveToRelative(0.12f, -1.48f, 0.49f, -6.49f, 0.49f, -9.51f)
                close()
            }
        }.also { _CommentDots = it}

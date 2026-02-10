package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentMinus: ImageVector? = null

val Icons.Tc.CommentMinus: ImageVector
    get() = _CommentMinus ?: UXIcon(name = "CommentMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 12f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
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
                curveToRelative(3.23f, 0f, 8.06f, -0.37f, 9.51f, -0.49f)
                curveToRelative(0.12f, -1.48f, 0.49f, -6.49f, 0.49f, -9.51f)
                close()
            }
        }.also { _CommentMinus = it}

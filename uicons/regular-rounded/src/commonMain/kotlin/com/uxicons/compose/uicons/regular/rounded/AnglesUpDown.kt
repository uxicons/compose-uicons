package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AnglesUpDown: ImageVector? = null

val Icons.Rr.AnglesUpDown: ImageVector
    get() = _AnglesUpDown ?: UXIcon(name = "AnglesUpDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.3f, 9.71f)
                curveToRelative(-0.39f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                lineTo(9.47f, 1.05f)
                curveToRelative(1.36f, -1.36f, 3.71f, -1.35f, 5.06f, -0.0f)
                lineToRelative(7.18f, 7.25f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, -0.01f, 1.41f)
                curveToRelative(-0.2f, 0.19f, -0.45f, 0.29f, -0.7f, 0.29f)
                curveToRelative(-0.26f, 0f, -0.52f, -0.1f, -0.71f, -0.3f)
                lineToRelative(-7.18f, -7.25f)
                curveToRelative(-0.59f, -0.59f, -1.63f, -0.59f, -2.23f, 0.0f)
                lineToRelative(-7.17f, 7.24f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.4f, -1.42f, 0.01f)
                close()
                moveTo(20.29f, 14.29f)
                lineToRelative(-7.17f, 7.24f)
                curveToRelative(-0.6f, 0.6f, -1.64f, 0.59f, -2.23f, 0.0f)
                lineToRelative(-7.18f, -7.25f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.4f, -1.42f, -0.01f)
                curveToRelative(-0.39f, 0.39f, -0.4f, 1.02f, -0.01f, 1.42f)
                lineToRelative(7.18f, 7.25f)
                curveToRelative(0.68f, 0.68f, 1.57f, 1.05f, 2.53f, 1.05f)
                reflectiveCurveToRelative(1.85f, -0.37f, 2.53f, -1.05f)
                lineToRelative(7.18f, -7.25f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, -0.01f, -1.42f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.42f, 0.01f)
                close()
            }
        }.also { _AnglesUpDown = it}

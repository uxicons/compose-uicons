package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tags: ImageVector? = null

val Icons.Ts.Tags: ImageVector
    get() = _Tags ?: UXIcon(name = "Tags") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.71f, 8.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                close()
                moveTo(22.32f, 13.49f)
                lineToRelative(-0.43f, 0.44f)
                curveToRelative(0.24f, 0.81f, 0.03f, 1.73f, -0.61f, 2.37f)
                lineToRelative(-6.77f, 6.99f)
                curveToRelative(-0.46f, 0.46f, -1.06f, 0.71f, -1.71f, 0.71f)
                reflectiveCurveToRelative(-1.25f, -0.25f, -1.7f, -0.7f)
                lineTo(1.03f, 13.21f)
                lineTo(2.04f, 4.07f)
                lineToRelative(9.15f, -1.25f)
                lineToRelative(10.09f, 10.09f)
                curveToRelative(0.04f, 0.04f, 0.07f, 0.07f, 0.1f, 0.11f)
                lineToRelative(0.22f, -0.23f)
                curveToRelative(0.27f, -0.27f, 0.41f, -0.62f, 0.41f, -1.0f)
                reflectiveCurveToRelative(-0.15f, -0.73f, -0.41f, -0.99f)
                lineTo(11.87f, 1.06f)
                lineTo(3.6f, 2.19f)
                lineToRelative(-0.14f, -0.99f)
                lineTo(12.23f, 0.01f)
                lineToRelative(10.09f, 10.09f)
                curveToRelative(0.94f, 0.94f, 0.94f, 2.46f, 0f, 3.4f)
                close()
                moveTo(20.57f, 13.61f)
                lineTo(10.84f, 3.88f)
                lineToRelative(-7.89f, 1.08f)
                lineToRelative(-0.87f, 7.89f)
                lineToRelative(9.74f, 9.74f)
                curveToRelative(0.53f, 0.53f, 1.46f, 0.53f, 1.98f, 0f)
                lineToRelative(6.77f, -6.99f)
                curveToRelative(0.55f, -0.55f, 0.55f, -1.44f, 0.01f, -1.99f)
                close()
            }
        }.also { _Tags = it}

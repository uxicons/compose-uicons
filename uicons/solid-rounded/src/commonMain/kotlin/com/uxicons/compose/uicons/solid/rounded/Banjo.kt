package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banjo: ImageVector? = null

val Icons.Sr.Banjo: ImageVector
    get() = _Banjo ?: UXIcon(name = "Banjo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.49f, 1.1f)
                lineToRelative(-0.59f, -0.59f)
                curveToRelative(-0.68f, -0.68f, -1.78f, -0.68f, -2.46f, -0.0f)
                lineToRelative(-0.56f, 0.55f)
                curveToRelative(-0.56f, 0.56f, -0.88f, 1.33f, -0.88f, 2.12f)
                verticalLineToRelative(0.4f)
                lineToRelative(-6.1f, 6.1f)
                curveToRelative(-1.35f, -1.05f, -3.06f, -1.68f, -4.9f, -1.68f)
                curveTo(3.59f, 8f, 0f, 11.59f, 0f, 16f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                curveToRelative(0f, -1.85f, -0.63f, -3.55f, -1.68f, -4.9f)
                lineToRelative(6.1f, -6.1f)
                horizontalLineToRelative(0.4f)
                curveToRelative(0.8f, 0f, 1.56f, -0.32f, 2.12f, -0.88f)
                lineToRelative(0.56f, -0.56f)
                curveToRelative(0.68f, -0.68f, 0.68f, -1.78f, 0.0f, -2.46f)
                close()
                moveTo(8.71f, 19.71f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-3f, -3f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(3f, 3f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _Banjo = it}

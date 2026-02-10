package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThumbtackSlash: ImageVector? = null

val Icons.Sr.ThumbtackSlash: ImageVector
    get() = _ThumbtackSlash ?: UXIcon(name = "ThumbtackSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 22.36f)
                lineToRelative(-6.75f, -6.75f)
                curveToRelative(0.14f, -1.24f, -0.14f, -2.51f, -0.46f, -3.69f)
                lineToRelative(1.87f, -1.87f)
                curveToRelative(0.08f, -0.08f, 0.23f, -0.09f, 0.22f, -0.09f)
                curveToRelative(0.06f, 0f, 0.14f, 0.02f, 0.22f, 0.09f)
                curveToRelative(1.07f, 1.07f, 2.77f, 1.24f, 3.94f, 0.4f)
                curveToRelative(1.49f, -1.02f, 1.68f, -3.32f, 0.38f, -4.56f)
                lineTo(18.2f, 0.95f)
                curveToRelative(-1.07f, -1.07f, -2.77f, -1.24f, -3.94f, -0.4f)
                curveToRelative(-1.49f, 1.02f, -1.68f, 3.32f, -0.38f, 4.56f)
                curveToRelative(0.16f, 0.12f, 0.23f, 0.35f, 0.08f, 0.51f)
                lineToRelative(-1.87f, 1.87f)
                curveToRelative(-1.19f, -0.32f, -2.47f, -0.6f, -3.69f, -0.46f)
                lineTo(1.71f, 0.35f)
                curveTo(1.32f, -0.04f, 0.68f, -0.04f, 0.29f, 0.35f)
                reflectiveCurveTo(-0.1f, 1.38f, 0.29f, 1.77f)
                lineTo(22.29f, 23.77f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(14.71f, 19.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-4.29f, -4.29f)
                lineTo(1.71f, 23.71f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(7.29f, -7.29f)
                lineTo(3.29f, 10.71f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(10f, 10f)
                close()
            }
        }.also { _ThumbtackSlash = it}

package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTag: ImageVector? = null

val Icons.Br.UserTag: ImageVector
    get() = _UserTag ?: UXIcon(name = "UserTag") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.12f, 16.99f)
            lineToRelative(-3.88f, -3.91f)
            curveToRelative(-0.68f, -0.68f, -1.63f, -1.0f, -2.58f, -0.88f)
            lineToRelative(-2.37f, 0.31f)
            curveToRelative(-1.02f, 0.14f, -1.81f, 0.96f, -1.89f, 1.99f)
            lineToRelative(-0.18f, 2.29f)
            curveToRelative(-0.07f, 0.89f, 0.25f, 1.77f, 0.89f, 2.41f)
            lineToRelative(3.88f, 3.92f)
            curveToRelative(1.17f, 1.18f, 3.08f, 1.17f, 4.25f, -0.0f)
            lineToRelative(1.88f, -1.89f)
            curveToRelative(1.17f, -1.17f, 1.16f, -3.06f, -0.0f, -4.24f)
            close()
            moveTo(16f, 17.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(8f, 12f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            reflectiveCurveTo(11.31f, 0f, 8f, 0f)
            reflectiveCurveTo(2f, 2.69f, 2f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            close()
            moveTo(8f, 3f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            close()
            moveTo(10f, 15.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            curveToRelative(0f, -4.69f, 3.81f, -8.5f, 8.5f, -8.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _UserTag = it }

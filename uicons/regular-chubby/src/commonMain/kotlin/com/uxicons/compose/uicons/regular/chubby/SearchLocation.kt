package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchLocation: ImageVector? = null

val Icons.Rc.SearchLocation: ImageVector
    get() = _SearchLocation ?: UXIcon(name = "SearchLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.71f, 21.29f)
                lineToRelative(-4.54f, -4.54f)
                curveToRelative(1.2f, -1.57f, 1.83f, -3.67f, 1.83f, -6.25f)
                curveToRelative(0f, -6.04f, -3.46f, -9.5f, -9.5f, -9.5f)
                reflectiveCurveToRelative(-9.5f, 3.46f, -9.5f, 9.5f)
                reflectiveCurveToRelative(3.46f, 9.5f, 9.5f, 9.5f)
                curveToRelative(2.58f, 0f, 4.68f, -0.64f, 6.25f, -1.83f)
                lineToRelative(4.54f, 4.54f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(10.5f, 18f)
                curveToRelative(-4.98f, 0f, -7.5f, -2.52f, -7.5f, -7.5f)
                reflectiveCurveToRelative(2.52f, -7.5f, 7.5f, -7.5f)
                reflectiveCurveToRelative(7.5f, 2.52f, 7.5f, 7.5f)
                reflectiveCurveToRelative(-2.52f, 7.5f, -7.5f, 7.5f)
                close()
                moveTo(10.5f, 5f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                curveToRelative(0f, 2.88f, 3.46f, 5.92f, 3.85f, 6.26f)
                curveToRelative(0.38f, 0.32f, 0.93f, 0.32f, 1.3f, 0f)
                curveToRelative(0.39f, -0.34f, 3.85f, -3.38f, 3.85f, -6.26f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(10.5f, 13.63f)
                curveToRelative(-1.15f, -1.15f, -2.5f, -2.9f, -2.5f, -4.13f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 1.24f, -1.35f, 2.98f, -2.5f, 4.13f)
                close()
                moveTo(11.5f, 9.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _SearchLocation = it}

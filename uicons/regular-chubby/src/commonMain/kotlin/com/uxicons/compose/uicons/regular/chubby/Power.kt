package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Power: ImageVector? = null

val Icons.Rc.Power: ImageVector
    get() = _Power ?: UXIcon(name = "Power") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineTo(6.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.88f, 2.4f)
                curveToRelative(-0.52f, -0.17f, -1.09f, 0.12f, -1.26f, 0.64f)
                curveToRelative(-0.17f, 0.53f, 0.12f, 1.09f, 0.64f, 1.26f)
                curveToRelative(2.06f, 0.67f, 4.42f, 2.19f, 4.42f, 8.08f)
                curveToRelative(0f, 7.16f, -3.47f, 8.62f, -8.68f, 8.62f)
                reflectiveCurveTo(3.32f, 19.53f, 3.32f, 12.38f)
                curveToRelative(0f, -5.87f, 2.37f, -7.4f, 4.43f, -8.07f)
                curveToRelative(0.53f, -0.17f, 0.81f, -0.74f, 0.64f, -1.26f)
                curveToRelative(-0.17f, -0.53f, -0.74f, -0.81f, -1.26f, -0.64f)
                curveTo(3.22f, 3.68f, 1.32f, 6.94f, 1.32f, 12.38f)
                curveToRelative(0f, 9.42f, 5.71f, 10.62f, 10.68f, 10.62f)
                reflectiveCurveToRelative(10.68f, -1.21f, 10.68f, -10.62f)
                curveToRelative(0f, -5.45f, -1.9f, -8.71f, -5.81f, -9.98f)
                close()
            }
        }.also { _Power = it}

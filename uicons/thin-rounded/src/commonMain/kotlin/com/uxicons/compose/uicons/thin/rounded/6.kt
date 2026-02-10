package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tr6: ImageVector? = null

val Icons.Tr.Tr6: ImageVector
    get() = _Tr6 ?: UXIcon(name = "Tr6") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.01f, 16.08f)
                curveToRelative(0.17f, 4.27f, 3.45f, 7.71f, 7.6f, 7.91f)
                curveToRelative(2.36f, 0.1f, 4.64f, -0.81f, 6.24f, -2.54f)
                curveToRelative(1.61f, -1.73f, 2.37f, -4.07f, 2.09f, -6.43f)
                curveToRelative(-0.43f, -3.63f, -3.39f, -6.56f, -7.02f, -6.97f)
                curveToRelative(-2.31f, -0.26f, -4.53f, 0.45f, -6.25f, 1.98f)
                curveToRelative(-0.68f, 0.6f, -1.24f, 1.31f, -1.67f, 2.09f)
                verticalLineToRelative(-2.63f)
                curveTo(5f, 4.81f, 8.81f, 1f, 13.5f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4f)
                curveTo(8.26f, 0f, 4f, 4.26f, 4f, 9.5f)
                curveToRelative(0f, 0f, 0.0f, 6.56f, 0.01f, 6.58f)
                close()
                moveTo(11.99f, 9f)
                curveToRelative(3.87f, 0f, 7f, 3.13f, 7f, 7f)
                reflectiveCurveToRelative(-3.13f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.13f, -7f, -7f)
                reflectiveCurveToRelative(3.13f, -7f, 7f, -7f)
                close()
            }
        }.also { _Tr6 = it}

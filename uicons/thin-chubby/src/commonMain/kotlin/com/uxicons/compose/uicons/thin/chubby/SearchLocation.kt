package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchLocation: ImageVector? = null

val Icons.Tc.SearchLocation: ImageVector
    get() = _SearchLocation ?: UXIcon(name = "SearchLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.85f, 22.15f)
                lineToRelative(-4.97f, -4.97f)
                curveToRelative(1.39f, -1.59f, 2.12f, -3.83f, 2.12f, -6.67f)
                curveToRelative(0f, -6.13f, -3.37f, -9.5f, -9.5f, -9.5f)
                reflectiveCurveToRelative(-9.5f, 3.38f, -9.5f, 9.5f)
                reflectiveCurveToRelative(3.37f, 9.5f, 9.5f, 9.5f)
                curveToRelative(2.84f, 0f, 5.08f, -0.73f, 6.67f, -2.12f)
                lineToRelative(4.97f, 4.97f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(10.5f, 19f)
                curveToRelative(-5.56f, 0f, -8.5f, -2.94f, -8.5f, -8.5f)
                reflectiveCurveToRelative(2.94f, -8.5f, 8.5f, -8.5f)
                reflectiveCurveToRelative(8.5f, 2.94f, 8.5f, 8.5f)
                reflectiveCurveToRelative(-2.94f, 8.5f, -8.5f, 8.5f)
                close()
                moveTo(10.5f, 5f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                curveToRelative(0f, 3.05f, 4.0f, 6.52f, 4.17f, 6.67f)
                curveToRelative(0.19f, 0.16f, 0.46f, 0.16f, 0.65f, 0f)
                curveToRelative(0.17f, -0.15f, 4.17f, -3.61f, 4.17f, -6.67f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(10.5f, 15.11f)
                curveToRelative(-0.93f, -0.87f, -3.5f, -3.47f, -3.5f, -5.61f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 2.14f, -2.58f, 4.74f, -3.5f, 5.61f)
                close()
                moveTo(11.25f, 9.5f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                close()
            }
        }.also { _SearchLocation = it}

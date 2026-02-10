package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiplomaAlt: ImageVector? = null

val Icons.Ss.DiplomaAlt: ImageVector
    get() = _DiplomaAlt ?: UXIcon(name = "DiplomaAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.85f, 7.68f)
                curveToRelative(-0.04f, 0.01f, -2.56f, 0.39f, -5.5f, 0.68f)
                curveToRelative(1.05f, -0.58f, 1.65f, -1.55f, 1.65f, -2.97f)
                curveToRelative(-0.0f, -1.94f, -1.66f, -3.45f, -3.56f, -3.38f)
                reflectiveCurveToRelative(-3.21f, 1.56f, -3.44f, 3.54f)
                curveToRelative(-0.23f, -1.98f, -1.54f, -3.47f, -3.44f, -3.54f)
                reflectiveCurveToRelative(-3.56f, 1.45f, -3.56f, 3.38f)
                curveToRelative(-0.0f, 1.42f, 0.6f, 2.39f, 1.65f, 2.97f)
                curveToRelative(-4.25f, -0.45f, -4.85f, -0.59f, -6.65f, -0.85f)
                verticalLineToRelative(10f)
                curveToRelative(1.74f, -0.22f, 3.41f, -0.47f, 8f, -0.92f)
                verticalLineToRelative(-7.75f)
                curveToRelative(0.58f, 0.13f, 1.32f, 0.18f, 2f, 0.17f)
                verticalLineToRelative(14f)
                lineToRelative(2f, -1.91f)
                lineToRelative(2f, 1.91f)
                verticalLineToRelative(-14.0f)
                curveToRelative(0.68f, 0.01f, 1.42f, -0.04f, 2f, -0.17f)
                verticalLineToRelative(7.75f)
                curveToRelative(4.6f, 0.45f, 6.25f, 0.7f, 8f, 0.92f)
                verticalLineToRelative(-10.0f)
                close()
            }
        }.also { _DiplomaAlt = it}

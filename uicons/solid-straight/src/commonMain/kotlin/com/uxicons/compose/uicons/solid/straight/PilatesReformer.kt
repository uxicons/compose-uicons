package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PilatesReformer: ImageVector? = null

val Icons.Ss.PilatesReformer: ImageVector
    get() = _PilatesReformer ?: UXIcon(name = "PilatesReformer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 2f)
                verticalLineToRelative(2.1f)
                lineToRelative(-6.39f, 5.9f)
                horizontalLineToRelative(-6.61f)
                curveToRelative(-1.09f, 0f, -1.99f, 0.89f, -2.0f, 1.98f)
                lineToRelative(-3.1f, -3.38f)
                curveToRelative(0.06f, -0.19f, 0.1f, -0.39f, 0.1f, -0.59f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                curveToRelative(0.15f, 0f, 0.29f, -0.02f, 0.43f, -0.05f)
                lineToRelative(2.79f, 3.05f)
                horizontalLineToRelative(-5.23f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-20f)
                close()
                moveTo(17f, 13f)
                verticalLineToRelative(-1.56f)
                lineToRelative(5f, -4.62f)
                verticalLineToRelative(6.18f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.also { _PilatesReformer = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PilatesReformer: ImageVector? = null

val Icons.Bs.PilatesReformer: ImageVector
    get() = _PilatesReformer ?: UXIcon(name = "PilatesReformer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 2f)
                verticalLineToRelative(2.37f)
                lineToRelative(-6.48f, 4.63f)
                horizontalLineToRelative(-6.52f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-0.86f)
                lineToRelative(-2.31f, -3.63f)
                curveToRelative(0.1f, -0.27f, 0.17f, -0.56f, 0.17f, -0.87f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 1.31f, 1.01f, 2.38f, 2.3f, 2.48f)
                lineToRelative(1.29f, 2.02f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-20f)
                close()
                moveTo(21f, 8.06f)
                verticalLineToRelative(2.94f)
                horizontalLineToRelative(-4.12f)
                close()
                moveTo(3f, 16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _PilatesReformer = it}
